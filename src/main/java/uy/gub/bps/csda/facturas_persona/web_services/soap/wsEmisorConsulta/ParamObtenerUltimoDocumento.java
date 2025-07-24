
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorConsulta;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParamObtenerUltimoDocumento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ParamObtenerUltimoDocumento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codAportacionContratista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codAportacionTitular" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nivelDetalle" type="{http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001}NivelDetalle" minOccurs="0"/&gt;
 *         &lt;element name="nroIntContribuyenteContratista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nroIntContribuyenteTitular" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nroIntEmpresaContratista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nroIntEmpresaTitular" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nroObra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamObtenerUltimoDocumento", propOrder = {
    "codAportacionContratista",
    "codAportacionTitular",
    "nivelDetalle",
    "nroIntContribuyenteContratista",
    "nroIntContribuyenteTitular",
    "nroIntEmpresaContratista",
    "nroIntEmpresaTitular",
    "nroObra",
    "tipoFactura"
})
public class ParamObtenerUltimoDocumento {

    protected Integer codAportacionContratista;
    protected Integer codAportacionTitular;
    @XmlSchemaType(name = "string")
    protected NivelDetalle nivelDetalle;
    protected Integer nroIntContribuyenteContratista;
    protected Integer nroIntContribuyenteTitular;
    protected Integer nroIntEmpresaContratista;
    protected Integer nroIntEmpresaTitular;
    protected String nroObra;
    protected String tipoFactura;

    /**
     * Obtiene el valor de la propiedad codAportacionContratista.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodAportacionContratista() {
        return codAportacionContratista;
    }

    /**
     * Define el valor de la propiedad codAportacionContratista.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodAportacionContratista(Integer value) {
        this.codAportacionContratista = value;
    }

    /**
     * Obtiene el valor de la propiedad codAportacionTitular.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodAportacionTitular() {
        return codAportacionTitular;
    }

    /**
     * Define el valor de la propiedad codAportacionTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodAportacionTitular(Integer value) {
        this.codAportacionTitular = value;
    }

    /**
     * Obtiene el valor de la propiedad nivelDetalle.
     * 
     * @return
     *     possible object is
     *     {@link NivelDetalle }
     *     
     */
    public NivelDetalle getNivelDetalle() {
        return nivelDetalle;
    }

    /**
     * Define el valor de la propiedad nivelDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link NivelDetalle }
     *     
     */
    public void setNivelDetalle(NivelDetalle value) {
        this.nivelDetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad nroIntContribuyenteContratista.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNroIntContribuyenteContratista() {
        return nroIntContribuyenteContratista;
    }

    /**
     * Define el valor de la propiedad nroIntContribuyenteContratista.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNroIntContribuyenteContratista(Integer value) {
        this.nroIntContribuyenteContratista = value;
    }

    /**
     * Obtiene el valor de la propiedad nroIntContribuyenteTitular.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNroIntContribuyenteTitular() {
        return nroIntContribuyenteTitular;
    }

    /**
     * Define el valor de la propiedad nroIntContribuyenteTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNroIntContribuyenteTitular(Integer value) {
        this.nroIntContribuyenteTitular = value;
    }

    /**
     * Obtiene el valor de la propiedad nroIntEmpresaContratista.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNroIntEmpresaContratista() {
        return nroIntEmpresaContratista;
    }

    /**
     * Define el valor de la propiedad nroIntEmpresaContratista.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNroIntEmpresaContratista(Integer value) {
        this.nroIntEmpresaContratista = value;
    }

    /**
     * Obtiene el valor de la propiedad nroIntEmpresaTitular.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNroIntEmpresaTitular() {
        return nroIntEmpresaTitular;
    }

    /**
     * Define el valor de la propiedad nroIntEmpresaTitular.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNroIntEmpresaTitular(Integer value) {
        this.nroIntEmpresaTitular = value;
    }

    /**
     * Obtiene el valor de la propiedad nroObra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNroObra() {
        return nroObra;
    }

    /**
     * Define el valor de la propiedad nroObra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNroObra(String value) {
        this.nroObra = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFactura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFactura() {
        return tipoFactura;
    }

    /**
     * Define el valor de la propiedad tipoFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFactura(String value) {
        this.tipoFactura = value;
    }

}
