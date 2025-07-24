
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjEmpresaContribuyentes complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjEmpresaContribuyentes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="objContribuyente" type="{http://bps.gub.uy/atyr/registro/rce/v003/datatypes}ObjContribuyente" minOccurs="0"/&gt;
 *         &lt;element name="objRelacionEmpContr" type="{http://bps.gub.uy/atyr/registro/rce/v003/datatypes}ObjRelacionEmpContr" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjEmpresaContribuyentes", namespace = "http://bps.gub.uy/atyr/registro/rce/v002/datatypes", propOrder = {
    "objContribuyente",
    "objRelacionEmpContr"
})
public class ObjEmpresaContribuyentes {

    protected ObjContribuyente2 objContribuyente;
    protected ObjRelacionEmpContr2 objRelacionEmpContr;

    /**
     * Obtiene el valor de la propiedad objContribuyente.
     * 
     * @return
     *     possible object is
     *     {@link ObjContribuyente2 }
     *     
     */
    public ObjContribuyente2 getObjContribuyente() {
        return objContribuyente;
    }

    /**
     * Define el valor de la propiedad objContribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjContribuyente2 }
     *     
     */
    public void setObjContribuyente(ObjContribuyente2 value) {
        this.objContribuyente = value;
    }

    /**
     * Obtiene el valor de la propiedad objRelacionEmpContr.
     * 
     * @return
     *     possible object is
     *     {@link ObjRelacionEmpContr2 }
     *     
     */
    public ObjRelacionEmpContr2 getObjRelacionEmpContr() {
        return objRelacionEmpContr;
    }

    /**
     * Define el valor de la propiedad objRelacionEmpContr.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjRelacionEmpContr2 }
     *     
     */
    public void setObjRelacionEmpContr(ObjRelacionEmpContr2 value) {
        this.objRelacionEmpContr = value;
    }

}
