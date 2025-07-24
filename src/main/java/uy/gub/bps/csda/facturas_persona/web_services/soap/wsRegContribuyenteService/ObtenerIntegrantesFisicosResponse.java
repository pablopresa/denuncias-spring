
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerIntegrantesFisicosResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerIntegrantesFisicosResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResultObtenerIntegrantesFisicos" type="{http://bps.gub.uy/atyr/registro/contribuyentes/v002/datatypes}ResultObtenerIntegrantesFisicos" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerIntegrantesFisicosResponse", namespace = "http://bps.gub.uy/registro/contribuyentes/v003", propOrder = {
    "resultObtenerIntegrantesFisicos"
})
public class ObtenerIntegrantesFisicosResponse {

    @XmlElement(name = "ResultObtenerIntegrantesFisicos")
    protected ResultObtenerIntegrantesFisicos resultObtenerIntegrantesFisicos;

    /**
     * Obtiene el valor de la propiedad resultObtenerIntegrantesFisicos.
     * 
     * @return
     *     possible object is
     *     {@link ResultObtenerIntegrantesFisicos }
     *     
     */
    public ResultObtenerIntegrantesFisicos getResultObtenerIntegrantesFisicos() {
        return resultObtenerIntegrantesFisicos;
    }

    /**
     * Define el valor de la propiedad resultObtenerIntegrantesFisicos.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObtenerIntegrantesFisicos }
     *     
     */
    public void setResultObtenerIntegrantesFisicos(ResultObtenerIntegrantesFisicos value) {
        this.resultObtenerIntegrantesFisicos = value;
    }

}
