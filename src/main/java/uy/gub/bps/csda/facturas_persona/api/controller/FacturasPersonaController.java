package uy.gub.bps.csda.facturas_persona.api.controller;

import lombok.AllArgsConstructor;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uy.gub.bps.csda.facturas_persona.api.response.ApplicationResponse;
import uy.gub.bps.csda.facturas_persona.api.response.ApplicationResponseFactory;
import uy.gub.bps.csda.facturas_persona.core.properties.MensajesProperties;
import uy.gub.bps.csda.facturas_persona.dto.*;
import uy.gub.bps.csda.facturas_persona.dto.Error;
import uy.gub.bps.csda.facturas_persona.service.FacturasPersonaService;
import uy.gub.bps.csda.facturas_persona.util.Utils;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/wsFacturasPersona")
public class FacturasPersonaController {

	private FacturasPersonaService service;
	private MensajesProperties mensajes;
	private static final Logger logger = LogManager.getLogger(FacturasPersonaController.class);

	@GetMapping(value = "/obtenerFacturasPersona")
	public ResponseEntity<ApplicationResponse> obtenerFacturasPersona(@RequestParam(required = false) Integer persIdentificador,
																	  @RequestParam(required = false) Integer tipoAportacion,
																	  @RequestParam(required = false) String usuario) {

		logger.log(Level.INFO, String.format("obtenerFacturasPersona(persIdentificador:%s, tipoAportacion:%s, usuario:%s)", persIdentificador, tipoAportacion, usuario));

		List<Error> errores = new ArrayList<>();
		try {
			List<Empresa> empresas = service.obtenerFacturasPersona(persIdentificador, tipoAportacion, usuario, errores);
			if(Utils.isNullOrEmpty(empresas) && Utils.isNullOrEmpty(errores)){
				errores.add(obtenerMensajeErrorInesperado("BEFPCOFP_1"));
			}
			ApplicationResponse respuesta = armarRespuesta(empresas, errores);
			return new ResponseEntity<>(respuesta, HttpStatus.OK);
		}
		catch (Exception e) {
			if(Utils.isNullOrEmpty(errores)){
				errores.add(obtenerMensajeErrorInesperado("BEFPCOFP_2"));
			}
			ApplicationResponse respuesta = armarRespuesta((List<Empresa>) null, errores);
			return new ResponseEntity<>(respuesta, HttpStatus.OK);
		}
	}

	@GetMapping("/obtenerVersion")
	public ResponseEntity<ApplicationResponse> obtenerVersion() {
		List<Error> errores = new ArrayList<>();
		ResultVersion resultado = service.obtenerVersion();
		ApplicationResponse respuesta = armarRespuesta(resultado, errores);
		return new ResponseEntity<>(respuesta, HttpStatus.OK);
	}

	@GetMapping("/monitor")
	public ResponseEntity<ApplicationResponse> obtenerMonitor() {
		ResultMonitor resultado = service.obtenerMonitor();
		ApplicationResponse respuesta = armarRespuesta(resultado);
		return new ResponseEntity<>(respuesta, HttpStatus.OK);
	}

	private ApplicationResponse armarRespuesta(ResultVersion resultado, List<Error> errores) {
		ResponseVersion respuesta = new ResponseVersion();
		if(!errores.isEmpty()){
			respuesta.setResultVersion(null);
		}
		else{
			respuesta = new ResponseVersion(resultado);
		}
		return ApplicationResponseFactory.getInstance().buildSuccess(respuesta);
	}

	private ApplicationResponse armarRespuesta(ResultMonitor resultado) {
		if(Boolean.TRUE.equals(resultado.getOk())){
			return ApplicationResponseFactory.getInstance().buildSuccess(resultado);
		}
		return ApplicationResponseFactory.getInstance().buildError(resultado.getResultados().toString());
	}

	private ApplicationResponse armarRespuesta(List<Empresa> empresas, List<Error> errores){
		ResultObtenerFacturasPersona resultado = new ResultObtenerFacturasPersona();
		if(Utils.isNullOrEmpty(errores)) {
			resultado.setColErrores(null);
			resultado.setColEmpresas(empresas);
		}
		else {
			resultado.setColErrores(errores);
			resultado.setColEmpresas(null);
		}
		ResponseObtenerFacturasPersona response = new ResponseObtenerFacturasPersona(resultado);
		return ApplicationResponseFactory.getInstance().buildSuccess(response);
	}

	private Error obtenerMensajeErrorInesperado(String codigoInterno){
		String mensaje = mensajes.obtenerMensajeError(999);
		String codigoFormateado = (codigoInterno.isBlank())? "" : String.format(" (Código interno: %s)", codigoInterno);
		loguearError(String.format("%s (Código: %s)%s", mensaje, 999, codigoFormateado));
		return new Error(999, mensaje);
	}

	private void loguearError(String mensaje){
		logger.log(Level.ERROR, mensaje);
	}
}