
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjAEEmp complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjAEEmp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codAtributoEspecialEmpresa" type="{http://bps.gub.uy/atyr/}Entero"/&gt;
 *         &lt;element name="descAtributoEspecialEmpresa" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ObjAEEmp", propOrder = {
    "codAtributoEspecialEmpresa",
    "descAtributoEspecialEmpresa",
    "vigente"
})
public class ObjAEEmp {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Entero codAtributoEspecialEmpresa;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String descAtributoEspecialEmpresa;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String vigente;

    /**
     * Obtiene el valor de la propiedad codAtributoEspecialEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link Entero }
     *     
     */
    public Entero getCodAtributoEspecialEmpresa() {
        return codAtributoEspecialEmpresa;
    }

    /**
     * Define el valor de la propiedad codAtributoEspecialEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link Entero }
     *     
     */
    public void setCodAtributoEspecialEmpresa(Entero value) {
        this.codAtributoEspecialEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad descAtributoEspecialEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescAtributoEspecialEmpresa() {
        return descAtributoEspecialEmpresa;
    }

    /**
     * Define el valor de la propiedad descAtributoEspecialEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescAtributoEspecialEmpresa(String value) {
        this.descAtributoEspecialEmpresa = value;
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
