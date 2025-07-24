
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjAEPeriodo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjAEPeriodo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="atributoEspecial" type="{http://bps.gub.uy/atyr/registro/empresas/v001/datatypes}ObjAEEmp" minOccurs="0"/&gt;
 *         &lt;element name="causal" type="{http://bps.gub.uy/atyr/registro/empresas/v001/datatypes}objGenericCodeInt" minOccurs="0"/&gt;
 *         &lt;element name="codArea" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "ObjAEPeriodo", namespace = "http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", propOrder = {
    "atributoEspecial",
    "causal",
    "codArea",
    "periodo"
})
public class ObjAEPeriodo {

    protected ObjAEEmp atributoEspecial;
    protected ObjGenericCodeInt causal;
    protected Integer codArea;
    protected ObjPeriodo periodo;

    /**
     * Obtiene el valor de la propiedad atributoEspecial.
     * 
     * @return
     *     possible object is
     *     {@link ObjAEEmp }
     *     
     */
    public ObjAEEmp getAtributoEspecial() {
        return atributoEspecial;
    }

    /**
     * Define el valor de la propiedad atributoEspecial.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjAEEmp }
     *     
     */
    public void setAtributoEspecial(ObjAEEmp value) {
        this.atributoEspecial = value;
    }

    /**
     * Obtiene el valor de la propiedad causal.
     * 
     * @return
     *     possible object is
     *     {@link ObjGenericCodeInt }
     *     
     */
    public ObjGenericCodeInt getCausal() {
        return causal;
    }

    /**
     * Define el valor de la propiedad causal.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjGenericCodeInt }
     *     
     */
    public void setCausal(ObjGenericCodeInt value) {
        this.causal = value;
    }

    /**
     * Obtiene el valor de la propiedad codArea.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodArea() {
        return codArea;
    }

    /**
     * Define el valor de la propiedad codArea.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodArea(Integer value) {
        this.codArea = value;
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
