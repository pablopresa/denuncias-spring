
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorConsulta;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParamObtenerDocumentosPorNroResumen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ParamObtenerDocumentosPorNroResumen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nroResumen" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamObtenerDocumentosPorNroResumen", propOrder = {
    "nroResumen"
})
public class ParamObtenerDocumentosPorNroResumen {

    protected Long nroResumen;

    /**
     * Obtiene el valor de la propiedad nroResumen.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNroResumen() {
        return nroResumen;
    }

    /**
     * Define el valor de la propiedad nroResumen.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNroResumen(Long value) {
        this.nroResumen = value;
    }

}
