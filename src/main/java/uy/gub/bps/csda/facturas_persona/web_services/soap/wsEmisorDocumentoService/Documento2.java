
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.activation.DataHandler;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlMimeType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Documento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Documento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pdf" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="anioMesDesde" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="anioMesHasta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="aportacionSecundaria" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="aportacionTitular" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fechaVencimientoIrpf" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="fechaVencimientoPago" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="importeMinimo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="importeTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="nroIntContribuyenteSec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nroIntContribuyenteTit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nroIntEmpresaSec" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nroIntEmpresaTit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nroReferencia" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="numeroObra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opcionDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Documento", namespace = "http://bps.gub.uy/recaudacion/facturacion/v001/datatypes", propOrder = {
    "pdf",
    "anioMesDesde",
    "anioMesHasta",
    "aportacionSecundaria",
    "aportacionTitular",
    "fechaVencimientoIrpf",
    "fechaVencimientoPago",
    "importeMinimo",
    "importeTotal",
    "nroIntContribuyenteSec",
    "nroIntContribuyenteTit",
    "nroIntEmpresaSec",
    "nroIntEmpresaTit",
    "nroReferencia",
    "numeroObra",
    "opcionDocumento",
    "tipoDocumento"
})
public class Documento2 {

    @XmlMimeType("application/pdf")
    protected DataHandler pdf;
    protected Integer anioMesDesde;
    protected Integer anioMesHasta;
    protected Integer aportacionSecundaria;
    protected Integer aportacionTitular;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaVencimientoIrpf;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaVencimientoPago;
    protected Double importeMinimo;
    protected Double importeTotal;
    protected Integer nroIntContribuyenteSec;
    protected Integer nroIntContribuyenteTit;
    protected Integer nroIntEmpresaSec;
    protected Integer nroIntEmpresaTit;
    protected Long nroReferencia;
    protected String numeroObra;
    protected String opcionDocumento;
    protected String tipoDocumento;

    /**
     * Obtiene el valor de la propiedad pdf.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getPdf() {
        return pdf;
    }

    /**
     * Define el valor de la propiedad pdf.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setPdf(DataHandler value) {
        this.pdf = value;
    }

    /**
     * Obtiene el valor de la propiedad anioMesDesde.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnioMesDesde() {
        return anioMesDesde;
    }

    /**
     * Define el valor de la propiedad anioMesDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnioMesDesde(Integer value) {
        this.anioMesDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad anioMesHasta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnioMesHasta() {
        return anioMesHasta;
    }

    /**
     * Define el valor de la propiedad anioMesHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnioMesHasta(Integer value) {
        this.anioMesHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad aportacionSecundaria.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAportacionSecundaria() {
        return aportacionSecundaria;
    }

    /**
     * Define el valor de la propiedad aportacionSecundaria.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAportacionSecundaria(Integer value) {
        this.aportacionSecundaria = value;
    }

    /**
     * Obtiene el valor de la propiedad aportacionTitular.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAportacionTitular() {
        return aportacionTitular;
    }

    /**
     * Define el valor de la propiedad aportacionTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAportacionTitular(Integer value) {
        this.aportacionTitular = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimientoIrpf.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimientoIrpf() {
        return fechaVencimientoIrpf;
    }

    /**
     * Define el valor de la propiedad fechaVencimientoIrpf.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimientoIrpf(XMLGregorianCalendar value) {
        this.fechaVencimientoIrpf = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimientoPago.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimientoPago() {
        return fechaVencimientoPago;
    }

    /**
     * Define el valor de la propiedad fechaVencimientoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimientoPago(XMLGregorianCalendar value) {
        this.fechaVencimientoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad importeMinimo.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImporteMinimo() {
        return importeMinimo;
    }

    /**
     * Define el valor de la propiedad importeMinimo.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImporteMinimo(Double value) {
        this.importeMinimo = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTotal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImporteTotal() {
        return importeTotal;
    }

    /**
     * Define el valor de la propiedad importeTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImporteTotal(Double value) {
        this.importeTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad nroIntContribuyenteSec.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNroIntContribuyenteSec() {
        return nroIntContribuyenteSec;
    }

    /**
     * Define el valor de la propiedad nroIntContribuyenteSec.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNroIntContribuyenteSec(Integer value) {
        this.nroIntContribuyenteSec = value;
    }

    /**
     * Obtiene el valor de la propiedad nroIntContribuyenteTit.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNroIntContribuyenteTit() {
        return nroIntContribuyenteTit;
    }

    /**
     * Define el valor de la propiedad nroIntContribuyenteTit.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNroIntContribuyenteTit(Integer value) {
        this.nroIntContribuyenteTit = value;
    }

    /**
     * Obtiene el valor de la propiedad nroIntEmpresaSec.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNroIntEmpresaSec() {
        return nroIntEmpresaSec;
    }

    /**
     * Define el valor de la propiedad nroIntEmpresaSec.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNroIntEmpresaSec(Integer value) {
        this.nroIntEmpresaSec = value;
    }

    /**
     * Obtiene el valor de la propiedad nroIntEmpresaTit.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNroIntEmpresaTit() {
        return nroIntEmpresaTit;
    }

    /**
     * Define el valor de la propiedad nroIntEmpresaTit.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNroIntEmpresaTit(Integer value) {
        this.nroIntEmpresaTit = value;
    }

    /**
     * Obtiene el valor de la propiedad nroReferencia.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNroReferencia() {
        return nroReferencia;
    }

    /**
     * Define el valor de la propiedad nroReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNroReferencia(Long value) {
        this.nroReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroObra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroObra() {
        return numeroObra;
    }

    /**
     * Define el valor de la propiedad numeroObra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroObra(String value) {
        this.numeroObra = value;
    }

    /**
     * Obtiene el valor de la propiedad opcionDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcionDocumento() {
        return opcionDocumento;
    }

    /**
     * Define el valor de la propiedad opcionDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcionDocumento(String value) {
        this.opcionDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

}
