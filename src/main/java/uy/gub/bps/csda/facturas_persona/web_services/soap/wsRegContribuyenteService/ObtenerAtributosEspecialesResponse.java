
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerAtributosEspecialesResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerAtributosEspecialesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultObtenerAtributosEspeciales" type="{http://bps.gub.uy/registro/contribuyentes/v003/datatypes}ResultObtenerAtributosEspeciales" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerAtributosEspecialesResponse", namespace = "http://bps.gub.uy/registro/contribuyentes/v003", propOrder = {
    "resultObtenerAtributosEspeciales"
})
public class ObtenerAtributosEspecialesResponse {

    protected ResultObtenerAtributosEspeciales resultObtenerAtributosEspeciales;

    /**
     * Obtiene el valor de la propiedad resultObtenerAtributosEspeciales.
     * 
     * @return
     *     possible object is
     *     {@link ResultObtenerAtributosEspeciales }
     *     
     */
    public ResultObtenerAtributosEspeciales getResultObtenerAtributosEspeciales() {
        return resultObtenerAtributosEspeciales;
    }

    /**
     * Define el valor de la propiedad resultObtenerAtributosEspeciales.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObtenerAtributosEspeciales }
     *     
     */
    public void setResultObtenerAtributosEspeciales(ResultObtenerAtributosEspeciales value) {
        this.resultObtenerAtributosEspeciales = value;
    }

}
