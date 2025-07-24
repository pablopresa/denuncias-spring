
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjTipoSueldoFicto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjTipoSueldoFicto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codTipoSueldoFicto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descTipoSueldoFicto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ObjTipoSueldoFicto", propOrder = {
    "codTipoSueldoFicto",
    "descTipoSueldoFicto",
    "vigente"
})
public class ObjTipoSueldoFicto {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String codTipoSueldoFicto;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String descTipoSueldoFicto;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String vigente;

    /**
     * Obtiene el valor de la propiedad codTipoSueldoFicto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodTipoSueldoFicto() {
        return codTipoSueldoFicto;
    }

    /**
     * Define el valor de la propiedad codTipoSueldoFicto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodTipoSueldoFicto(String value) {
        this.codTipoSueldoFicto = value;
    }

    /**
     * Obtiene el valor de la propiedad descTipoSueldoFicto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTipoSueldoFicto() {
        return descTipoSueldoFicto;
    }

    /**
     * Define el valor de la propiedad descTipoSueldoFicto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTipoSueldoFicto(String value) {
        this.descTipoSueldoFicto = value;
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
