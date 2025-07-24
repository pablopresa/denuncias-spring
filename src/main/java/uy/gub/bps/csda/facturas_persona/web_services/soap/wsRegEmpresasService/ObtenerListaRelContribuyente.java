
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerListaRelContribuyente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerListaRelContribuyente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerListaRelContribuyente" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes}paramObtenerListaRelContribuyente" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerListaRelContribuyente", propOrder = {
    "paramObtenerListaRelContribuyente"
})
public class ObtenerListaRelContribuyente {

    protected ParamObtenerListaRelContribuyente paramObtenerListaRelContribuyente;

    /**
     * Obtiene el valor de la propiedad paramObtenerListaRelContribuyente.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerListaRelContribuyente }
     *     
     */
    public ParamObtenerListaRelContribuyente getParamObtenerListaRelContribuyente() {
        return paramObtenerListaRelContribuyente;
    }

    /**
     * Define el valor de la propiedad paramObtenerListaRelContribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerListaRelContribuyente }
     *     
     */
    public void setParamObtenerListaRelContribuyente(ParamObtenerListaRelContribuyente value) {
        this.paramObtenerListaRelContribuyente = value;
    }

}
