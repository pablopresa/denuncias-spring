
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="codAtributoEspecialEmpresa" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="descAtributoEspecialEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ObjAEEmp", namespace = "http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", propOrder = {
    "codAtributoEspecialEmpresa",
    "descAtributoEspecialEmpresa",
    "vigente"
})
public class ObjAEEmp {

    protected Integer codAtributoEspecialEmpresa;
    protected String descAtributoEspecialEmpresa;
    protected String vigente;

    /**
     * Obtiene el valor de la propiedad codAtributoEspecialEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodAtributoEspecialEmpresa() {
        return codAtributoEspecialEmpresa;
    }

    /**
     * Define el valor de la propiedad codAtributoEspecialEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodAtributoEspecialEmpresa(Integer value) {
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
