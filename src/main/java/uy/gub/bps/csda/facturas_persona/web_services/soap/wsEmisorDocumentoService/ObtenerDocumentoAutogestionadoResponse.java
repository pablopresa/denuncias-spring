
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerDocumentoAutogestionadoResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerDocumentoAutogestionadoResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultObtenerDocumentoAutogestionado" type="{http://bps.gub.uy/recaudacion/facturacion/v003/datatypes/generaciondocumento}ResultObtenerDocumentoAutogestionado" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerDocumentoAutogestionadoResponse", propOrder = {
    "resultObtenerDocumentoAutogestionado"
})
public class ObtenerDocumentoAutogestionadoResponse {

    protected ResultObtenerDocumentoAutogestionado resultObtenerDocumentoAutogestionado;

    /**
     * Obtiene el valor de la propiedad resultObtenerDocumentoAutogestionado.
     * 
     * @return
     *     possible object is
     *     {@link ResultObtenerDocumentoAutogestionado }
     *     
     */
    public ResultObtenerDocumentoAutogestionado getResultObtenerDocumentoAutogestionado() {
        return resultObtenerDocumentoAutogestionado;
    }

    /**
     * Define el valor de la propiedad resultObtenerDocumentoAutogestionado.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObtenerDocumentoAutogestionado }
     *     
     */
    public void setResultObtenerDocumentoAutogestionado(ResultObtenerDocumentoAutogestionado value) {
        this.resultObtenerDocumentoAutogestionado = value;
    }

}
