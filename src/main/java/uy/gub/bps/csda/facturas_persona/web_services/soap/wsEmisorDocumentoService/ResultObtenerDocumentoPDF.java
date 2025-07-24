
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResultObtenerDocumentoPDF complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResultObtenerDocumentoPDF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="documento" type="{http://bps.gub.uy/recaudacion/facturacion/v001/datatypes}Documento" minOccurs="0"/&gt;
 *         &lt;element name="erroresNegocio" type="{http://bps.gub.uy/recaudacion/facturacion/v001/datatypes}ErrorNegocioSeveridad" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultObtenerDocumentoPDF", namespace = "http://bps.gub.uy/recaudacion/facturacion/v002/datatypes/generaciondocumento", propOrder = {
    "documento",
    "erroresNegocio"
})
public class ResultObtenerDocumentoPDF {

    protected Documento2 documento;
    @XmlElement(nillable = true)
    protected List<ErrorNegocioSeveridad> erroresNegocio;

    /**
     * Obtiene el valor de la propiedad documento.
     * 
     * @return
     *     possible object is
     *     {@link Documento2 }
     *     
     */
    public Documento2 getDocumento() {
        return documento;
    }

    /**
     * Define el valor de la propiedad documento.
     * 
     * @param value
     *     allowed object is
     *     {@link Documento2 }
     *     
     */
    public void setDocumento(Documento2 value) {
        this.documento = value;
    }

    /**
     * Gets the value of the erroresNegocio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the erroresNegocio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErroresNegocio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorNegocioSeveridad }
     * 
     * 
     */
    public List<ErrorNegocioSeveridad> getErroresNegocio() {
        if (erroresNegocio == null) {
            erroresNegocio = new ArrayList<ErrorNegocioSeveridad>();
        }
        return this.erroresNegocio;
    }

}
