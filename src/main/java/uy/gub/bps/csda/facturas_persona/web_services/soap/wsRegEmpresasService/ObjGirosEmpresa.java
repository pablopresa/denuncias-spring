
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjGirosEmpresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjGirosEmpresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="giroPrincipal" type="{http://bps.gub.uy/atyr/registro/rce/v002/datatypes}ObjGiroPeriodo" minOccurs="0"/&gt;
 *         &lt;element name="girosSecundarios" type="{http://bps.gub.uy/atyr/registro/rce/v002/datatypes}ObjGiroPeriodo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjGirosEmpresa", namespace = "http://bps.gub.uy/atyr/registro/rce/v002/datatypes", propOrder = {
    "giroPrincipal",
    "girosSecundarios"
})
public class ObjGirosEmpresa {

    protected ObjGiroPeriodo giroPrincipal;
    @XmlElement(nillable = true)
    protected List<ObjGiroPeriodo> girosSecundarios;

    /**
     * Obtiene el valor de la propiedad giroPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link ObjGiroPeriodo }
     *     
     */
    public ObjGiroPeriodo getGiroPrincipal() {
        return giroPrincipal;
    }

    /**
     * Define el valor de la propiedad giroPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjGiroPeriodo }
     *     
     */
    public void setGiroPrincipal(ObjGiroPeriodo value) {
        this.giroPrincipal = value;
    }

    /**
     * Gets the value of the girosSecundarios property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the girosSecundarios property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGirosSecundarios().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjGiroPeriodo }
     * 
     * 
     */
    public List<ObjGiroPeriodo> getGirosSecundarios() {
        if (girosSecundarios == null) {
            girosSecundarios = new ArrayList<ObjGiroPeriodo>();
        }
        return this.girosSecundarios;
    }

}
