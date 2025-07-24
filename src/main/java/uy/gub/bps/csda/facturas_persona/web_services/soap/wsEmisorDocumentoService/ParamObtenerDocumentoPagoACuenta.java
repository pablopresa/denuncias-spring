
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParamObtenerDocumentoPagoACuenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ParamObtenerDocumentoPagoACuenta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fechaValor" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="fechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="identificadorCredito" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="importe" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="invocador" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="mensajes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="motivo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroObra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pagoExclusivoBps" type="{http://bps.gub.uy/recaudacion/facturacion/v001/datatypes}MetodoDePago" minOccurs="0"/&gt;
 *         &lt;element name="titCodCaja" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="titNroIntContrib" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="titNroIntEmp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamObtenerDocumentoPagoACuenta", namespace = "http://bps.gub.uy/recaudacion/facturacion/v003/datatypes/generaciondocumento", propOrder = {
    "fechaValor",
    "fechaVencimiento",
    "identificadorCredito",
    "importe",
    "invocador",
    "mensajes",
    "moneda",
    "motivo",
    "nroObra",
    "pagoExclusivoBps",
    "titCodCaja",
    "titNroIntContrib",
    "titNroIntEmp",
    "usuario"
})
public class ParamObtenerDocumentoPagoACuenta {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaValor;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaVencimiento;
    protected Integer identificadorCredito;
    protected Double importe;
    protected Integer invocador;
    @XmlElement(nillable = true)
    protected List<String> mensajes;
    protected Integer moneda;
    protected String motivo;
    protected String nroObra;
    @XmlSchemaType(name = "string")
    protected MetodoDePago pagoExclusivoBps;
    protected Integer titCodCaja;
    protected Integer titNroIntContrib;
    protected Integer titNroIntEmp;
    protected String usuario;

    /**
     * Obtiene el valor de la propiedad fechaValor.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaValor() {
        return fechaValor;
    }

    /**
     * Define el valor de la propiedad fechaValor.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaValor(XMLGregorianCalendar value) {
        this.fechaValor = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Define el valor de la propiedad fechaVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimiento(XMLGregorianCalendar value) {
        this.fechaVencimiento = value;
    }

    /**
     * Obtiene el valor de la propiedad identificadorCredito.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdentificadorCredito() {
        return identificadorCredito;
    }

    /**
     * Define el valor de la propiedad identificadorCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdentificadorCredito(Integer value) {
        this.identificadorCredito = value;
    }

    /**
     * Obtiene el valor de la propiedad importe.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImporte() {
        return importe;
    }

    /**
     * Define el valor de la propiedad importe.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImporte(Double value) {
        this.importe = value;
    }

    /**
     * Obtiene el valor de la propiedad invocador.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInvocador() {
        return invocador;
    }

    /**
     * Define el valor de la propiedad invocador.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInvocador(Integer value) {
        this.invocador = value;
    }

    /**
     * Gets the value of the mensajes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the mensajes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMensajes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getMensajes() {
        if (mensajes == null) {
            mensajes = new ArrayList<String>();
        }
        return this.mensajes;
    }

    /**
     * Obtiene el valor de la propiedad moneda.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMoneda() {
        return moneda;
    }

    /**
     * Define el valor de la propiedad moneda.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMoneda(Integer value) {
        this.moneda = value;
    }

    /**
     * Obtiene el valor de la propiedad motivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotivo() {
        return motivo;
    }

    /**
     * Define el valor de la propiedad motivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotivo(String value) {
        this.motivo = value;
    }

    /**
     * Obtiene el valor de la propiedad nroObra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroObra() {
        return nroObra;
    }

    /**
     * Define el valor de la propiedad nroObra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroObra(String value) {
        this.nroObra = value;
    }

    /**
     * Obtiene el valor de la propiedad pagoExclusivoBps.
     * 
     * @return
     *     possible object is
     *     {@link MetodoDePago }
     *     
     */
    public MetodoDePago getPagoExclusivoBps() {
        return pagoExclusivoBps;
    }

    /**
     * Define el valor de la propiedad pagoExclusivoBps.
     * 
     * @param value
     *     allowed object is
     *     {@link MetodoDePago }
     *     
     */
    public void setPagoExclusivoBps(MetodoDePago value) {
        this.pagoExclusivoBps = value;
    }

    /**
     * Obtiene el valor de la propiedad titCodCaja.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTitCodCaja() {
        return titCodCaja;
    }

    /**
     * Define el valor de la propiedad titCodCaja.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTitCodCaja(Integer value) {
        this.titCodCaja = value;
    }

    /**
     * Obtiene el valor de la propiedad titNroIntContrib.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTitNroIntContrib() {
        return titNroIntContrib;
    }

    /**
     * Define el valor de la propiedad titNroIntContrib.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTitNroIntContrib(Integer value) {
        this.titNroIntContrib = value;
    }

    /**
     * Obtiene el valor de la propiedad titNroIntEmp.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTitNroIntEmp() {
        return titNroIntEmp;
    }

    /**
     * Define el valor de la propiedad titNroIntEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTitNroIntEmp(Integer value) {
        this.titNroIntEmp = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

}
