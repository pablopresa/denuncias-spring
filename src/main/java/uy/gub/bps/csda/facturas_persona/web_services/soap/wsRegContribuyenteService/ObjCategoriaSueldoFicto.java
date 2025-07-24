
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjCategoriaSueldoFicto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjCategoriaSueldoFicto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codCategoriaSueldoFicto" type="{http://bps.gub.uy/atyr/}Entero"/&gt;
 *         &lt;element name="descCategoriaSueldoFicto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ObjCategoriaSueldoFicto", propOrder = {
    "codCategoriaSueldoFicto",
    "descCategoriaSueldoFicto",
    "vigente"
})
public class ObjCategoriaSueldoFicto {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Entero codCategoriaSueldoFicto;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String descCategoriaSueldoFicto;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String vigente;

    /**
     * Obtiene el valor de la propiedad codCategoriaSueldoFicto.
     * 
     * @return
     *     possible object is
     *     {@link Entero }
     *     
     */
    public Entero getCodCategoriaSueldoFicto() {
        return codCategoriaSueldoFicto;
    }

    /**
     * Define el valor de la propiedad codCategoriaSueldoFicto.
     * 
     * @param value
     *     allowed object is
     *     {@link Entero }
     *     
     */
    public void setCodCategoriaSueldoFicto(Entero value) {
        this.codCategoriaSueldoFicto = value;
    }

    /**
     * Obtiene el valor de la propiedad descCategoriaSueldoFicto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescCategoriaSueldoFicto() {
        return descCategoriaSueldoFicto;
    }

    /**
     * Define el valor de la propiedad descCategoriaSueldoFicto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescCategoriaSueldoFicto(String value) {
        this.descCategoriaSueldoFicto = value;
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
