
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para paramObtenerAtributoEspecialEmpresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="paramObtenerAtributoEspecialEmpresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claveContribuyente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codAportacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codsAtributosEspeciales" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fechaDesde" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="fechaHasta" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="nroEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroExtContribuyente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroIntContribuyente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nroIntEmp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "paramObtenerAtributoEspecialEmpresa", namespace = "http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes", propOrder = {
    "claveContribuyente",
    "codAportacion",
    "codsAtributosEspeciales",
    "fechaDesde",
    "fechaHasta",
    "nroEmpresa",
    "nroExtContribuyente",
    "nroIntContribuyente",
    "nroIntEmp"
})
public class ParamObtenerAtributoEspecialEmpresa {

    protected String claveContribuyente;
    protected Integer codAportacion;
    @XmlElement(nillable = true)
    protected List<Integer> codsAtributosEspeciales;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaDesde;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaHasta;
    protected String nroEmpresa;
    protected String nroExtContribuyente;
    protected Integer nroIntContribuyente;
    protected Integer nroIntEmp;

    /**
     * Obtiene el valor de la propiedad claveContribuyente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveContribuyente() {
        return claveContribuyente;
    }

    /**
     * Define el valor de la propiedad claveContribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveContribuyente(String value) {
        this.claveContribuyente = value;
    }

    /**
     * Obtiene el valor de la propiedad codAportacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodAportacion() {
        return codAportacion;
    }

    /**
     * Define el valor de la propiedad codAportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodAportacion(Integer value) {
        this.codAportacion = value;
    }

    /**
     * Gets the value of the codsAtributosEspeciales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the codsAtributosEspeciales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCodsAtributosEspeciales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getCodsAtributosEspeciales() {
        if (codsAtributosEspeciales == null) {
            codsAtributosEspeciales = new ArrayList<Integer>();
        }
        return this.codsAtributosEspeciales;
    }

    /**
     * Obtiene el valor de la propiedad fechaDesde.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDesde() {
        return fechaDesde;
    }

    /**
     * Define el valor de la propiedad fechaDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDesde(XMLGregorianCalendar value) {
        this.fechaDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaHasta.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaHasta() {
        return fechaHasta;
    }

    /**
     * Define el valor de la propiedad fechaHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaHasta(XMLGregorianCalendar value) {
        this.fechaHasta = value;
    }

    /**
     * Obtiene el valor de la propiedad nroEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroEmpresa() {
        return nroEmpresa;
    }

    /**
     * Define el valor de la propiedad nroEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroEmpresa(String value) {
        this.nroEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad nroExtContribuyente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroExtContribuyente() {
        return nroExtContribuyente;
    }

    /**
     * Define el valor de la propiedad nroExtContribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroExtContribuyente(String value) {
        this.nroExtContribuyente = value;
    }

    /**
     * Obtiene el valor de la propiedad nroIntContribuyente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNroIntContribuyente() {
        return nroIntContribuyente;
    }

    /**
     * Define el valor de la propiedad nroIntContribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNroIntContribuyente(Integer value) {
        this.nroIntContribuyente = value;
    }

    /**
     * Obtiene el valor de la propiedad nroIntEmp.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNroIntEmp() {
        return nroIntEmp;
    }

    /**
     * Define el valor de la propiedad nroIntEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNroIntEmp(Integer value) {
        this.nroIntEmp = value;
    }

}
