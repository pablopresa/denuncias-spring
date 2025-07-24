
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerDocumentoPagoACuentaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerDocumentoPagoACuentaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultObtenerDocumentoPagoACuenta" type="{http://bps.gub.uy/recaudacion/facturacion/v003/datatypes/generaciondocumento}ResultObtenerDocumentoPagoACuenta" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerDocumentoPagoACuentaResponse", propOrder = {
    "resultObtenerDocumentoPagoACuenta"
})
public class ObtenerDocumentoPagoACuentaResponse {

    protected ResultObtenerDocumentoPagoACuenta resultObtenerDocumentoPagoACuenta;

    /**
     * Obtiene el valor de la propiedad resultObtenerDocumentoPagoACuenta.
     * 
     * @return
     *     possible object is
     *     {@link ResultObtenerDocumentoPagoACuenta }
     *     
     */
    public ResultObtenerDocumentoPagoACuenta getResultObtenerDocumentoPagoACuenta() {
        return resultObtenerDocumentoPagoACuenta;
    }

    /**
     * Define el valor de la propiedad resultObtenerDocumentoPagoACuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObtenerDocumentoPagoACuenta }
     *     
     */
    public void setResultObtenerDocumentoPagoACuenta(ResultObtenerDocumentoPagoACuenta value) {
        this.resultObtenerDocumentoPagoACuenta = value;
    }

}
