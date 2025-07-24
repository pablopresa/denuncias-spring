package uy.gub.bps.csda.facturas_persona.service.impl;

import lombok.AllArgsConstructor;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import uy.gub.bps.csda.facturas_persona.core.properties.FacturasPersonaProperties;
import uy.gub.bps.csda.facturas_persona.core.properties.MensajesProperties;
import uy.gub.bps.csda.facturas_persona.dto.*;
import uy.gub.bps.csda.facturas_persona.dto.Error;
import uy.gub.bps.csda.facturas_persona.dto.ResultVersion;
import uy.gub.bps.csda.facturas_persona.service.FacturasPersonaService;
import uy.gub.bps.csda.facturas_persona.util.Utils;
import uy.gub.bps.csda.facturas_persona.web_services.soap.clientes.ClienteWsEmisorConsulta;
import uy.gub.bps.csda.facturas_persona.web_services.soap.clientes.ClienteWsEmisorDocumento;
import uy.gub.bps.csda.facturas_persona.web_services.soap.clientes.ClienteWsRegContribuyente;
import uy.gub.bps.csda.facturas_persona.web_services.soap.clientes.ClienteWsRegEmpresa;
import uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorConsulta.ResultObtenerDuplicadoDocumentoWs;
import uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService.Documento;
import uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService.FacturaPorEmpresa;
import uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService.ResultObtenerDocumentosPorEmpresa;
import uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService.ObjContribuyenteEmpresas;
import uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService.ObjContribuyentePersonaFisicaNatJuridica;
import uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService.ResultObtenerContribuyentesPorPersona;
import uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService.ResultObtenerListaRelEmpresa;
import uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService.*;

import java.util.*;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class FacturasPersonaServiceImpl implements FacturasPersonaService{

	private static final Logger logger = LogManager.getLogger(FacturasPersonaServiceImpl.class);

	private final ClienteWsRegContribuyente wsRegContribuyente;
	private final ClienteWsRegEmpresa wsRegEmpresa;
	private final ClienteWsEmisorDocumento wsEmisorDocumento;
	private final ClienteWsEmisorConsulta wsEmisorConsulta;
	private final FacturasPersonaProperties properties;
	private final MensajesProperties mensajes;

	@Override
	public ResultVersion obtenerVersion() {
		loguearInfo("obtenerVersion");
		return new ResultVersion(properties.getVersion(), properties.getNombre(), (List.of("null", "").contains(properties.getFechaExpiracion()))? null : properties.getFechaExpiracion(), properties.getVersionEstandar());
	}

	@Override
	public ResultMonitor obtenerMonitor(){

		loguearInfo("monitor");
		Boolean regContribuyente = null;
		Boolean regEmpresa = null;
		Boolean emisorDocumento = null;
		Boolean emisorConsulta = null;

		try{
			regContribuyente = wsRegContribuyente.obtenerVersion();
		}
		catch(Exception e){
			regContribuyente = false;
			loguearError(e.getMessage());
		}
		try{
			regEmpresa = wsRegEmpresa.obtenerVersion();
		}
		catch(Exception e){
			regEmpresa = false;
			loguearError(e.getMessage());
		}
		try{
			emisorDocumento = wsEmisorDocumento.obtenerVersion();
		}
		catch(Exception e){
			emisorDocumento = false;
			loguearError(e.getMessage());
		}
		try{
			emisorConsulta = wsEmisorConsulta.obtenerVersion();
		}
		catch(Exception e){
			emisorConsulta = false;
			loguearError(e.getMessage());
		}

		Map<String, Boolean> webServices = new HashMap<>();
		webServices.put("WsRegContribuyente", regContribuyente);
		webServices.put("WsRegEmpresa", regEmpresa);
		webServices.put("WsEmisorDocumento", emisorDocumento);
		webServices.put("WsEmisorConsulta", emisorConsulta);

		Boolean resultado = webServices.values().stream().allMatch(ws -> ws);

		List<String> resultados = webServices.entrySet().stream()
				.map(entry -> entry.getKey() + " - " + (entry.getValue() ? "OK" : "ERROR"))
				.toList();

		return new ResultMonitor(resultado, resultados);
	}

	@Override
	public List<Empresa> obtenerFacturasPersona(Integer persIdentificador, Integer tipoAportacion, String usuario, List<Error> errores) {
		loguearInfo(String.format("obtenerFacturasPersona(persIdentificador:%s, tipoAportacion:%s, usuario:%s)", persIdentificador, tipoAportacion, usuario));

		if (parametrosInvalidos(persIdentificador, usuario, errores)) {
			return List.of();
		}

		List<ObjContribuyentePersonaFisicaNatJuridica> contribuyentes = obtenerContribuyentesPorPersId(persIdentificador, errores);
		if (manejarErroresSiVacio(contribuyentes, errores, 2, "BEFPSIOFP_1")) {
			return List.of();
		}

		List<ObjContribuyenteEmpresas> empresas = obtenerEmpresasContribuyente(contribuyentes, errores);
		if (manejarErroresSiVacio(empresas, errores, 999, "BEFPSIOFP_2")) {
			return List.of();
		}

		List<Empresa> estadosAportacion = obtenerEstadosAportacion(mapearEmpresas(empresas), tipoAportacion, errores);
		if (manejarErroresSiVacio(estadosAportacion, errores, 4, "BEFPSIOFP_3")) {
			return List.of();
		}

		if (estadosAportacion.size() > 1) {
			return manejarMultiplesAportaciones(tipoAportacion, estadosAportacion, errores);
		}

		return procesarFactura(estadosAportacion.getFirst(), tipoAportacion, usuario, errores);
	}

	private boolean parametrosInvalidos(Integer persIdentificador, String usuario, List<Error> errores) {
		if (persIdentificador == null || persIdentificador == 0 || Utils.isNullOrEmpty(usuario)) {
			errores.add(obtenerMensajeError(1, "BEFPSIOFP_4"));
			return true;
		}
		return false;
	}

	private boolean manejarErroresSiVacio(List<?> lista, List<Error> errores, int codigoError, String codigoInterno) {
		if (Utils.isNullOrEmpty(lista)) {
			errores.add(obtenerMensajeError(codigoError, codigoInterno));
			return true;
		}
		return false;
	}

	private List<ObjContribuyenteEmpresas> obtenerEmpresasContribuyente(
			List<ObjContribuyentePersonaFisicaNatJuridica> contribuyentes, List<Error> errores) {
		return obtenerEmpresas(
				contribuyentes.getFirst().getContribuyente().getNroIntContr(), errores);
	}

	private List<Empresa> mapearEmpresas(List<ObjContribuyenteEmpresas> empresas) {
		return empresas.stream()
				.map(emp -> new Empresa(emp.getObjEmpresa().getNroIntEmp(), emp.getObjEmpresa().getNroEmpresa(), null, null, null))
				.toList();
	}

	private List<Empresa> manejarMultiplesAportaciones(Integer tipoAportacion, List<Empresa> estadosAportacion, List<Error> errores) {
		if (tipoAportacion == null) {
			loguearInfo(String.format("Estados aportacion: %s", estadosAportacion));
			return estadosAportacion;
		} else {
			errores.add(obtenerMensajeError(3, "BEFPSIMMA_1"));
			return List.of();
		}
	}

	private List<Empresa> procesarFactura(Empresa empresa, Integer tipoAportacion, String usuario, List<Error> errores) {
		Documento doc = generarFacturas(empresa.getNroEmpresa(), usuario, tipoAportacion, errores);

		if (doc == null || manejarErroresSiVacio(doc.getFacturaPorEmpresa(), errores, 999, "BEFPSIPF_1")) {
			return List.of();
		}

		List<FacturaPorEmpresa> facturasPorEmpresa =  doc.getFacturaPorEmpresa();

		if (tipoAportacion != null){
			facturasPorEmpresa = filtrarFacturasPorAportacionAndNIE(doc, tipoAportacion);
		}

		if (Utils.isNullOrEmpty(facturasPorEmpresa)) {
			errores.add(obtenerMensajeError(5, "BEFPSIPF_2"));
			return List.of();
		}

		List<ResultObtenerDuplicadoDocumentoWs> facturasConsultadas = consultarFacturas(
				facturasPorEmpresa.stream()
						.map(FacturaPorEmpresa::getNroReferencia)
						.toList(),
				errores);

		if (manejarErroresSiVacio(facturasConsultadas, errores, 999, "BEFPSIPF_3")) {
			return List.of();
		}

		return armarResultado(
				empresa.getNroEmpresa(),
				empresa.getNroIntEmp(),
				facturasPorEmpresa.getFirst().getCodigoAportacion(),
				facturasPorEmpresa.getFirst().getDescripcionAportacion(),
				convertirFacturas(facturasConsultadas));
	}

	private List<FacturaPorEmpresa> filtrarFacturasPorAportacionAndNIE(Documento doc, Integer tipoAportacion){
			return doc.getFacturaPorEmpresa().stream()
					.filter(f -> tipoAportacion.equals(f.getCodigoAportacion()))
					.toList();
	}

	private List<Empresa> armarResultado(String nroExternoEmpresa, Integer nroInternoEmpresa, Integer codigoAportacion, String descripcionAportacion, List<Factura> facturas) {
		Empresa empresa = new Empresa(nroInternoEmpresa, nroExternoEmpresa, codigoAportacion, descripcionAportacion, facturas);
		return List.of(empresa);
	}

	private List<Factura> convertirFacturas(List<ResultObtenerDuplicadoDocumentoWs> facturasConsultadas) {
		List<Factura> ret = new ArrayList<>();
		for(ResultObtenerDuplicadoDocumentoWs result : facturasConsultadas){
			if(!Utils.isNullOrEmpty(result.getErroresNegocio())){
				Utils.loguearErroresNegocio(logger, result.getErroresNegocio());
			}
			else{
				ret.add(new Factura(result.getDocumentoDuplicado().getValue(), properties.getDevolverBase64()));
			}
		}
		return ret;
	}

	private boolean masDeUnaFacturaDeDistintaAportacion(List<FacturaPorEmpresa> facturas){
		Set<Integer> aportacionesUnicas = facturas.stream()
				.map(FacturaPorEmpresa::getCodigoAportacion)
				.collect(Collectors.toSet());
		return aportacionesUnicas.size() > 1;
	}

	public List<ObjContribuyentePersonaFisicaNatJuridica> filtrarContribuyentes(List<ObjContribuyentePersonaFisicaNatJuridica> contribuyentes) {
		return contribuyentes.stream()
				.filter(this::tieneNaturalezaJuridicaUnipersonalVigente)
				.filter(this::tieneRelacionLaboralPatronoUnipersonalVigente)
				.toList();
	}

	private boolean tieneNaturalezaJuridicaUnipersonalVigente(ObjContribuyentePersonaFisicaNatJuridica contribuyente) {
		if (contribuyente.getNaturalezasJuridicas() == null) {
			return false;
		}
		return contribuyente.getNaturalezasJuridicas().stream()
				.anyMatch(nj -> nj.getNatJuridica().getCodNatJuridica()
						.equals(properties.getCodNatJuridicaUnipersonal())
						&& nj.getPeriodo().getFechaHasta() == null);
	}

	private boolean tieneRelacionLaboralPatronoUnipersonalVigente(ObjContribuyentePersonaFisicaNatJuridica contribuyente) {
		if (contribuyente.getRelacionesLaborales() == null) {
			return false;
		}
		return contribuyente.getRelacionesLaborales().stream()
				.anyMatch(rl -> rl.getRelacionLaboral() != null &&
						rl.getRelacionLaboral().getCodRelacionLaboral().equals(properties.getCodRelLaboralPatronoUnipersonal()) &&
						rl.getPeriodo().getFechaHasta() == null);
	}

	private List<ObjContribuyenteEmpresas> filtrarEmpresas(List<ObjContribuyenteEmpresas> empresas){
		return empresas.stream().filter(e -> e.getObjRelacionEmpContr().getPeriodo().getFechaHasta() == null).toList();
	}

	private List<Empresa> filtrarEstadosAportacion(List<ResultObtenerEstadosAportacion> estadosAportacion, Integer tipoAportacionIngreso) {

		List<Integer> codAportacionesValidas = Utils.obtenerListaInteger(properties.getCodAportacionesValidas());

		return estadosAportacion.stream()
				.flatMap(res -> res.getDatosAportacionEmpresa().stream()
						.filter(aportacionEmpresa -> esAportacionValida(aportacionEmpresa, codAportacionesValidas))
						.flatMap(aportacionEmpresa -> aportacionEmpresa.getEstadosAportacion().stream()
								.filter(this::esEstadoVigente)
								.map(estadoAportacion -> crearEmpresa(res, aportacionEmpresa, tipoAportacionIngreso))
								.filter(Objects::nonNull)))
				.toList();
	}

	private boolean esAportacionValida(ObjDatosAportacionEmpresa aportacionEmpresa, List<Integer> codAportacionesValidas) {
		Integer codAportacion = aportacionEmpresa.getAportacion().getCodAportacion();
		return codAportacionesValidas.contains(codAportacion);
	}

	private boolean esEstadoVigente(ObjEstadoAportacion estadoAportacion) {
		return estadoAportacion.getPeriodoEstadoApo().getFechaHasta() == null;
	}

	private Empresa crearEmpresa(ResultObtenerEstadosAportacion res, ObjDatosAportacionEmpresa aportacionEmpresa, Integer tipoAportacionIngreso) {
		Integer tipoAportacion = aportacionEmpresa.getAportacion().getCodAportacion();
		if (tipoAportacionIngreso == null || tipoAportacion.equals(tipoAportacionIngreso)) {
			String nroEmpresa = res.getClave().getNroEmpresa();
			Integer nroIntEmpresa = res.getClave().getNroIntEmp();
			String descAportacion = aportacionEmpresa.getAportacion().getDescAportacion();
			return new Empresa(nroIntEmpresa, nroEmpresa, tipoAportacion, descAportacion, null);
		}
		return null;
	}

	private List<ObjContribuyentePersonaFisicaNatJuridica> obtenerContribuyentesPorPersId(Integer persIdentificador, List<Error> errores){
		loguearInfo(String.format("obtenerContribuyentesPorPersId(persIdentificador:%s)", persIdentificador));
		ResultObtenerContribuyentesPorPersona result = wsRegContribuyente.obtenerContribuyentesPorPersona(persIdentificador);
		if(Utils.isNullOrEmpty(result) ||
				(Utils.isNullOrEmpty(result.getContribuyentesPorPersona())
						&& Utils.isNullOrEmpty(result.getErroresNegocio()))){
			return new ArrayList<>();
		}
		if(!Utils.isNullOrEmpty(result.getErroresNegocio())){
			Utils.loguearErroresNegocio(logger, result.getErroresNegocio());
			result.getErroresNegocio()
					.forEach( err -> errores.add(obtenerMensajeError(Utils.parseInt(err.getCodigo()),
							"BEFPSIOCPPI_1")));
			return new ArrayList<>();
		}

		return filtrarContribuyentes(result.getContribuyentesPorPersona());
	}

	private List<ObjContribuyenteEmpresas> obtenerEmpresas(Integer nroIntContr, List<Error> errores){
		loguearInfo(String.format("obtenerEmpresas(nroIntContr:%s)", nroIntContr));
		ResultObtenerListaRelEmpresa result = wsRegContribuyente.obtenerListaRelEmpresa(nroIntContr, properties.getFiltrarAnuladas());
		if(Utils.isNullOrEmpty(result) ||
				(Utils.isNullOrEmpty(result.getEmpresas())
						&& Utils.isNullOrEmpty(result.getErroresNegocio()))){
			errores.add(obtenerMensajeError(3, "BEFPSIOE_1"));
			return new ArrayList<>();
		}
		if(!Utils.isNullOrEmpty(result.getErroresNegocio())){
			Utils.loguearErroresNegocio(logger, result.getErroresNegocio());
			result.getErroresNegocio()
					.forEach( err -> errores.add(obtenerMensajeError(Utils.parseInt(err.getCodigo()),
							"BEFPSIOE_2")));
			return new ArrayList<>();
		}
		return filtrarEmpresas(result.getEmpresas());
	}

	private List<Empresa> obtenerEstadosAportacion(List<Empresa> empresas, Integer tipoAportacion, List<Error> errores){
		loguearInfo(String.format("obtenerEstadosAportacion(empresas:%s)", empresas.toString()));
		ResultObtenerListaEstadosAportacion result = wsRegEmpresa.obtenerListaEstadosAportacion(empresas);
		if(Utils.isNullOrEmpty(result) ||
				(Utils.isNullOrEmpty(result.getResultsObtenerEstadosAportacion())
						&& Utils.isNullOrEmpty(result.getErroresNegocio()))){
			return new ArrayList<>();
		}

		if(!Utils.isNullOrEmpty(result.getErroresNegocio())){
			Utils.loguearErroresNegocio(logger, result.getErroresNegocio());
			result.getErroresNegocio()
					.forEach( err -> errores.add(obtenerMensajeError(Utils.parseInt(err.getCodigo()),
							"BEFPSIOEA_1")));
			return new ArrayList<>();
		}

		List<ResultObtenerEstadosAportacion> resultsEstadosAportacion = result.getResultsObtenerEstadosAportacion();
		for (ResultObtenerEstadosAportacion res : resultsEstadosAportacion) {
			ParamObtenerEstadosAportacion param = res.getClave();
			empresas.stream()
					.filter(empresa -> empresa.getNroEmpresa().equals(param.getNroEmpresa()))
					.findFirst()
					.ifPresent(empresa -> param.setNroIntEmp(empresa.getNroIntEmp()));
		}

		return filtrarEstadosAportacion(resultsEstadosAportacion, tipoAportacion);
	}

	private Documento generarFacturas(String nroEmpresa, String usuario, Integer tipoAportacion, List<Error> errores){
		loguearInfo(String.format("generarFacturas(nroEmpresa:%s, usuario:%s)", nroEmpresa, usuario));
		ResultObtenerDocumentosPorEmpresa result = wsEmisorDocumento.obtenerDocumentosPorEmpresa(nroEmpresa, usuario);

		if(isResultadoEmidorDocumentoODPEIncorrecto(result)){
			errores.add(obtenerMensajeError(999, "BEFPSIGF_1"));
			return null;
		}

		if(!Utils.isNullOrEmpty(result.getErroresNegocio())){
			Utils.loguearErroresNegocio(logger, result.getErroresNegocio());
			result.getErroresNegocio()
					.forEach( err -> errores.add(obtenerMensajeError(Utils.parseInt(err.getCodigo()),
							"BEFPSIGF_2")));
			return null;
		}

		if(tieneErroresDeNegocio(result, tipoAportacion, errores)){
			return null;
		}

		return result.getDocumentosPorEmpresa();
	}

	private static boolean isResultadoEmidorDocumentoODPEIncorrecto(ResultObtenerDocumentosPorEmpresa result) {
		return Utils.isNullOrEmpty(result) ||
				(Utils.isNullOrEmpty(result.getDocumentosPorEmpresa()) && Utils.isNullOrEmpty(result.getErroresNegocio()));
	}

	private List<ResultObtenerDuplicadoDocumentoWs> consultarFacturas(List<Long> nrosReferencia, List<Error> errores){

		loguearInfo(String.format("consultarFacturas(nrosReferencia:%s)", nrosReferencia.toString()));

		List<ResultObtenerDuplicadoDocumentoWs> facturas = new ArrayList<>();
		for(Long nroReferencia : nrosReferencia){
			ResultObtenerDuplicadoDocumentoWs factura = wsEmisorConsulta.obtenerDocumentoPorNroReferencia(nroReferencia, properties.getNivelDetalleDuplicadoDocumento());
			if(factura == null){
				errores.add(obtenerMensajeError(999, "BEFPSICF_1"));
				return  new ArrayList<>();
			}
			if(!Utils.isNullOrEmpty(factura.getErroresNegocio())){
				Utils.loguearErroresNegocio(logger, factura.getErroresNegocio());
				factura.getErroresNegocio()
						.forEach( err -> errores.add(obtenerMensajeError(Utils.parseInt(err.getCodigo()),
								"BEFPSICF_2")));
				return new ArrayList<>();
			}
			facturas.add(factura);
		}

		return facturas;
	}

	private void loguearInfo(String mensaje){
		logger.log(Level.INFO, mensaje);
	}

	private void loguearError(String mensaje){
		logger.log(Level.ERROR, mensaje);
	}

	private Error obtenerMensajeError(Integer codigoError, String codigoInterno){
		String mensaje = mensajes.obtenerMensajeError(codigoError);
		String codigoFormateado = (codigoInterno.isBlank())? "" : String.format(" (Código interno: %s)", codigoInterno);
		loguearError(String.format("%s (Código: %s)%s", mensaje, codigoError, codigoFormateado));
		return new Error(codigoError, mensaje);
	}

	private boolean tieneErroresDeNegocio(ResultObtenerDocumentosPorEmpresa result, Integer tipoAportacion, List<Error> errores) {
		List<Error> erroresNegocio = new ArrayList<>();
		if(!Utils.isNullOrEmpty(result.getErroresNegocio())){
			result.getErroresNegocio()
					.forEach( err -> erroresNegocio.add(obtenerMensajeError(Utils.parseInt(err.getCodigo()),
							"BEFPSITEN_1")));
		}
		loguearInfo(String.format("Tipo de aportación incluído en la llamada: %s", tipoAportacion));
		for(FacturaPorEmpresa factura : result.getDocumentosPorEmpresa().getFacturaPorEmpresa()){
			loguearInfo(String.format("Factura %s. Tipo aportacion: %s", factura.getNroReferencia(), factura.getCodigoAportacion()));
			if((tipoAportacion == null || tipoAportacion == factura.getCodigoAportacion())
					&& !Utils.isNullOrEmpty(factura.getErroresNegocio())){
				loguearInfo("Se agrega la factura a la respuesta");
				factura.getErroresNegocio().forEach( err -> erroresNegocio.add(obtenerMensajeError(Utils.parseInt(err.getCodigo()),
						"BEFPSITEN_2")));
			}
		}
		errores.addAll(erroresNegocio);
		return !erroresNegocio.isEmpty();
	}
}