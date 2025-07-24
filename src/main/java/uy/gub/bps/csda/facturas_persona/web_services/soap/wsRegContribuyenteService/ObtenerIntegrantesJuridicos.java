
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerIntegrantesJuridicos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerIntegrantesJuridicos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerIntegrantesJuridicos" type="{http://bps.gub.uy/registro/contribuyentes/v003/datatypes}ParamObtenerIntegrantesJuridicos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerIntegrantesJuridicos", namespace = "http://bps.gub.uy/registro/contribuyentes/v003", propOrder = {
    "paramObtenerIntegrantesJuridicos"
})
public class ObtenerIntegrantesJuridicos {

    protected ParamObtenerIntegrantesJuridicos paramObtenerIntegrantesJuridicos;

    /**
     * Obtiene el valor de la propiedad paramObtenerIntegrantesJuridicos.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerIntegrantesJuridicos }
     *     
     */
    public ParamObtenerIntegrantesJuridicos getParamObtenerIntegrantesJuridicos() {
        return paramObtenerIntegrantesJuridicos;
    }

    /**
     * Define el valor de la propiedad paramObtenerIntegrantesJuridicos.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerIntegrantesJuridicos }
     *     
     */
    public void setParamObtenerIntegrantesJuridicos(ParamObtenerIntegrantesJuridicos value) {
        this.paramObtenerIntegrantesJuridicos = value;
    }

}
