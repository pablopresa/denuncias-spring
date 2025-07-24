
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerEstadosAportacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerEstadosAportacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerEstadosAportacion" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes}ParamObtenerEstadosAportacion" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerEstadosAportacion", propOrder = {
    "paramObtenerEstadosAportacion"
})
public class ObtenerEstadosAportacion {

    protected ParamObtenerEstadosAportacion paramObtenerEstadosAportacion;

    /**
     * Obtiene el valor de la propiedad paramObtenerEstadosAportacion.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerEstadosAportacion }
     *     
     */
    public ParamObtenerEstadosAportacion getParamObtenerEstadosAportacion() {
        return paramObtenerEstadosAportacion;
    }

    /**
     * Define el valor de la propiedad paramObtenerEstadosAportacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerEstadosAportacion }
     *     
     */
    public void setParamObtenerEstadosAportacion(ParamObtenerEstadosAportacion value) {
        this.paramObtenerEstadosAportacion = value;
    }

}
