
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerContribuyenteVigenteResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerContribuyenteVigenteResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultObtenerContribuyenteVigente" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes}ResultObtenerContribuyenteVigente" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerContribuyenteVigenteResponse", propOrder = {
    "resultObtenerContribuyenteVigente"
})
public class ObtenerContribuyenteVigenteResponse {

    protected ResultObtenerContribuyenteVigente resultObtenerContribuyenteVigente;

    /**
     * Obtiene el valor de la propiedad resultObtenerContribuyenteVigente.
     * 
     * @return
     *     possible object is
     *     {@link ResultObtenerContribuyenteVigente }
     *     
     */
    public ResultObtenerContribuyenteVigente getResultObtenerContribuyenteVigente() {
        return resultObtenerContribuyenteVigente;
    }

    /**
     * Define el valor de la propiedad resultObtenerContribuyenteVigente.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObtenerContribuyenteVigente }
     *     
     */
    public void setResultObtenerContribuyenteVigente(ResultObtenerContribuyenteVigente value) {
        this.resultObtenerContribuyenteVigente = value;
    }

}
