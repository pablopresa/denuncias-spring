
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParamObtenerDocumentoPDF complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ParamObtenerDocumentoPDF"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="buenPagador" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="conDetalle" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="excluirCodigos" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="fechaPago" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="invocador" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="mesDesde" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="mesHasta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nroObra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="opcionDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="secCodCaja" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="secNroIntContrib" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="secNroIntEmp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tipoDoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="titCodCaja" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="titNroIntContrib" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="titNroIntEmp" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "ParamObtenerDocumentoPDF", namespace = "http://bps.gub.uy/recaudacion/facturacion/v003/datatypes/generaciondocumento", propOrder = {
    "buenPagador",
    "conDetalle",
    "excluirCodigos",
    "fechaPago",
    "invocador",
    "mesDesde",
    "mesHasta",
    "nroObra",
    "opcionDoc",
    "secCodCaja",
    "secNroIntContrib",
    "secNroIntEmp",
    "tipoDoc",
    "titCodCaja",
    "titNroIntContrib",
    "titNroIntEmp",
    "usuario",
    "utilizarCreditos",
    "vtoInternet"
})
public class ParamObtenerDocumentoPDF {

    protected Boolean buenPagador;
    protected Boolean conDetalle;
    protected Boolean excluirCodigos;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaPago;
    protected Integer invocador;
    protected Integer mesDesde;
    protected Integer mesHasta;
    protected String nroObra;
    protected String opcionDoc;
    protected Integer secCodCaja;
    protected Integer secNroIntContrib;
    protected Integer secNroIntEmp;
    protected String tipoDoc;
    protected Integer titCodCaja;
    protected Integer titNroIntContrib;
    protected Integer titNroIntEmp;
    protected String usuario;
    protected Boolean utilizarCreditos;
    protected Boolean vtoInternet;

    /**
     * Obtiene el valor de la propiedad buenPagador.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBuenPagador() {
        return buenPagador;
    }

    /**
     * Define el valor de la propiedad buenPagador.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBuenPagador(Boolean value) {
        this.buenPagador = value;
    }

    /**
     * Obtiene el valor de la propiedad conDetalle.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConDetalle() {
        return conDetalle;
    }

    /**
     * Define el valor de la propiedad conDetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConDetalle(Boolean value) {
        this.conDetalle = value;
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
     * Obtiene el valor de la propiedad mesDesde.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMesDesde() {
        return mesDesde;
    }

    /**
     * Define el valor de la propiedad mesDesde.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMesDesde(Integer value) {
        this.mesDesde = value;
    }

    /**
     * Obtiene el valor de la propiedad mesHasta.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMesHasta() {
        return mesHasta;
    }

    /**
     * Define el valor de la propiedad mesHasta.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMesHasta(Integer value) {
        this.mesHasta = value;
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
     * Obtiene el valor de la propiedad opcionDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpcionDoc() {
        return opcionDoc;
    }

    /**
     * Define el valor de la propiedad opcionDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpcionDoc(String value) {
        this.opcionDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad secCodCaja.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecCodCaja() {
        return secCodCaja;
    }

    /**
     * Define el valor de la propiedad secCodCaja.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecCodCaja(Integer value) {
        this.secCodCaja = value;
    }

    /**
     * Obtiene el valor de la propiedad secNroIntContrib.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecNroIntContrib() {
        return secNroIntContrib;
    }

    /**
     * Define el valor de la propiedad secNroIntContrib.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecNroIntContrib(Integer value) {
        this.secNroIntContrib = value;
    }

    /**
     * Obtiene el valor de la propiedad secNroIntEmp.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecNroIntEmp() {
        return secNroIntEmp;
    }

    /**
     * Define el valor de la propiedad secNroIntEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecNroIntEmp(Integer value) {
        this.secNroIntEmp = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoDoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDoc() {
        return tipoDoc;
    }

    /**
     * Define el valor de la propiedad tipoDoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDoc(String value) {
        this.tipoDoc = value;
    }

    /**
     * Obtiene el valor de la propiedad titCodCaja.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTitCodCaja() {
        return titCodCaja;
    }

    /**
     * Define el valor de la propiedad titCodCaja.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTitCodCaja(Integer value) {
        this.titCodCaja = value;
    }

    /**
     * Obtiene el valor de la propiedad titNroIntContrib.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTitNroIntContrib() {
        return titNroIntContrib;
    }

    /**
     * Define el valor de la propiedad titNroIntContrib.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTitNroIntContrib(Integer value) {
        this.titNroIntContrib = value;
    }

    /**
     * Obtiene el valor de la propiedad titNroIntEmp.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTitNroIntEmp() {
        return titNroIntEmp;
    }

    /**
     * Define el valor de la propiedad titNroIntEmp.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTitNroIntEmp(Integer value) {
        this.titNroIntEmp = value;
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
