
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjAportacionAE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjAportacionAE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aportacion" type="{http://bps.gub.uy/atyr/registro/empresas/v001/datatypes}objGenericCodeInt" minOccurs="0"/&gt;
 *         &lt;element name="atributosEspeciales" type="{http://bps.gub.uy/atyr/registro/empresas/v001/datatypes}ObjAEPeriodo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjAportacionAE", namespace = "http://bps.gub.uy/atyr/registro/empresas/v001/datatypes", propOrder = {
    "aportacion",
    "atributosEspeciales"
})
public class ObjAportacionAE {

    protected ObjGenericCodeInt aportacion;
    @XmlElement(nillable = true)
    protected List<ObjAEPeriodo> atributosEspeciales;

    /**
     * Obtiene el valor de la propiedad aportacion.
     * 
     * @return
     *     possible object is
     *     {@link ObjGenericCodeInt }
     *     
     */
    public ObjGenericCodeInt getAportacion() {
        return aportacion;
    }

    /**
     * Define el valor de la propiedad aportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjGenericCodeInt }
     *     
     */
    public void setAportacion(ObjGenericCodeInt value) {
        this.aportacion = value;
    }

    /**
     * Gets the value of the atributosEspeciales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the atributosEspeciales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtributosEspeciales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjAEPeriodo }
     * 
     * 
     */
    public List<ObjAEPeriodo> getAtributosEspeciales() {
        if (atributosEspeciales == null) {
            atributosEspeciales = new ArrayList<ObjAEPeriodo>();
        }
        return this.atributosEspeciales;
    }

}
