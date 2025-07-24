
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjSueldoFicto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjSueldoFicto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tipoSueldoFicto" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjTipoSueldoFicto"/&gt;
 *         &lt;element name="valor" type="{http://bps.gub.uy/atyr/}Entero"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjSueldoFicto", propOrder = {
    "tipoSueldoFicto",
    "valor"
})
public class ObjSueldoFicto {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjTipoSueldoFicto tipoSueldoFicto;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected Entero valor;

    /**
     * Obtiene el valor de la propiedad tipoSueldoFicto.
     * 
     * @return
     *     possible object is
     *     {@link ObjTipoSueldoFicto }
     *     
     */
    public ObjTipoSueldoFicto getTipoSueldoFicto() {
        return tipoSueldoFicto;
    }

    /**
     * Define el valor de la propiedad tipoSueldoFicto.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjTipoSueldoFicto }
     *     
     */
    public void setTipoSueldoFicto(ObjTipoSueldoFicto value) {
        this.tipoSueldoFicto = value;
    }

    /**
     * Obtiene el valor de la propiedad valor.
     * 
     * @return
     *     possible object is
     *     {@link Entero }
     *     
     */
    public Entero getValor() {
        return valor;
    }

    /**
     * Define el valor de la propiedad valor.
     * 
     * @param value
     *     allowed object is
     *     {@link Entero }
     *     
     */
    public void setValor(Entero value) {
        this.valor = value;
    }

}
