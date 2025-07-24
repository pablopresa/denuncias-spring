
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerDocumentosPorEmpresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerDocumentosPorEmpresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paramObtenerDocumentosPorEmpresa" type="{http://bps.gub.uy/recaudacion/facturacion/v003/datatypes/generaciondocumento}ParamObtenerDocumentosPorEmpresa" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerDocumentosPorEmpresa", propOrder = {
    "paramObtenerDocumentosPorEmpresa"
})
public class ObtenerDocumentosPorEmpresa {

    protected ParamObtenerDocumentosPorEmpresa paramObtenerDocumentosPorEmpresa;

    /**
     * Obtiene el valor de la propiedad paramObtenerDocumentosPorEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerDocumentosPorEmpresa }
     *     
     */
    public ParamObtenerDocumentosPorEmpresa getParamObtenerDocumentosPorEmpresa() {
        return paramObtenerDocumentosPorEmpresa;
    }

    /**
     * Define el valor de la propiedad paramObtenerDocumentosPorEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerDocumentosPorEmpresa }
     *     
     */
    public void setParamObtenerDocumentosPorEmpresa(ParamObtenerDocumentosPorEmpresa value) {
        this.paramObtenerDocumentosPorEmpresa = value;
    }

}
