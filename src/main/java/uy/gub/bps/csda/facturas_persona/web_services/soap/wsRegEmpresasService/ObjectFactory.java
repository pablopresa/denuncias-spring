
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uy.gub.bps.csda.facturas_persona.web_services.soap.WsRegEmpresasService package. 
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

    private final static QName _ObtenerAtributosEspecialesEmpresa_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "obtenerAtributosEspecialesEmpresa");
    private final static QName _ObtenerAtributosEspecialesEmpresaResponse_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "obtenerAtributosEspecialesEmpresaResponse");
    private final static QName _ObtenerContribuyenteVigente_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "obtenerContribuyenteVigente");
    private final static QName _ObtenerContribuyenteVigenteResponse_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "obtenerContribuyenteVigenteResponse");
    private final static QName _ObtenerDomicilioFiscalPpal_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "obtenerDomicilioFiscalPpal");
    private final static QName _ObtenerDomicilioFiscalPpalResponse_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "obtenerDomicilioFiscalPpalResponse");
    private final static QName _ObtenerEmpresa_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "obtenerEmpresa");
    private final static QName _ObtenerEmpresaResponse_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "obtenerEmpresaResponse");
    private final static QName _ObtenerEstadosAportacion_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "obtenerEstadosAportacion");
    private final static QName _ObtenerEstadosAportacionResponse_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "obtenerEstadosAportacionResponse");
    private final static QName _ObtenerListaEmpresa_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "obtenerListaEmpresa");
    private final static QName _ObtenerListaEmpresaResponse_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "obtenerListaEmpresaResponse");
    private final static QName _ObtenerListaEstadosAportacion_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "obtenerListaEstadosAportacion");
    private final static QName _ObtenerListaEstadosAportacionResponse_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "obtenerListaEstadosAportacionResponse");
    private final static QName _ObtenerListaRelContribuyente_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "obtenerListaRelContribuyente");
    private final static QName _ObtenerListaRelContribuyenteEmpresas_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "obtenerListaRelContribuyenteEmpresas");
    private final static QName _ObtenerListaRelContribuyenteEmpresasResponse_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "obtenerListaRelContribuyenteEmpresasResponse");
    private final static QName _ObtenerListaRelContribuyenteResponse_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "obtenerListaRelContribuyenteResponse");
    private final static QName _ObtenerLocales_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "obtenerLocales");
    private final static QName _ObtenerLocalesResponse_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "obtenerLocalesResponse");
    private final static QName _ValidarEmpresa_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "validarEmpresa");
    private final static QName _ValidarEmpresaResponse_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "validarEmpresaResponse");
    private final static QName _Version_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "version");
    private final static QName _VersionResponse_QNAME = new QName("http://bps.gub.uy/atyr/registro/empresas/v003", "versionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uy.gub.bps.csda.facturas_persona.web_services.soap.WsRegEmpresasService
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
     * Create an instance of {@link ErrorNegocio2 }
     * 
     */
    public ErrorNegocio2 createErrorNegocio2() {
        return new ErrorNegocio2();
    }

    /**
     * Create an instance of {@link ResultVersion2 }
     * 
     */
    public ResultVersion2 createResultVersion2() {
        return new ResultVersion2();
    }

    /**
     * Create an instance of {@link ObjEmpresa }
     * 
     */
    public ObjEmpresa createObjEmpresa() {
        return new ObjEmpresa();
    }

    /**
     * Create an instance of {@link ObjDenominacionPeriodo }
     * 
     */
    public ObjDenominacionPeriodo createObjDenominacionPeriodo() {
        return new ObjDenominacionPeriodo();
    }

    /**
     * Create an instance of {@link ObjPeriodo }
     * 
     */
    public ObjPeriodo createObjPeriodo() {
        return new ObjPeriodo();
    }

    /**
     * Create an instance of {@link ObjContribuyente }
     * 
     */
    public ObjContribuyente createObjContribuyente() {
        return new ObjContribuyente();
    }

    /**
     * Create an instance of {@link ObjRelacionEmpContr }
     * 
     */
    public ObjRelacionEmpContr createObjRelacionEmpContr() {
        return new ObjRelacionEmpContr();
    }

    /**
     * Create an instance of {@link ObjDatosAportacionEmpresa }
     * 
     */
    public ObjDatosAportacionEmpresa createObjDatosAportacionEmpresa() {
        return new ObjDatosAportacionEmpresa();
    }

    /**
     * Create an instance of {@link ObjAportacion }
     * 
     */
    public ObjAportacion createObjAportacion() {
        return new ObjAportacion();
    }

    /**
     * Create an instance of {@link ObjEstadoAportacion }
     * 
     */
    public ObjEstadoAportacion createObjEstadoAportacion() {
        return new ObjEstadoAportacion();
    }

    /**
     * Create an instance of {@link ObjCausal }
     * 
     */
    public ObjCausal createObjCausal() {
        return new ObjCausal();
    }

    /**
     * Create an instance of {@link ObjEmpresaContribuyentes }
     * 
     */
    public ObjEmpresaContribuyentes createObjEmpresaContribuyentes() {
        return new ObjEmpresaContribuyentes();
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
     * Create an instance of {@link ObjDomicilio }
     * 
     */
    public ObjDomicilio createObjDomicilio() {
        return new ObjDomicilio();
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
     * Create an instance of {@link ObjEmail }
     * 
     */
    public ObjEmail createObjEmail() {
        return new ObjEmail();
    }

    /**
     * Create an instance of {@link ObjFax }
     * 
     */
    public ObjFax createObjFax() {
        return new ObjFax();
    }

    /**
     * Create an instance of {@link ObjTelefono }
     * 
     */
    public ObjTelefono createObjTelefono() {
        return new ObjTelefono();
    }

    /**
     * Create an instance of {@link ObtenerAtributosEspecialesEmpresa }
     * 
     */
    public ObtenerAtributosEspecialesEmpresa createObtenerAtributosEspecialesEmpresa() {
        return new ObtenerAtributosEspecialesEmpresa();
    }

    /**
     * Create an instance of {@link ObtenerAtributosEspecialesEmpresaResponse }
     * 
     */
    public ObtenerAtributosEspecialesEmpresaResponse createObtenerAtributosEspecialesEmpresaResponse() {
        return new ObtenerAtributosEspecialesEmpresaResponse();
    }

    /**
     * Create an instance of {@link ObtenerContribuyenteVigente }
     * 
     */
    public ObtenerContribuyenteVigente createObtenerContribuyenteVigente() {
        return new ObtenerContribuyenteVigente();
    }

    /**
     * Create an instance of {@link ObtenerContribuyenteVigenteResponse }
     * 
     */
    public ObtenerContribuyenteVigenteResponse createObtenerContribuyenteVigenteResponse() {
        return new ObtenerContribuyenteVigenteResponse();
    }

    /**
     * Create an instance of {@link ObtenerDomicilioFiscalPpal }
     * 
     */
    public ObtenerDomicilioFiscalPpal createObtenerDomicilioFiscalPpal() {
        return new ObtenerDomicilioFiscalPpal();
    }

    /**
     * Create an instance of {@link ObtenerDomicilioFiscalPpalResponse }
     * 
     */
    public ObtenerDomicilioFiscalPpalResponse createObtenerDomicilioFiscalPpalResponse() {
        return new ObtenerDomicilioFiscalPpalResponse();
    }

    /**
     * Create an instance of {@link ObtenerEmpresa }
     * 
     */
    public ObtenerEmpresa createObtenerEmpresa() {
        return new ObtenerEmpresa();
    }

    /**
     * Create an instance of {@link ObtenerEmpresaResponse }
     * 
     */
    public ObtenerEmpresaResponse createObtenerEmpresaResponse() {
        return new ObtenerEmpresaResponse();
    }

    /**
     * Create an instance of {@link ObtenerEstadosAportacion }
     * 
     */
    public ObtenerEstadosAportacion createObtenerEstadosAportacion() {
        return new ObtenerEstadosAportacion();
    }

    /**
     * Create an instance of {@link ObtenerEstadosAportacionResponse }
     * 
     */
    public ObtenerEstadosAportacionResponse createObtenerEstadosAportacionResponse() {
        return new ObtenerEstadosAportacionResponse();
    }

    /**
     * Create an instance of {@link ObtenerListaEmpresa }
     * 
     */
    public ObtenerListaEmpresa createObtenerListaEmpresa() {
        return new ObtenerListaEmpresa();
    }

    /**
     * Create an instance of {@link ObtenerListaEmpresaResponse }
     * 
     */
    public ObtenerListaEmpresaResponse createObtenerListaEmpresaResponse() {
        return new ObtenerListaEmpresaResponse();
    }

    /**
     * Create an instance of {@link ObtenerListaEstadosAportacion }
     * 
     */
    public ObtenerListaEstadosAportacion createObtenerListaEstadosAportacion() {
        return new ObtenerListaEstadosAportacion();
    }

    /**
     * Create an instance of {@link ObtenerListaEstadosAportacionResponse }
     * 
     */
    public ObtenerListaEstadosAportacionResponse createObtenerListaEstadosAportacionResponse() {
        return new ObtenerListaEstadosAportacionResponse();
    }

    /**
     * Create an instance of {@link ObtenerListaRelContribuyente }
     * 
     */
    public ObtenerListaRelContribuyente createObtenerListaRelContribuyente() {
        return new ObtenerListaRelContribuyente();
    }

    /**
     * Create an instance of {@link ObtenerListaRelContribuyenteEmpresas }
     * 
     */
    public ObtenerListaRelContribuyenteEmpresas createObtenerListaRelContribuyenteEmpresas() {
        return new ObtenerListaRelContribuyenteEmpresas();
    }

    /**
     * Create an instance of {@link ObtenerListaRelContribuyenteEmpresasResponse }
     * 
     */
    public ObtenerListaRelContribuyenteEmpresasResponse createObtenerListaRelContribuyenteEmpresasResponse() {
        return new ObtenerListaRelContribuyenteEmpresasResponse();
    }

    /**
     * Create an instance of {@link ObtenerListaRelContribuyenteResponse }
     * 
     */
    public ObtenerListaRelContribuyenteResponse createObtenerListaRelContribuyenteResponse() {
        return new ObtenerListaRelContribuyenteResponse();
    }

    /**
     * Create an instance of {@link ObtenerLocales }
     * 
     */
    public ObtenerLocales createObtenerLocales() {
        return new ObtenerLocales();
    }

    /**
     * Create an instance of {@link ObtenerLocalesResponse }
     * 
     */
    public ObtenerLocalesResponse createObtenerLocalesResponse() {
        return new ObtenerLocalesResponse();
    }

    /**
     * Create an instance of {@link ValidarEmpresa }
     * 
     */
    public ValidarEmpresa createValidarEmpresa() {
        return new ValidarEmpresa();
    }

    /**
     * Create an instance of {@link ValidarEmpresaResponse }
     * 
     */
    public ValidarEmpresaResponse createValidarEmpresaResponse() {
        return new ValidarEmpresaResponse();
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
     * Create an instance of {@link ObjContribuyenteAportacionAE }
     * 
     */
    public ObjContribuyenteAportacionAE createObjContribuyenteAportacionAE() {
        return new ObjContribuyenteAportacionAE();
    }

    /**
     * Create an instance of {@link ObjAportacionAE }
     * 
     */
    public ObjAportacionAE createObjAportacionAE() {
        return new ObjAportacionAE();
    }

    /**
     * Create an instance of {@link ObjGenericCodeInt }
     * 
     */
    public ObjGenericCodeInt createObjGenericCodeInt() {
        return new ObjGenericCodeInt();
    }

    /**
     * Create an instance of {@link ObjAEPeriodo }
     * 
     */
    public ObjAEPeriodo createObjAEPeriodo() {
        return new ObjAEPeriodo();
    }

    /**
     * Create an instance of {@link ObjAEEmp }
     * 
     */
    public ObjAEEmp createObjAEEmp() {
        return new ObjAEEmp();
    }

    /**
     * Create an instance of {@link ParamObtenerListaEmpresa }
     * 
     */
    public ParamObtenerListaEmpresa createParamObtenerListaEmpresa() {
        return new ParamObtenerListaEmpresa();
    }

    /**
     * Create an instance of {@link ResultObtenerListaEmpresa }
     * 
     */
    public ResultObtenerListaEmpresa createResultObtenerListaEmpresa() {
        return new ResultObtenerListaEmpresa();
    }

    /**
     * Create an instance of {@link ParamObtenerEstadosAportacion }
     * 
     */
    public ParamObtenerEstadosAportacion createParamObtenerEstadosAportacion() {
        return new ParamObtenerEstadosAportacion();
    }

    /**
     * Create an instance of {@link ResultObtenerEstadosAportacion }
     * 
     */
    public ResultObtenerEstadosAportacion createResultObtenerEstadosAportacion() {
        return new ResultObtenerEstadosAportacion();
    }

    /**
     * Create an instance of {@link ParamObtenerListaRelContribuyente }
     * 
     */
    public ParamObtenerListaRelContribuyente createParamObtenerListaRelContribuyente() {
        return new ParamObtenerListaRelContribuyente();
    }

    /**
     * Create an instance of {@link ResultObtenerListaRelContribuyente }
     * 
     */
    public ResultObtenerListaRelContribuyente createResultObtenerListaRelContribuyente() {
        return new ResultObtenerListaRelContribuyente();
    }

    /**
     * Create an instance of {@link ParamObtenerEmpresa }
     * 
     */
    public ParamObtenerEmpresa createParamObtenerEmpresa() {
        return new ParamObtenerEmpresa();
    }

    /**
     * Create an instance of {@link ResultObtenerEmpresa }
     * 
     */
    public ResultObtenerEmpresa createResultObtenerEmpresa() {
        return new ResultObtenerEmpresa();
    }

    /**
     * Create an instance of {@link ParamObtenerAtributoEspecialEmpresa }
     * 
     */
    public ParamObtenerAtributoEspecialEmpresa createParamObtenerAtributoEspecialEmpresa() {
        return new ParamObtenerAtributoEspecialEmpresa();
    }

    /**
     * Create an instance of {@link ResultObtenerAtributosEspecialesEmpresa }
     * 
     */
    public ResultObtenerAtributosEspecialesEmpresa createResultObtenerAtributosEspecialesEmpresa() {
        return new ResultObtenerAtributosEspecialesEmpresa();
    }

    /**
     * Create an instance of {@link ParamObtenerListaEstadosAportacion }
     * 
     */
    public ParamObtenerListaEstadosAportacion createParamObtenerListaEstadosAportacion() {
        return new ParamObtenerListaEstadosAportacion();
    }

    /**
     * Create an instance of {@link ResultObtenerListaEstadosAportacion }
     * 
     */
    public ResultObtenerListaEstadosAportacion createResultObtenerListaEstadosAportacion() {
        return new ResultObtenerListaEstadosAportacion();
    }

    /**
     * Create an instance of {@link ParamObtenerListaRelContribuyenteEmpresas }
     * 
     */
    public ParamObtenerListaRelContribuyenteEmpresas createParamObtenerListaRelContribuyenteEmpresas() {
        return new ParamObtenerListaRelContribuyenteEmpresas();
    }

    /**
     * Create an instance of {@link ResultObtenerListaRelContribuyenteEmpresas }
     * 
     */
    public ResultObtenerListaRelContribuyenteEmpresas createResultObtenerListaRelContribuyenteEmpresas() {
        return new ResultObtenerListaRelContribuyenteEmpresas();
    }

    /**
     * Create an instance of {@link ParamObtenerLocales }
     * 
     */
    public ParamObtenerLocales createParamObtenerLocales() {
        return new ParamObtenerLocales();
    }

    /**
     * Create an instance of {@link ResultObtenerLocales }
     * 
     */
    public ResultObtenerLocales createResultObtenerLocales() {
        return new ResultObtenerLocales();
    }

    /**
     * Create an instance of {@link ParamObtenerDomicilioFiscalPpal }
     * 
     */
    public ParamObtenerDomicilioFiscalPpal createParamObtenerDomicilioFiscalPpal() {
        return new ParamObtenerDomicilioFiscalPpal();
    }

    /**
     * Create an instance of {@link ResultObtenerDomicilioFiscalPpal }
     * 
     */
    public ResultObtenerDomicilioFiscalPpal createResultObtenerDomicilioFiscalPpal() {
        return new ResultObtenerDomicilioFiscalPpal();
    }

    /**
     * Create an instance of {@link ParamObtenerContribuyenteVigente }
     * 
     */
    public ParamObtenerContribuyenteVigente createParamObtenerContribuyenteVigente() {
        return new ParamObtenerContribuyenteVigente();
    }

    /**
     * Create an instance of {@link ResultObtenerContribuyenteVigente }
     * 
     */
    public ResultObtenerContribuyenteVigente createResultObtenerContribuyenteVigente() {
        return new ResultObtenerContribuyenteVigente();
    }

    /**
     * Create an instance of {@link ParamValidarEmpresa }
     * 
     */
    public ParamValidarEmpresa createParamValidarEmpresa() {
        return new ParamValidarEmpresa();
    }

    /**
     * Create an instance of {@link ResultValidarEmpresa }
     * 
     */
    public ResultValidarEmpresa createResultValidarEmpresa() {
        return new ResultValidarEmpresa();
    }

    /**
     * Create an instance of {@link LocalEmpresa }
     * 
     */
    public LocalEmpresa createLocalEmpresa() {
        return new LocalEmpresa();
    }

    /**
     * Create an instance of {@link AmpliacionDomicilio }
     * 
     */
    public AmpliacionDomicilio createAmpliacionDomicilio() {
        return new AmpliacionDomicilio();
    }

    /**
     * Create an instance of {@link Departamento }
     * 
     */
    public Departamento createDepartamento() {
        return new Departamento();
    }

    /**
     * Create an instance of {@link Direccion }
     * 
     */
    public Direccion createDireccion() {
        return new Direccion();
    }

    /**
     * Create an instance of {@link Calle }
     * 
     */
    public Calle createCalle() {
        return new Calle();
    }

    /**
     * Create an instance of {@link CodigoPostal }
     * 
     */
    public CodigoPostal createCodigoPostal() {
        return new CodigoPostal();
    }

    /**
     * Create an instance of {@link EMail }
     * 
     */
    public EMail createEMail() {
        return new EMail();
    }

    /**
     * Create an instance of {@link Fax }
     * 
     */
    public Fax createFax() {
        return new Fax();
    }

    /**
     * Create an instance of {@link Localidad }
     * 
     */
    public Localidad createLocalidad() {
        return new Localidad();
    }

    /**
     * Create an instance of {@link ObjPeriodo2 }
     * 
     */
    public ObjPeriodo2 createObjPeriodo2() {
        return new ObjPeriodo2();
    }

    /**
     * Create an instance of {@link Telefono }
     * 
     */
    public Telefono createTelefono() {
        return new Telefono();
    }

    /**
     * Create an instance of {@link TipoEstablecimiento }
     * 
     */
    public TipoEstablecimiento createTipoEstablecimiento() {
        return new TipoEstablecimiento();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerAtributosEspecialesEmpresa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerAtributosEspecialesEmpresa }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "obtenerAtributosEspecialesEmpresa")
    public JAXBElement<ObtenerAtributosEspecialesEmpresa> createObtenerAtributosEspecialesEmpresa(ObtenerAtributosEspecialesEmpresa value) {
        return new JAXBElement<ObtenerAtributosEspecialesEmpresa>(_ObtenerAtributosEspecialesEmpresa_QNAME, ObtenerAtributosEspecialesEmpresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerAtributosEspecialesEmpresaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerAtributosEspecialesEmpresaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "obtenerAtributosEspecialesEmpresaResponse")
    public JAXBElement<ObtenerAtributosEspecialesEmpresaResponse> createObtenerAtributosEspecialesEmpresaResponse(ObtenerAtributosEspecialesEmpresaResponse value) {
        return new JAXBElement<ObtenerAtributosEspecialesEmpresaResponse>(_ObtenerAtributosEspecialesEmpresaResponse_QNAME, ObtenerAtributosEspecialesEmpresaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerContribuyenteVigente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerContribuyenteVigente }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "obtenerContribuyenteVigente")
    public JAXBElement<ObtenerContribuyenteVigente> createObtenerContribuyenteVigente(ObtenerContribuyenteVigente value) {
        return new JAXBElement<ObtenerContribuyenteVigente>(_ObtenerContribuyenteVigente_QNAME, ObtenerContribuyenteVigente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerContribuyenteVigenteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerContribuyenteVigenteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "obtenerContribuyenteVigenteResponse")
    public JAXBElement<ObtenerContribuyenteVigenteResponse> createObtenerContribuyenteVigenteResponse(ObtenerContribuyenteVigenteResponse value) {
        return new JAXBElement<ObtenerContribuyenteVigenteResponse>(_ObtenerContribuyenteVigenteResponse_QNAME, ObtenerContribuyenteVigenteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDomicilioFiscalPpal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerDomicilioFiscalPpal }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "obtenerDomicilioFiscalPpal")
    public JAXBElement<ObtenerDomicilioFiscalPpal> createObtenerDomicilioFiscalPpal(ObtenerDomicilioFiscalPpal value) {
        return new JAXBElement<ObtenerDomicilioFiscalPpal>(_ObtenerDomicilioFiscalPpal_QNAME, ObtenerDomicilioFiscalPpal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDomicilioFiscalPpalResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerDomicilioFiscalPpalResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "obtenerDomicilioFiscalPpalResponse")
    public JAXBElement<ObtenerDomicilioFiscalPpalResponse> createObtenerDomicilioFiscalPpalResponse(ObtenerDomicilioFiscalPpalResponse value) {
        return new JAXBElement<ObtenerDomicilioFiscalPpalResponse>(_ObtenerDomicilioFiscalPpalResponse_QNAME, ObtenerDomicilioFiscalPpalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerEmpresa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerEmpresa }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "obtenerEmpresa")
    public JAXBElement<ObtenerEmpresa> createObtenerEmpresa(ObtenerEmpresa value) {
        return new JAXBElement<ObtenerEmpresa>(_ObtenerEmpresa_QNAME, ObtenerEmpresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerEmpresaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerEmpresaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "obtenerEmpresaResponse")
    public JAXBElement<ObtenerEmpresaResponse> createObtenerEmpresaResponse(ObtenerEmpresaResponse value) {
        return new JAXBElement<ObtenerEmpresaResponse>(_ObtenerEmpresaResponse_QNAME, ObtenerEmpresaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerEstadosAportacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerEstadosAportacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "obtenerEstadosAportacion")
    public JAXBElement<ObtenerEstadosAportacion> createObtenerEstadosAportacion(ObtenerEstadosAportacion value) {
        return new JAXBElement<ObtenerEstadosAportacion>(_ObtenerEstadosAportacion_QNAME, ObtenerEstadosAportacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerEstadosAportacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerEstadosAportacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "obtenerEstadosAportacionResponse")
    public JAXBElement<ObtenerEstadosAportacionResponse> createObtenerEstadosAportacionResponse(ObtenerEstadosAportacionResponse value) {
        return new JAXBElement<ObtenerEstadosAportacionResponse>(_ObtenerEstadosAportacionResponse_QNAME, ObtenerEstadosAportacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerListaEmpresa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerListaEmpresa }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "obtenerListaEmpresa")
    public JAXBElement<ObtenerListaEmpresa> createObtenerListaEmpresa(ObtenerListaEmpresa value) {
        return new JAXBElement<ObtenerListaEmpresa>(_ObtenerListaEmpresa_QNAME, ObtenerListaEmpresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerListaEmpresaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerListaEmpresaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "obtenerListaEmpresaResponse")
    public JAXBElement<ObtenerListaEmpresaResponse> createObtenerListaEmpresaResponse(ObtenerListaEmpresaResponse value) {
        return new JAXBElement<ObtenerListaEmpresaResponse>(_ObtenerListaEmpresaResponse_QNAME, ObtenerListaEmpresaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerListaEstadosAportacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerListaEstadosAportacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "obtenerListaEstadosAportacion")
    public JAXBElement<ObtenerListaEstadosAportacion> createObtenerListaEstadosAportacion(ObtenerListaEstadosAportacion value) {
        return new JAXBElement<ObtenerListaEstadosAportacion>(_ObtenerListaEstadosAportacion_QNAME, ObtenerListaEstadosAportacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerListaEstadosAportacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerListaEstadosAportacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "obtenerListaEstadosAportacionResponse")
    public JAXBElement<ObtenerListaEstadosAportacionResponse> createObtenerListaEstadosAportacionResponse(ObtenerListaEstadosAportacionResponse value) {
        return new JAXBElement<ObtenerListaEstadosAportacionResponse>(_ObtenerListaEstadosAportacionResponse_QNAME, ObtenerListaEstadosAportacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerListaRelContribuyente }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerListaRelContribuyente }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "obtenerListaRelContribuyente")
    public JAXBElement<ObtenerListaRelContribuyente> createObtenerListaRelContribuyente(ObtenerListaRelContribuyente value) {
        return new JAXBElement<ObtenerListaRelContribuyente>(_ObtenerListaRelContribuyente_QNAME, ObtenerListaRelContribuyente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerListaRelContribuyenteEmpresas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerListaRelContribuyenteEmpresas }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "obtenerListaRelContribuyenteEmpresas")
    public JAXBElement<ObtenerListaRelContribuyenteEmpresas> createObtenerListaRelContribuyenteEmpresas(ObtenerListaRelContribuyenteEmpresas value) {
        return new JAXBElement<ObtenerListaRelContribuyenteEmpresas>(_ObtenerListaRelContribuyenteEmpresas_QNAME, ObtenerListaRelContribuyenteEmpresas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerListaRelContribuyenteEmpresasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerListaRelContribuyenteEmpresasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "obtenerListaRelContribuyenteEmpresasResponse")
    public JAXBElement<ObtenerListaRelContribuyenteEmpresasResponse> createObtenerListaRelContribuyenteEmpresasResponse(ObtenerListaRelContribuyenteEmpresasResponse value) {
        return new JAXBElement<ObtenerListaRelContribuyenteEmpresasResponse>(_ObtenerListaRelContribuyenteEmpresasResponse_QNAME, ObtenerListaRelContribuyenteEmpresasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerListaRelContribuyenteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerListaRelContribuyenteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "obtenerListaRelContribuyenteResponse")
    public JAXBElement<ObtenerListaRelContribuyenteResponse> createObtenerListaRelContribuyenteResponse(ObtenerListaRelContribuyenteResponse value) {
        return new JAXBElement<ObtenerListaRelContribuyenteResponse>(_ObtenerListaRelContribuyenteResponse_QNAME, ObtenerListaRelContribuyenteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerLocales }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerLocales }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "obtenerLocales")
    public JAXBElement<ObtenerLocales> createObtenerLocales(ObtenerLocales value) {
        return new JAXBElement<ObtenerLocales>(_ObtenerLocales_QNAME, ObtenerLocales.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerLocalesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerLocalesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "obtenerLocalesResponse")
    public JAXBElement<ObtenerLocalesResponse> createObtenerLocalesResponse(ObtenerLocalesResponse value) {
        return new JAXBElement<ObtenerLocalesResponse>(_ObtenerLocalesResponse_QNAME, ObtenerLocalesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarEmpresa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarEmpresa }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "validarEmpresa")
    public JAXBElement<ValidarEmpresa> createValidarEmpresa(ValidarEmpresa value) {
        return new JAXBElement<ValidarEmpresa>(_ValidarEmpresa_QNAME, ValidarEmpresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ValidarEmpresaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ValidarEmpresaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "validarEmpresaResponse")
    public JAXBElement<ValidarEmpresaResponse> createValidarEmpresaResponse(ValidarEmpresaResponse value) {
        return new JAXBElement<ValidarEmpresaResponse>(_ValidarEmpresaResponse_QNAME, ValidarEmpresaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Version }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Version }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "version")
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
    @XmlElementDecl(namespace = "http://bps.gub.uy/atyr/registro/empresas/v003", name = "versionResponse")
    public JAXBElement<VersionResponse> createVersionResponse(VersionResponse value) {
        return new JAXBElement<VersionResponse>(_VersionResponse_QNAME, VersionResponse.class, null, value);
    }

}
