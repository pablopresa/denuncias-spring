
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerContribuyenteResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerContribuyenteResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultObtenerContribuyente" type="{http://bps.gub.uy/registro/contribuyentes/v003/datatypes}ResultObtenerContribuyente" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerContribuyenteResponse", namespace = "http://bps.gub.uy/registro/contribuyentes/v003", propOrder = {
    "resultObtenerContribuyente"
})
public class ObtenerContribuyenteResponse {

    protected ResultObtenerContribuyente resultObtenerContribuyente;

    /**
     * Obtiene el valor de la propiedad resultObtenerContribuyente.
     * 
     * @return
     *     possible object is
     *     {@link ResultObtenerContribuyente }
     *     
     */
    public ResultObtenerContribuyente getResultObtenerContribuyente() {
        return resultObtenerContribuyente;
    }

    /**
     * Define el valor de la propiedad resultObtenerContribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObtenerContribuyente }
     *     
     */
    public void setResultObtenerContribuyente(ResultObtenerContribuyente value) {
        this.resultObtenerContribuyente = value;
    }

}
