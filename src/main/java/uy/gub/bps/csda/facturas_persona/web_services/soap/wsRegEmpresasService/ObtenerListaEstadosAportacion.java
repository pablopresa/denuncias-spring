
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerListaEstadosAportacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerListaEstadosAportacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerListaEstadosAportacion" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes}ParamObtenerListaEstadosAportacion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerListaEstadosAportacion", propOrder = {
    "paramObtenerListaEstadosAportacion"
})
public class ObtenerListaEstadosAportacion {

    protected ParamObtenerListaEstadosAportacion paramObtenerListaEstadosAportacion;

    /**
     * Obtiene el valor de la propiedad paramObtenerListaEstadosAportacion.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerListaEstadosAportacion }
     *     
     */
    public ParamObtenerListaEstadosAportacion getParamObtenerListaEstadosAportacion() {
        return paramObtenerListaEstadosAportacion;
    }

    /**
     * Define el valor de la propiedad paramObtenerListaEstadosAportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerListaEstadosAportacion }
     *     
     */
    public void setParamObtenerListaEstadosAportacion(ParamObtenerListaEstadosAportacion value) {
        this.paramObtenerListaEstadosAportacion = value;
    }

}
