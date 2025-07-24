
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uy.gub.bps.csda.facturas_persona.web_services.soap.WsRegContribuyenteService package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ObtenerAtributosEspeciales_QNAME = new QName("http://bps.gub.uy/registro/contribuyentes/v003", "obtenerAtributosEspeciales");
    private final static QName _ObtenerAtributosEspecialesResponse_QNAME = new QName("http://bps.gub.uy/registro/contribuyentes/v003", "obtenerAtributosEspecialesResponse");
    private final static QName _ObtenerContribuyente_QNAME = new QName("http://bps.gub.uy/registro/contribuyentes/v003", "obtenerContribuyente");
    private final static QName _ObtenerContribuyenteResponse_QNAME = new QName("http://bps.gub.uy/registro/contribuyentes/v003", "obtenerContribuyenteResponse");
    private final static QName _ObtenerContribuyentesPorPersona_QNAME = new QName("http://bps.gub.uy/registro/contribuyentes/v003", "obtenerContribuyentesPorPersona");
    private final static QName _ObtenerContribuyentesPorPersonaResponse_QNAME = new QName("http://bps.gub.uy/registro/contribuyentes/v003", "obtenerContribuyentesPorPersonaResponse");
    private final static QName _ObtenerIntegrantesFisicos_QNAME = new QName("http://bps.gub.uy/registro/contribuyentes/v003", "obtenerIntegrantesFisicos");
    private final static QName _ObtenerIntegrantesFisicosResponse_QNAME = new QName("http://bps.gub.uy/registro/contribuyentes/v003", "obtenerIntegrantesFisicosResponse");
    private final static QName _ObtenerIntegrantesJuridicos_QNAME = new QName("http://bps.gub.uy/registro/contribuyentes/v003", "obtenerIntegrantesJuridicos");
    private final static QName _ObtenerIntegrantesJuridicosResponse_QNAME = new QName("http://bps.gub.uy/registro/contribuyentes/v003", "obtenerIntegrantesJuridicosResponse");
    private final static QName _ObtenerListaContribuyente_QNAME = new QName("http://bps.gub.uy/registro/contribuyentes/v003", "obtenerListaContribuyente");
    private final static QName _ObtenerListaContribuyenteResponse_QNAME = new QName("http://bps.gub.uy/registro/contribuyentes/v003", "obtenerListaContribuyenteResponse");
    private final static QName _ObtenerListaRelEmpresa_QNAME = new QName("http://bps.gub.uy/registro/contribuyentes/v003", "obtenerListaRelEmpresa");
    private final static QName _ObtenerListaRelEmpresaResponse_QNAME = new QName("http://bps.gub.uy/registro/contribuyentes/v003", "obtenerListaRelEmpresaResponse");
    private final static QName _ObtenerNaturalezasJuridicas_QNAME = new QName("http://bps.gub.uy/registro/contribuyentes/v003", "obtenerNaturalezasJuridicas");
    private final static QName _ObtenerNaturalezasJuridicasResponse_QNAME = new QName("http://bps.gub.uy/registro/contribuyentes/v003", "obtenerNaturalezasJuridicasResponse");
    private final static QName _ValidarContribuyente_QNAME = new QName("http://bps.gub.uy/registro/contribuyentes/v003", "validarContribuyente");
    private final static QName _ValidarContribuyenteResponse_QNAME = new QName("http://bps.gub.uy/registro/contribuyentes/v003", "validarContribuyenteResponse");
    private final static QName _Version_QNAME = new QName("http://bps.gub.uy/registro/contribuyentes/v003", "version");
    private final static QName _VersionResponse_QNAME = new QName("http://bps.gub.uy/registro/contribuyentes/v003", "versionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uy.gub.bps.csda.facturas_persona.web_services.soap.WsRegContribuyenteService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ErrorNegocio }
     * 
     */
    public ErrorNegocio createErrorNegocio() {
        return new ErrorNegocio();
    }

    /**
     * Create an instance of {@link ResultVersion }
     * 
     */
    public ResultVersion createResultVersion() {
        return new ResultVersion();
    }

    /**
     * Create an instance of {@link ParamObtenerNaturalezasJuridicas }
     * 
     */
    public ParamObtenerNaturalezasJuridicas createParamObtenerNaturalezasJuridicas() {
        return new ParamObtenerNaturalezasJuridicas();
    }

    /**
     * Create an instance of {@link ResultObtenerNaturalezasJuridicas }
     * 
     */
    public ResultObtenerNaturalezasJuridicas createResultObtenerNaturalezasJuridicas() {
        return new ResultObtenerNaturalezasJuridicas();
    }

    /**
     * Create an instance of {@link ParamObtenerAtributosEspeciales }
     * 
     */
    public ParamObtenerAtributosEspeciales createParamObtenerAtributosEspeciales() {
        return new ParamObtenerAtributosEspeciales();
    }

    /**
     * Create an instance of {@link ResultObtenerAtributosEspeciales }
     * 
     */
    public ResultObtenerAtributosEspeciales createResultObtenerAtributosEspeciales() {
        return new ResultObtenerAtributosEspeciales();
    }

    /**
     * Create an instance of {@link ParamObtenerListaRelEmpresa }
     * 
     */
    public ParamObtenerListaRelEmpresa createParamObtenerListaRelEmpresa() {
        return new ParamObtenerListaRelEmpresa();
    }

    /**
     * Create an instance of {@link ResultObtenerListaRelEmpresa }
     * 
     */
    public ResultObtenerListaRelEmpresa createResultObtenerListaRelEmpresa() {
        return new ResultObtenerListaRelEmpresa();
    }

    /**
     * Create an instance of {@link ParamObtenerIntegrantesJuridicos }
     * 
     */
    public ParamObtenerIntegrantesJuridicos createParamObtenerIntegrantesJuridicos() {
        return new ParamObtenerIntegrantesJuridicos();
    }

    /**
     * Create an instance of {@link ResultObtenerIntegrantesJuridicos }
     * 
     */
    public ResultObtenerIntegrantesJuridicos createResultObtenerIntegrantesJuridicos() {
        return new ResultObtenerIntegrantesJuridicos();
    }

    /**
     * Create an instance of {@link ParamObtenerListaContribuyente }
     * 
     */
    public ParamObtenerListaContribuyente createParamObtenerListaContribuyente() {
        return new ParamObtenerListaContribuyente();
    }

    /**
     * Create an instance of {@link ResultObtenerListaContribuyente }
     * 
     */
    public ResultObtenerListaContribuyente createResultObtenerListaContribuyente() {
        return new ResultObtenerListaContribuyente();
    }

    /**
     * Create an instance of {@link ParamValContribuyente }
     * 
     */
    public ParamValContribuyente createParamValContribuyente() {
        return new ParamValContribuyente();
    }

    /**
     * Create an instance of {@link ResultValidarContribuyente }
     * 
     */
    public ResultValidarContribuyente createResultValidarContribuyente() {
        return new ResultValidarContribuyente();
    }

    /**
     * Create an instance of {@link ParamObtenerContribuyentesPorPersona }
     * 
     */
    public ParamObtenerContribuyentesPorPersona createParamObtenerContribuyentesPorPersona() {
        return new ParamObtenerContribuyentesPorPersona();
    }

    /**
     * Create an instance of {@link ResultObtenerContribuyentesPorPersona }
     * 
     */
    public ResultObtenerContribuyentesPorPersona createResultObtenerContribuyentesPorPersona() {
        return new ResultObtenerContribuyentesPorPersona();
    }

    /**
     * Create an instance of {@link ParamObtenerContribuyente }
     * 
     */
    public ParamObtenerContribuyente createParamObtenerContribuyente() {
        return new ParamObtenerContribuyente();
    }

    /**
     * Create an instance of {@link ResultObtenerContribuyente }
     * 
     */
    public ResultObtenerContribuyente createResultObtenerContribuyente() {
        return new ResultObtenerContribuyente();
    }

    /**
     * Create an instance of {@link ObtenerAtributosEspeciales }
     * 
     */
    public ObtenerAtributosEspeciales createObtenerAtributosEspeciales() {
        return new ObtenerAtributosEspeciales();
    }

    /**
     * Create an instance of {@link ObtenerAtributosEspecialesResponse }
     * 
     */
    public ObtenerAtributosEspecialesResponse createObtenerAtributosEspecialesResponse() {
        return new ObtenerAtributosEspecialesResponse();
    }

    /**
     * Create an instance of {@link ObtenerContribuyente }
     * 
     */
    public ObtenerContribuyente createObtenerContribuyente() {
        return new ObtenerContribuyente();
    }

    /**
     * Create an instance of {@link ObtenerContribuyenteResponse }
     * 
     */
    public ObtenerContribuyenteResponse createObtenerContribuyenteResponse() {
        return new ObtenerContribuyenteResponse();
    }

    /**
     * Create an instance of {@link ObtenerContribuyentesPorPersona }
     * 
     */
    public ObtenerContribuyentesPorPersona createObtenerContribuyentesPorPersona() {
        return new ObtenerContribuyentesPorPersona();
    }

    /**
     * Create an instance of {@link ObtenerContribuyentesPorPersonaResponse }
     * 
     */
    public ObtenerContribuyentesPorPersonaResponse createObtenerContribuyentesPorPersonaResponse() {
        return new ObtenerContribuyentesPorPersonaResponse();
    }

    /**
     * Create an instance of {@link ObtenerIntegrantesFisicos }
     * 
     */
    public ObtenerIntegrantesFisicos createObtenerIntegrantesFisicos() {
        return new ObtenerIntegrantesFisicos();
    }

    /**
     * Create an instance of {@link ObtenerIntegrantesFisicosResponse }
     * 
     */
    public ObtenerIntegrantesFisicosResponse createObtenerIntegrantesFisicosResponse() {
        return new ObtenerIntegrantesFisicosResponse();
    }

    /**
     * Create an instance of {@link ObtenerIntegrantesJuridicos }
     * 
     */
    public ObtenerIntegrantesJuridicos createObtenerIntegrantesJuridicos() {
        return new ObtenerIntegrantesJuridicos();
    }

    /**
     * Create an instance of {@link ObtenerIntegrantesJuridicosResponse }
     * 
     */
    public ObtenerIntegrantesJuridicosResponse createObtenerIntegrantesJuridicosResponse() {
        return new ObtenerIntegrantesJuridicosResponse();
    }

    /**
     * Create an instance of {@link ObtenerListaContribuyente }
     * 
     */
    public ObtenerListaContribuyente createObtenerListaContribuyente() {
        return new ObtenerListaContribuyente();
    }

    /**
     * Create an instance of {@link ObtenerListaContribuyenteResponse }
     * 
     */
    public ObtenerListaContribuyenteResponse createObtenerListaContribuyenteResponse() {
        return new ObtenerListaContribuyenteResponse();
    }

    /**
     * Create an instance of {@link ObtenerListaRelEmpresa }
     * 
     */
    public ObtenerListaRelEmpresa createObtenerListaRelEmpresa() {
        return new ObtenerListaRelEmpresa();
    }

    /**
     * Create an instance of {@link ObtenerListaRelEmpresaResponse }
     * 
     */
    public ObtenerListaRelEmpresaResponse createObtenerListaRelEmpresaResponse() {
        return new ObtenerListaRelEmpresaResponse();
    }

    /**
     * Create an instance of {@link ObtenerNaturalezasJuridicas }
     * 
     */
    public ObtenerNaturalezasJuridicas createObtenerNaturalezasJuridicas() {
        return new ObtenerNaturalezasJuridicas();
    }

    /**
     * Create an instance of {@link ObtenerNaturalezasJuridicasResponse }
     * 
     */
    public ObtenerNaturalezasJuridicasResponse createObtenerNaturalezasJuridicasResponse() {
        return new ObtenerNaturalezasJuridicasResponse();
    }

    /**
     * Create an instance of {@link ValidarContribuyente }
     * 
     */
    public ValidarContribuyente createValidarContribuyente() {
        return new ValidarContribuyente();
    }

    /**
     * Create an instance of {@link ValidarContribuyenteResponse }
     * 
     */
    public ValidarContribuyenteResponse createValidarContribuyenteResponse() {
        return new ValidarContribuyenteResponse();
    }

    /**
     * Create an instance of {@link Version }
     * 
     */
    public Version createVersion() {
        return new Version();
    }

    /**
     * Create an instance of {@link VersionResponse }
     * 
     */
    public VersionResponse createVersionResponse() {
        return new VersionResponse();
    }

    /**
     * Create an instance of {@link ObjContribuyente }
     * 
     */
    public ObjContribuyente createObjContribuyente() {
        return new ObjContribuyente();
    }

    /**
     * Create an instance of {@link ParamPeriodo }
     * 
     */
    public ParamPeriodo createParamPeriodo() {
        return new ParamPeriodo();
    }

    /**
     * Create an instance of {@link ObjRelacionLaboralPeriodo }
     * 
     */
    public ObjRelacionLaboralPeriodo createObjRelacionLaboralPeriodo() {
        return new ObjRelacionLaboralPeriodo();
    }

    /**
     * Create an instance of {@link ObjRelacionEmpContr }
     * 
     */
    public ObjRelacionEmpContr createObjRelacionEmpContr() {
        return new ObjRelacionEmpContr();
    }

    /**
     * Create an instance of {@link ObjPeriodo }
     * 
     */
    public ObjPeriodo createObjPeriodo() {
        return new ObjPeriodo();
    }

    /**
     * Create an instance of {@link ObjNatJuridicaPeriodo }
     * 
     */
    public ObjNatJuridicaPeriodo createObjNatJuridicaPeriodo() {
        return new ObjNatJuridicaPeriodo();
    }

    /**
     * Create an instance of {@link ObjContribuyente2 }
     * 
     */
    public ObjContribuyente2 createObjContribuyente2() {
        return new ObjContribuyente2();
    }

    /**
     * Create an instance of {@link ObjDenominacionPeriodo }
     * 
     */
    public ObjDenominacionPeriodo createObjDenominacionPeriodo() {
        return new ObjDenominacionPeriodo();
    }

    /**
     * Create an instance of {@link ObjContribuyenteEmpresas }
     * 
     */
    public ObjContribuyenteEmpresas createObjContribuyenteEmpresas() {
        return new ObjContribuyenteEmpresas();
    }

    /**
     * Create an instance of {@link ObjEmpresa }
     * 
     */
    public ObjEmpresa createObjEmpresa() {
        return new ObjEmpresa();
    }

    /**
     * Create an instance of {@link ObjContribuyentePersonaFisicaNatJuridica }
     * 
     */
    public ObjContribuyentePersonaFisicaNatJuridica createObjContribuyentePersonaFisicaNatJuridica() {
        return new ObjContribuyentePersonaFisicaNatJuridica();
    }

    /**
     * Create an instance of {@link ObjPersonaFisica }
     * 
     */
    public ObjPersonaFisica createObjPersonaFisica() {
        return new ObjPersonaFisica();
    }

    /**
     * Create an instance of {@link ObjRelacionLaboralPeriodo2 }
     * 
     */
    public ObjRelacionLaboralPeriodo2 createObjRelacionLaboralPeriodo2() {
        return new ObjRelacionLaboralPeriodo2();
    }

    /**
     * Create an instance of {@link ObjDatosContribuyente }
     * 
     */
    public ObjDatosContribuyente createObjDatosContribuyente() {
        return new ObjDatosContribuyente();
    }

    /**
     * Create an instance of {@link ObjDomicilioPeriodo }
     * 
     */
    public ObjDomicilioPeriodo createObjDomicilioPeriodo() {
        return new ObjDomicilioPeriodo();
    }

    /**
     * Create an instance of {@link ObjDomicilio }
     * 
     */
    public ObjDomicilio createObjDomicilio() {
        return new ObjDomicilio();
    }

    /**
     * Create an instance of {@link ObjRelacionEmpContr2 }
     * 
     */
    public ObjRelacionEmpContr2 createObjRelacionEmpContr2() {
        return new ObjRelacionEmpContr2();
    }

    /**
     * Create an instance of {@link ObjNatJuridica }
     * 
     */
    public ObjNatJuridica createObjNatJuridica() {
        return new ObjNatJuridica();
    }

    /**
     * Create an instance of {@link ObjIntegranteJuridico }
     * 
     */
    public ObjIntegranteJuridico createObjIntegranteJuridico() {
        return new ObjIntegranteJuridico();
    }

    /**
     * Create an instance of {@link ObjCausal }
     * 
     */
    public ObjCausal createObjCausal() {
        return new ObjCausal();
    }

    /**
     * Create an instance of {@link ObjPeriodo2 }
     * 
     */
    public ObjPeriodo2 createObjPeriodo2() {
        return new ObjPeriodo2();
    }

    /**
     * Create an instance of {@link ObjRelacionLaboral }
     * 
     */
    public ObjRelacionLaboral createObjRelacionLaboral() {
        return new ObjRelacionLaboral();
    }

    /**
     * Create an instance of {@link ObjCalle }
     * 
     */
    public ObjCalle createObjCalle() {
        return new ObjCalle();
    }

    /**
     * Create an instance of {@link ObjLocalidad }
     * 
     */
    public ObjLocalidad createObjLocalidad() {
        return new ObjLocalidad();
    }

    /**
     * Create an instance of {@link ObjDepartamento }
     * 
     */
    public ObjDepartamento createObjDepartamento() {
        return new ObjDepartamento();
    }

    /**
     * Create an instance of {@link ObjGirosEmpresa }
     * 
     */
    public ObjGirosEmpresa createObjGirosEmpresa() {
        return new ObjGirosEmpresa();
    }

    /**
     * Create an instance of {@link ObjGiroPeriodo }
     * 
     */
    public ObjGiroPeriodo createObjGiroPeriodo() {
        return new ObjGiroPeriodo();
    }

    /**
     * Create an instance of {@link ObjGiro }
     * 
     */
    public ObjGiro createObjGiro() {
        return new ObjGiro();
    }

    /**
     * Create an instance of {@link ObjDomicilio2 }
     * 
     */
    public ObjDomicilio2 createObjDomicilio2() {
        return new ObjDomicilio2();
    }

    /**
     * Create an instance of {@link ObjAportacion }
     * 
     */
    public ObjAportacion createObjAportacion() {
        return new ObjAportacion();
    }

    /**
     * Create an instance of {@link ObjEmpresaContribuyentes }
     * 
     */
    public ObjEmpresaContribuyentes createObjEmpresaContribuyentes() {
        return new ObjEmpresaContribuyentes();
    }

    /**
     * Create an instance of {@link ObjDatosAportacionEmpresa }
     * 
     */
    public ObjDatosAportacionEmpresa createObjDatosAportacionEmpresa() {
        return new ObjDatosAportacionEmpresa();
    }

    /**
     * Create an instance of {@link ObjEstadoAportacion }
     * 
     */
    public ObjEstadoAportacion createObjEstadoAportacion() {
        return new ObjEstadoAportacion();
    }

    /**
     * Create an instance of {@link ObjIntegranteFisico }
     * 
     */
    public ObjIntegranteFisico createObjIntegranteFisico() {
        return new ObjIntegranteFisico();
    }

    /**
     * Create an instance of {@link ObjContribuyenteAtrEspecialPeriodo }
     * 
     */
    public ObjContribuyenteAtrEspecialPeriodo createObjContribuyenteAtrEspecialPeriodo() {
        return new ObjContribuyenteAtrEspecialPeriodo();
    }

    /**
     * Create an instance of {@link ObjAtributoEspecialPeriodo }
     * 
     */
    public ObjAtributoEspecialPeriodo createObjAtributoEspecialPeriodo() {
        return new ObjAtributoEspecialPeriodo();
    }

    /**
     * Create an instance of {@link ObjGenericCodeInt }
     * 
     */
    public ObjGenericCodeInt createObjGenericCodeInt() {
        return new ObjGenericCodeInt();
    }

    /**
     * Create an instance of {@link ObjEmail }
     * 
     */
    public ObjEmail createObjEmail() {
        return new ObjEmail();
    }

    /**
     * Create an instance of {@link ObjTelefono }
     * 
     */
    public ObjTelefono createObjTelefono() {
        return new ObjTelefono();
    }

    /**
     * Create an instance of {@link ObjGirosEmpresa2 }
     * 
     */
    public ObjGirosEmpresa2 createObjGirosEmpresa2() {
        return new ObjGirosEmpresa2();
    }

    /**
     * Create an instance of {@link ObjGiroPeriodo2 }
     * 
     */
    public ObjGiroPeriodo2 createObjGiroPeriodo2() {
        return new ObjGiroPeriodo2();
    }

    /**
     * Create an instance of {@link ObjCausal2 }
     * 
     */
    public ObjCausal2 createObjCausal2() {
        return new ObjCausal2();
    }

    /**
     * Create an instance of {@link ObjGiro2 }
     * 
     */
    public ObjGiro2 createObjGiro2() {
        return new ObjGiro2();
    }

    /**
     * Create an instance of {@link ObjPeriodo3 }
     * 
     */
    public ObjPeriodo3 createObjPeriodo3() {
        return new ObjPeriodo3();
    }

    /**
     * Create an instance of {@link ColGirosPeriodo }
     * 
     */
    public ColGirosPeriodo createColGirosPeriodo() {
        return new ColGirosPeriodo();
    }

    /**
     * Create an instance of {@link ObjContibuyenteEmpresaSueldoFicto }
     * 
     */
    public ObjContibuyenteEmpresaSueldoFicto createObjContibuyenteEmpresaSueldoFicto() {
        return new ObjContibuyenteEmpresaSueldoFicto();
    }

    /**
     * Create an instance of {@link ObjContribuyente3 }
     * 
     */
    public ObjContribuyente3 createObjContribuyente3() {
        return new ObjContribuyente3();
    }

    /**
     * Create an instance of {@link ObjDenominacionPeriodo2 }
     * 
     */
    public ObjDenominacionPeriodo2 createObjDenominacionPeriodo2() {
        return new ObjDenominacionPeriodo2();
    }

    /**
     * Create an instance of {@link ObjEmpresa2 }
     * 
     */
    public ObjEmpresa2 createObjEmpresa2() {
        return new ObjEmpresa2();
    }

    /**
     * Create an instance of {@link ObjSueldoFictoPeriodo }
     * 
     */
    public ObjSueldoFictoPeriodo createObjSueldoFictoPeriodo() {
        return new ObjSueldoFictoPeriodo();
    }

    /**
     * Create an instance of {@link ObjSueldoFicto }
     * 
     */
    public ObjSueldoFicto createObjSueldoFicto() {
        return new ObjSueldoFicto();
    }

    /**
     * Create an instance of {@link ObjTipoSueldoFicto }
     * 
     */
    public ObjTipoSueldoFicto createObjTipoSueldoFicto() {
        return new ObjTipoSueldoFicto();
    }

    /**
     * Create an instance of {@link ColContribuyentes }
     * 
     */
    public ColContribuyentes createColContribuyentes() {
        return new ColContribuyentes();
    }

    /**
     * Create an instance of {@link ObjDatosContribuyente2 }
     * 
     */
    public ObjDatosContribuyente2 createObjDatosContribuyente2() {
        return new ObjDatosContribuyente2();
    }

    /**
     * Create an instance of {@link ObjDomicilioPeriodo2 }
     * 
     */
    public ObjDomicilioPeriodo2 createObjDomicilioPeriodo2() {
        return new ObjDomicilioPeriodo2();
    }

    /**
     * Create an instance of {@link ObjDomicilio3 }
     * 
     */
    public ObjDomicilio3 createObjDomicilio3() {
        return new ObjDomicilio3();
    }

    /**
     * Create an instance of {@link ObjCalle2 }
     * 
     */
    public ObjCalle2 createObjCalle2() {
        return new ObjCalle2();
    }

    /**
     * Create an instance of {@link ObjLocalidad2 }
     * 
     */
    public ObjLocalidad2 createObjLocalidad2() {
        return new ObjLocalidad2();
    }

    /**
     * Create an instance of {@link ObjDepartamento2 }
     * 
     */
    public ObjDepartamento2 createObjDepartamento2() {
        return new ObjDepartamento2();
    }

    /**
     * Create an instance of {@link ColEmpresasRelacionadas }
     * 
     */
    public ColEmpresasRelacionadas createColEmpresasRelacionadas() {
        return new ColEmpresasRelacionadas();
    }

    /**
     * Create an instance of {@link ObjContribuyenteEmpresas2 }
     * 
     */
    public ObjContribuyenteEmpresas2 createObjContribuyenteEmpresas2() {
        return new ObjContribuyenteEmpresas2();
    }

    /**
     * Create an instance of {@link ObjRelacionEmpContr3 }
     * 
     */
    public ObjRelacionEmpContr3 createObjRelacionEmpContr3() {
        return new ObjRelacionEmpContr3();
    }

    /**
     * Create an instance of {@link ColNatJuridicaPeriodo }
     * 
     */
    public ColNatJuridicaPeriodo createColNatJuridicaPeriodo() {
        return new ColNatJuridicaPeriodo();
    }

    /**
     * Create an instance of {@link ObjNatJuridicaPeriodo2 }
     * 
     */
    public ObjNatJuridicaPeriodo2 createObjNatJuridicaPeriodo2() {
        return new ObjNatJuridicaPeriodo2();
    }

    /**
     * Create an instance of {@link ObjNatJuridica2 }
     * 
     */
    public ObjNatJuridica2 createObjNatJuridica2() {
        return new ObjNatJuridica2();
    }

    /**
     * Create an instance of {@link ColContribuyentePersonaFisicaNatJuridica }
     * 
     */
    public ColContribuyentePersonaFisicaNatJuridica createColContribuyentePersonaFisicaNatJuridica() {
        return new ColContribuyentePersonaFisicaNatJuridica();
    }

    /**
     * Create an instance of {@link ObjContribuyentePersonaFisicaNatJuridica2 }
     * 
     */
    public ObjContribuyentePersonaFisicaNatJuridica2 createObjContribuyentePersonaFisicaNatJuridica2() {
        return new ObjContribuyentePersonaFisicaNatJuridica2();
    }

    /**
     * Create an instance of {@link ObjPersonaFisica2 }
     * 
     */
    public ObjPersonaFisica2 createObjPersonaFisica2() {
        return new ObjPersonaFisica2();
    }

    /**
     * Create an instance of {@link ColRelacionLaboralPeriodo }
     * 
     */
    public ColRelacionLaboralPeriodo createColRelacionLaboralPeriodo() {
        return new ColRelacionLaboralPeriodo();
    }

    /**
     * Create an instance of {@link ObjRelacionLaboralPeriodo3 }
     * 
     */
    public ObjRelacionLaboralPeriodo3 createObjRelacionLaboralPeriodo3() {
        return new ObjRelacionLaboralPeriodo3();
    }

    /**
     * Create an instance of {@link ObjRelacionLaboral2 }
     * 
     */
    public ObjRelacionLaboral2 createObjRelacionLaboral2() {
        return new ObjRelacionLaboral2();
    }

    /**
     * Create an instance of {@link ColTipoClaveContrib }
     * 
     */
    public ColTipoClaveContrib createColTipoClaveContrib() {
        return new ColTipoClaveContrib();
    }

    /**
     * Create an instance of {@link ObjTipoClaveContrib }
     * 
     */
    public ObjTipoClaveContrib createObjTipoClaveContrib() {
        return new ObjTipoClaveContrib();
    }

    /**
     * Create an instance of {@link ColAEEmp }
     * 
     */
    public ColAEEmp createColAEEmp() {
        return new ColAEEmp();
    }

    /**
     * Create an instance of {@link ObjAEEmp }
     * 
     */
    public ObjAEEmp createObjAEEmp() {
        return new ObjAEEmp();
    }

    /**
     * Create an instance of {@link ColAportaciones }
     * 
     */
    public ColAportaciones createColAportaciones() {
        return new ColAportaciones();
    }

    /**
     * Create an instance of {@link ObjAportacion2 }
     * 
     */
    public ObjAportacion2 createObjAportacion2() {
        return new ObjAportacion2();
    }

    /**
     * Create an instance of {@link ColGiros }
     * 
     */
    public ColGiros createColGiros() {
        return new ColGiros();
    }

    /**
     * Create an instance of {@link ColDivisiones }
     * 
     */
    public ColDivisiones createColDivisiones() {
        return new ColDivisiones();
    }

    /**
     * Create an instance of {@link ObjDivision }
     * 
     */
    public ObjDivision createObjDivision() {
        return new ObjDivision();
    }

    /**
     * Create an instance of {@link ColGrupos }
     * 
     */
    public ColGrupos createColGrupos() {
        return new ColGrupos();
    }

    /**
     * Create an instance of {@link ObjGrupo }
     * 
     */
    public ObjGrupo createObjGrupo() {
        return new ObjGrupo();
    }

    /**
     * Create an instance of {@link ColCategoriaSueldoFicto }
     * 
     */
    public ColCategoriaSueldoFicto createColCategoriaSueldoFicto() {
        return new ColCategoriaSueldoFicto();
    }

    /**
     * Create an instance of {@link ObjCategoriaSueldoFicto }
     * 
     */
    public ObjCategoriaSueldoFicto createObjCategoriaSueldoFicto() {
        return new ObjCategoriaSueldoFicto();
    }

    /**
     * Create an instance of {@link ColCausal }
     * 
     */
    public ColCausal createColCausal() {
        return new ColCausal();
    }

    /**
     * Create an instance of {@link ColRelacionesLaborales }
     * 
     */
    public ColRelacionesLaborales createColRelacionesLaborales() {
        return new ColRelacionesLaborales();
    }

    /**
     * Create an instance of {@link ColTipoSueldoFicto }
     * 
     */
    public ColTipoSueldoFicto createColTipoSueldoFicto() {
        return new ColTipoSueldoFicto();
    }

    /**
     * Create an instance of {@link ObjTipoTitularVehiculo }
     * 
     */
    public ObjTipoTitularVehiculo createObjTipoTitularVehiculo() {
        return new ObjTipoTitularVehiculo();
    }

    /**
     * Create an instance of {@link ColTipoTitularVehiculo }
     * 
     */
    public ColTipoTitularVehiculo createColTipoTitularVehiculo() {
        return new ColTipoTitularVehiculo();
    }

    /**
     * Create an instance of {@link ColRelacionEmpApo }
     * 
     */
    public ColRelacionEmpApo createColRelacionEmpApo() {
        return new ColRelacionEmpApo();
    }

    /**
     * Create an instance of {@link ObjRelacionEmpApo }
     * 
     */
    public ObjRelacionEmpApo createObjRelacionEmpApo() {
        return new ObjRelacionEmpApo();
    }

    /**
     * Create an instance of {@link ColRelacionEmpContr }
     * 
     */
    public ColRelacionEmpContr createColRelacionEmpContr() {
        return new ColRelacionEmpContr();
    }

    /**
     * Create an instance of {@link ColFormaTenencia }
     * 
     */
    public ColFormaTenencia createColFormaTenencia() {
        return new ColFormaTenencia();
    }

    /**
     * Create an instance of {@link ObjFormaTenencia }
     * 
     */
    public ObjFormaTenencia createObjFormaTenencia() {
        return new ObjFormaTenencia();
    }

    /**
     * Create an instance of {@link ObjTipoVehiculo }
     * 
     */
    public ObjTipoVehiculo createObjTipoVehiculo() {
        return new ObjTipoVehiculo();
    }

    /**
     * Create an instance of {@link ColTipoVehiculo }
     * 
     */
    public ColTipoVehiculo createColTipoVehiculo() {
        return new ColTipoVehiculo();
    }

    /**
     * Create an instance of {@link ColLocalidadesBasico }
     * 
     */
    public ColLocalidadesBasico createColLocalidadesBasico() {
        return new ColLocalidadesBasico();
    }

    /**
     * Create an instance of {@link ObjLocalidadBasico }
     * 
     */
    public ObjLocalidadBasico createObjLocalidadBasico() {
        return new ObjLocalidadBasico();
    }

    /**
     * Create an instance of {@link ObjLocalBPS }
     * 
     */
    public ObjLocalBPS createObjLocalBPS() {
        return new ObjLocalBPS();
    }

    /**
     * Create an instance of {@link ColLocalBPS }
     * 
     */
    public ColLocalBPS createColLocalBPS() {
        return new ColLocalBPS();
    }

    /**
     * Create an instance of {@link ObjCalleBasico }
     * 
     */
    public ObjCalleBasico createObjCalleBasico() {
        return new ObjCalleBasico();
    }

    /**
     * Create an instance of {@link ColCallesBasico }
     * 
     */
    public ColCallesBasico createColCallesBasico() {
        return new ColCallesBasico();
    }

    /**
     * Create an instance of {@link ColDepartamentos }
     * 
     */
    public ColDepartamentos createColDepartamentos() {
        return new ColDepartamentos();
    }

    /**
     * Create an instance of {@link ColEstablecimientos }
     * 
     */
    public ColEstablecimientos createColEstablecimientos() {
        return new ColEstablecimientos();
    }

    /**
     * Create an instance of {@link ObjEstablecimiento }
     * 
     */
    public ObjEstablecimiento createObjEstablecimiento() {
        return new ObjEstablecimiento();
    }

    /**
     * Create an instance of {@link ColEmails }
     * 
     */
    public ColEmails createColEmails() {
        return new ColEmails();
    }

    /**
     * Create an instance of {@link ObjEmpresaContribuyentes2 }
     * 
     */
    public ObjEmpresaContribuyentes2 createObjEmpresaContribuyentes2() {
        return new ObjEmpresaContribuyentes2();
    }

    /**
     * Create an instance of {@link ColContribuyentesRelacionados }
     * 
     */
    public ColContribuyentesRelacionados createColContribuyentesRelacionados() {
        return new ColContribuyentesRelacionados();
    }

    /**
     * Create an instance of {@link ColDatosAportacionEmpresa }
     * 
     */
    public ColDatosAportacionEmpresa createColDatosAportacionEmpresa() {
        return new ColDatosAportacionEmpresa();
    }

    /**
     * Create an instance of {@link ObjDatosAportacionEmpresa2 }
     * 
     */
    public ObjDatosAportacionEmpresa2 createObjDatosAportacionEmpresa2() {
        return new ObjDatosAportacionEmpresa2();
    }

    /**
     * Create an instance of {@link ColEstadosAportacion }
     * 
     */
    public ColEstadosAportacion createColEstadosAportacion() {
        return new ColEstadosAportacion();
    }

    /**
     * Create an instance of {@link ObjEstadoAportacion2 }
     * 
     */
    public ObjEstadoAportacion2 createObjEstadoAportacion2() {
        return new ObjEstadoAportacion2();
    }

    /**
     * Create an instance of {@link ColTelefonos }
     * 
     */
    public ColTelefonos createColTelefonos() {
        return new ColTelefonos();
    }

    /**
     * Create an instance of {@link ColFaxes }
     * 
     */
    public ColFaxes createColFaxes() {
        return new ColFaxes();
    }

    /**
     * Create an instance of {@link ObjFax }
     * 
     */
    public ObjFax createObjFax() {
        return new ObjFax();
    }

    /**
     * Create an instance of {@link ColEmpresa }
     * 
     */
    public ColEmpresa createColEmpresa() {
        return new ColEmpresa();
    }

    /**
     * Create an instance of {@link ResultObtenerIntegrantesFisicos }
     * 
     */
    public ResultObtenerIntegrantesFisicos createResultObtenerIntegrantesFisicos() {
        return new ResultObtenerIntegrantesFisicos();
    }

    /**
     * Create an instance of {@link ParamObtDescripcionNatJuridica }
     * 
     */
    public ParamObtDescripcionNatJuridica createParamObtDescripcionNatJuridica() {
        return new ParamObtDescripcionNatJuridica();
    }

    /**
     * Create an instance of {@link ParamObtenerIntegrantesFisicos }
     * 
     */
    public ParamObtenerIntegrantesFisicos createParamObtenerIntegrantesFisicos() {
        return new ParamObtenerIntegrantesFisicos();
    }

    /**
     * Create an instance of {@link ObjGenericCode }
     * 
     */
    public ObjGenericCode createObjGenericCode() {
        return new ObjGenericCode();
    }

    /**
     * Create an instance of {@link Entero }
     * 
     */
    public Entero createEntero() {
        return new Entero();
    }

    /**
     * Create an instance of {@link Fecha }
     * 
     */
    public Fecha createFecha() {
        return new Fecha();
    }

    /**
     * Create an instance of {@link Real }
     * 
     */
    public Real createReal() {
        return new Real();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerAtributosEspeciales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerAtributosEspeciales }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/registro/contribuyentes/v003", name = "obtenerAtributosEspeciales")
    public JAXBElement<ObtenerAtributosEspeciales> createObtenerAtributosEspeciales(ObtenerAtributosEspeciales value) {
        return new JAXBElement<ObtenerAtributosEspeciales>(_ObtenerAtributosEspeciales_QNAME, ObtenerAtributosEspeciales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerAtributosEspecialesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerAtributosEspecialesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/registro/contribuyentes/v003", name = "obtenerAtributosEspecialesResponse")
    public JAXBElement<ObtenerAtributosEspecialesResponse> createObtenerAtributosEspecialesResponse(ObtenerAtributosEspecialesResponse value) {
        return new JAXBElement<ObtenerAtributosEspecialesResponse>(_ObtenerAtributosEspecialesResponse_QNAME, ObtenerAtributosEspecialesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerContribuyente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerContribuyente }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/registro/contribuyentes/v003", name = "obtenerContribuyente")
    public JAXBElement<ObtenerContribuyente> createObtenerContribuyente(ObtenerContribuyente value) {
        return new JAXBElement<ObtenerContribuyente>(_ObtenerContribuyente_QNAME, ObtenerContribuyente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerContribuyenteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerContribuyenteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/registro/contribuyentes/v003", name = "obtenerContribuyenteResponse")
    public JAXBElement<ObtenerContribuyenteResponse> createObtenerContribuyenteResponse(ObtenerContribuyenteResponse value) {
        return new JAXBElement<ObtenerContribuyenteResponse>(_ObtenerContribuyenteResponse_QNAME, ObtenerContribuyenteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerContribuyentesPorPersona }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerContribuyentesPorPersona }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/registro/contribuyentes/v003", name = "obtenerContribuyentesPorPersona")
    public JAXBElement<ObtenerContribuyentesPorPersona> createObtenerContribuyentesPorPersona(ObtenerContribuyentesPorPersona value) {
        return new JAXBElement<ObtenerContribuyentesPorPersona>(_ObtenerContribuyentesPorPersona_QNAME, ObtenerContribuyentesPorPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerContribuyentesPorPersonaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerContribuyentesPorPersonaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/registro/contribuyentes/v003", name = "obtenerContribuyentesPorPersonaResponse")
    public JAXBElement<ObtenerContribuyentesPorPersonaResponse> createObtenerContribuyentesPorPersonaResponse(ObtenerContribuyentesPorPersonaResponse value) {
        return new JAXBElement<ObtenerContribuyentesPorPersonaResponse>(_ObtenerContribuyentesPorPersonaResponse_QNAME, ObtenerContribuyentesPorPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerIntegrantesFisicos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerIntegrantesFisicos }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/registro/contribuyentes/v003", name = "obtenerIntegrantesFisicos")
    public JAXBElement<ObtenerIntegrantesFisicos> createObtenerIntegrantesFisicos(ObtenerIntegrantesFisicos value) {
        return new JAXBElement<ObtenerIntegrantesFisicos>(_ObtenerIntegrantesFisicos_QNAME, ObtenerIntegrantesFisicos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerIntegrantesFisicosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerIntegrantesFisicosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/registro/contribuyentes/v003", name = "obtenerIntegrantesFisicosResponse")
    public JAXBElement<ObtenerIntegrantesFisicosResponse> createObtenerIntegrantesFisicosResponse(ObtenerIntegrantesFisicosResponse value) {
        return new JAXBElement<ObtenerIntegrantesFisicosResponse>(_ObtenerIntegrantesFisicosResponse_QNAME, ObtenerIntegrantesFisicosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerIntegrantesJuridicos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerIntegrantesJuridicos }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/registro/contribuyentes/v003", name = "obtenerIntegrantesJuridicos")
    public JAXBElement<ObtenerIntegrantesJuridicos> createObtenerIntegrantesJuridicos(ObtenerIntegrantesJuridicos value) {
        return new JAXBElement<ObtenerIntegrantesJuridicos>(_ObtenerIntegrantesJuridicos_QNAME, ObtenerIntegrantesJuridicos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerIntegrantesJuridicosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerIntegrantesJuridicosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/registro/contribuyentes/v003", name = "obtenerIntegrantesJuridicosResponse")
    public JAXBElement<ObtenerIntegrantesJuridicosResponse> createObtenerIntegrantesJuridicosResponse(ObtenerIntegrantesJuridicosResponse value) {
        return new JAXBElement<ObtenerIntegrantesJuridicosResponse>(_ObtenerIntegrantesJuridicosResponse_QNAME, ObtenerIntegrantesJuridicosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerListaContribuyente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerListaContribuyente }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/registro/contribuyentes/v003", name = "obtenerListaContribuyente")
    public JAXBElement<ObtenerListaContribuyente> createObtenerListaContribuyente(ObtenerListaContribuyente value) {
        return new JAXBElement<ObtenerListaContribuyente>(_ObtenerListaContribuyente_QNAME, ObtenerListaContribuyente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerListaContribuyenteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerListaContribuyenteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/registro/contribuyentes/v003", name = "obtenerListaContribuyenteResponse")
    public JAXBElement<ObtenerListaContribuyenteResponse> createObtenerListaContribuyenteResponse(ObtenerListaContribuyenteResponse value) {
        return new JAXBElement<ObtenerListaContribuyenteResponse>(_ObtenerListaContribuyenteResponse_QNAME, ObtenerListaContribuyenteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerListaRelEmpresa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerListaRelEmpresa }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/registro/contribuyentes/v003", name = "obtenerListaRelEmpresa")
    public JAXBElement<ObtenerListaRelEmpresa> createObtenerListaRelEmpresa(ObtenerListaRelEmpresa value) {
        return new JAXBElement<ObtenerListaRelEmpresa>(_ObtenerListaRelEmpresa_QNAME, ObtenerListaRelEmpresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerListaRelEmpresaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerListaRelEmpresaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/registro/contribuyentes/v003", name = "obtenerListaRelEmpresaResponse")
    public JAXBElement<ObtenerListaRelEmpresaResponse> createObtenerListaRelEmpresaResponse(ObtenerListaRelEmpresaResponse value) {
        return new JAXBElement<ObtenerListaRelEmpresaResponse>(_ObtenerListaRelEmpresaResponse_QNAME, ObtenerListaRelEmpresaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNaturalezasJuridicas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerNaturalezasJuridicas }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/registro/contribuyentes/v003", name = "obtenerNaturalezasJuridicas")
    public JAXBElement<ObtenerNaturalezasJuridicas> createObtenerNaturalezasJuridicas(ObtenerNaturalezasJuridicas value) {
        return new JAXBElement<ObtenerNaturalezasJuridicas>(_ObtenerNaturalezasJuridicas_QNAME, ObtenerNaturalezasJuridicas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerNaturalezasJuridicasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerNaturalezasJuridicasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/registro/contribuyentes/v003", name = "obtenerNaturalezasJuridicasResponse")
    public JAXBElement<ObtenerNaturalezasJuridicasResponse> createObtenerNaturalezasJuridicasResponse(ObtenerNaturalezasJuridicasResponse value) {
        return new JAXBElement<ObtenerNaturalezasJuridicasResponse>(_ObtenerNaturalezasJuridicasResponse_QNAME, ObtenerNaturalezasJuridicasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarContribuyente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarContribuyente }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/registro/contribuyentes/v003", name = "validarContribuyente")
    public JAXBElement<ValidarContribuyente> createValidarContribuyente(ValidarContribuyente value) {
        return new JAXBElement<ValidarContribuyente>(_ValidarContribuyente_QNAME, ValidarContribuyente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarContribuyenteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarContribuyenteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/registro/contribuyentes/v003", name = "validarContribuyenteResponse")
    public JAXBElement<ValidarContribuyenteResponse> createValidarContribuyenteResponse(ValidarContribuyenteResponse value) {
        return new JAXBElement<ValidarContribuyenteResponse>(_ValidarContribuyenteResponse_QNAME, ValidarContribuyenteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Version }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Version }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/registro/contribuyentes/v003", name = "version")
    public JAXBElement<Version> createVersion(Version value) {
        return new JAXBElement<Version>(_Version_QNAME, Version.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VersionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/registro/contribuyentes/v003", name = "versionResponse")
    public JAXBElement<VersionResponse> createVersionResponse(VersionResponse value) {
        return new JAXBElement<VersionResponse>(_VersionResponse_QNAME, VersionResponse.class, null, value);
    }

}
