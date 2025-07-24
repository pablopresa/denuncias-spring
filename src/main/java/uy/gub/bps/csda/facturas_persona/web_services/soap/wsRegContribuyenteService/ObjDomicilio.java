
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjDomicilio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjDomicilio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bloque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calle" type="{http://bps.gub.uy/atyr/registro/rce/v002/datatypes}ObjCalle" minOccurs="0"/&gt;
 *         &lt;element name="calleEntreDos" type="{http://bps.gub.uy/atyr/registro/rce/v002/datatypes}ObjCalle" minOccurs="0"/&gt;
 *         &lt;element name="calleEntreUno" type="{http://bps.gub.uy/atyr/registro/rce/v002/datatypes}ObjCalle" minOccurs="0"/&gt;
 *         &lt;element name="codPostal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="complejoHabitacional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="departamento" type="{http://bps.gub.uy/atyr/registro/rce/v002/datatypes}ObjDepartamento" minOccurs="0"/&gt;
 *         &lt;element name="emails" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjEmail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="kilometro" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localidad" type="{http://bps.gub.uy/atyr/registro/rce/v002/datatypes}ObjLocalidad" minOccurs="0"/&gt;
 *         &lt;element name="manzana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroPuerta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="padron" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ruta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seccionJudicial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="solar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefonos" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjTelefono" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="torre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unidad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="zona" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjDomicilio", namespace = "http://bps.gub.uy/atyr/registro/rce/v003/datatypes", propOrder = {
    "apto",
    "bis",
    "bloque",
    "calle",
    "calleEntreDos",
    "calleEntreUno",
    "codPostal",
    "complejoHabitacional",
    "departamento",
    "emails",
    "kilometro",
    "local",
    "localidad",
    "manzana",
    "nivel",
    "nroPuerta",
    "observaciones",
    "padron",
    "ruta",
    "seccionJudicial",
    "solar",
    "telefonos",
    "torre",
    "unidad",
    "zona"
})
public class ObjDomicilio {

    protected String apto;
    protected String bis;
    protected String bloque;
    protected ObjCalle calle;
    protected ObjCalle calleEntreDos;
    protected ObjCalle calleEntreUno;
    protected Integer codPostal;
    protected String complejoHabitacional;
    protected ObjDepartamento departamento;
    @XmlElement(nillable = true)
    protected List<ObjEmail> emails;
    protected Double kilometro;
    protected String local;
    protected ObjLocalidad localidad;
    protected String manzana;
    protected String nivel;
    protected Integer nroPuerta;
    protected String observaciones;
    protected String padron;
    protected String ruta;
    protected Integer seccionJudicial;
    protected String solar;
    @XmlElement(nillable = true)
    protected List<ObjTelefono> telefonos;
    protected String torre;
    protected Integer unidad;
    protected Integer zona;

    /**
     * Obtiene el valor de la propiedad apto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApto() {
        return apto;
    }

    /**
     * Define el valor de la propiedad apto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApto(String value) {
        this.apto = value;
    }

    /**
     * Obtiene el valor de la propiedad bis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBis() {
        return bis;
    }

    /**
     * Define el valor de la propiedad bis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBis(String value) {
        this.bis = value;
    }

    /**
     * Obtiene el valor de la propiedad bloque.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBloque() {
        return bloque;
    }

    /**
     * Define el valor de la propiedad bloque.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBloque(String value) {
        this.bloque = value;
    }

    /**
     * Obtiene el valor de la propiedad calle.
     * 
     * @return
     *     possible object is
     *     {@link ObjCalle }
     *     
     */
    public ObjCalle getCalle() {
        return calle;
    }

    /**
     * Define el valor de la propiedad calle.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjCalle }
     *     
     */
    public void setCalle(ObjCalle value) {
        this.calle = value;
    }

    /**
     * Obtiene el valor de la propiedad calleEntreDos.
     * 
     * @return
     *     possible object is
     *     {@link ObjCalle }
     *     
     */
    public ObjCalle getCalleEntreDos() {
        return calleEntreDos;
    }

    /**
     * Define el valor de la propiedad calleEntreDos.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjCalle }
     *     
     */
    public void setCalleEntreDos(ObjCalle value) {
        this.calleEntreDos = value;
    }

    /**
     * Obtiene el valor de la propiedad calleEntreUno.
     * 
     * @return
     *     possible object is
     *     {@link ObjCalle }
     *     
     */
    public ObjCalle getCalleEntreUno() {
        return calleEntreUno;
    }

    /**
     * Define el valor de la propiedad calleEntreUno.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjCalle }
     *     
     */
    public void setCalleEntreUno(ObjCalle value) {
        this.calleEntreUno = value;
    }

    /**
     * Obtiene el valor de la propiedad codPostal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodPostal() {
        return codPostal;
    }

    /**
     * Define el valor de la propiedad codPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodPostal(Integer value) {
        this.codPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad complejoHabitacional.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplejoHabitacional() {
        return complejoHabitacional;
    }

    /**
     * Define el valor de la propiedad complejoHabitacional.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplejoHabitacional(String value) {
        this.complejoHabitacional = value;
    }

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link ObjDepartamento }
     *     
     */
    public ObjDepartamento getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjDepartamento }
     *     
     */
    public void setDepartamento(ObjDepartamento value) {
        this.departamento = value;
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
     * Obtiene el valor de la propiedad kilometro.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getKilometro() {
        return kilometro;
    }

    /**
     * Define el valor de la propiedad kilometro.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setKilometro(Double value) {
        this.kilometro = value;
    }

    /**
     * Obtiene el valor de la propiedad local.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocal() {
        return local;
    }

    /**
     * Define el valor de la propiedad local.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocal(String value) {
        this.local = value;
    }

    /**
     * Obtiene el valor de la propiedad localidad.
     * 
     * @return
     *     possible object is
     *     {@link ObjLocalidad }
     *     
     */
    public ObjLocalidad getLocalidad() {
        return localidad;
    }

    /**
     * Define el valor de la propiedad localidad.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjLocalidad }
     *     
     */
    public void setLocalidad(ObjLocalidad value) {
        this.localidad = value;
    }

    /**
     * Obtiene el valor de la propiedad manzana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManzana() {
        return manzana;
    }

    /**
     * Define el valor de la propiedad manzana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManzana(String value) {
        this.manzana = value;
    }

    /**
     * Obtiene el valor de la propiedad nivel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivel() {
        return nivel;
    }

    /**
     * Define el valor de la propiedad nivel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivel(String value) {
        this.nivel = value;
    }

    /**
     * Obtiene el valor de la propiedad nroPuerta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNroPuerta() {
        return nroPuerta;
    }

    /**
     * Define el valor de la propiedad nroPuerta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNroPuerta(Integer value) {
        this.nroPuerta = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservaciones(String value) {
        this.observaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad padron.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadron() {
        return padron;
    }

    /**
     * Define el valor de la propiedad padron.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadron(String value) {
        this.padron = value;
    }

    /**
     * Obtiene el valor de la propiedad ruta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * Define el valor de la propiedad ruta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuta(String value) {
        this.ruta = value;
    }

    /**
     * Obtiene el valor de la propiedad seccionJudicial.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeccionJudicial() {
        return seccionJudicial;
    }

    /**
     * Define el valor de la propiedad seccionJudicial.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeccionJudicial(Integer value) {
        this.seccionJudicial = value;
    }

    /**
     * Obtiene el valor de la propiedad solar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolar() {
        return solar;
    }

    /**
     * Define el valor de la propiedad solar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolar(String value) {
        this.solar = value;
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
     * Obtiene el valor de la propiedad torre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTorre() {
        return torre;
    }

    /**
     * Define el valor de la propiedad torre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTorre(String value) {
        this.torre = value;
    }

    /**
     * Obtiene el valor de la propiedad unidad.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnidad() {
        return unidad;
    }

    /**
     * Define el valor de la propiedad unidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnidad(Integer value) {
        this.unidad = value;
    }

    /**
     * Obtiene el valor de la propiedad zona.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getZona() {
        return zona;
    }

    /**
     * Define el valor de la propiedad zona.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setZona(Integer value) {
        this.zona = value;
    }

}
