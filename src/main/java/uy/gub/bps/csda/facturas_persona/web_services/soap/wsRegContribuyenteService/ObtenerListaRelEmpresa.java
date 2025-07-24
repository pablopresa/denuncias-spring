
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerListaRelEmpresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerListaRelEmpresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerListaRelEmpresa" type="{http://bps.gub.uy/registro/contribuyentes/v003/datatypes}ParamObtenerListaRelEmpresa" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerListaRelEmpresa", namespace = "http://bps.gub.uy/registro/contribuyentes/v003", propOrder = {
    "paramObtenerListaRelEmpresa"
})
public class ObtenerListaRelEmpresa {

    protected ParamObtenerListaRelEmpresa paramObtenerListaRelEmpresa;

    /**
     * Obtiene el valor de la propiedad paramObtenerListaRelEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerListaRelEmpresa }
     *     
     */
    public ParamObtenerListaRelEmpresa getParamObtenerListaRelEmpresa() {
        return paramObtenerListaRelEmpresa;
    }

    /**
     * Define el valor de la propiedad paramObtenerListaRelEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerListaRelEmpresa }
     *     
     */
    public void setParamObtenerListaRelEmpresa(ParamObtenerListaRelEmpresa value) {
        this.paramObtenerListaRelEmpresa = value;
    }

}
