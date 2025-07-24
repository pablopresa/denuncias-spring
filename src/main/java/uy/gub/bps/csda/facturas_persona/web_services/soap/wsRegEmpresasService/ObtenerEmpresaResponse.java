
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerEmpresaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerEmpresaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultObtenerEmpresa" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes}ResultObtenerEmpresa" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerEmpresaResponse", propOrder = {
    "resultObtenerEmpresa"
})
public class ObtenerEmpresaResponse {

    protected ResultObtenerEmpresa resultObtenerEmpresa;

    /**
     * Obtiene el valor de la propiedad resultObtenerEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link ResultObtenerEmpresa }
     *     
     */
    public ResultObtenerEmpresa getResultObtenerEmpresa() {
        return resultObtenerEmpresa;
    }

    /**
     * Define el valor de la propiedad resultObtenerEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObtenerEmpresa }
     *     
     */
    public void setResultObtenerEmpresa(ResultObtenerEmpresa value) {
        this.resultObtenerEmpresa = value;
    }

}
