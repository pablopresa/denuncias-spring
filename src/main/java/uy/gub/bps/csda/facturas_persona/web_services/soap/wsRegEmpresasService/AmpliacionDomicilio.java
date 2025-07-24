
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AmpliacionDomicilio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AmpliacionDomicilio"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bloque" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="complejoHabitacional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="kilometro" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="local" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="manzana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nivel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="padron" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ruta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seccionJudicial" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="solar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "AmpliacionDomicilio", namespace = "http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", propOrder = {
    "bloque",
    "complejoHabitacional",
    "kilometro",
    "local",
    "manzana",
    "nivel",
    "observaciones",
    "padron",
    "ruta",
    "seccionJudicial",
    "solar",
    "torre",
    "unidad",
    "zona"
})
public class AmpliacionDomicilio {

    protected String bloque;
    protected String complejoHabitacional;
    protected Double kilometro;
    protected String local;
    protected String manzana;
    protected String nivel;
    protected String observaciones;
    protected String padron;
    protected String ruta;
    protected Integer seccionJudicial;
    protected String solar;
    protected String torre;
    protected Integer unidad;
    protected Integer zona;

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
