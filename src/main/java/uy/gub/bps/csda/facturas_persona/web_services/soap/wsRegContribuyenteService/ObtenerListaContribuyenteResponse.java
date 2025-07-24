
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerListaContribuyenteResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerListaContribuyenteResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultObtenerListaContribuyente" type="{http://bps.gub.uy/registro/contribuyentes/v003/datatypes}resultObtenerListaContribuyente" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerListaContribuyenteResponse", namespace = "http://bps.gub.uy/registro/contribuyentes/v003", propOrder = {
    "resultObtenerListaContribuyente"
})
public class ObtenerListaContribuyenteResponse {

    protected ResultObtenerListaContribuyente resultObtenerListaContribuyente;

    /**
     * Obtiene el valor de la propiedad resultObtenerListaContribuyente.
     * 
     * @return
     *     possible object is
     *     {@link ResultObtenerListaContribuyente }
     *     
     */
    public ResultObtenerListaContribuyente getResultObtenerListaContribuyente() {
        return resultObtenerListaContribuyente;
    }

    /**
     * Define el valor de la propiedad resultObtenerListaContribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObtenerListaContribuyente }
     *     
     */
    public void setResultObtenerListaContribuyente(ResultObtenerListaContribuyente value) {
        this.resultObtenerListaContribuyente = value;
    }

}
