
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerIntegrantesFisicos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerIntegrantesFisicos"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerIntegrantesFisicos" type="{http://bps.gub.uy/atyr/registro/contribuyentes/v001/datatypes}ParamObtenerIntegrantesFisicos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerIntegrantesFisicos", namespace = "http://bps.gub.uy/registro/contribuyentes/v003", propOrder = {
    "paramObtenerIntegrantesFisicos"
})
public class ObtenerIntegrantesFisicos {

    protected ParamObtenerIntegrantesFisicos paramObtenerIntegrantesFisicos;

    /**
     * Obtiene el valor de la propiedad paramObtenerIntegrantesFisicos.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerIntegrantesFisicos }
     *     
     */
    public ParamObtenerIntegrantesFisicos getParamObtenerIntegrantesFisicos() {
        return paramObtenerIntegrantesFisicos;
    }

    /**
     * Define el valor de la propiedad paramObtenerIntegrantesFisicos.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerIntegrantesFisicos }
     *     
     */
    public void setParamObtenerIntegrantesFisicos(ParamObtenerIntegrantesFisicos value) {
        this.paramObtenerIntegrantesFisicos = value;
    }

}
