
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParamValContribuyente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ParamValContribuyente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claveContribuyente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="criterio" type="{http://bps.gub.uy/registro/contribuyentes/v001/datatypes}CriterioPeriodo" minOccurs="0"/&gt;
 *         &lt;element name="nroContribuyente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nroIntContr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="paramPeriodo" type="{http://bps.gub.uy/registro/contribuyentes/v001/datatypes}ParamPeriodo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamValContribuyente", namespace = "http://bps.gub.uy/registro/contribuyentes/v003/datatypes", propOrder = {
    "claveContribuyente",
    "criterio",
    "nroContribuyente",
    "nroIntContr",
    "paramPeriodo"
})
public class ParamValContribuyente {

    protected String claveContribuyente;
    @XmlSchemaType(name = "string")
    protected CriterioPeriodo criterio;
    protected String nroContribuyente;
    protected Integer nroIntContr;
    protected ParamPeriodo paramPeriodo;

    /**
     * Obtiene el valor de la propiedad claveContribuyente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveContribuyente() {
        return claveContribuyente;
    }

    /**
     * Define el valor de la propiedad claveContribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveContribuyente(String value) {
        this.claveContribuyente = value;
    }

    /**
     * Obtiene el valor de la propiedad criterio.
     * 
     * @return
     *     possible object is
     *     {@link CriterioPeriodo }
     *     
     */
    public CriterioPeriodo getCriterio() {
        return criterio;
    }

    /**
     * Define el valor de la propiedad criterio.
     * 
     * @param value
     *     allowed object is
     *     {@link CriterioPeriodo }
     *     
     */
    public void setCriterio(CriterioPeriodo value) {
        this.criterio = value;
    }

    /**
     * Obtiene el valor de la propiedad nroContribuyente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroContribuyente() {
        return nroContribuyente;
    }

    /**
     * Define el valor de la propiedad nroContribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroContribuyente(String value) {
        this.nroContribuyente = value;
    }

    /**
     * Obtiene el valor de la propiedad nroIntContr.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNroIntContr() {
        return nroIntContr;
    }

    /**
     * Define el valor de la propiedad nroIntContr.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNroIntContr(Integer value) {
        this.nroIntContr = value;
    }

    /**
     * Obtiene el valor de la propiedad paramPeriodo.
     * 
     * @return
     *     possible object is
     *     {@link ParamPeriodo }
     *     
     */
    public ParamPeriodo getParamPeriodo() {
        return paramPeriodo;
    }

    /**
     * Define el valor de la propiedad paramPeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamPeriodo }
     *     
     */
    public void setParamPeriodo(ParamPeriodo value) {
        this.paramPeriodo = value;
    }

}
