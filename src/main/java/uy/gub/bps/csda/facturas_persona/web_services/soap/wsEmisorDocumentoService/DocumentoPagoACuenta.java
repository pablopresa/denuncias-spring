
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import jakarta.activation.DataHandler;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlMimeType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DocumentoPagoACuenta complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DocumentoPagoACuenta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pdf" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="nroReferencia" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoPagoACuenta", namespace = "http://bps.gub.uy/recaudacion/facturacion/v001/datatypes", propOrder = {
    "pdf",
    "nroReferencia"
})
public class DocumentoPagoACuenta {

    @XmlMimeType("application/pdf")
    protected DataHandler pdf;
    protected Long nroReferencia;

    /**
     * Obtiene el valor de la propiedad pdf.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getPdf() {
        return pdf;
    }

    /**
     * Define el valor de la propiedad pdf.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setPdf(DataHandler value) {
        this.pdf = value;
    }

    /**
     * Obtiene el valor de la propiedad nroReferencia.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNroReferencia() {
        return nroReferencia;
    }

    /**
     * Define el valor de la propiedad nroReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNroReferencia(Long value) {
        this.nroReferencia = value;
    }

}
