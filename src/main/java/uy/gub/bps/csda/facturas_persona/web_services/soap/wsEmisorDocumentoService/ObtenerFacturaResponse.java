
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerFacturaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerFacturaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultObtenerFactura" type="{http://bps.gub.uy/recaudacion/facturacion/v001/datatypes/generaciondocumento}ResultObtenerFactura" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerFacturaResponse", propOrder = {
    "resultObtenerFactura"
})
public class ObtenerFacturaResponse {

    protected ResultObtenerFactura resultObtenerFactura;

    /**
     * Obtiene el valor de la propiedad resultObtenerFactura.
     * 
     * @return
     *     possible object is
     *     {@link ResultObtenerFactura }
     *     
     */
    public ResultObtenerFactura getResultObtenerFactura() {
        return resultObtenerFactura;
    }

    /**
     * Define el valor de la propiedad resultObtenerFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObtenerFactura }
     *     
     */
    public void setResultObtenerFactura(ResultObtenerFactura value) {
        this.resultObtenerFactura = value;
    }

}
