
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjLocalBPS complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjLocalBPS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codLocalBPS" type="{http://bps.gub.uy/atyr/}Entero"/&gt;
 *         &lt;element name="departamento" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjDepartamento"/&gt;
 *         &lt;element name="nombreLocalBPS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="sucursal" type="{http://bps.gub.uy/atyr/}Entero"/&gt;
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
@XmlType(name = "ObjLocalBPS", propOrder = {
    "codLocalBPS",
    "departamento",
    "nombreLocalBPS",
    "sucursal",
    "vigente"
})
public class ObjLocalBPS {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Entero codLocalBPS;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjDepartamento2 departamento;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String nombreLocalBPS;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Entero sucursal;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String vigente;

    /**
     * Obtiene el valor de la propiedad codLocalBPS.
     * 
     * @return
     *     possible object is
     *     {@link Entero }
     *     
     */
    public Entero getCodLocalBPS() {
        return codLocalBPS;
    }

    /**
     * Define el valor de la propiedad codLocalBPS.
     * 
     * @param value
     *     allowed object is
     *     {@link Entero }
     *     
     */
    public void setCodLocalBPS(Entero value) {
        this.codLocalBPS = value;
    }

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link ObjDepartamento2 }
     *     
     */
    public ObjDepartamento2 getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjDepartamento2 }
     *     
     */
    public void setDepartamento(ObjDepartamento2 value) {
        this.departamento = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreLocalBPS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreLocalBPS() {
        return nombreLocalBPS;
    }

    /**
     * Define el valor de la propiedad nombreLocalBPS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreLocalBPS(String value) {
        this.nombreLocalBPS = value;
    }

    /**
     * Obtiene el valor de la propiedad sucursal.
     * 
     * @return
     *     possible object is
     *     {@link Entero }
     *     
     */
    public Entero getSucursal() {
        return sucursal;
    }

    /**
     * Define el valor de la propiedad sucursal.
     * 
     * @param value
     *     allowed object is
     *     {@link Entero }
     *     
     */
    public void setSucursal(Entero value) {
        this.sucursal = value;
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
