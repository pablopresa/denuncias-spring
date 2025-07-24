
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ColEmpresasRelacionadas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ColEmpresasRelacionadas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="objContribuyenteEmpresas" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjContribuyenteEmpresas" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColEmpresasRelacionadas", propOrder = {
    "objContribuyenteEmpresas"
})
public class ColEmpresasRelacionadas {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", nillable = true)
    protected List<ObjContribuyenteEmpresas2> objContribuyenteEmpresas;

    /**
     * Gets the value of the objContribuyenteEmpresas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the objContribuyenteEmpresas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjContribuyenteEmpresas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjContribuyenteEmpresas2 }
     * 
     * 
     */
    public List<ObjContribuyenteEmpresas2> getObjContribuyenteEmpresas() {
        if (objContribuyenteEmpresas == null) {
            objContribuyenteEmpresas = new ArrayList<ObjContribuyenteEmpresas2>();
        }
        return this.objContribuyenteEmpresas;
    }

}
