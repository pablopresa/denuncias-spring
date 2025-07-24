
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerListaContribuyente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerListaContribuyente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerListaContribuyente" type="{http://bps.gub.uy/registro/contribuyentes/v003/datatypes}paramObtenerListaContribuyente" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerListaContribuyente", namespace = "http://bps.gub.uy/registro/contribuyentes/v003", propOrder = {
    "paramObtenerListaContribuyente"
})
public class ObtenerListaContribuyente {

    protected ParamObtenerListaContribuyente paramObtenerListaContribuyente;

    /**
     * Obtiene el valor de la propiedad paramObtenerListaContribuyente.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerListaContribuyente }
     *     
     */
    public ParamObtenerListaContribuyente getParamObtenerListaContribuyente() {
        return paramObtenerListaContribuyente;
    }

    /**
     * Define el valor de la propiedad paramObtenerListaContribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerListaContribuyente }
     *     
     */
    public void setParamObtenerListaContribuyente(ParamObtenerListaContribuyente value) {
        this.paramObtenerListaContribuyente = value;
    }

}
