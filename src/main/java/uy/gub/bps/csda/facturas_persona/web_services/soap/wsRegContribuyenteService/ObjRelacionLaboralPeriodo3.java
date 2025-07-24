
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="periodo" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjPeriodo"/&gt;
 *         &lt;element name="relacionLaboral" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjRelacionLaboral"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjRelacionLaboralPeriodo", propOrder = {
    "periodo",
    "relacionLaboral"
})
public class ObjRelacionLaboralPeriodo3 {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjPeriodo3 periodo;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjRelacionLaboral2 relacionLaboral;

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

    /**
     * Obtiene el valor de la propiedad relacionLaboral.
     * 
     * @return
     *     possible object is
     *     {@link ObjRelacionLaboral2 }
     *     
     */
    public ObjRelacionLaboral2 getRelacionLaboral() {
        return relacionLaboral;
    }

    /**
     * Define el valor de la propiedad relacionLaboral.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjRelacionLaboral2 }
     *     
     */
    public void setRelacionLaboral(ObjRelacionLaboral2 value) {
        this.relacionLaboral = value;
    }

}
