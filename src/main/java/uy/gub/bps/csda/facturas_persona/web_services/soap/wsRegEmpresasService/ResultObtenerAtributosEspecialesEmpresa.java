
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultObtenerAtributosEspecialesEmpresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultObtenerAtributosEspecialesEmpresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contribuyentesAportacionesAE" type="{http://bps.gub.uy/atyr/registro/empresas/v001/datatypes}ObjContribuyenteAportacionAE" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="erroresNegocio" type="{http://bps.gub.uy/v002/datatypes}ErrorNegocio" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="valido" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultObtenerAtributosEspecialesEmpresa", namespace = "http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes", propOrder = {
    "contribuyentesAportacionesAE",
    "erroresNegocio",
    "valido"
})
public class ResultObtenerAtributosEspecialesEmpresa {

    @XmlElement(nillable = true)
    protected List<ObjContribuyenteAportacionAE> contribuyentesAportacionesAE;
    @XmlElement(nillable = true)
    protected List<ErrorNegocio> erroresNegocio;
    protected Integer valido;

    /**
     * Gets the value of the contribuyentesAportacionesAE property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the contribuyentesAportacionesAE property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContribuyentesAportacionesAE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ObjContribuyenteAportacionAE }
     * 
     * 
     */
    public List<ObjContribuyenteAportacionAE> getContribuyentesAportacionesAE() {
        if (contribuyentesAportacionesAE == null) {
            contribuyentesAportacionesAE = new ArrayList<ObjContribuyenteAportacionAE>();
        }
        return this.contribuyentesAportacionesAE;
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

    /**
     * Obtiene el valor de la propiedad valido.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getValido() {
        return valido;
    }

    /**
     * Define el valor de la propiedad valido.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setValido(Integer value) {
        this.valido = value;
    }

}
