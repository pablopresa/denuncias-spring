
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerContribuyenteVigente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerContribuyenteVigente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerContribuyenteVigente" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes}ParamObtenerContribuyenteVigente" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerContribuyenteVigente", propOrder = {
    "paramObtenerContribuyenteVigente"
})
public class ObtenerContribuyenteVigente {

    protected ParamObtenerContribuyenteVigente paramObtenerContribuyenteVigente;

    /**
     * Obtiene el valor de la propiedad paramObtenerContribuyenteVigente.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerContribuyenteVigente }
     *     
     */
    public ParamObtenerContribuyenteVigente getParamObtenerContribuyenteVigente() {
        return paramObtenerContribuyenteVigente;
    }

    /**
     * Define el valor de la propiedad paramObtenerContribuyenteVigente.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerContribuyenteVigente }
     *     
     */
    public void setParamObtenerContribuyenteVigente(ParamObtenerContribuyenteVigente value) {
        this.paramObtenerContribuyenteVigente = value;
    }

}
