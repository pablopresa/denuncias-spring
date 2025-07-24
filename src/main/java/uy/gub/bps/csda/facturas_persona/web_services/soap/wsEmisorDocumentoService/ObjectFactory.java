
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uy.gub.bps.csda.facturas_persona.web_services.soap.WsEmisorDocumentoService package. 
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

    private final static QName _ObtenerDocumentoAutogestionado_QNAME = new QName("http://bps.gub.uy/recaudacion/facturacion/v001", "obtenerDocumentoAutogestionado");
    private final static QName _ObtenerDocumentoAutogestionadoResponse_QNAME = new QName("http://bps.gub.uy/recaudacion/facturacion/v001", "obtenerDocumentoAutogestionadoResponse");
    private final static QName _ObtenerDocumentoPDF_QNAME = new QName("http://bps.gub.uy/recaudacion/facturacion/v001", "obtenerDocumentoPDF");
    private final static QName _ObtenerDocumentoPDFResponse_QNAME = new QName("http://bps.gub.uy/recaudacion/facturacion/v001", "obtenerDocumentoPDFResponse");
    private final static QName _ObtenerDocumentoPagoACuenta_QNAME = new QName("http://bps.gub.uy/recaudacion/facturacion/v001", "obtenerDocumentoPagoACuenta");
    private final static QName _ObtenerDocumentoPagoACuentaResponse_QNAME = new QName("http://bps.gub.uy/recaudacion/facturacion/v001", "obtenerDocumentoPagoACuentaResponse");
    private final static QName _ObtenerDocumentosPorEmpresa_QNAME = new QName("http://bps.gub.uy/recaudacion/facturacion/v001", "obtenerDocumentosPorEmpresa");
    private final static QName _ObtenerDocumentosPorEmpresaResponse_QNAME = new QName("http://bps.gub.uy/recaudacion/facturacion/v001", "obtenerDocumentosPorEmpresaResponse");
    private final static QName _ObtenerFactura_QNAME = new QName("http://bps.gub.uy/recaudacion/facturacion/v001", "obtenerFactura");
    private final static QName _ObtenerFacturaResponse_QNAME = new QName("http://bps.gub.uy/recaudacion/facturacion/v001", "obtenerFacturaResponse");
    private final static QName _Version_QNAME = new QName("http://bps.gub.uy/recaudacion/facturacion/v001", "version");
    private final static QName _VersionResponse_QNAME = new QName("http://bps.gub.uy/recaudacion/facturacion/v001", "versionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uy.gub.bps.csda.facturas_persona.web_services.soap.WsEmisorDocumentoService
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
     * Create an instance of {@link ParamObtenerDocumentosPorEmpresa }
     * 
     */
    public ParamObtenerDocumentosPorEmpresa createParamObtenerDocumentosPorEmpresa() {
        return new ParamObtenerDocumentosPorEmpresa();
    }

    /**
     * Create an instance of {@link ResultObtenerDocumentosPorEmpresa }
     * 
     */
    public ResultObtenerDocumentosPorEmpresa createResultObtenerDocumentosPorEmpresa() {
        return new ResultObtenerDocumentosPorEmpresa();
    }

    /**
     * Create an instance of {@link Documento }
     * 
     */
    public Documento createDocumento() {
        return new Documento();
    }

    /**
     * Create an instance of {@link FacturaPorEmpresa }
     * 
     */
    public FacturaPorEmpresa createFacturaPorEmpresa() {
        return new FacturaPorEmpresa();
    }

    /**
     * Create an instance of {@link ParamObtenerDocumentoAutogestionado }
     * 
     */
    public ParamObtenerDocumentoAutogestionado createParamObtenerDocumentoAutogestionado() {
        return new ParamObtenerDocumentoAutogestionado();
    }

    /**
     * Create an instance of {@link LineaDocumento }
     * 
     */
    public LineaDocumento createLineaDocumento() {
        return new LineaDocumento();
    }

    /**
     * Create an instance of {@link ResultObtenerDocumentoAutogestionado }
     * 
     */
    public ResultObtenerDocumentoAutogestionado createResultObtenerDocumentoAutogestionado() {
        return new ResultObtenerDocumentoAutogestionado();
    }

    /**
     * Create an instance of {@link DocumentoAutogestionado }
     * 
     */
    public DocumentoAutogestionado createDocumentoAutogestionado() {
        return new DocumentoAutogestionado();
    }

    /**
     * Create an instance of {@link ParamObtenerDocumentoPagoACuenta }
     * 
     */
    public ParamObtenerDocumentoPagoACuenta createParamObtenerDocumentoPagoACuenta() {
        return new ParamObtenerDocumentoPagoACuenta();
    }

    /**
     * Create an instance of {@link ResultObtenerDocumentoPagoACuenta }
     * 
     */
    public ResultObtenerDocumentoPagoACuenta createResultObtenerDocumentoPagoACuenta() {
        return new ResultObtenerDocumentoPagoACuenta();
    }

    /**
     * Create an instance of {@link ParamObtenerDocumentoPDF }
     * 
     */
    public ParamObtenerDocumentoPDF createParamObtenerDocumentoPDF() {
        return new ParamObtenerDocumentoPDF();
    }

    /**
     * Create an instance of {@link ParamObtenerFactura }
     * 
     */
    public ParamObtenerFactura createParamObtenerFactura() {
        return new ParamObtenerFactura();
    }

    /**
     * Create an instance of {@link ResultObtenerDocumentoPDF }
     * 
     */
    public ResultObtenerDocumentoPDF createResultObtenerDocumentoPDF() {
        return new ResultObtenerDocumentoPDF();
    }

    /**
     * Create an instance of {@link Archivo }
     * 
     */
    public Archivo createArchivo() {
        return new Archivo();
    }

    /**
     * Create an instance of {@link ResultObtenerFactura }
     * 
     */
    public ResultObtenerFactura createResultObtenerFactura() {
        return new ResultObtenerFactura();
    }

    /**
     * Create an instance of {@link ErrorNegocioSeveridad }
     * 
     */
    public ErrorNegocioSeveridad createErrorNegocioSeveridad() {
        return new ErrorNegocioSeveridad();
    }

    /**
     * Create an instance of {@link Factura }
     * 
     */
    public Factura createFactura() {
        return new Factura();
    }

    /**
     * Create an instance of {@link DocumentoPagoACuenta }
     * 
     */
    public DocumentoPagoACuenta createDocumentoPagoACuenta() {
        return new DocumentoPagoACuenta();
    }

    /**
     * Create an instance of {@link Documento2 }
     * 
     */
    public Documento2 createDocumento2() {
        return new Documento2();
    }

    /**
     * Create an instance of {@link DatosFactura }
     * 
     */
    public DatosFactura createDatosFactura() {
        return new DatosFactura();
    }

    /**
     * Create an instance of {@link ObtenerDocumentoAutogestionado }
     * 
     */
    public ObtenerDocumentoAutogestionado createObtenerDocumentoAutogestionado() {
        return new ObtenerDocumentoAutogestionado();
    }

    /**
     * Create an instance of {@link ObtenerDocumentoAutogestionadoResponse }
     * 
     */
    public ObtenerDocumentoAutogestionadoResponse createObtenerDocumentoAutogestionadoResponse() {
        return new ObtenerDocumentoAutogestionadoResponse();
    }

    /**
     * Create an instance of {@link ObtenerDocumentoPDF }
     * 
     */
    public ObtenerDocumentoPDF createObtenerDocumentoPDF() {
        return new ObtenerDocumentoPDF();
    }

    /**
     * Create an instance of {@link ObtenerDocumentoPDFResponse }
     * 
     */
    public ObtenerDocumentoPDFResponse createObtenerDocumentoPDFResponse() {
        return new ObtenerDocumentoPDFResponse();
    }

    /**
     * Create an instance of {@link ObtenerDocumentoPagoACuenta }
     * 
     */
    public ObtenerDocumentoPagoACuenta createObtenerDocumentoPagoACuenta() {
        return new ObtenerDocumentoPagoACuenta();
    }

    /**
     * Create an instance of {@link ObtenerDocumentoPagoACuentaResponse }
     * 
     */
    public ObtenerDocumentoPagoACuentaResponse createObtenerDocumentoPagoACuentaResponse() {
        return new ObtenerDocumentoPagoACuentaResponse();
    }

    /**
     * Create an instance of {@link ObtenerDocumentosPorEmpresa }
     * 
     */
    public ObtenerDocumentosPorEmpresa createObtenerDocumentosPorEmpresa() {
        return new ObtenerDocumentosPorEmpresa();
    }

    /**
     * Create an instance of {@link ObtenerDocumentosPorEmpresaResponse }
     * 
     */
    public ObtenerDocumentosPorEmpresaResponse createObtenerDocumentosPorEmpresaResponse() {
        return new ObtenerDocumentosPorEmpresaResponse();
    }

    /**
     * Create an instance of {@link ObtenerFactura }
     * 
     */
    public ObtenerFactura createObtenerFactura() {
        return new ObtenerFactura();
    }

    /**
     * Create an instance of {@link ObtenerFacturaResponse }
     * 
     */
    public ObtenerFacturaResponse createObtenerFacturaResponse() {
        return new ObtenerFacturaResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentoAutogestionado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentoAutogestionado }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/facturacion/v001", name = "obtenerDocumentoAutogestionado")
    public JAXBElement<ObtenerDocumentoAutogestionado> createObtenerDocumentoAutogestionado(ObtenerDocumentoAutogestionado value) {
        return new JAXBElement<ObtenerDocumentoAutogestionado>(_ObtenerDocumentoAutogestionado_QNAME, ObtenerDocumentoAutogestionado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentoAutogestionadoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentoAutogestionadoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/facturacion/v001", name = "obtenerDocumentoAutogestionadoResponse")
    public JAXBElement<ObtenerDocumentoAutogestionadoResponse> createObtenerDocumentoAutogestionadoResponse(ObtenerDocumentoAutogestionadoResponse value) {
        return new JAXBElement<ObtenerDocumentoAutogestionadoResponse>(_ObtenerDocumentoAutogestionadoResponse_QNAME, ObtenerDocumentoAutogestionadoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentoPDF }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentoPDF }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/facturacion/v001", name = "obtenerDocumentoPDF")
    public JAXBElement<ObtenerDocumentoPDF> createObtenerDocumentoPDF(ObtenerDocumentoPDF value) {
        return new JAXBElement<ObtenerDocumentoPDF>(_ObtenerDocumentoPDF_QNAME, ObtenerDocumentoPDF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentoPDFResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentoPDFResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/facturacion/v001", name = "obtenerDocumentoPDFResponse")
    public JAXBElement<ObtenerDocumentoPDFResponse> createObtenerDocumentoPDFResponse(ObtenerDocumentoPDFResponse value) {
        return new JAXBElement<ObtenerDocumentoPDFResponse>(_ObtenerDocumentoPDFResponse_QNAME, ObtenerDocumentoPDFResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentoPagoACuenta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentoPagoACuenta }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/facturacion/v001", name = "obtenerDocumentoPagoACuenta")
    public JAXBElement<ObtenerDocumentoPagoACuenta> createObtenerDocumentoPagoACuenta(ObtenerDocumentoPagoACuenta value) {
        return new JAXBElement<ObtenerDocumentoPagoACuenta>(_ObtenerDocumentoPagoACuenta_QNAME, ObtenerDocumentoPagoACuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentoPagoACuentaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentoPagoACuentaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/facturacion/v001", name = "obtenerDocumentoPagoACuentaResponse")
    public JAXBElement<ObtenerDocumentoPagoACuentaResponse> createObtenerDocumentoPagoACuentaResponse(ObtenerDocumentoPagoACuentaResponse value) {
        return new JAXBElement<ObtenerDocumentoPagoACuentaResponse>(_ObtenerDocumentoPagoACuentaResponse_QNAME, ObtenerDocumentoPagoACuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentosPorEmpresa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentosPorEmpresa }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/facturacion/v001", name = "obtenerDocumentosPorEmpresa")
    public JAXBElement<ObtenerDocumentosPorEmpresa> createObtenerDocumentosPorEmpresa(ObtenerDocumentosPorEmpresa value) {
        return new JAXBElement<ObtenerDocumentosPorEmpresa>(_ObtenerDocumentosPorEmpresa_QNAME, ObtenerDocumentosPorEmpresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentosPorEmpresaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentosPorEmpresaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/facturacion/v001", name = "obtenerDocumentosPorEmpresaResponse")
    public JAXBElement<ObtenerDocumentosPorEmpresaResponse> createObtenerDocumentosPorEmpresaResponse(ObtenerDocumentosPorEmpresaResponse value) {
        return new JAXBElement<ObtenerDocumentosPorEmpresaResponse>(_ObtenerDocumentosPorEmpresaResponse_QNAME, ObtenerDocumentosPorEmpresaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerFactura }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerFactura }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/facturacion/v001", name = "obtenerFactura")
    public JAXBElement<ObtenerFactura> createObtenerFactura(ObtenerFactura value) {
        return new JAXBElement<ObtenerFactura>(_ObtenerFactura_QNAME, ObtenerFactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerFacturaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerFacturaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/facturacion/v001", name = "obtenerFacturaResponse")
    public JAXBElement<ObtenerFacturaResponse> createObtenerFacturaResponse(ObtenerFacturaResponse value) {
        return new JAXBElement<ObtenerFacturaResponse>(_ObtenerFacturaResponse_QNAME, ObtenerFacturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Version }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Version }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/facturacion/v001", name = "version")
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
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/facturacion/v001", name = "versionResponse")
    public JAXBElement<VersionResponse> createVersionResponse(VersionResponse value) {
        return new JAXBElement<VersionResponse>(_VersionResponse_QNAME, VersionResponse.class, null, value);
    }

}
