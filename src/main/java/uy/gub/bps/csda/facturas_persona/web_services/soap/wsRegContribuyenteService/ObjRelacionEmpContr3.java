
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjRelacionEmpContr complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjRelacionEmpContr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="causalDesde" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjCausal"/&gt;
 *         &lt;element name="causalHasta" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjCausal"/&gt;
 *         &lt;element name="codEstadoAnulado" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ObjRelacionEmpContr", propOrder = {
    "causalDesde",
    "causalHasta",
    "codEstadoAnulado",
    "periodo"
})
public class ObjRelacionEmpContr3 {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjCausal2 causalDesde;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjCausal2 causalHasta;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String codEstadoAnulado;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjPeriodo3 periodo;

    /**
     * Obtiene el valor de la propiedad causalDesde.
     * 
     * @return
     *     possible object is
     *     {@link ObjCausal2 }
     *     
     */
    public ObjCausal2 getCausalDesde() {
        return causalDesde;
    }

    /**
     * Define el valor de la propiedad causalDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjCausal2 }
     *     
     */
    public void setCausalDesde(ObjCausal2 value) {
        this.causalDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad causalHasta.
     * 
     * @return
     *     possible object is
     *     {@link ObjCausal2 }
     *     
     */
    public ObjCausal2 getCausalHasta() {
        return causalHasta;
    }

    /**
     * Define el valor de la propiedad causalHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjCausal2 }
     *     
     */
    public void setCausalHasta(ObjCausal2 value) {
        this.causalHasta = value;
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
