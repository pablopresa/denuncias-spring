
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjEmpresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjEmpresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codEstadoAnulada" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="denominacion" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjDenominacionPeriodo"/&gt;
 *         &lt;element name="digitoControl" type="{http://bps.gub.uy/atyr/}Entero"/&gt;
 *         &lt;element name="fechaInicioActividad" type="{http://bps.gub.uy/atyr/}Fecha"/&gt;
 *         &lt;element name="nroEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nroIntEmp" type="{http://bps.gub.uy/atyr/}Entero"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjEmpresa", propOrder = {
    "codEstadoAnulada",
    "denominacion",
    "digitoControl",
    "fechaInicioActividad",
    "nroEmpresa",
    "nroIntEmp"
})
public class ObjEmpresa2 {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String codEstadoAnulada;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjDenominacionPeriodo2 denominacion;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Entero digitoControl;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Fecha fechaInicioActividad;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String nroEmpresa;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Entero nroIntEmp;

    /**
     * Obtiene el valor de la propiedad codEstadoAnulada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodEstadoAnulada() {
        return codEstadoAnulada;
    }

    /**
     * Define el valor de la propiedad codEstadoAnulada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodEstadoAnulada(String value) {
        this.codEstadoAnulada = value;
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
     * Obtiene el valor de la propiedad digitoControl.
     * 
     * @return
     *     possible object is
     *     {@link Entero }
     *     
     */
    public Entero getDigitoControl() {
        return digitoControl;
    }

    /**
     * Define el valor de la propiedad digitoControl.
     * 
     * @param value
     *     allowed object is
     *     {@link Entero }
     *     
     */
    public void setDigitoControl(Entero value) {
        this.digitoControl = value;
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
     * Obtiene el valor de la propiedad nroIntEmp.
     * 
     * @return
     *     possible object is
     *     {@link Entero }
     *     
     */
    public Entero getNroIntEmp() {
        return nroIntEmp;
    }

    /**
     * Define el valor de la propiedad nroIntEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link Entero }
     *     
     */
    public void setNroIntEmp(Entero value) {
        this.nroIntEmp = value;
    }

}
