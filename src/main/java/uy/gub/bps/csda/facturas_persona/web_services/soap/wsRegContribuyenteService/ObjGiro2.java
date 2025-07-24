
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjGiro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjGiro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codGiro" type="{http://bps.gub.uy/atyr/}Entero"/&gt;
 *         &lt;element name="codGiroApertura" type="{http://bps.gub.uy/atyr/}Entero"/&gt;
 *         &lt;element name="descGiro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ObjGiro", propOrder = {
    "codGiro",
    "codGiroApertura",
    "descGiro",
    "vigente"
})
public class ObjGiro2 {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Entero codGiro;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Entero codGiroApertura;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String descGiro;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String vigente;

    /**
     * Obtiene el valor de la propiedad codGiro.
     * 
     * @return
     *     possible object is
     *     {@link Entero }
     *     
     */
    public Entero getCodGiro() {
        return codGiro;
    }

    /**
     * Define el valor de la propiedad codGiro.
     * 
     * @param value
     *     allowed object is
     *     {@link Entero }
     *     
     */
    public void setCodGiro(Entero value) {
        this.codGiro = value;
    }

    /**
     * Obtiene el valor de la propiedad codGiroApertura.
     * 
     * @return
     *     possible object is
     *     {@link Entero }
     *     
     */
    public Entero getCodGiroApertura() {
        return codGiroApertura;
    }

    /**
     * Define el valor de la propiedad codGiroApertura.
     * 
     * @param value
     *     allowed object is
     *     {@link Entero }
     *     
     */
    public void setCodGiroApertura(Entero value) {
        this.codGiroApertura = value;
    }

    /**
     * Obtiene el valor de la propiedad descGiro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescGiro() {
        return descGiro;
    }

    /**
     * Define el valor de la propiedad descGiro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescGiro(String value) {
        this.descGiro = value;
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
