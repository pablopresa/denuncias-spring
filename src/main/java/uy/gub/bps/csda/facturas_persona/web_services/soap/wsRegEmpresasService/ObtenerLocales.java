
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerLocales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerLocales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerLocales" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes}ParamObtenerLocales" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerLocales", propOrder = {
    "paramObtenerLocales"
})
public class ObtenerLocales {

    protected ParamObtenerLocales paramObtenerLocales;

    /**
     * Obtiene el valor de la propiedad paramObtenerLocales.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerLocales }
     *     
     */
    public ParamObtenerLocales getParamObtenerLocales() {
        return paramObtenerLocales;
    }

    /**
     * Define el valor de la propiedad paramObtenerLocales.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerLocales }
     *     
     */
    public void setParamObtenerLocales(ParamObtenerLocales value) {
        this.paramObtenerLocales = value;
    }

}
