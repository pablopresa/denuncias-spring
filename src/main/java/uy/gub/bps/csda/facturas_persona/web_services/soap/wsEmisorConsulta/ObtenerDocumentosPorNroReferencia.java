
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorConsulta;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerDocumentosPorNroReferencia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerDocumentosPorNroReferencia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ParamObtenerDocumentoPorNroReferencia" type="{http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001/datatypes}ParamObtenerDocumentosPorNroReferencia" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerDocumentosPorNroReferencia", namespace = "http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", propOrder = {
    "paramObtenerDocumentoPorNroReferencia"
})
public class ObtenerDocumentosPorNroReferencia {

    @XmlElement(name = "ParamObtenerDocumentoPorNroReferencia")
    protected ParamObtenerDocumentosPorNroReferencia paramObtenerDocumentoPorNroReferencia;

    /**
     * Obtiene el valor de la propiedad paramObtenerDocumentoPorNroReferencia.
     * 
     * @return
     *     possible object is
     *     {@link ParamObtenerDocumentosPorNroReferencia }
     *     
     */
    public ParamObtenerDocumentosPorNroReferencia getParamObtenerDocumentoPorNroReferencia() {
        return paramObtenerDocumentoPorNroReferencia;
    }

    /**
     * Define el valor de la propiedad paramObtenerDocumentoPorNroReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link ParamObtenerDocumentosPorNroReferencia }
     *     
     */
    public void setParamObtenerDocumentoPorNroReferencia(ParamObtenerDocumentosPorNroReferencia value) {
        this.paramObtenerDocumentoPorNroReferencia = value;
    }

}
