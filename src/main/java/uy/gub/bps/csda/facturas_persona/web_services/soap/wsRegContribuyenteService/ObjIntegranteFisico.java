
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjIntegranteFisico complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjIntegranteFisico"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listObjRelacionLaboralPeriodo" type="{http://bps.gub.uy/atyr/registro/rce/v004/datatypes}ObjRelacionLaboralPeriodo" maxOccurs="unbounded" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="periodo" type="{http://bps.gub.uy/atyr/registro/rce/v003/datatypes}ObjPeriodo" minOccurs="0" form="unqualified"/&gt;
 *         &lt;element name="persIdentificador" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjIntegranteFisico", propOrder = {
    "listObjRelacionLaboralPeriodo",
    "periodo",
    "persIdentificador"
})
public class ObjIntegranteFisico {

    @XmlElement(nillable = true)
    protected List<ObjRelacionLaboralPeriodo> listObjRelacionLaboralPeriodo;
    protected ObjPeriodo periodo;
    protected Integer persIdentificador;

    /**
     * Gets the value of the listObjRelacionLaboralPeriodo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the listObjRelacionLaboralPeriodo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListObjRelacionLaboralPeriodo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjRelacionLaboralPeriodo }
     * 
     * 
     */
    public List<ObjRelacionLaboralPeriodo> getListObjRelacionLaboralPeriodo() {
        if (listObjRelacionLaboralPeriodo == null) {
            listObjRelacionLaboralPeriodo = new ArrayList<ObjRelacionLaboralPeriodo>();
        }
        return this.listObjRelacionLaboralPeriodo;
    }

    /**
     * Obtiene el valor de la propiedad periodo.
     * 
     * @return
     *     possible object is
     *     {@link ObjPeriodo }
     *     
     */
    public ObjPeriodo getPeriodo() {
        return periodo;
    }

    /**
     * Define el valor de la propiedad periodo.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjPeriodo }
     *     
     */
    public void setPeriodo(ObjPeriodo value) {
        this.periodo = value;
    }

    /**
     * Obtiene el valor de la propiedad persIdentificador.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPersIdentificador() {
        return persIdentificador;
    }

    /**
     * Define el valor de la propiedad persIdentificador.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPersIdentificador(Integer value) {
        this.persIdentificador = value;
    }

}
