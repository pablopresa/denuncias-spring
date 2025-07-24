
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerDocumentosPorEmpresaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerDocumentosPorEmpresaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultObtenerDocumentosPorEmpresa" type="{http://bps.gub.uy/recaudacion/facturacion/v003/datatypes/generaciondocumento}ResultObtenerDocumentosPorEmpresa" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerDocumentosPorEmpresaResponse", propOrder = {
    "resultObtenerDocumentosPorEmpresa"
})
public class ObtenerDocumentosPorEmpresaResponse {

    protected ResultObtenerDocumentosPorEmpresa resultObtenerDocumentosPorEmpresa;

    /**
     * Obtiene el valor de la propiedad resultObtenerDocumentosPorEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link ResultObtenerDocumentosPorEmpresa }
     *     
     */
    public ResultObtenerDocumentosPorEmpresa getResultObtenerDocumentosPorEmpresa() {
        return resultObtenerDocumentosPorEmpresa;
    }

    /**
     * Define el valor de la propiedad resultObtenerDocumentosPorEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObtenerDocumentosPorEmpresa }
     *     
     */
    public void setResultObtenerDocumentosPorEmpresa(ResultObtenerDocumentosPorEmpresa value) {
        this.resultObtenerDocumentosPorEmpresa = value;
    }

}
