
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerDocumentoAutogestionado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerDocumentoAutogestionado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerDocumentoAutogestionado" type="{http://bps.gub.uy/recaudacion/facturacion/v003/datatypes/generaciondocumento}ParamObtenerDocumentoAutogestionado" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerDocumentoAutogestionado", propOrder = {
    "paramObtenerDocumentoAutogestionado"
})
public class ObtenerDocumentoAutogestionado {

    protected ParamObtenerDocumentoAutogestionado paramObtenerDocumentoAutogestionado;

    /**
     * Obtiene el valor de la propiedad paramObtenerDocumentoAutogestionado.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerDocumentoAutogestionado }
     *     
     */
    public ParamObtenerDocumentoAutogestionado getParamObtenerDocumentoAutogestionado() {
        return paramObtenerDocumentoAutogestionado;
    }

    /**
     * Define el valor de la propiedad paramObtenerDocumentoAutogestionado.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerDocumentoAutogestionado }
     *     
     */
    public void setParamObtenerDocumentoAutogestionado(ParamObtenerDocumentoAutogestionado value) {
        this.paramObtenerDocumentoAutogestionado = value;
    }

}
