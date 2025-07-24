
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerDocumentoPDFResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerDocumentoPDFResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultObtenerDocumentoPDF" type="{http://bps.gub.uy/recaudacion/facturacion/v002/datatypes/generaciondocumento}ResultObtenerDocumentoPDF" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerDocumentoPDFResponse", propOrder = {
    "resultObtenerDocumentoPDF"
})
public class ObtenerDocumentoPDFResponse {

    protected ResultObtenerDocumentoPDF resultObtenerDocumentoPDF;

    /**
     * Obtiene el valor de la propiedad resultObtenerDocumentoPDF.
     * 
     * @return
     *     possible object is
     *     {@link ResultObtenerDocumentoPDF }
     *     
     */
    public ResultObtenerDocumentoPDF getResultObtenerDocumentoPDF() {
        return resultObtenerDocumentoPDF;
    }

    /**
     * Define el valor de la propiedad resultObtenerDocumentoPDF.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObtenerDocumentoPDF }
     *     
     */
    public void setResultObtenerDocumentoPDF(ResultObtenerDocumentoPDF value) {
        this.resultObtenerDocumentoPDF = value;
    }

}
