
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ColTipoSueldoFicto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ColTipoSueldoFicto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tiposSueldoFicto" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjTipoSueldoFicto" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColTipoSueldoFicto", propOrder = {
    "tiposSueldoFicto"
})
public class ColTipoSueldoFicto {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected List<ObjTipoSueldoFicto> tiposSueldoFicto;

    /**
     * Gets the value of the tiposSueldoFicto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tiposSueldoFicto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTiposSueldoFicto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjTipoSueldoFicto }
     * 
     * 
     */
    public List<ObjTipoSueldoFicto> getTiposSueldoFicto() {
        if (tiposSueldoFicto == null) {
            tiposSueldoFicto = new ArrayList<ObjTipoSueldoFicto>();
        }
        return this.tiposSueldoFicto;
    }

}
