
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjGiroPeriodo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjGiroPeriodo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="causalHastaGiro" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjCausal"/&gt;
 *         &lt;element name="giro" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjGiro"/&gt;
 *         &lt;element name="periodo" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjPeriodo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjGiroPeriodo", propOrder = {
    "causalHastaGiro",
    "giro",
    "periodo"
})
public class ObjGiroPeriodo2 {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjCausal2 causalHastaGiro;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjGiro2 giro;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjPeriodo3 periodo;

    /**
     * Obtiene el valor de la propiedad causalHastaGiro.
     * 
     * @return
     *     possible object is
     *     {@link ObjCausal2 }
     *     
     */
    public ObjCausal2 getCausalHastaGiro() {
        return causalHastaGiro;
    }

    /**
     * Define el valor de la propiedad causalHastaGiro.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjCausal2 }
     *     
     */
    public void setCausalHastaGiro(ObjCausal2 value) {
        this.causalHastaGiro = value;
    }

    /**
     * Obtiene el valor de la propiedad giro.
     * 
     * @return
     *     possible object is
     *     {@link ObjGiro2 }
     *     
     */
    public ObjGiro2 getGiro() {
        return giro;
    }

    /**
     * Define el valor de la propiedad giro.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjGiro2 }
     *     
     */
    public void setGiro(ObjGiro2 value) {
        this.giro = value;
    }

    /**
     * Obtiene el valor de la propiedad periodo.
     * 
     * @return
     *     possible object is
     *     {@link ObjPeriodo3 }
     *     
     */
    public ObjPeriodo3 getPeriodo() {
        return periodo;
    }

    /**
     * Define el valor de la propiedad periodo.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjPeriodo3 }
     *     
     */
    public void setPeriodo(ObjPeriodo3 value) {
        this.periodo = value;
    }

}
