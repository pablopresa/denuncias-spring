
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerAtributosEspecialesEmpresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerAtributosEspecialesEmpresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerAtributoEspecialEmpresa" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes}paramObtenerAtributoEspecialEmpresa" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerAtributosEspecialesEmpresa", propOrder = {
    "paramObtenerAtributoEspecialEmpresa"
})
public class ObtenerAtributosEspecialesEmpresa {

    protected ParamObtenerAtributoEspecialEmpresa paramObtenerAtributoEspecialEmpresa;

    /**
     * Obtiene el valor de la propiedad paramObtenerAtributoEspecialEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerAtributoEspecialEmpresa }
     *     
     */
    public ParamObtenerAtributoEspecialEmpresa getParamObtenerAtributoEspecialEmpresa() {
        return paramObtenerAtributoEspecialEmpresa;
    }

    /**
     * Define el valor de la propiedad paramObtenerAtributoEspecialEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerAtributoEspecialEmpresa }
     *     
     */
    public void setParamObtenerAtributoEspecialEmpresa(ParamObtenerAtributoEspecialEmpresa value) {
        this.paramObtenerAtributoEspecialEmpresa = value;
    }

}
