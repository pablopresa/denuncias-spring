
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerEmpresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerEmpresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerEmpresa" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes}ParamObtenerEmpresa" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerEmpresa", propOrder = {
    "paramObtenerEmpresa"
})
public class ObtenerEmpresa {

    protected ParamObtenerEmpresa paramObtenerEmpresa;

    /**
     * Obtiene el valor de la propiedad paramObtenerEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerEmpresa }
     *     
     */
    public ParamObtenerEmpresa getParamObtenerEmpresa() {
        return paramObtenerEmpresa;
    }

    /**
     * Define el valor de la propiedad paramObtenerEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerEmpresa }
     *     
     */
    public void setParamObtenerEmpresa(ParamObtenerEmpresa value) {
        this.paramObtenerEmpresa = value;
    }

}
