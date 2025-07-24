
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerNaturalezasJuridicasResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerNaturalezasJuridicasResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultObtenerNaturalezasJuridicas" type="{http://bps.gub.uy/registro/contribuyentes/v003/datatypes}ResultObtenerNaturalezasJuridicas" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerNaturalezasJuridicasResponse", namespace = "http://bps.gub.uy/registro/contribuyentes/v003", propOrder = {
    "resultObtenerNaturalezasJuridicas"
})
public class ObtenerNaturalezasJuridicasResponse {

    protected ResultObtenerNaturalezasJuridicas resultObtenerNaturalezasJuridicas;

    /**
     * Obtiene el valor de la propiedad resultObtenerNaturalezasJuridicas.
     * 
     * @return
     *     possible object is
     *     {@link ResultObtenerNaturalezasJuridicas }
     *     
     */
    public ResultObtenerNaturalezasJuridicas getResultObtenerNaturalezasJuridicas() {
        return resultObtenerNaturalezasJuridicas;
    }

    /**
     * Define el valor de la propiedad resultObtenerNaturalezasJuridicas.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObtenerNaturalezasJuridicas }
     *     
     */
    public void setResultObtenerNaturalezasJuridicas(ResultObtenerNaturalezasJuridicas value) {
        this.resultObtenerNaturalezasJuridicas = value;
    }

}
