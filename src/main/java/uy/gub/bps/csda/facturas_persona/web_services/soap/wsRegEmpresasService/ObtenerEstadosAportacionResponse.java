
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerEstadosAportacionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerEstadosAportacionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultObtenerEstadosAportacion" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes}ResultObtenerEstadosAportacion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerEstadosAportacionResponse", propOrder = {
    "resultObtenerEstadosAportacion"
})
public class ObtenerEstadosAportacionResponse {

    protected ResultObtenerEstadosAportacion resultObtenerEstadosAportacion;

    /**
     * Obtiene el valor de la propiedad resultObtenerEstadosAportacion.
     * 
     * @return
     *     possible object is
     *     {@link ResultObtenerEstadosAportacion }
     *     
     */
    public ResultObtenerEstadosAportacion getResultObtenerEstadosAportacion() {
        return resultObtenerEstadosAportacion;
    }

    /**
     * Define el valor de la propiedad resultObtenerEstadosAportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObtenerEstadosAportacion }
     *     
     */
    public void setResultObtenerEstadosAportacion(ResultObtenerEstadosAportacion value) {
        this.resultObtenerEstadosAportacion = value;
    }

}
