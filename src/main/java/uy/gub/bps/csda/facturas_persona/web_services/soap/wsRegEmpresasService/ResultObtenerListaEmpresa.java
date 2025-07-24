
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResultObtenerListaEmpresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResultObtenerListaEmpresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="empresa" type="{http://bps.gub.uy/atyr/registro/rce/v003/datatypes}ObjEmpresa" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="erroresNegocio" type="{http://bps.gub.uy/v002/datatypes}ErrorNegocio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultObtenerListaEmpresa", namespace = "http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes", propOrder = {
    "empresa",
    "erroresNegocio"
})
public class ResultObtenerListaEmpresa {

    @XmlElement(nillable = true)
    protected List<ObjEmpresa> empresa;
    @XmlElement(nillable = true)
    protected List<ErrorNegocio> erroresNegocio;

    /**
     * Gets the value of the empresa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the empresa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmpresa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjEmpresa }
     * 
     * 
     */
    public List<ObjEmpresa> getEmpresa() {
        if (empresa == null) {
            empresa = new ArrayList<ObjEmpresa>();
        }
        return this.empresa;
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
