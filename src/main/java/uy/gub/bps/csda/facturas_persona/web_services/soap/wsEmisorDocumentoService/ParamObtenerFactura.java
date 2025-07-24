
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParamObtenerFactura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ParamObtenerFactura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codAportacionContratista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codAportacionTitular" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="invocador" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="mesCargoDesde" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="mesCargoHasta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nroIntContribuyenteContratista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nroIntContribuyenteTitular" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nroIntEmpresaContratista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nroIntEmpresaTitular" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nroObra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamObtenerFactura", namespace = "http://bps.gub.uy/recaudacion/facturacion/v003/datatypes/generaciondocumento", propOrder = {
    "codAportacionContratista",
    "codAportacionTitular",
    "invocador",
    "mesCargoDesde",
    "mesCargoHasta",
    "nroIntContribuyenteContratista",
    "nroIntContribuyenteTitular",
    "nroIntEmpresaContratista",
    "nroIntEmpresaTitular",
    "nroObra",
    "usuario"
})
public class ParamObtenerFactura {

    protected Integer codAportacionContratista;
    protected Integer codAportacionTitular;
    protected Integer invocador;
    protected Integer mesCargoDesde;
    protected Integer mesCargoHasta;
    protected Integer nroIntContribuyenteContratista;
    protected Integer nroIntContribuyenteTitular;
    protected Integer nroIntEmpresaContratista;
    protected Integer nroIntEmpresaTitular;
    protected String nroObra;
    protected String usuario;

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
     * Obtiene el valor de la propiedad invocador.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInvocador() {
        return invocador;
    }

    /**
     * Define el valor de la propiedad invocador.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInvocador(Integer value) {
        this.invocador = value;
    }

    /**
     * Obtiene el valor de la propiedad mesCargoDesde.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMesCargoDesde() {
        return mesCargoDesde;
    }

    /**
     * Define el valor de la propiedad mesCargoDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMesCargoDesde(Integer value) {
        this.mesCargoDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad mesCargoHasta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMesCargoHasta() {
        return mesCargoHasta;
    }

    /**
     * Define el valor de la propiedad mesCargoHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMesCargoHasta(Integer value) {
        this.mesCargoHasta = value;
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
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

}
