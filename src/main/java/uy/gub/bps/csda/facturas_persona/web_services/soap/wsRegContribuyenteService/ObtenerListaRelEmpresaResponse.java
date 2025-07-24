
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerListaRelEmpresaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerListaRelEmpresaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultObtenerListaRelEmpresa" type="{http://bps.gub.uy/registro/contribuyentes/v003/datatypes}ResultObtenerListaRelEmpresa" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerListaRelEmpresaResponse", namespace = "http://bps.gub.uy/registro/contribuyentes/v003", propOrder = {
    "resultObtenerListaRelEmpresa"
})
public class ObtenerListaRelEmpresaResponse {

    protected ResultObtenerListaRelEmpresa resultObtenerListaRelEmpresa;

    /**
     * Obtiene el valor de la propiedad resultObtenerListaRelEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link ResultObtenerListaRelEmpresa }
     *     
     */
    public ResultObtenerListaRelEmpresa getResultObtenerListaRelEmpresa() {
        return resultObtenerListaRelEmpresa;
    }

    /**
     * Define el valor de la propiedad resultObtenerListaRelEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObtenerListaRelEmpresa }
     *     
     */
    public void setResultObtenerListaRelEmpresa(ResultObtenerListaRelEmpresa value) {
        this.resultObtenerListaRelEmpresa = value;
    }

}
