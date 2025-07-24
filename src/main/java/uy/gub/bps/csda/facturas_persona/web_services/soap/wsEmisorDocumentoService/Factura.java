
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Factura complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Factura"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fechaVencimientoIrpf" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="fechaVencimientoPago" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="importeTotal" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="mesCargoDesde" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="mesCargoHasta" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="nroReferencia" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tipoDocumento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "Factura", namespace = "http://bps.gub.uy/recaudacion/facturacion/v001/datatypes", propOrder = {
    "fechaVencimientoIrpf",
    "fechaVencimientoPago",
    "importeTotal",
    "mesCargoDesde",
    "mesCargoHasta",
    "nroReferencia",
    "tipoDocumento",
    "tipoFactura"
})
public class Factura {

    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaVencimientoIrpf;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaVencimientoPago;
    protected Double importeTotal;
    protected Integer mesCargoDesde;
    protected Integer mesCargoHasta;
    protected Long nroReferencia;
    protected String tipoDocumento;
    protected String tipoFactura;

    /**
     * Obtiene el valor de la propiedad fechaVencimientoIrpf.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimientoIrpf() {
        return fechaVencimientoIrpf;
    }

    /**
     * Define el valor de la propiedad fechaVencimientoIrpf.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimientoIrpf(XMLGregorianCalendar value) {
        this.fechaVencimientoIrpf = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaVencimientoPago.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVencimientoPago() {
        return fechaVencimientoPago;
    }

    /**
     * Define el valor de la propiedad fechaVencimientoPago.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVencimientoPago(XMLGregorianCalendar value) {
        this.fechaVencimientoPago = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTotal.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImporteTotal() {
        return importeTotal;
    }

    /**
     * Define el valor de la propiedad importeTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImporteTotal(Double value) {
        this.importeTotal = value;
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
     * Obtiene el valor de la propiedad nroReferencia.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNroReferencia() {
        return nroReferencia;
    }

    /**
     * Define el valor de la propiedad nroReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNroReferencia(Long value) {
        this.nroReferencia = value;
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

}
