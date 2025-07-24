
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerFactura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerFactura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerFactura" type="{http://bps.gub.uy/recaudacion/facturacion/v003/datatypes/generaciondocumento}ParamObtenerFactura" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerFactura", propOrder = {
    "paramObtenerFactura"
})
public class ObtenerFactura {

    protected ParamObtenerFactura paramObtenerFactura;

    /**
     * Obtiene el valor de la propiedad paramObtenerFactura.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerFactura }
     *     
     */
    public ParamObtenerFactura getParamObtenerFactura() {
        return paramObtenerFactura;
    }

    /**
     * Define el valor de la propiedad paramObtenerFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerFactura }
     *     
     */
    public void setParamObtenerFactura(ParamObtenerFactura value) {
        this.paramObtenerFactura = value;
    }

}
