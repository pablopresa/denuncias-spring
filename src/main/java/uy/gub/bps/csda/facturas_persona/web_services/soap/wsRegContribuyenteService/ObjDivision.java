
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para objDivision complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="objDivision"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codDivision" type="{http://bps.gub.uy/atyr/}Entero" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objDivision", propOrder = {
    "codDivision",
    "descripcion"
})
public class ObjDivision {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes")
    protected Entero codDivision;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes")
    protected String descripcion;

    /**
     * Obtiene el valor de la propiedad codDivision.
     * 
     * @return
     *     possible object is
     *     {@link Entero }
     *     
     */
    public Entero getCodDivision() {
        return codDivision;
    }

    /**
     * Define el valor de la propiedad codDivision.
     * 
     * @param value
     *     allowed object is
     *     {@link Entero }
     *     
     */
    public void setCodDivision(Entero value) {
        this.codDivision = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

}
