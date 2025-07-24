
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorConsulta;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResultObtenerDocumentosPorNroResumen complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResultObtenerDocumentosPorNroResumen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="erroresNegocio" type="{http://bps.gub.uy/v001/datatypes}ErrorNegocio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="fechaEmision" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="importeTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="listaResultadoDocumento" type="{http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001/datatypes}Documento" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="nroResumen" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultObtenerDocumentosPorNroResumen", propOrder = {
    "erroresNegocio",
    "fechaEmision",
    "importeTotal",
    "listaResultadoDocumento",
    "nroResumen"
})
public class ResultObtenerDocumentosPorNroResumen {

    @XmlElement(nillable = true)
    protected List<ErrorNegocio> erroresNegocio;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaEmision;
    protected BigDecimal importeTotal;
    @XmlElement(nillable = true)
    protected List<Documento> listaResultadoDocumento;
    protected Long nroResumen;

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
     * {@link ErrorNegocio }
     * 
     * 
     */
    public List<ErrorNegocio> getErroresNegocio() {
        if (erroresNegocio == null) {
            erroresNegocio = new ArrayList<ErrorNegocio>();
        }
        return this.erroresNegocio;
    }

    /**
     * Obtiene el valor de la propiedad fechaEmision.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Define el valor de la propiedad fechaEmision.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEmision(XMLGregorianCalendar value) {
        this.fechaEmision = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImporteTotal() {
        return importeTotal;
    }

    /**
     * Define el valor de la propiedad importeTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImporteTotal(BigDecimal value) {
        this.importeTotal = value;
    }

    /**
     * Gets the value of the listaResultadoDocumento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the listaResultadoDocumento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaResultadoDocumento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Documento }
     * 
     * 
     */
    public List<Documento> getListaResultadoDocumento() {
        if (listaResultadoDocumento == null) {
            listaResultadoDocumento = new ArrayList<Documento>();
        }
        return this.listaResultadoDocumento;
    }

    /**
     * Obtiene el valor de la propiedad nroResumen.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNroResumen() {
        return nroResumen;
    }

    /**
     * Define el valor de la propiedad nroResumen.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNroResumen(Long value) {
        this.nroResumen = value;
    }

}
