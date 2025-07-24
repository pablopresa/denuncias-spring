
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ColNatJuridicaPeriodo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ColNatJuridicaPeriodo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="natJuridicaPeriodo" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjNatJuridicaPeriodo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColNatJuridicaPeriodo", propOrder = {
    "natJuridicaPeriodo"
})
public class ColNatJuridicaPeriodo {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", nillable = true)
    protected List<ObjNatJuridicaPeriodo2> natJuridicaPeriodo;

    /**
     * Gets the value of the natJuridicaPeriodo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the natJuridicaPeriodo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNatJuridicaPeriodo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjNatJuridicaPeriodo2 }
     * 
     * 
     */
    public List<ObjNatJuridicaPeriodo2> getNatJuridicaPeriodo() {
        if (natJuridicaPeriodo == null) {
            natJuridicaPeriodo = new ArrayList<ObjNatJuridicaPeriodo2>();
        }
        return this.natJuridicaPeriodo;
    }

}
