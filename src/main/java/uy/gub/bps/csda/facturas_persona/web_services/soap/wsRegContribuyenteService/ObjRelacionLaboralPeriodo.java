
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjRelacionLaboralPeriodo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjRelacionLaboralPeriodo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="causalEgreso" type="{http://bps.gub.uy/atyr/registro/codigueras/v001/datatypes}ObjGenericCode" minOccurs="0"/&gt;
 *         &lt;element name="periodo" type="{http://bps.gub.uy/atyr/registro/rce/v003/datatypes}ObjPeriodo" minOccurs="0"/&gt;
 *         &lt;element name="relacionLaboral" type="{http://bps.gub.uy/atyr/registro/codigueras/v001/datatypes}ObjGenericCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjRelacionLaboralPeriodo", namespace = "http://bps.gub.uy/atyr/registro/rce/v004/datatypes", propOrder = {
    "causalEgreso",
    "periodo",
    "relacionLaboral"
})
public class ObjRelacionLaboralPeriodo {

    protected ObjGenericCode causalEgreso;
    protected ObjPeriodo periodo;
    protected ObjGenericCode relacionLaboral;

    /**
     * Obtiene el valor de la propiedad causalEgreso.
     * 
     * @return
     *     possible object is
     *     {@link ObjGenericCode }
     *     
     */
    public ObjGenericCode getCausalEgreso() {
        return causalEgreso;
    }

    /**
     * Define el valor de la propiedad causalEgreso.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjGenericCode }
     *     
     */
    public void setCausalEgreso(ObjGenericCode value) {
        this.causalEgreso = value;
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

    /**
     * Obtiene el valor de la propiedad relacionLaboral.
     * 
     * @return
     *     possible object is
     *     {@link ObjGenericCode }
     *     
     */
    public ObjGenericCode getRelacionLaboral() {
        return relacionLaboral;
    }

    /**
     * Define el valor de la propiedad relacionLaboral.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjGenericCode }
     *     
     */
    public void setRelacionLaboral(ObjGenericCode value) {
        this.relacionLaboral = value;
    }

}
