
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParamObtenerDocumentoAutogestionado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ParamObtenerDocumentoAutogestionado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codAportacionContratista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codAportacionTitular" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="excluirCodigos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fechaPago" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="invocador" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="lineasDocumento" type="{http://bps.gub.uy/recaudacion/facturacion/v003/datatypes/generaciondocumento}LineaDocumento" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="mesCargoDesde" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="mesCargoHasta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nroIntContribuyenteContratista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nroIntContribuyenteTitular" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nroIntEmpresaContratista" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nroIntEmpresaTitular" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nroObra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="privilegioMulta85" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="tipoContribuyente" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoFactura" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="utilizarCreditos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="vtoInternet" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamObtenerDocumentoAutogestionado", namespace = "http://bps.gub.uy/recaudacion/facturacion/v003/datatypes/generaciondocumento", propOrder = {
    "codAportacionContratista",
    "codAportacionTitular",
    "excluirCodigos",
    "fechaPago",
    "invocador",
    "lineasDocumento",
    "mesCargoDesde",
    "mesCargoHasta",
    "nroIntContribuyenteContratista",
    "nroIntContribuyenteTitular",
    "nroIntEmpresaContratista",
    "nroIntEmpresaTitular",
    "nroObra",
    "privilegioMulta85",
    "tipoContribuyente",
    "tipoDocumento",
    "tipoFactura",
    "usuario",
    "utilizarCreditos",
    "vtoInternet"
})
public class ParamObtenerDocumentoAutogestionado {

    protected Integer codAportacionContratista;
    protected Integer codAportacionTitular;
    protected Boolean excluirCodigos;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaPago;
    protected Integer invocador;
    @XmlElement(nillable = true)
    protected List<LineaDocumento> lineasDocumento;
    protected Integer mesCargoDesde;
    protected Integer mesCargoHasta;
    protected Integer nroIntContribuyenteContratista;
    protected Integer nroIntContribuyenteTitular;
    protected Integer nroIntEmpresaContratista;
    protected Integer nroIntEmpresaTitular;
    protected String nroObra;
    protected Boolean privilegioMulta85;
    protected Integer tipoContribuyente;
    protected String tipoDocumento;
    protected String tipoFactura;
    protected String usuario;
    protected Boolean utilizarCreditos;
    protected Boolean vtoInternet;

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
     * Obtiene el valor de la propiedad excluirCodigos.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcluirCodigos() {
        return excluirCodigos;
    }

    /**
     * Define el valor de la propiedad excluirCodigos.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcluirCodigos(Boolean value) {
        this.excluirCodigos = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPago.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaPago() {
        return fechaPago;
    }

    /**
     * Define el valor de la propiedad fechaPago.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaPago(XMLGregorianCalendar value) {
        this.fechaPago = value;
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
     * Gets the value of the lineasDocumento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the lineasDocumento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineasDocumento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LineaDocumento }
     * 
     * 
     */
    public List<LineaDocumento> getLineasDocumento() {
        if (lineasDocumento == null) {
            lineasDocumento = new ArrayList<LineaDocumento>();
        }
        return this.lineasDocumento;
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
     * Obtiene el valor de la propiedad privilegioMulta85.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrivilegioMulta85() {
        return privilegioMulta85;
    }

    /**
     * Define el valor de la propiedad privilegioMulta85.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrivilegioMulta85(Boolean value) {
        this.privilegioMulta85 = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoContribuyente.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTipoContribuyente() {
        return tipoContribuyente;
    }

    /**
     * Define el valor de la propiedad tipoContribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTipoContribuyente(Integer value) {
        this.tipoContribuyente = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
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

    /**
     * Obtiene el valor de la propiedad utilizarCreditos.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUtilizarCreditos() {
        return utilizarCreditos;
    }

    /**
     * Define el valor de la propiedad utilizarCreditos.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUtilizarCreditos(Boolean value) {
        this.utilizarCreditos = value;
    }

    /**
     * Obtiene el valor de la propiedad vtoInternet.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVtoInternet() {
        return vtoInternet;
    }

    /**
     * Define el valor de la propiedad vtoInternet.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVtoInternet(Boolean value) {
        this.vtoInternet = value;
    }

}
