
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerContribuyentesPorPersonaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerContribuyentesPorPersonaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultObtenerContribuyentesPorPersona" type="{http://bps.gub.uy/registro/contribuyentes/v003/datatypes}ResultObtenerContribuyentesPorPersona" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerContribuyentesPorPersonaResponse", namespace = "http://bps.gub.uy/registro/contribuyentes/v003", propOrder = {
    "resultObtenerContribuyentesPorPersona"
})
public class ObtenerContribuyentesPorPersonaResponse {

    protected ResultObtenerContribuyentesPorPersona resultObtenerContribuyentesPorPersona;

    /**
     * Obtiene el valor de la propiedad resultObtenerContribuyentesPorPersona.
     * 
     * @return
     *     possible object is
     *     {@link ResultObtenerContribuyentesPorPersona }
     *     
     */
    public ResultObtenerContribuyentesPorPersona getResultObtenerContribuyentesPorPersona() {
        return resultObtenerContribuyentesPorPersona;
    }

    /**
     * Define el valor de la propiedad resultObtenerContribuyentesPorPersona.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObtenerContribuyentesPorPersona }
     *     
     */
    public void setResultObtenerContribuyentesPorPersona(ResultObtenerContribuyentesPorPersona value) {
        this.resultObtenerContribuyentesPorPersona = value;
    }

}
