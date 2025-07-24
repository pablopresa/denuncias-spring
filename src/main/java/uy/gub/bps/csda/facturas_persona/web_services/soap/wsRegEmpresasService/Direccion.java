
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Direccion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Direccion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calle" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes}Calle" minOccurs="0"/&gt;
 *         &lt;element name="calleEntreDos" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes}Calle" minOccurs="0"/&gt;
 *         &lt;element name="calleEntreUno" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes}Calle" minOccurs="0"/&gt;
 *         &lt;element name="codigoPostal" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes}CodigoPostal" minOccurs="0"/&gt;
 *         &lt;element name="numeroPuerta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Direccion", namespace = "http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", propOrder = {
    "apto",
    "bis",
    "calle",
    "calleEntreDos",
    "calleEntreUno",
    "codigoPostal",
    "numeroPuerta"
})
public class Direccion {

    protected String apto;
    protected String bis;
    protected Calle calle;
    protected Calle calleEntreDos;
    protected Calle calleEntreUno;
    protected CodigoPostal codigoPostal;
    protected String numeroPuerta;

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
     * Obtiene el valor de la propiedad calle.
     * 
     * @return
     *     possible object is
     *     {@link Calle }
     *     
     */
    public Calle getCalle() {
        return calle;
    }

    /**
     * Define el valor de la propiedad calle.
     * 
     * @param value
     *     allowed object is
     *     {@link Calle }
     *     
     */
    public void setCalle(Calle value) {
        this.calle = value;
    }

    /**
     * Obtiene el valor de la propiedad calleEntreDos.
     * 
     * @return
     *     possible object is
     *     {@link Calle }
     *     
     */
    public Calle getCalleEntreDos() {
        return calleEntreDos;
    }

    /**
     * Define el valor de la propiedad calleEntreDos.
     * 
     * @param value
     *     allowed object is
     *     {@link Calle }
     *     
     */
    public void setCalleEntreDos(Calle value) {
        this.calleEntreDos = value;
    }

    /**
     * Obtiene el valor de la propiedad calleEntreUno.
     * 
     * @return
     *     possible object is
     *     {@link Calle }
     *     
     */
    public Calle getCalleEntreUno() {
        return calleEntreUno;
    }

    /**
     * Define el valor de la propiedad calleEntreUno.
     * 
     * @param value
     *     allowed object is
     *     {@link Calle }
     *     
     */
    public void setCalleEntreUno(Calle value) {
        this.calleEntreUno = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPostal.
     * 
     * @return
     *     possible object is
     *     {@link CodigoPostal }
     *     
     */
    public CodigoPostal getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Define el valor de la propiedad codigoPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link CodigoPostal }
     *     
     */
    public void setCodigoPostal(CodigoPostal value) {
        this.codigoPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroPuerta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPuerta() {
        return numeroPuerta;
    }

    /**
     * Define el valor de la propiedad numeroPuerta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPuerta(String value) {
        this.numeroPuerta = value;
    }

}
