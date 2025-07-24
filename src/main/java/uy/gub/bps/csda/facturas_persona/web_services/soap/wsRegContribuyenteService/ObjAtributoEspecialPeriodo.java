
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjAtributoEspecialPeriodo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjAtributoEspecialPeriodo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="area" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}objGenericCodeInt" minOccurs="0"/&gt;
 *         &lt;element name="atributoEspecial" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}objGenericCodeInt" minOccurs="0"/&gt;
 *         &lt;element name="causalHasta" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}objGenericCodeInt" minOccurs="0"/&gt;
 *         &lt;element name="fechaDesde" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="fechaHasta" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjAtributoEspecialPeriodo", propOrder = {
    "area",
    "atributoEspecial",
    "causalHasta",
    "fechaDesde",
    "fechaHasta"
})
public class ObjAtributoEspecialPeriodo {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes")
    protected ObjGenericCodeInt area;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes")
    protected ObjGenericCodeInt atributoEspecial;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes")
    protected ObjGenericCodeInt causalHasta;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaDesde;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaHasta;

    /**
     * Obtiene el valor de la propiedad area.
     * 
     * @return
     *     possible object is
     *     {@link ObjGenericCodeInt }
     *     
     */
    public ObjGenericCodeInt getArea() {
        return area;
    }

    /**
     * Define el valor de la propiedad area.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjGenericCodeInt }
     *     
     */
    public void setArea(ObjGenericCodeInt value) {
        this.area = value;
    }

    /**
     * Obtiene el valor de la propiedad atributoEspecial.
     * 
     * @return
     *     possible object is
     *     {@link ObjGenericCodeInt }
     *     
     */
    public ObjGenericCodeInt getAtributoEspecial() {
        return atributoEspecial;
    }

    /**
     * Define el valor de la propiedad atributoEspecial.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjGenericCodeInt }
     *     
     */
    public void setAtributoEspecial(ObjGenericCodeInt value) {
        this.atributoEspecial = value;
    }

    /**
     * Obtiene el valor de la propiedad causalHasta.
     * 
     * @return
     *     possible object is
     *     {@link ObjGenericCodeInt }
     *     
     */
    public ObjGenericCodeInt getCausalHasta() {
        return causalHasta;
    }

    /**
     * Define el valor de la propiedad causalHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjGenericCodeInt }
     *     
     */
    public void setCausalHasta(ObjGenericCodeInt value) {
        this.causalHasta = value;
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

}
