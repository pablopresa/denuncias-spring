
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerDomicilioFiscalPpal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerDomicilioFiscalPpal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerDomicilioFiscalPpal" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes}ParamObtenerDomicilioFiscalPpal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerDomicilioFiscalPpal", propOrder = {
    "paramObtenerDomicilioFiscalPpal"
})
public class ObtenerDomicilioFiscalPpal {

    protected ParamObtenerDomicilioFiscalPpal paramObtenerDomicilioFiscalPpal;

    /**
     * Obtiene el valor de la propiedad paramObtenerDomicilioFiscalPpal.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerDomicilioFiscalPpal }
     *     
     */
    public ParamObtenerDomicilioFiscalPpal getParamObtenerDomicilioFiscalPpal() {
        return paramObtenerDomicilioFiscalPpal;
    }

    /**
     * Define el valor de la propiedad paramObtenerDomicilioFiscalPpal.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerDomicilioFiscalPpal }
     *     
     */
    public void setParamObtenerDomicilioFiscalPpal(ParamObtenerDomicilioFiscalPpal value) {
        this.paramObtenerDomicilioFiscalPpal = value;
    }

}
