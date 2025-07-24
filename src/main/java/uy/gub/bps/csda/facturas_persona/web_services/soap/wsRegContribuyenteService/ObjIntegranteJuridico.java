
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjIntegranteJuridico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjIntegranteJuridico"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="datosIJ" type="{http://bps.gub.uy/atyr/registro/rce/v003/datatypes}ObjContribuyente" minOccurs="0"/&gt;
 *         &lt;element name="fechaEgreso" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="fechaIngreso" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="relacionesLaborales" type="{http://bps.gub.uy/atyr/registro/rce/v004/datatypes}ObjRelacionLaboralPeriodo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjIntegranteJuridico", namespace = "http://bps.gub.uy/atyr/registro/rce/v002/datatypes", propOrder = {
    "datosIJ",
    "fechaEgreso",
    "fechaIngreso",
    "relacionesLaborales"
})
public class ObjIntegranteJuridico {

    protected ObjContribuyente2 datosIJ;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaEgreso;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaIngreso;
    @XmlElement(nillable = true)
    protected List<ObjRelacionLaboralPeriodo> relacionesLaborales;

    /**
     * Obtiene el valor de la propiedad datosIJ.
     * 
     * @return
     *     possible object is
     *     {@link ObjContribuyente2 }
     *     
     */
    public ObjContribuyente2 getDatosIJ() {
        return datosIJ;
    }

    /**
     * Define el valor de la propiedad datosIJ.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjContribuyente2 }
     *     
     */
    public void setDatosIJ(ObjContribuyente2 value) {
        this.datosIJ = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEgreso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEgreso() {
        return fechaEgreso;
    }

    /**
     * Define el valor de la propiedad fechaEgreso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEgreso(XMLGregorianCalendar value) {
        this.fechaEgreso = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaIngreso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Define el valor de la propiedad fechaIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaIngreso(XMLGregorianCalendar value) {
        this.fechaIngreso = value;
    }

    /**
     * Gets the value of the relacionesLaborales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the relacionesLaborales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelacionesLaborales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjRelacionLaboralPeriodo }
     * 
     * 
     */
    public List<ObjRelacionLaboralPeriodo> getRelacionesLaborales() {
        if (relacionesLaborales == null) {
            relacionesLaborales = new ArrayList<ObjRelacionLaboralPeriodo>();
        }
        return this.relacionesLaborales;
    }

}
