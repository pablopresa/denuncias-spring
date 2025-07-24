
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerListaRelContribuyenteEmpresas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerListaRelContribuyenteEmpresas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerListaRelContribuyenteEmpresas" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes}paramObtenerListaRelContribuyenteEmpresas" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerListaRelContribuyenteEmpresas", propOrder = {
    "paramObtenerListaRelContribuyenteEmpresas"
})
public class ObtenerListaRelContribuyenteEmpresas {

    protected ParamObtenerListaRelContribuyenteEmpresas paramObtenerListaRelContribuyenteEmpresas;

    /**
     * Obtiene el valor de la propiedad paramObtenerListaRelContribuyenteEmpresas.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerListaRelContribuyenteEmpresas }
     *     
     */
    public ParamObtenerListaRelContribuyenteEmpresas getParamObtenerListaRelContribuyenteEmpresas() {
        return paramObtenerListaRelContribuyenteEmpresas;
    }

    /**
     * Define el valor de la propiedad paramObtenerListaRelContribuyenteEmpresas.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerListaRelContribuyenteEmpresas }
     *     
     */
    public void setParamObtenerListaRelContribuyenteEmpresas(ParamObtenerListaRelContribuyenteEmpresas value) {
        this.paramObtenerListaRelContribuyenteEmpresas = value;
    }

}
