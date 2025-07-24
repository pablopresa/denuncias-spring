
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerIntegrantesJuridicosResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerIntegrantesJuridicosResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultObtenerIntegrantesJuridicos" type="{http://bps.gub.uy/registro/contribuyentes/v003/datatypes}ResultObtenerIntegrantesJuridicos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerIntegrantesJuridicosResponse", namespace = "http://bps.gub.uy/registro/contribuyentes/v003", propOrder = {
    "resultObtenerIntegrantesJuridicos"
})
public class ObtenerIntegrantesJuridicosResponse {

    protected ResultObtenerIntegrantesJuridicos resultObtenerIntegrantesJuridicos;

    /**
     * Obtiene el valor de la propiedad resultObtenerIntegrantesJuridicos.
     * 
     * @return
     *     possible object is
     *     {@link ResultObtenerIntegrantesJuridicos }
     *     
     */
    public ResultObtenerIntegrantesJuridicos getResultObtenerIntegrantesJuridicos() {
        return resultObtenerIntegrantesJuridicos;
    }

    /**
     * Define el valor de la propiedad resultObtenerIntegrantesJuridicos.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObtenerIntegrantesJuridicos }
     *     
     */
    public void setResultObtenerIntegrantesJuridicos(ResultObtenerIntegrantesJuridicos value) {
        this.resultObtenerIntegrantesJuridicos = value;
    }

}
