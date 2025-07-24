
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerListaEmpresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerListaEmpresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerListaEmpresaEmpresa" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes}ParamObtenerListaEmpresa" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerListaEmpresa", propOrder = {
    "paramObtenerListaEmpresaEmpresa"
})
public class ObtenerListaEmpresa {

    protected ParamObtenerListaEmpresa paramObtenerListaEmpresaEmpresa;

    /**
     * Obtiene el valor de la propiedad paramObtenerListaEmpresaEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerListaEmpresa }
     *     
     */
    public ParamObtenerListaEmpresa getParamObtenerListaEmpresaEmpresa() {
        return paramObtenerListaEmpresaEmpresa;
    }

    /**
     * Define el valor de la propiedad paramObtenerListaEmpresaEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerListaEmpresa }
     *     
     */
    public void setParamObtenerListaEmpresaEmpresa(ParamObtenerListaEmpresa value) {
        this.paramObtenerListaEmpresaEmpresa = value;
    }

}
