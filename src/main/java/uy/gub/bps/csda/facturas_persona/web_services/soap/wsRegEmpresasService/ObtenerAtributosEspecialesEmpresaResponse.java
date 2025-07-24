
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerAtributosEspecialesEmpresaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerAtributosEspecialesEmpresaResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultObtenerAtributosEspecialesEmpresa" type="{http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes}resultObtenerAtributosEspecialesEmpresa" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerAtributosEspecialesEmpresaResponse", propOrder = {
    "resultObtenerAtributosEspecialesEmpresa"
})
public class ObtenerAtributosEspecialesEmpresaResponse {

    protected ResultObtenerAtributosEspecialesEmpresa resultObtenerAtributosEspecialesEmpresa;

    /**
     * Obtiene el valor de la propiedad resultObtenerAtributosEspecialesEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link ResultObtenerAtributosEspecialesEmpresa }
     *     
     */
    public ResultObtenerAtributosEspecialesEmpresa getResultObtenerAtributosEspecialesEmpresa() {
        return resultObtenerAtributosEspecialesEmpresa;
    }

    /**
     * Define el valor de la propiedad resultObtenerAtributosEspecialesEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultObtenerAtributosEspecialesEmpresa }
     *     
     */
    public void setResultObtenerAtributosEspecialesEmpresa(ResultObtenerAtributosEspecialesEmpresa value) {
        this.resultObtenerAtributosEspecialesEmpresa = value;
    }

}
