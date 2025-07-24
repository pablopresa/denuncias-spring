
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerListaEstadosAportacionResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerListaEstadosAportacionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultObtenerListaEstadosAportacion" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes}ResultObtenerListaEstadosAportacion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerListaEstadosAportacionResponse", propOrder = {
    "resultObtenerListaEstadosAportacion"
})
public class ObtenerListaEstadosAportacionResponse {

    protected ResultObtenerListaEstadosAportacion resultObtenerListaEstadosAportacion;

    /**
     * Obtiene el valor de la propiedad resultObtenerListaEstadosAportacion.
     * 
     * @return
     *     possible object is
     *     {@link ResultObtenerListaEstadosAportacion }
     *     
     */
    public ResultObtenerListaEstadosAportacion getResultObtenerListaEstadosAportacion() {
        return resultObtenerListaEstadosAportacion;
    }

    /**
     * Define el valor de la propiedad resultObtenerListaEstadosAportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObtenerListaEstadosAportacion }
     *     
     */
    public void setResultObtenerListaEstadosAportacion(ResultObtenerListaEstadosAportacion value) {
        this.resultObtenerListaEstadosAportacion = value;
    }

}
