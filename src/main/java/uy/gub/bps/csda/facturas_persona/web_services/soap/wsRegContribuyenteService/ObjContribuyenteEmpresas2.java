
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjContribuyenteEmpresas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjContribuyenteEmpresas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="objEmpresa" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjEmpresa"/&gt;
 *         &lt;element name="objRelacionEmpContr" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjRelacionEmpContr"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjContribuyenteEmpresas", propOrder = {
    "objEmpresa",
    "objRelacionEmpContr"
})
public class ObjContribuyenteEmpresas2 {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjEmpresa2 objEmpresa;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjRelacionEmpContr3 objRelacionEmpContr;

    /**
     * Obtiene el valor de la propiedad objEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link ObjEmpresa2 }
     *     
     */
    public ObjEmpresa2 getObjEmpresa() {
        return objEmpresa;
    }

    /**
     * Define el valor de la propiedad objEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjEmpresa2 }
     *     
     */
    public void setObjEmpresa(ObjEmpresa2 value) {
        this.objEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad objRelacionEmpContr.
     * 
     * @return
     *     possible object is
     *     {@link ObjRelacionEmpContr3 }
     *     
     */
    public ObjRelacionEmpContr3 getObjRelacionEmpContr() {
        return objRelacionEmpContr;
    }

    /**
     * Define el valor de la propiedad objRelacionEmpContr.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjRelacionEmpContr3 }
     *     
     */
    public void setObjRelacionEmpContr(ObjRelacionEmpContr3 value) {
        this.objRelacionEmpContr = value;
    }

}
