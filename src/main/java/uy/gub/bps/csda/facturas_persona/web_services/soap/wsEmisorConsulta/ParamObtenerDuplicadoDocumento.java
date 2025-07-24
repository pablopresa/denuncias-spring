
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorConsulta;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ParamObtenerDuplicadoDocumento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ParamObtenerDuplicadoDocumento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nivelDetalle" type="{http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001}NivelDetalle" minOccurs="0"/&gt;
 *         &lt;element name="nroReferencia" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="validarFechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamObtenerDuplicadoDocumento", propOrder = {
    "nivelDetalle",
    "nroReferencia",
    "validarFechaVencimiento"
})
public class ParamObtenerDuplicadoDocumento {

    @XmlSchemaType(name = "string")
    protected NivelDetalle nivelDetalle;
    protected Long nroReferencia;
    protected Boolean validarFechaVencimiento;

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
     * Obtiene el valor de la propiedad validarFechaVencimiento.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isValidarFechaVencimiento() {
        return validarFechaVencimiento;
    }

    /**
     * Define el valor de la propiedad validarFechaVencimiento.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setValidarFechaVencimiento(Boolean value) {
        this.validarFechaVencimiento = value;
    }

}
