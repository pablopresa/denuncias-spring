
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorConsulta;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para versionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="versionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultVersion" type="{http://bps.gub.uy/v001/datatypes}ResultVersion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "versionResponse", namespace = "http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", propOrder = {
    "resultVersion"
})
public class VersionResponse {

    protected ResultVersion resultVersion;

    /**
     * Obtiene el valor de la propiedad resultVersion.
     * 
     * @return
     *     possible object is
     *     {@link ResultVersion }
     *     
     */
    public ResultVersion getResultVersion() {
        return resultVersion;
    }

    /**
     * Define el valor de la propiedad resultVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultVersion }
     *     
     */
    public void setResultVersion(ResultVersion value) {
        this.resultVersion = value;
    }

}
