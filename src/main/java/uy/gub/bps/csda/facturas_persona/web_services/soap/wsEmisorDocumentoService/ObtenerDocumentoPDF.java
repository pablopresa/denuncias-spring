
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerDocumentoPDF complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerDocumentoPDF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerDocumentoPDF" type="{http://bps.gub.uy/recaudacion/facturacion/v003/datatypes/generaciondocumento}ParamObtenerDocumentoPDF" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerDocumentoPDF", propOrder = {
    "paramObtenerDocumentoPDF"
})
public class ObtenerDocumentoPDF {

    protected ParamObtenerDocumentoPDF paramObtenerDocumentoPDF;

    /**
     * Obtiene el valor de la propiedad paramObtenerDocumentoPDF.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerDocumentoPDF }
     *     
     */
    public ParamObtenerDocumentoPDF getParamObtenerDocumentoPDF() {
        return paramObtenerDocumentoPDF;
    }

    /**
     * Define el valor de la propiedad paramObtenerDocumentoPDF.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerDocumentoPDF }
     *     
     */
    public void setParamObtenerDocumentoPDF(ParamObtenerDocumentoPDF value) {
        this.paramObtenerDocumentoPDF = value;
    }

}
