
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorConsulta;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the uy.gub.bps.csda.facturas_persona.web_services.soap.WsEmisorConsulta package. 
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

    private final static QName _ObtenerDocumentosPorNroReferencia_QNAME = new QName("http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", "obtenerDocumentosPorNroReferencia");
    private final static QName _ObtenerDocumentosPorNroReferenciaResponse_QNAME = new QName("http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", "obtenerDocumentosPorNroReferenciaResponse");
    private final static QName _ObtenerDocumentosPorNroResumen_QNAME = new QName("http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", "obtenerDocumentosPorNroResumen");
    private final static QName _ObtenerDocumentosPorNroResumenResponse_QNAME = new QName("http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", "obtenerDocumentosPorNroResumenResponse");
    private final static QName _ObtenerDuplicadoDocumento_QNAME = new QName("http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", "obtenerDuplicadoDocumento");
    private final static QName _ObtenerDuplicadoDocumentoResponse_QNAME = new QName("http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", "obtenerDuplicadoDocumentoResponse");
    private final static QName _ObtenerUltimoDocumento_QNAME = new QName("http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", "obtenerUltimoDocumento");
    private final static QName _ObtenerUltimoDocumentoResponse_QNAME = new QName("http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", "obtenerUltimoDocumentoResponse");
    private final static QName _Version_QNAME = new QName("http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", "version");
    private final static QName _VersionResponse_QNAME = new QName("http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", "versionResponse");
    private final static QName _ResultObtenerDuplicadoDocumentoWsDocumentoDuplicado_QNAME = new QName("", "documentoDuplicado");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: uy.gub.bps.csda.facturas_persona.web_services.soap.WsEmisorConsulta
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
     * Create an instance of {@link ParamObtenerUltimoDocumento }
     * 
     */
    public ParamObtenerUltimoDocumento createParamObtenerUltimoDocumento() {
        return new ParamObtenerUltimoDocumento();
    }

    /**
     * Create an instance of {@link ResultObtenerUltimoDocumento }
     * 
     */
    public ResultObtenerUltimoDocumento createResultObtenerUltimoDocumento() {
        return new ResultObtenerUltimoDocumento();
    }

    /**
     * Create an instance of {@link DocumentoDuplicado }
     * 
     */
    public DocumentoDuplicado createDocumentoDuplicado() {
        return new DocumentoDuplicado();
    }

    /**
     * Create an instance of {@link Documento }
     * 
     */
    public Documento createDocumento() {
        return new Documento();
    }

    /**
     * Create an instance of {@link ParamObtenerDuplicadoDocumento }
     * 
     */
    public ParamObtenerDuplicadoDocumento createParamObtenerDuplicadoDocumento() {
        return new ParamObtenerDuplicadoDocumento();
    }

    /**
     * Create an instance of {@link ResultObtenerDuplicadoDocumentoWs }
     * 
     */
    public ResultObtenerDuplicadoDocumentoWs createResultObtenerDuplicadoDocumentoWs() {
        return new ResultObtenerDuplicadoDocumentoWs();
    }

    /**
     * Create an instance of {@link ParamObtenerDocumentosPorNroReferencia }
     * 
     */
    public ParamObtenerDocumentosPorNroReferencia createParamObtenerDocumentosPorNroReferencia() {
        return new ParamObtenerDocumentosPorNroReferencia();
    }

    /**
     * Create an instance of {@link ResultObtenerDocumentosPorNroReferenciaWs }
     * 
     */
    public ResultObtenerDocumentosPorNroReferenciaWs createResultObtenerDocumentosPorNroReferenciaWs() {
        return new ResultObtenerDocumentosPorNroReferenciaWs();
    }

    /**
     * Create an instance of {@link DatosDocumento }
     * 
     */
    public DatosDocumento createDatosDocumento() {
        return new DatosDocumento();
    }

    /**
     * Create an instance of {@link ParamObtenerDocumentosPorNroResumen }
     * 
     */
    public ParamObtenerDocumentosPorNroResumen createParamObtenerDocumentosPorNroResumen() {
        return new ParamObtenerDocumentosPorNroResumen();
    }

    /**
     * Create an instance of {@link ResultObtenerDocumentosPorNroResumen }
     * 
     */
    public ResultObtenerDocumentosPorNroResumen createResultObtenerDocumentosPorNroResumen() {
        return new ResultObtenerDocumentosPorNroResumen();
    }

    /**
     * Create an instance of {@link ObtenerDocumentosPorNroReferencia }
     * 
     */
    public ObtenerDocumentosPorNroReferencia createObtenerDocumentosPorNroReferencia() {
        return new ObtenerDocumentosPorNroReferencia();
    }

    /**
     * Create an instance of {@link ObtenerDocumentosPorNroReferenciaResponse }
     * 
     */
    public ObtenerDocumentosPorNroReferenciaResponse createObtenerDocumentosPorNroReferenciaResponse() {
        return new ObtenerDocumentosPorNroReferenciaResponse();
    }

    /**
     * Create an instance of {@link ObtenerDocumentosPorNroResumen }
     * 
     */
    public ObtenerDocumentosPorNroResumen createObtenerDocumentosPorNroResumen() {
        return new ObtenerDocumentosPorNroResumen();
    }

    /**
     * Create an instance of {@link ObtenerDocumentosPorNroResumenResponse }
     * 
     */
    public ObtenerDocumentosPorNroResumenResponse createObtenerDocumentosPorNroResumenResponse() {
        return new ObtenerDocumentosPorNroResumenResponse();
    }

    /**
     * Create an instance of {@link ObtenerDuplicadoDocumento }
     * 
     */
    public ObtenerDuplicadoDocumento createObtenerDuplicadoDocumento() {
        return new ObtenerDuplicadoDocumento();
    }

    /**
     * Create an instance of {@link ObtenerDuplicadoDocumentoResponse }
     * 
     */
    public ObtenerDuplicadoDocumentoResponse createObtenerDuplicadoDocumentoResponse() {
        return new ObtenerDuplicadoDocumentoResponse();
    }

    /**
     * Create an instance of {@link ObtenerUltimoDocumento }
     * 
     */
    public ObtenerUltimoDocumento createObtenerUltimoDocumento() {
        return new ObtenerUltimoDocumento();
    }

    /**
     * Create an instance of {@link ObtenerUltimoDocumentoResponse }
     * 
     */
    public ObtenerUltimoDocumentoResponse createObtenerUltimoDocumentoResponse() {
        return new ObtenerUltimoDocumentoResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentosPorNroReferencia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentosPorNroReferencia }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", name = "obtenerDocumentosPorNroReferencia")
    public JAXBElement<ObtenerDocumentosPorNroReferencia> createObtenerDocumentosPorNroReferencia(ObtenerDocumentosPorNroReferencia value) {
        return new JAXBElement<ObtenerDocumentosPorNroReferencia>(_ObtenerDocumentosPorNroReferencia_QNAME, ObtenerDocumentosPorNroReferencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentosPorNroReferenciaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentosPorNroReferenciaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", name = "obtenerDocumentosPorNroReferenciaResponse")
    public JAXBElement<ObtenerDocumentosPorNroReferenciaResponse> createObtenerDocumentosPorNroReferenciaResponse(ObtenerDocumentosPorNroReferenciaResponse value) {
        return new JAXBElement<ObtenerDocumentosPorNroReferenciaResponse>(_ObtenerDocumentosPorNroReferenciaResponse_QNAME, ObtenerDocumentosPorNroReferenciaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentosPorNroResumen }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentosPorNroResumen }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", name = "obtenerDocumentosPorNroResumen")
    public JAXBElement<ObtenerDocumentosPorNroResumen> createObtenerDocumentosPorNroResumen(ObtenerDocumentosPorNroResumen value) {
        return new JAXBElement<ObtenerDocumentosPorNroResumen>(_ObtenerDocumentosPorNroResumen_QNAME, ObtenerDocumentosPorNroResumen.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentosPorNroResumenResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerDocumentosPorNroResumenResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", name = "obtenerDocumentosPorNroResumenResponse")
    public JAXBElement<ObtenerDocumentosPorNroResumenResponse> createObtenerDocumentosPorNroResumenResponse(ObtenerDocumentosPorNroResumenResponse value) {
        return new JAXBElement<ObtenerDocumentosPorNroResumenResponse>(_ObtenerDocumentosPorNroResumenResponse_QNAME, ObtenerDocumentosPorNroResumenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDuplicadoDocumento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerDuplicadoDocumento }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", name = "obtenerDuplicadoDocumento")
    public JAXBElement<ObtenerDuplicadoDocumento> createObtenerDuplicadoDocumento(ObtenerDuplicadoDocumento value) {
        return new JAXBElement<ObtenerDuplicadoDocumento>(_ObtenerDuplicadoDocumento_QNAME, ObtenerDuplicadoDocumento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerDuplicadoDocumentoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerDuplicadoDocumentoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", name = "obtenerDuplicadoDocumentoResponse")
    public JAXBElement<ObtenerDuplicadoDocumentoResponse> createObtenerDuplicadoDocumentoResponse(ObtenerDuplicadoDocumentoResponse value) {
        return new JAXBElement<ObtenerDuplicadoDocumentoResponse>(_ObtenerDuplicadoDocumentoResponse_QNAME, ObtenerDuplicadoDocumentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUltimoDocumento }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerUltimoDocumento }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", name = "obtenerUltimoDocumento")
    public JAXBElement<ObtenerUltimoDocumento> createObtenerUltimoDocumento(ObtenerUltimoDocumento value) {
        return new JAXBElement<ObtenerUltimoDocumento>(_ObtenerUltimoDocumento_QNAME, ObtenerUltimoDocumento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUltimoDocumentoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerUltimoDocumentoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", name = "obtenerUltimoDocumentoResponse")
    public JAXBElement<ObtenerUltimoDocumentoResponse> createObtenerUltimoDocumentoResponse(ObtenerUltimoDocumentoResponse value) {
        return new JAXBElement<ObtenerUltimoDocumentoResponse>(_ObtenerUltimoDocumentoResponse_QNAME, ObtenerUltimoDocumentoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Version }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Version }{@code >}
     */
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", name = "version")
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
    @XmlElementDecl(namespace = "http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", name = "versionResponse")
    public JAXBElement<VersionResponse> createVersionResponse(VersionResponse value) {
        return new JAXBElement<VersionResponse>(_VersionResponse_QNAME, VersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentoDuplicado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentoDuplicado }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "documentoDuplicado", scope = ResultObtenerDuplicadoDocumentoWs.class)
    public JAXBElement<DocumentoDuplicado> createResultObtenerDuplicadoDocumentoWsDocumentoDuplicado(DocumentoDuplicado value) {
        return new JAXBElement<DocumentoDuplicado>(_ResultObtenerDuplicadoDocumentoWsDocumentoDuplicado_QNAME, DocumentoDuplicado.class, ResultObtenerDuplicadoDocumentoWs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentoDuplicado }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocumentoDuplicado }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "documentoDuplicado", scope = ResultObtenerUltimoDocumento.class)
    public JAXBElement<DocumentoDuplicado> createResultObtenerUltimoDocumentoDocumentoDuplicado(DocumentoDuplicado value) {
        return new JAXBElement<DocumentoDuplicado>(_ResultObtenerDuplicadoDocumentoWsDocumentoDuplicado_QNAME, DocumentoDuplicado.class, ResultObtenerUltimoDocumento.class, value);
    }

}
