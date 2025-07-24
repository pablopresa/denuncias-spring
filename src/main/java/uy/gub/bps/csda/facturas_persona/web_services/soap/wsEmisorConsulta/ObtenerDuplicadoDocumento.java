
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorConsulta;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerDuplicadoDocumento complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerDuplicadoDocumento"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParamObtenerDuplicadoDocumento" type="{http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001/datatypes}ParamObtenerDuplicadoDocumento" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerDuplicadoDocumento", namespace = "http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", propOrder = {
    "paramObtenerDuplicadoDocumento"
})
public class ObtenerDuplicadoDocumento {

    @XmlElement(name = "ParamObtenerDuplicadoDocumento")
    protected ParamObtenerDuplicadoDocumento paramObtenerDuplicadoDocumento;

    /**
     * Obtiene el valor de la propiedad paramObtenerDuplicadoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerDuplicadoDocumento }
     *     
     */
    public ParamObtenerDuplicadoDocumento getParamObtenerDuplicadoDocumento() {
        return paramObtenerDuplicadoDocumento;
    }

    /**
     * Define el valor de la propiedad paramObtenerDuplicadoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerDuplicadoDocumento }
     *     
     */
    public void setParamObtenerDuplicadoDocumento(ParamObtenerDuplicadoDocumento value) {
        this.paramObtenerDuplicadoDocumento = value;
    }

}
