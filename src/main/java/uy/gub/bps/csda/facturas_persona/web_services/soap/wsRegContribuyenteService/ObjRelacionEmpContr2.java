
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="causalDesde" type="{http://bps.gub.uy/atyr/registro/rce/v002/datatypes}ObjCausal" minOccurs="0"/&gt;
 *         &lt;element name="causalHasta" type="{http://bps.gub.uy/atyr/registro/rce/v002/datatypes}ObjCausal" minOccurs="0"/&gt;
 *         &lt;element name="codEstadoAnulado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroTramite" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "ObjRelacionEmpContr", namespace = "http://bps.gub.uy/atyr/registro/rce/v003/datatypes", propOrder = {
    "causalDesde",
    "causalHasta",
    "codEstadoAnulado",
    "numeroTramite",
    "periodo"
})
public class ObjRelacionEmpContr2 {

    protected ObjCausal causalDesde;
    protected ObjCausal causalHasta;
    protected String codEstadoAnulado;
    protected Integer numeroTramite;
    protected ObjPeriodo periodo;

    /**
     * Obtiene el valor de la propiedad causalDesde.
     * 
     * @return
     *     possible object is
     *     {@link ObjCausal }
     *     
     */
    public ObjCausal getCausalDesde() {
        return causalDesde;
    }

    /**
     * Define el valor de la propiedad causalDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjCausal }
     *     
     */
    public void setCausalDesde(ObjCausal value) {
        this.causalDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad causalHasta.
     * 
     * @return
     *     possible object is
     *     {@link ObjCausal }
     *     
     */
    public ObjCausal getCausalHasta() {
        return causalHasta;
    }

    /**
     * Define el valor de la propiedad causalHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjCausal }
     *     
     */
    public void setCausalHasta(ObjCausal value) {
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
     * Obtiene el valor de la propiedad numeroTramite.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroTramite() {
        return numeroTramite;
    }

    /**
     * Define el valor de la propiedad numeroTramite.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroTramite(Integer value) {
        this.numeroTramite = value;
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
