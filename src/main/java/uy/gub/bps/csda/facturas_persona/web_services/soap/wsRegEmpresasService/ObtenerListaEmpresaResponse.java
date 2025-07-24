
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerListaEmpresaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerListaEmpresaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultObtenerListaEmpresa" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes}ResultObtenerListaEmpresa" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerListaEmpresaResponse", propOrder = {
    "resultObtenerListaEmpresa"
})
public class ObtenerListaEmpresaResponse {

    protected ResultObtenerListaEmpresa resultObtenerListaEmpresa;

    /**
     * Obtiene el valor de la propiedad resultObtenerListaEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link ResultObtenerListaEmpresa }
     *     
     */
    public ResultObtenerListaEmpresa getResultObtenerListaEmpresa() {
        return resultObtenerListaEmpresa;
    }

    /**
     * Define el valor de la propiedad resultObtenerListaEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObtenerListaEmpresa }
     *     
     */
    public void setResultObtenerListaEmpresa(ResultObtenerListaEmpresa value) {
        this.resultObtenerListaEmpresa = value;
    }

}
