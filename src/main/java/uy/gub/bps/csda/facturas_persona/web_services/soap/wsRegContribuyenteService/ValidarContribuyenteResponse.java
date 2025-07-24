
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para validarContribuyenteResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="validarContribuyenteResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultValidarContribuyente" type="{http://bps.gub.uy/registro/contribuyentes/v003/datatypes}ResultValidarContribuyente" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validarContribuyenteResponse", namespace = "http://bps.gub.uy/registro/contribuyentes/v003", propOrder = {
    "resultValidarContribuyente"
})
public class ValidarContribuyenteResponse {

    protected ResultValidarContribuyente resultValidarContribuyente;

    /**
     * Obtiene el valor de la propiedad resultValidarContribuyente.
     * 
     * @return
     *     possible object is
     *     {@link ResultValidarContribuyente }
     *     
     */
    public ResultValidarContribuyente getResultValidarContribuyente() {
        return resultValidarContribuyente;
    }

    /**
     * Define el valor de la propiedad resultValidarContribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultValidarContribuyente }
     *     
     */
    public void setResultValidarContribuyente(ResultValidarContribuyente value) {
        this.resultValidarContribuyente = value;
    }

}
