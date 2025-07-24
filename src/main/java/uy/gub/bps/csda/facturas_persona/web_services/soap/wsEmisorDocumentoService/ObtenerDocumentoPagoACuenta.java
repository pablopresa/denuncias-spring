
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerDocumentoPagoACuenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerDocumentoPagoACuenta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerDocumentoPagoACuenta" type="{http://bps.gub.uy/recaudacion/facturacion/v003/datatypes/generaciondocumento}ParamObtenerDocumentoPagoACuenta" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerDocumentoPagoACuenta", propOrder = {
    "paramObtenerDocumentoPagoACuenta"
})
public class ObtenerDocumentoPagoACuenta {

    protected ParamObtenerDocumentoPagoACuenta paramObtenerDocumentoPagoACuenta;

    /**
     * Obtiene el valor de la propiedad paramObtenerDocumentoPagoACuenta.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerDocumentoPagoACuenta }
     *     
     */
    public ParamObtenerDocumentoPagoACuenta getParamObtenerDocumentoPagoACuenta() {
        return paramObtenerDocumentoPagoACuenta;
    }

    /**
     * Define el valor de la propiedad paramObtenerDocumentoPagoACuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerDocumentoPagoACuenta }
     *     
     */
    public void setParamObtenerDocumentoPagoACuenta(ParamObtenerDocumentoPagoACuenta value) {
        this.paramObtenerDocumentoPagoACuenta = value;
    }

}
