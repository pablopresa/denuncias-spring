
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="claveContribuyente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codEstadoAnulado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="denominacion" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjDenominacionPeriodo"/&gt;
 *         &lt;element name="fechaInicioActividad" type="{http://bps.gub.uy/atyr/}Fecha"/&gt;
 *         &lt;element name="nroContribuyente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nroIntContr" type="{http://bps.gub.uy/atyr/}Entero"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjContribuyente", propOrder = {
    "claveContribuyente",
    "codEstadoAnulado",
    "denominacion",
    "fechaInicioActividad",
    "nroContribuyente",
    "nroIntContr"
})
public class ObjContribuyente3 {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String claveContribuyente;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String codEstadoAnulado;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjDenominacionPeriodo2 denominacion;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Fecha fechaInicioActividad;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String nroContribuyente;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Entero nroIntContr;

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
     *     {@link ObjDenominacionPeriodo2 }
     *     
     */
    public ObjDenominacionPeriodo2 getDenominacion() {
        return denominacion;
    }

    /**
     * Define el valor de la propiedad denominacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjDenominacionPeriodo2 }
     *     
     */
    public void setDenominacion(ObjDenominacionPeriodo2 value) {
        this.denominacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicioActividad.
     * 
     * @return
     *     possible object is
     *     {@link Fecha }
     *     
     */
    public Fecha getFechaInicioActividad() {
        return fechaInicioActividad;
    }

    /**
     * Define el valor de la propiedad fechaInicioActividad.
     * 
     * @param value
     *     allowed object is
     *     {@link Fecha }
     *     
     */
    public void setFechaInicioActividad(Fecha value) {
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
     *     {@link Entero }
     *     
     */
    public Entero getNroIntContr() {
        return nroIntContr;
    }

    /**
     * Define el valor de la propiedad nroIntContr.
     * 
     * @param value
     *     allowed object is
     *     {@link Entero }
     *     
     */
    public void setNroIntContr(Entero value) {
        this.nroIntContr = value;
    }

}
