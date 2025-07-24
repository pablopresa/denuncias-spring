
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DocumentoAutogestionado complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DocumentoAutogestionado"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="archivo" type="{http://bps.gub.uy/recaudacion/facturacion/v002/datatypes}Archivo" minOccurs="0"/&gt;
 *         &lt;element name="facturas" type="{http://bps.gub.uy/recaudacion/facturacion/v001/datatypes}Factura" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoAutogestionado", namespace = "http://bps.gub.uy/recaudacion/facturacion/v003/datatypes/generaciondocumento", propOrder = {
    "archivo",
    "facturas"
})
public class DocumentoAutogestionado {

    protected Archivo archivo;
    @XmlElement(nillable = true)
    protected List<Factura> facturas;

    /**
     * Obtiene el valor de la propiedad archivo.
     * 
     * @return
     *     possible object is
     *     {@link Archivo }
     *     
     */
    public Archivo getArchivo() {
        return archivo;
    }

    /**
     * Define el valor de la propiedad archivo.
     * 
     * @param value
     *     allowed object is
     *     {@link Archivo }
     *     
     */
    public void setArchivo(Archivo value) {
        this.archivo = value;
    }

    /**
     * Gets the value of the facturas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the facturas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacturas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Factura }
     * 
     * 
     */
    public List<Factura> getFacturas() {
        if (facturas == null) {
            facturas = new ArrayList<Factura>();
        }
        return this.facturas;
    }

}
