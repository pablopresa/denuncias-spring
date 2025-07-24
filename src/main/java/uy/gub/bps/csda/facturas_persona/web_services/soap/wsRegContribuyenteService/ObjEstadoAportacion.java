
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="causalHastaEstadoApo" type="{http://bps.gub.uy/atyr/registro/rce/v002/datatypes}ObjCausal" minOccurs="0"/&gt;
 *         &lt;element name="codEstadoAportacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="descEstadoAportacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="periodoEstadoApo" type="{http://bps.gub.uy/atyr/registro/rce/v003/datatypes}ObjPeriodo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjEstadoAportacion", namespace = "http://bps.gub.uy/atyr/registro/rce/v002/datatypes", propOrder = {
    "causalHastaEstadoApo",
    "codEstadoAportacion",
    "descEstadoAportacion",
    "periodoEstadoApo"
})
public class ObjEstadoAportacion {

    protected ObjCausal causalHastaEstadoApo;
    protected Integer codEstadoAportacion;
    protected String descEstadoAportacion;
    protected ObjPeriodo periodoEstadoApo;

    /**
     * Obtiene el valor de la propiedad causalHastaEstadoApo.
     * 
     * @return
     *     possible object is
     *     {@link ObjCausal }
     *     
     */
    public ObjCausal getCausalHastaEstadoApo() {
        return causalHastaEstadoApo;
    }

    /**
     * Define el valor de la propiedad causalHastaEstadoApo.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjCausal }
     *     
     */
    public void setCausalHastaEstadoApo(ObjCausal value) {
        this.causalHastaEstadoApo = value;
    }

    /**
     * Obtiene el valor de la propiedad codEstadoAportacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodEstadoAportacion() {
        return codEstadoAportacion;
    }

    /**
     * Define el valor de la propiedad codEstadoAportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodEstadoAportacion(Integer value) {
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
     *     {@link ObjPeriodo }
     *     
     */
    public ObjPeriodo getPeriodoEstadoApo() {
        return periodoEstadoApo;
    }

    /**
     * Define el valor de la propiedad periodoEstadoApo.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjPeriodo }
     *     
     */
    public void setPeriodoEstadoApo(ObjPeriodo value) {
        this.periodoEstadoApo = value;
    }

}
