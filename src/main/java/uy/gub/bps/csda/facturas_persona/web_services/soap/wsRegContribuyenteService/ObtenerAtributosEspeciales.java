
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerAtributosEspeciales complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerAtributosEspeciales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerAtributosEspeciales" type="{http://bps.gub.uy/registro/contribuyentes/v003/datatypes}ParamObtenerAtributosEspeciales" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerAtributosEspeciales", namespace = "http://bps.gub.uy/registro/contribuyentes/v003", propOrder = {
    "paramObtenerAtributosEspeciales"
})
public class ObtenerAtributosEspeciales {

    protected ParamObtenerAtributosEspeciales paramObtenerAtributosEspeciales;

    /**
     * Obtiene el valor de la propiedad paramObtenerAtributosEspeciales.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerAtributosEspeciales }
     *     
     */
    public ParamObtenerAtributosEspeciales getParamObtenerAtributosEspeciales() {
        return paramObtenerAtributosEspeciales;
    }

    /**
     * Define el valor de la propiedad paramObtenerAtributosEspeciales.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerAtributosEspeciales }
     *     
     */
    public void setParamObtenerAtributosEspeciales(ParamObtenerAtributosEspeciales value) {
        this.paramObtenerAtributosEspeciales = value;
    }

}
