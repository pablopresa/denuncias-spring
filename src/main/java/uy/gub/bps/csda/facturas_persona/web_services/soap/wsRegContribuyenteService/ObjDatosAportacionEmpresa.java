
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjDatosAportacionEmpresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjDatosAportacionEmpresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aportacion" type="{http://bps.gub.uy/atyr/registro/rce/v002/datatypes}ObjAportacion" minOccurs="0"/&gt;
 *         &lt;element name="estadosAportacion" type="{http://bps.gub.uy/atyr/registro/rce/v002/datatypes}ObjEstadoAportacion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjDatosAportacionEmpresa", namespace = "http://bps.gub.uy/atyr/registro/rce/v002/datatypes", propOrder = {
    "aportacion",
    "estadosAportacion"
})
public class ObjDatosAportacionEmpresa {

    protected ObjAportacion aportacion;
    @XmlElement(nillable = true)
    protected List<ObjEstadoAportacion> estadosAportacion;

    /**
     * Obtiene el valor de la propiedad aportacion.
     * 
     * @return
     *     possible object is
     *     {@link ObjAportacion }
     *     
     */
    public ObjAportacion getAportacion() {
        return aportacion;
    }

    /**
     * Define el valor de la propiedad aportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjAportacion }
     *     
     */
    public void setAportacion(ObjAportacion value) {
        this.aportacion = value;
    }

    /**
     * Gets the value of the estadosAportacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the estadosAportacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstadosAportacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjEstadoAportacion }
     * 
     * 
     */
    public List<ObjEstadoAportacion> getEstadosAportacion() {
        if (estadosAportacion == null) {
            estadosAportacion = new ArrayList<ObjEstadoAportacion>();
        }
        return this.estadosAportacion;
    }

}
