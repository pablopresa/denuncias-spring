
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="contribuyente" type="{http://bps.gub.uy/atyr/registro/rce/v003/datatypes}ObjContribuyente" minOccurs="0"/&gt;
 *         &lt;element name="domicilioConstituido" type="{http://bps.gub.uy/atyr/registro/rce/v003/datatypes}ObjDomicilioPeriodo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjDatosContribuyente", namespace = "http://bps.gub.uy/atyr/registro/rce/v003/datatypes", propOrder = {
    "contribuyente",
    "domicilioConstituido"
})
public class ObjDatosContribuyente {

    protected ObjContribuyente2 contribuyente;
    protected ObjDomicilioPeriodo domicilioConstituido;

    /**
     * Obtiene el valor de la propiedad contribuyente.
     * 
     * @return
     *     possible object is
     *     {@link ObjContribuyente2 }
     *     
     */
    public ObjContribuyente2 getContribuyente() {
        return contribuyente;
    }

    /**
     * Define el valor de la propiedad contribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjContribuyente2 }
     *     
     */
    public void setContribuyente(ObjContribuyente2 value) {
        this.contribuyente = value;
    }

    /**
     * Obtiene el valor de la propiedad domicilioConstituido.
     * 
     * @return
     *     possible object is
     *     {@link ObjDomicilioPeriodo }
     *     
     */
    public ObjDomicilioPeriodo getDomicilioConstituido() {
        return domicilioConstituido;
    }

    /**
     * Define el valor de la propiedad domicilioConstituido.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjDomicilioPeriodo }
     *     
     */
    public void setDomicilioConstituido(ObjDomicilioPeriodo value) {
        this.domicilioConstituido = value;
    }

}
