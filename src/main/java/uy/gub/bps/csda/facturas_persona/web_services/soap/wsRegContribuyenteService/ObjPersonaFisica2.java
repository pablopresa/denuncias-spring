
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjPersonaFisica complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjPersonaFisica"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="causalEgreso" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjCausal"/&gt;
 *         &lt;element name="fechaEgreso" type="{http://bps.gub.uy/atyr/}Fecha"/&gt;
 *         &lt;element name="fechaIngreso" type="{http://bps.gub.uy/atyr/}Fecha"/&gt;
 *         &lt;element name="persIdentificador" type="{http://bps.gub.uy/atyr/}Entero"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjPersonaFisica", propOrder = {
    "causalEgreso",
    "fechaEgreso",
    "fechaIngreso",
    "persIdentificador"
})
public class ObjPersonaFisica2 {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjCausal2 causalEgreso;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Fecha fechaEgreso;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Fecha fechaIngreso;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Entero persIdentificador;

    /**
     * Obtiene el valor de la propiedad causalEgreso.
     * 
     * @return
     *     possible object is
     *     {@link ObjCausal2 }
     *     
     */
    public ObjCausal2 getCausalEgreso() {
        return causalEgreso;
    }

    /**
     * Define el valor de la propiedad causalEgreso.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjCausal2 }
     *     
     */
    public void setCausalEgreso(ObjCausal2 value) {
        this.causalEgreso = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEgreso.
     * 
     * @return
     *     possible object is
     *     {@link Fecha }
     *     
     */
    public Fecha getFechaEgreso() {
        return fechaEgreso;
    }

    /**
     * Define el valor de la propiedad fechaEgreso.
     * 
     * @param value
     *     allowed object is
     *     {@link Fecha }
     *     
     */
    public void setFechaEgreso(Fecha value) {
        this.fechaEgreso = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaIngreso.
     * 
     * @return
     *     possible object is
     *     {@link Fecha }
     *     
     */
    public Fecha getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Define el valor de la propiedad fechaIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link Fecha }
     *     
     */
    public void setFechaIngreso(Fecha value) {
        this.fechaIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad persIdentificador.
     * 
     * @return
     *     possible object is
     *     {@link Entero }
     *     
     */
    public Entero getPersIdentificador() {
        return persIdentificador;
    }

    /**
     * Define el valor de la propiedad persIdentificador.
     * 
     * @param value
     *     allowed object is
     *     {@link Entero }
     *     
     */
    public void setPersIdentificador(Entero value) {
        this.persIdentificador = value;
    }

}
