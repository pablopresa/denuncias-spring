
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjTipoTitularVehiculo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjTipoTitularVehiculo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codTipoTitularVehiculo" type="{http://bps.gub.uy/atyr/}Entero"/&gt;
 *         &lt;element name="descTipoTitularVehiculo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjTipoTitularVehiculo", propOrder = {
    "codTipoTitularVehiculo",
    "descTipoTitularVehiculo"
})
public class ObjTipoTitularVehiculo {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Entero codTipoTitularVehiculo;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String descTipoTitularVehiculo;

    /**
     * Obtiene el valor de la propiedad codTipoTitularVehiculo.
     * 
     * @return
     *     possible object is
     *     {@link Entero }
     *     
     */
    public Entero getCodTipoTitularVehiculo() {
        return codTipoTitularVehiculo;
    }

    /**
     * Define el valor de la propiedad codTipoTitularVehiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link Entero }
     *     
     */
    public void setCodTipoTitularVehiculo(Entero value) {
        this.codTipoTitularVehiculo = value;
    }

    /**
     * Obtiene el valor de la propiedad descTipoTitularVehiculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTipoTitularVehiculo() {
        return descTipoTitularVehiculo;
    }

    /**
     * Define el valor de la propiedad descTipoTitularVehiculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTipoTitularVehiculo(String value) {
        this.descTipoTitularVehiculo = value;
    }

}
