
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Real complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Real"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="real" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Real", namespace = "http://bps.gub.uy/atyr/", propOrder = {
    "real"
})
public class Real {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/", required = true, type = Double.class, nillable = true)
    protected Double real;

    /**
     * Obtiene el valor de la propiedad real.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getReal() {
        return real;
    }

    /**
     * Define el valor de la propiedad real.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setReal(Double value) {
        this.real = value;
    }

}
