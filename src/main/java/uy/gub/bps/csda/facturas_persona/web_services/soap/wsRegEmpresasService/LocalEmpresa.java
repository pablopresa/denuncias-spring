
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LocalEmpresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LocalEmpresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ampliacionDomicilio" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes}AmpliacionDomicilio" minOccurs="0"/&gt;
 *         &lt;element name="departamento" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes}Departamento" minOccurs="0"/&gt;
 *         &lt;element name="direccion" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes}Direccion" minOccurs="0"/&gt;
 *         &lt;element name="emails" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes}EMail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="faxes" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes}Fax" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localidad" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes}Localidad" minOccurs="0"/&gt;
 *         &lt;element name="numeroLocal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="periodo" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes}ObjPeriodo" minOccurs="0"/&gt;
 *         &lt;element name="telefonos" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes}Telefono" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tipoEstablecimiento" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes}TipoEstablecimiento" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalEmpresa", namespace = "http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", propOrder = {
    "ampliacionDomicilio",
    "departamento",
    "direccion",
    "emails",
    "faxes",
    "localidad",
    "numeroLocal",
    "periodo",
    "telefonos",
    "tipoEstablecimiento"
})
public class LocalEmpresa {

    protected AmpliacionDomicilio ampliacionDomicilio;
    protected Departamento departamento;
    protected Direccion direccion;
    @XmlElement(nillable = true)
    protected List<EMail> emails;
    @XmlElement(nillable = true)
    protected List<Fax> faxes;
    protected Localidad localidad;
    protected Integer numeroLocal;
    protected ObjPeriodo2 periodo;
    @XmlElement(nillable = true)
    protected List<Telefono> telefonos;
    protected TipoEstablecimiento tipoEstablecimiento;

    /**
     * Obtiene el valor de la propiedad ampliacionDomicilio.
     * 
     * @return
     *     possible object is
     *     {@link AmpliacionDomicilio }
     *     
     */
    public AmpliacionDomicilio getAmpliacionDomicilio() {
        return ampliacionDomicilio;
    }

    /**
     * Define el valor de la propiedad ampliacionDomicilio.
     * 
     * @param value
     *     allowed object is
     *     {@link AmpliacionDomicilio }
     *     
     */
    public void setAmpliacionDomicilio(AmpliacionDomicilio value) {
        this.ampliacionDomicilio = value;
    }

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link Departamento }
     *     
     */
    public Departamento getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link Departamento }
     *     
     */
    public void setDepartamento(Departamento value) {
        this.departamento = value;
    }

    /**
     * Obtiene el valor de la propiedad direccion.
     * 
     * @return
     *     possible object is
     *     {@link Direccion }
     *     
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Define el valor de la propiedad direccion.
     * 
     * @param value
     *     allowed object is
     *     {@link Direccion }
     *     
     */
    public void setDireccion(Direccion value) {
        this.direccion = value;
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
     * {@link EMail }
     * 
     * 
     */
    public List<EMail> getEmails() {
        if (emails == null) {
            emails = new ArrayList<EMail>();
        }
        return this.emails;
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
     * {@link Fax }
     * 
     * 
     */
    public List<Fax> getFaxes() {
        if (faxes == null) {
            faxes = new ArrayList<Fax>();
        }
        return this.faxes;
    }

    /**
     * Obtiene el valor de la propiedad localidad.
     * 
     * @return
     *     possible object is
     *     {@link Localidad }
     *     
     */
    public Localidad getLocalidad() {
        return localidad;
    }

    /**
     * Define el valor de la propiedad localidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Localidad }
     *     
     */
    public void setLocalidad(Localidad value) {
        this.localidad = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroLocal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroLocal() {
        return numeroLocal;
    }

    /**
     * Define el valor de la propiedad numeroLocal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroLocal(Integer value) {
        this.numeroLocal = value;
    }

    /**
     * Obtiene el valor de la propiedad periodo.
     * 
     * @return
     *     possible object is
     *     {@link ObjPeriodo2 }
     *     
     */
    public ObjPeriodo2 getPeriodo() {
        return periodo;
    }

    /**
     * Define el valor de la propiedad periodo.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjPeriodo2 }
     *     
     */
    public void setPeriodo(ObjPeriodo2 value) {
        this.periodo = value;
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
     * {@link Telefono }
     * 
     * 
     */
    public List<Telefono> getTelefonos() {
        if (telefonos == null) {
            telefonos = new ArrayList<Telefono>();
        }
        return this.telefonos;
    }

    /**
     * Obtiene el valor de la propiedad tipoEstablecimiento.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstablecimiento }
     *     
     */
    public TipoEstablecimiento getTipoEstablecimiento() {
        return tipoEstablecimiento;
    }

    /**
     * Define el valor de la propiedad tipoEstablecimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstablecimiento }
     *     
     */
    public void setTipoEstablecimiento(TipoEstablecimiento value) {
        this.tipoEstablecimiento = value;
    }

}
