
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjDatosContribuyente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjDatosContribuyente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contribuyente" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjContribuyente"/&gt;
 *         &lt;element name="domicilioConstituido" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjDomicilioPeriodo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjDatosContribuyente", propOrder = {
    "contribuyente",
    "domicilioConstituido"
})
public class ObjDatosContribuyente2 {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjContribuyente3 contribuyente;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjDomicilioPeriodo2 domicilioConstituido;

    /**
     * Obtiene el valor de la propiedad contribuyente.
     * 
     * @return
     *     possible object is
     *     {@link ObjContribuyente3 }
     *     
     */
    public ObjContribuyente3 getContribuyente() {
        return contribuyente;
    }

    /**
     * Define el valor de la propiedad contribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjContribuyente3 }
     *     
     */
    public void setContribuyente(ObjContribuyente3 value) {
        this.contribuyente = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilioConstituido.
     * 
     * @return
     *     possible object is
     *     {@link ObjDomicilioPeriodo2 }
     *     
     */
    public ObjDomicilioPeriodo2 getDomicilioConstituido() {
        return domicilioConstituido;
    }

    /**
     * Define el valor de la propiedad domicilioConstituido.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjDomicilioPeriodo2 }
     *     
     */
    public void setDomicilioConstituido(ObjDomicilioPeriodo2 value) {
        this.domicilioConstituido = value;
    }

}
