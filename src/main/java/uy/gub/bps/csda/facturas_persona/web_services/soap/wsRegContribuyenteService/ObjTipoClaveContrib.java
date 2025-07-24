
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjTipoClaveContrib complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjTipoClaveContrib"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codTipoClaveContribuyente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descTipoClaveContribuyente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="vigente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjTipoClaveContrib", propOrder = {
    "codTipoClaveContribuyente",
    "descTipoClaveContribuyente",
    "vigente"
})
public class ObjTipoClaveContrib {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String codTipoClaveContribuyente;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String descTipoClaveContribuyente;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String vigente;

    /**
     * Obtiene el valor de la propiedad codTipoClaveContribuyente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoClaveContribuyente() {
        return codTipoClaveContribuyente;
    }

    /**
     * Define el valor de la propiedad codTipoClaveContribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoClaveContribuyente(String value) {
        this.codTipoClaveContribuyente = value;
    }

    /**
     * Obtiene el valor de la propiedad descTipoClaveContribuyente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTipoClaveContribuyente() {
        return descTipoClaveContribuyente;
    }

    /**
     * Define el valor de la propiedad descTipoClaveContribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTipoClaveContribuyente(String value) {
        this.descTipoClaveContribuyente = value;
    }

    /**
     * Obtiene el valor de la propiedad vigente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVigente() {
        return vigente;
    }

    /**
     * Define el valor de la propiedad vigente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVigente(String value) {
        this.vigente = value;
    }

}
