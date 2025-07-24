
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjCalle complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjCalle"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codCalle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="localidad" type="{http://bps.gub.uy/atyr/registro/rce/v002/datatypes}ObjLocalidad" minOccurs="0"/&gt;
 *         &lt;element name="nombreCalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ObjCalle", namespace = "http://bps.gub.uy/atyr/registro/rce/v002/datatypes", propOrder = {
    "codCalle",
    "localidad",
    "nombreCalle",
    "vigente"
})
public class ObjCalle {

    protected Integer codCalle;
    protected ObjLocalidad localidad;
    protected String nombreCalle;
    protected String vigente;

    /**
     * Obtiene el valor de la propiedad codCalle.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodCalle() {
        return codCalle;
    }

    /**
     * Define el valor de la propiedad codCalle.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodCalle(Integer value) {
        this.codCalle = value;
    }

    /**
     * Obtiene el valor de la propiedad localidad.
     * 
     * @return
     *     possible object is
     *     {@link ObjLocalidad }
     *     
     */
    public ObjLocalidad getLocalidad() {
        return localidad;
    }

    /**
     * Define el valor de la propiedad localidad.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjLocalidad }
     *     
     */
    public void setLocalidad(ObjLocalidad value) {
        this.localidad = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreCalle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCalle() {
        return nombreCalle;
    }

    /**
     * Define el valor de la propiedad nombreCalle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCalle(String value) {
        this.nombreCalle = value;
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
