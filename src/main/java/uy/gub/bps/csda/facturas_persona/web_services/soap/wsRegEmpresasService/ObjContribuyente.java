
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjContribuyente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjContribuyente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claveContribuyente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codEstadoAnulado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="denominacion" type="{http://bps.gub.uy/atyr/registro/rce/v003/datatypes}ObjDenominacionPeriodo" minOccurs="0"/&gt;
 *         &lt;element name="fechaInicioActividad" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="nroContribuyente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroIntContr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjContribuyente", namespace = "http://bps.gub.uy/atyr/registro/rce/v003/datatypes", propOrder = {
    "claveContribuyente",
    "codEstadoAnulado",
    "denominacion",
    "fechaInicioActividad",
    "nroContribuyente",
    "nroIntContr"
})
public class ObjContribuyente {

    protected String claveContribuyente;
    protected String codEstadoAnulado;
    protected ObjDenominacionPeriodo denominacion;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaInicioActividad;
    protected String nroContribuyente;
    protected Integer nroIntContr;

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
     * Obtiene el valor de la propiedad codEstadoAnulado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEstadoAnulado() {
        return codEstadoAnulado;
    }

    /**
     * Define el valor de la propiedad codEstadoAnulado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEstadoAnulado(String value) {
        this.codEstadoAnulado = value;
    }

    /**
     * Obtiene el valor de la propiedad denominacion.
     * 
     * @return
     *     possible object is
     *     {@link ObjDenominacionPeriodo }
     *     
     */
    public ObjDenominacionPeriodo getDenominacion() {
        return denominacion;
    }

    /**
     * Define el valor de la propiedad denominacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjDenominacionPeriodo }
     *     
     */
    public void setDenominacion(ObjDenominacionPeriodo value) {
        this.denominacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicioActividad.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInicioActividad() {
        return fechaInicioActividad;
    }

    /**
     * Define el valor de la propiedad fechaInicioActividad.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInicioActividad(XMLGregorianCalendar value) {
        this.fechaInicioActividad = value;
    }

    /**
     * Obtiene el valor de la propiedad nroContribuyente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroContribuyente() {
        return nroContribuyente;
    }

    /**
     * Define el valor de la propiedad nroContribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroContribuyente(String value) {
        this.nroContribuyente = value;
    }

    /**
     * Obtiene el valor de la propiedad nroIntContr.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNroIntContr() {
        return nroIntContr;
    }

    /**
     * Define el valor de la propiedad nroIntContr.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNroIntContr(Integer value) {
        this.nroIntContr = value;
    }

}
