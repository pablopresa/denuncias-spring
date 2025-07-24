
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerListaContribuyente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerListaContribuyente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contribuyentes" type="{http://bps.gub.uy/atyr/registro/rce/v003/datatypes}ObjContribuyente" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="erroresNegocio" type="{http://bps.gub.uy/v001/datatypes}ErrorNegocio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerListaContribuyente", namespace = "http://bps.gub.uy/registro/contribuyentes/v003/datatypes", propOrder = {
    "contribuyentes",
    "erroresNegocio"
})
public class ResultObtenerListaContribuyente {

    @XmlElement(nillable = true)
    protected List<ObjContribuyente2> contribuyentes;
    @XmlElement(nillable = true)
    protected List<ErrorNegocio> erroresNegocio;

    /**
     * Gets the value of the contribuyentes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the contribuyentes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContribuyentes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjContribuyente2 }
     * 
     * 
     */
    public List<ObjContribuyente2> getContribuyentes() {
        if (contribuyentes == null) {
            contribuyentes = new ArrayList<ObjContribuyente2>();
        }
        return this.contribuyentes;
    }

    /**
     * Gets the value of the erroresNegocio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the erroresNegocio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getErroresNegocio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorNegocio }
     * 
     * 
     */
    public List<ErrorNegocio> getErroresNegocio() {
        if (erroresNegocio == null) {
            erroresNegocio = new ArrayList<ErrorNegocio>();
        }
        return this.erroresNegocio;
    }

}
