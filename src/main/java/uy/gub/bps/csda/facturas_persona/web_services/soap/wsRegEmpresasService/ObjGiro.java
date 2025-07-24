
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="codGiro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codGiroApertura" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="descGiro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vigente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjGiro", namespace = "http://bps.gub.uy/atyr/registro/rce/v002/datatypes", propOrder = {
    "codGiro",
    "codGiroApertura",
    "descGiro",
    "vigente"
})
public class ObjGiro {

    protected Integer codGiro;
    protected Integer codGiroApertura;
    protected String descGiro;
    protected String vigente;

    /**
     * Obtiene el valor de la propiedad codGiro.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodGiro() {
        return codGiro;
    }

    /**
     * Define el valor de la propiedad codGiro.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodGiro(Integer value) {
        this.codGiro = value;
    }

    /**
     * Obtiene el valor de la propiedad codGiroApertura.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodGiroApertura() {
        return codGiroApertura;
    }

    /**
     * Define el valor de la propiedad codGiroApertura.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodGiroApertura(Integer value) {
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
