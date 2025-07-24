
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjContribuyenteAtrEspecialPeriodo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjContribuyenteAtrEspecialPeriodo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="atributosEspeciales" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjAtributoEspecialPeriodo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="contribuyente" type="{http://bps.gub.uy/registro/contribuyentes/v001/datatypes}ObjContribuyente" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjContribuyenteAtrEspecialPeriodo", propOrder = {
    "atributosEspeciales",
    "contribuyente"
})
public class ObjContribuyenteAtrEspecialPeriodo {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", nillable = true)
    protected List<ObjAtributoEspecialPeriodo> atributosEspeciales;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes")
    protected ObjContribuyente contribuyente;

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
     * {@link ObjAtributoEspecialPeriodo }
     * 
     * 
     */
    public List<ObjAtributoEspecialPeriodo> getAtributosEspeciales() {
        if (atributosEspeciales == null) {
            atributosEspeciales = new ArrayList<ObjAtributoEspecialPeriodo>();
        }
        return this.atributosEspeciales;
    }

    /**
     * Obtiene el valor de la propiedad contribuyente.
     * 
     * @return
     *     possible object is
     *     {@link ObjContribuyente }
     *     
     */
    public ObjContribuyente getContribuyente() {
        return contribuyente;
    }

    /**
     * Define el valor de la propiedad contribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjContribuyente }
     *     
     */
    public void setContribuyente(ObjContribuyente value) {
        this.contribuyente = value;
    }

}
