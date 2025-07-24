
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

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
 *         &lt;element name="apto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bis" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bloque" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="calle" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjCalle"/&gt;
 *         &lt;element name="calleEntreDos" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjCalle"/&gt;
 *         &lt;element name="calleEntreUno" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjCalle"/&gt;
 *         &lt;element name="codPostal" type="{http://bps.gub.uy/atyr/}Entero"/&gt;
 *         &lt;element name="complejoHabitacional" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="departamento" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjDepartamento"/&gt;
 *         &lt;element name="kilometro" type="{http://bps.gub.uy/atyr/}Real"/&gt;
 *         &lt;element name="local" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="localidad" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjLocalidad"/&gt;
 *         &lt;element name="manzana" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nivel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nroPuerta" type="{http://bps.gub.uy/atyr/}Entero"/&gt;
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="padron" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ruta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="seccionJudicial" type="{http://bps.gub.uy/atyr/}Entero"/&gt;
 *         &lt;element name="solar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="torre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="unidad" type="{http://bps.gub.uy/atyr/}Entero"/&gt;
 *         &lt;element name="zona" type="{http://bps.gub.uy/atyr/}Entero"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjDomicilio", propOrder = {
    "apto",
    "bis",
    "bloque",
    "calle",
    "calleEntreDos",
    "calleEntreUno",
    "codPostal",
    "complejoHabitacional",
    "departamento",
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
    "torre",
    "unidad",
    "zona"
})
public class ObjDomicilio3 {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String apto;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String bis;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String bloque;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjCalle2 calle;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjCalle2 calleEntreDos;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjCalle2 calleEntreUno;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Entero codPostal;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String complejoHabitacional;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjDepartamento2 departamento;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Real kilometro;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String local;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjLocalidad2 localidad;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String manzana;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String nivel;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Entero nroPuerta;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String observaciones;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String padron;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String ruta;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Entero seccionJudicial;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String solar;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected String torre;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Entero unidad;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Entero zona;

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
     *     {@link ObjCalle2 }
     *     
     */
    public ObjCalle2 getCalle() {
        return calle;
    }

    /**
     * Define el valor de la propiedad calle.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjCalle2 }
     *     
     */
    public void setCalle(ObjCalle2 value) {
        this.calle = value;
    }

    /**
     * Obtiene el valor de la propiedad calleEntreDos.
     * 
     * @return
     *     possible object is
     *     {@link ObjCalle2 }
     *     
     */
    public ObjCalle2 getCalleEntreDos() {
        return calleEntreDos;
    }

    /**
     * Define el valor de la propiedad calleEntreDos.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjCalle2 }
     *     
     */
    public void setCalleEntreDos(ObjCalle2 value) {
        this.calleEntreDos = value;
    }

    /**
     * Obtiene el valor de la propiedad calleEntreUno.
     * 
     * @return
     *     possible object is
     *     {@link ObjCalle2 }
     *     
     */
    public ObjCalle2 getCalleEntreUno() {
        return calleEntreUno;
    }

    /**
     * Define el valor de la propiedad calleEntreUno.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjCalle2 }
     *     
     */
    public void setCalleEntreUno(ObjCalle2 value) {
        this.calleEntreUno = value;
    }

    /**
     * Obtiene el valor de la propiedad codPostal.
     * 
     * @return
     *     possible object is
     *     {@link Entero }
     *     
     */
    public Entero getCodPostal() {
        return codPostal;
    }

    /**
     * Define el valor de la propiedad codPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link Entero }
     *     
     */
    public void setCodPostal(Entero value) {
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
     *     {@link ObjDepartamento2 }
     *     
     */
    public ObjDepartamento2 getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjDepartamento2 }
     *     
     */
    public void setDepartamento(ObjDepartamento2 value) {
        this.departamento = value;
    }

    /**
     * Obtiene el valor de la propiedad kilometro.
     * 
     * @return
     *     possible object is
     *     {@link Real }
     *     
     */
    public Real getKilometro() {
        return kilometro;
    }

    /**
     * Define el valor de la propiedad kilometro.
     * 
     * @param value
     *     allowed object is
     *     {@link Real }
     *     
     */
    public void setKilometro(Real value) {
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
     *     {@link ObjLocalidad2 }
     *     
     */
    public ObjLocalidad2 getLocalidad() {
        return localidad;
    }

    /**
     * Define el valor de la propiedad localidad.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjLocalidad2 }
     *     
     */
    public void setLocalidad(ObjLocalidad2 value) {
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
     *     {@link Entero }
     *     
     */
    public Entero getNroPuerta() {
        return nroPuerta;
    }

    /**
     * Define el valor de la propiedad nroPuerta.
     * 
     * @param value
     *     allowed object is
     *     {@link Entero }
     *     
     */
    public void setNroPuerta(Entero value) {
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
     *     {@link Entero }
     *     
     */
    public Entero getSeccionJudicial() {
        return seccionJudicial;
    }

    /**
     * Define el valor de la propiedad seccionJudicial.
     * 
     * @param value
     *     allowed object is
     *     {@link Entero }
     *     
     */
    public void setSeccionJudicial(Entero value) {
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
     *     {@link Entero }
     *     
     */
    public Entero getUnidad() {
        return unidad;
    }

    /**
     * Define el valor de la propiedad unidad.
     * 
     * @param value
     *     allowed object is
     *     {@link Entero }
     *     
     */
    public void setUnidad(Entero value) {
        this.unidad = value;
    }

    /**
     * Obtiene el valor de la propiedad zona.
     * 
     * @return
     *     possible object is
     *     {@link Entero }
     *     
     */
    public Entero getZona() {
        return zona;
    }

    /**
     * Define el valor de la propiedad zona.
     * 
     * @param value
     *     allowed object is
     *     {@link Entero }
     *     
     */
    public void setZona(Entero value) {
        this.zona = value;
    }

}
