
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerContribuyente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerContribuyente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerContribuyente" type="{http://bps.gub.uy/registro/contribuyentes/v003/datatypes}ParamObtenerContribuyente" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerContribuyente", namespace = "http://bps.gub.uy/registro/contribuyentes/v003", propOrder = {
    "paramObtenerContribuyente"
})
public class ObtenerContribuyente {

    protected ParamObtenerContribuyente paramObtenerContribuyente;

    /**
     * Obtiene el valor de la propiedad paramObtenerContribuyente.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerContribuyente }
     *     
     */
    public ParamObtenerContribuyente getParamObtenerContribuyente() {
        return paramObtenerContribuyente;
    }

    /**
     * Define el valor de la propiedad paramObtenerContribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerContribuyente }
     *     
     */
    public void setParamObtenerContribuyente(ParamObtenerContribuyente value) {
        this.paramObtenerContribuyente = value;
    }

}
