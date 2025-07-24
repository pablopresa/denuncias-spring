
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParamObtDescripcionNatJuridica complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ParamObtDescripcionNatJuridica"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codNaturalezaJuridica" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamObtDescripcionNatJuridica", namespace = "http://bps.gub.uy/atyr/registro/contribuyentes/v002/datatypes", propOrder = {
    "codNaturalezaJuridica"
})
public class ParamObtDescripcionNatJuridica {

    protected Integer codNaturalezaJuridica;

    /**
     * Obtiene el valor de la propiedad codNaturalezaJuridica.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodNaturalezaJuridica() {
        return codNaturalezaJuridica;
    }

    /**
     * Define el valor de la propiedad codNaturalezaJuridica.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodNaturalezaJuridica(Integer value) {
        this.codNaturalezaJuridica = value;
    }

}
