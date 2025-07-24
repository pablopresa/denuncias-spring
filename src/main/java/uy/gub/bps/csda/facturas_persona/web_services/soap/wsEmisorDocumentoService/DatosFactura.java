
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.activation.DataHandler;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlMimeType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatosFactura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosFactura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pdf" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="facturas" type="{http://bps.gub.uy/recaudacion/facturacion/v001/datatypes}Factura" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fechaVencimientoMenor" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosFactura", namespace = "http://bps.gub.uy/recaudacion/facturacion/v001/datatypes", propOrder = {
    "pdf",
    "facturas",
    "fechaVencimientoMenor"
})
public class DatosFactura {

    @XmlMimeType("application/pdf")
    protected DataHandler pdf;
    @XmlElement(nillable = true)
    protected List<Factura> facturas;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaVencimientoMenor;

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
     * Gets the value of the facturas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the facturas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacturas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Factura }
     * 
     * 
     */
    public List<Factura> getFacturas() {
        if (facturas == null) {
            facturas = new ArrayList<Factura>();
        }
        return this.facturas;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimientoMenor.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimientoMenor() {
        return fechaVencimientoMenor;
    }

    /**
     * Define el valor de la propiedad fechaVencimientoMenor.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimientoMenor(XMLGregorianCalendar value) {
        this.fechaVencimientoMenor = value;
    }

}
