
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjEstadoAportacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjEstadoAportacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="causalHastaEstadoApo" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjCausal"/&gt;
 *         &lt;element name="codEstadoAportacion" type="{http://bps.gub.uy/atyr/}Entero"/&gt;
 *         &lt;element name="descEstadoAportacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="periodoEstadoApo" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjPeriodo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjEstadoAportacion", propOrder = {
    "causalHastaEstadoApo",
    "codEstadoAportacion",
    "descEstadoAportacion",
    "periodoEstadoApo"
})
public class ObjEstadoAportacion2 {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjCausal2 causalHastaEstadoApo;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Entero codEstadoAportacion;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String descEstadoAportacion;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjPeriodo3 periodoEstadoApo;

    /**
     * Obtiene el valor de la propiedad causalHastaEstadoApo.
     * 
     * @return
     *     possible object is
     *     {@link ObjCausal2 }
     *     
     */
    public ObjCausal2 getCausalHastaEstadoApo() {
        return causalHastaEstadoApo;
    }

    /**
     * Define el valor de la propiedad causalHastaEstadoApo.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjCausal2 }
     *     
     */
    public void setCausalHastaEstadoApo(ObjCausal2 value) {
        this.causalHastaEstadoApo = value;
    }

    /**
     * Obtiene el valor de la propiedad codEstadoAportacion.
     * 
     * @return
     *     possible object is
     *     {@link Entero }
     *     
     */
    public Entero getCodEstadoAportacion() {
        return codEstadoAportacion;
    }

    /**
     * Define el valor de la propiedad codEstadoAportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Entero }
     *     
     */
    public void setCodEstadoAportacion(Entero value) {
        this.codEstadoAportacion = value;
    }

    /**
     * Obtiene el valor de la propiedad descEstadoAportacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescEstadoAportacion() {
        return descEstadoAportacion;
    }

    /**
     * Define el valor de la propiedad descEstadoAportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescEstadoAportacion(String value) {
        this.descEstadoAportacion = value;
    }

    /**
     * Obtiene el valor de la propiedad periodoEstadoApo.
     * 
     * @return
     *     possible object is
     *     {@link ObjPeriodo3 }
     *     
     */
    public ObjPeriodo3 getPeriodoEstadoApo() {
        return periodoEstadoApo;
    }

    /**
     * Define el valor de la propiedad periodoEstadoApo.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjPeriodo3 }
     *     
     */
    public void setPeriodoEstadoApo(ObjPeriodo3 value) {
        this.periodoEstadoApo = value;
    }

}
