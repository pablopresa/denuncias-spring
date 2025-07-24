
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjFormaTenencia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjFormaTenencia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codFormaTenencia" type="{http://bps.gub.uy/atyr/}Entero"/&gt;
 *         &lt;element name="descFormaTenencia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ObjFormaTenencia", propOrder = {
    "codFormaTenencia",
    "descFormaTenencia",
    "vigente"
})
public class ObjFormaTenencia {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Entero codFormaTenencia;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String descFormaTenencia;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String vigente;

    /**
     * Obtiene el valor de la propiedad codFormaTenencia.
     * 
     * @return
     *     possible object is
     *     {@link Entero }
     *     
     */
    public Entero getCodFormaTenencia() {
        return codFormaTenencia;
    }

    /**
     * Define el valor de la propiedad codFormaTenencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Entero }
     *     
     */
    public void setCodFormaTenencia(Entero value) {
        this.codFormaTenencia = value;
    }

    /**
     * Obtiene el valor de la propiedad descFormaTenencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescFormaTenencia() {
        return descFormaTenencia;
    }

    /**
     * Define el valor de la propiedad descFormaTenencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescFormaTenencia(String value) {
        this.descFormaTenencia = value;
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
