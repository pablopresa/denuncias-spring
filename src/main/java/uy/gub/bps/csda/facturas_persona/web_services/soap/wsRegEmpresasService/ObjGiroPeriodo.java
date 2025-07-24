
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="causalHastaGiro" type="{http://bps.gub.uy/atyr/registro/rce/v002/datatypes}ObjCausal" minOccurs="0"/&gt;
 *         &lt;element name="giro" type="{http://bps.gub.uy/atyr/registro/rce/v002/datatypes}ObjGiro" minOccurs="0"/&gt;
 *         &lt;element name="periodo" type="{http://bps.gub.uy/atyr/registro/rce/v003/datatypes}ObjPeriodo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjGiroPeriodo", namespace = "http://bps.gub.uy/atyr/registro/rce/v002/datatypes", propOrder = {
    "causalHastaGiro",
    "giro",
    "periodo"
})
public class ObjGiroPeriodo {

    protected ObjCausal causalHastaGiro;
    protected ObjGiro giro;
    protected ObjPeriodo periodo;

    /**
     * Obtiene el valor de la propiedad causalHastaGiro.
     * 
     * @return
     *     possible object is
     *     {@link ObjCausal }
     *     
     */
    public ObjCausal getCausalHastaGiro() {
        return causalHastaGiro;
    }

    /**
     * Define el valor de la propiedad causalHastaGiro.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjCausal }
     *     
     */
    public void setCausalHastaGiro(ObjCausal value) {
        this.causalHastaGiro = value;
    }

    /**
     * Obtiene el valor de la propiedad giro.
     * 
     * @return
     *     possible object is
     *     {@link ObjGiro }
     *     
     */
    public ObjGiro getGiro() {
        return giro;
    }

    /**
     * Define el valor de la propiedad giro.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjGiro }
     *     
     */
    public void setGiro(ObjGiro value) {
        this.giro = value;
    }

    /**
     * Obtiene el valor de la propiedad periodo.
     * 
     * @return
     *     possible object is
     *     {@link ObjPeriodo }
     *     
     */
    public ObjPeriodo getPeriodo() {
        return periodo;
    }

    /**
     * Define el valor de la propiedad periodo.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjPeriodo }
     *     
     */
    public void setPeriodo(ObjPeriodo value) {
        this.periodo = value;
    }

}
