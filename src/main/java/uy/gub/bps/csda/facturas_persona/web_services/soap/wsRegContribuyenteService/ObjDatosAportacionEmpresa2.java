
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjDatosAportacionEmpresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjDatosAportacionEmpresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aportacion" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjAportacion"/&gt;
 *         &lt;element name="estadosAportacion" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ColEstadosAportacion"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjDatosAportacionEmpresa", propOrder = {
    "aportacion",
    "estadosAportacion"
})
public class ObjDatosAportacionEmpresa2 {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjAportacion2 aportacion;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ColEstadosAportacion estadosAportacion;

    /**
     * Obtiene el valor de la propiedad aportacion.
     * 
     * @return
     *     possible object is
     *     {@link ObjAportacion2 }
     *     
     */
    public ObjAportacion2 getAportacion() {
        return aportacion;
    }

    /**
     * Define el valor de la propiedad aportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjAportacion2 }
     *     
     */
    public void setAportacion(ObjAportacion2 value) {
        this.aportacion = value;
    }

    /**
     * Obtiene el valor de la propiedad estadosAportacion.
     * 
     * @return
     *     possible object is
     *     {@link ColEstadosAportacion }
     *     
     */
    public ColEstadosAportacion getEstadosAportacion() {
        return estadosAportacion;
    }

    /**
     * Define el valor de la propiedad estadosAportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ColEstadosAportacion }
     *     
     */
    public void setEstadosAportacion(ColEstadosAportacion value) {
        this.estadosAportacion = value;
    }

}
