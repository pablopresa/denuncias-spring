
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

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
 *         &lt;element name="giroPrincipal" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjGiroPeriodo"/&gt;
 *         &lt;element name="girosSecundarios" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ColGirosPeriodo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjGirosEmpresa", propOrder = {
    "giroPrincipal",
    "girosSecundarios"
})
public class ObjGirosEmpresa2 {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjGiroPeriodo2 giroPrincipal;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ColGirosPeriodo girosSecundarios;

    /**
     * Obtiene el valor de la propiedad giroPrincipal.
     * 
     * @return
     *     possible object is
     *     {@link ObjGiroPeriodo2 }
     *     
     */
    public ObjGiroPeriodo2 getGiroPrincipal() {
        return giroPrincipal;
    }

    /**
     * Define el valor de la propiedad giroPrincipal.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjGiroPeriodo2 }
     *     
     */
    public void setGiroPrincipal(ObjGiroPeriodo2 value) {
        this.giroPrincipal = value;
    }

    /**
     * Obtiene el valor de la propiedad girosSecundarios.
     * 
     * @return
     *     possible object is
     *     {@link ColGirosPeriodo }
     *     
     */
    public ColGirosPeriodo getGirosSecundarios() {
        return girosSecundarios;
    }

    /**
     * Define el valor de la propiedad girosSecundarios.
     * 
     * @param value
     *     allowed object is
     *     {@link ColGirosPeriodo }
     *     
     */
    public void setGirosSecundarios(ColGirosPeriodo value) {
        this.girosSecundarios = value;
    }

}
