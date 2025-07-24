
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResultObtenerDomicilioFiscalPpal complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResultObtenerDomicilioFiscalPpal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="domicilio" type="{http://bps.gub.uy/atyr/registro/rce/v002/datatypes}ObjDomicilio" minOccurs="0"/&gt;
 *         &lt;element name="emails" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjEmail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="erroresNegocio" type="{http://bps.gub.uy/v002/datatypes}ErrorNegocio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="faxes" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjFax" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="telefonos" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjTelefono" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="valido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultObtenerDomicilioFiscalPpal", namespace = "http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes", propOrder = {
    "domicilio",
    "emails",
    "erroresNegocio",
    "faxes",
    "telefonos",
    "valido"
})
public class ResultObtenerDomicilioFiscalPpal {

    protected ObjDomicilio domicilio;
    @XmlElement(nillable = true)
    protected List<ObjEmail> emails;
    @XmlElement(nillable = true)
    protected List<ErrorNegocio> erroresNegocio;
    @XmlElement(nillable = true)
    protected List<ObjFax> faxes;
    @XmlElement(nillable = true)
    protected List<ObjTelefono> telefonos;
    protected Integer valido;

    /**
     * Obtiene el valor de la propiedad domicilio.
     * 
     * @return
     *     possible object is
     *     {@link ObjDomicilio }
     *     
     */
    public ObjDomicilio getDomicilio() {
        return domicilio;
    }

    /**
     * Define el valor de la propiedad domicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjDomicilio }
     *     
     */
    public void setDomicilio(ObjDomicilio value) {
        this.domicilio = value;
    }

    /**
     * Gets the value of the emails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the emails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjEmail }
     * 
     * 
     */
    public List<ObjEmail> getEmails() {
        if (emails == null) {
            emails = new ArrayList<ObjEmail>();
        }
        return this.emails;
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
     * Gets the value of the faxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the faxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjFax }
     * 
     * 
     */
    public List<ObjFax> getFaxes() {
        if (faxes == null) {
            faxes = new ArrayList<ObjFax>();
        }
        return this.faxes;
    }

    /**
     * Gets the value of the telefonos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the telefonos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefonos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjTelefono }
     * 
     * 
     */
    public List<ObjTelefono> getTelefonos() {
        if (telefonos == null) {
            telefonos = new ArrayList<ObjTelefono>();
        }
        return this.telefonos;
    }

    /**
     * Obtiene el valor de la propiedad valido.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValido() {
        return valido;
    }

    /**
     * Define el valor de la propiedad valido.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValido(Integer value) {
        this.valido = value;
    }

}
