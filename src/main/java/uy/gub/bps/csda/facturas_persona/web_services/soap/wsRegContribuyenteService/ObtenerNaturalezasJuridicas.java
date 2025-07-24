
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerNaturalezasJuridicas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerNaturalezasJuridicas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerNaturalezasJuridicas" type="{http://bps.gub.uy/registro/contribuyentes/v003/datatypes}ParamObtenerNaturalezasJuridicas" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerNaturalezasJuridicas", namespace = "http://bps.gub.uy/registro/contribuyentes/v003", propOrder = {
    "paramObtenerNaturalezasJuridicas"
})
public class ObtenerNaturalezasJuridicas {

    protected ParamObtenerNaturalezasJuridicas paramObtenerNaturalezasJuridicas;

    /**
     * Obtiene el valor de la propiedad paramObtenerNaturalezasJuridicas.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerNaturalezasJuridicas }
     *     
     */
    public ParamObtenerNaturalezasJuridicas getParamObtenerNaturalezasJuridicas() {
        return paramObtenerNaturalezasJuridicas;
    }

    /**
     * Define el valor de la propiedad paramObtenerNaturalezasJuridicas.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerNaturalezasJuridicas }
     *     
     */
    public void setParamObtenerNaturalezasJuridicas(ParamObtenerNaturalezasJuridicas value) {
        this.paramObtenerNaturalezasJuridicas = value;
    }

}
