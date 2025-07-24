
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjContibuyenteEmpresaSueldoFicto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjContibuyenteEmpresaSueldoFicto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contribuyente" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjContribuyente"/&gt;
 *         &lt;element name="empresa" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjEmpresa"/&gt;
 *         &lt;element name="sueldoFictoPeriodo" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjSueldoFictoPeriodo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjContibuyenteEmpresaSueldoFicto", propOrder = {
    "contribuyente",
    "empresa",
    "sueldoFictoPeriodo"
})
public class ObjContibuyenteEmpresaSueldoFicto {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjContribuyente3 contribuyente;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjEmpresa2 empresa;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjSueldoFictoPeriodo sueldoFictoPeriodo;

    /**
     * Obtiene el valor de la propiedad contribuyente.
     * 
     * @return
     *     possible object is
     *     {@link ObjContribuyente3 }
     *     
     */
    public ObjContribuyente3 getContribuyente() {
        return contribuyente;
    }

    /**
     * Define el valor de la propiedad contribuyente.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjContribuyente3 }
     *     
     */
    public void setContribuyente(ObjContribuyente3 value) {
        this.contribuyente = value;
    }

    /**
     * Obtiene el valor de la propiedad empresa.
     * 
     * @return
     *     possible object is
     *     {@link ObjEmpresa2 }
     *     
     */
    public ObjEmpresa2 getEmpresa() {
        return empresa;
    }

    /**
     * Define el valor de la propiedad empresa.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjEmpresa2 }
     *     
     */
    public void setEmpresa(ObjEmpresa2 value) {
        this.empresa = value;
    }

    /**
     * Obtiene el valor de la propiedad sueldoFictoPeriodo.
     * 
     * @return
     *     possible object is
     *     {@link ObjSueldoFictoPeriodo }
     *     
     */
    public ObjSueldoFictoPeriodo getSueldoFictoPeriodo() {
        return sueldoFictoPeriodo;
    }

    /**
     * Define el valor de la propiedad sueldoFictoPeriodo.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjSueldoFictoPeriodo }
     *     
     */
    public void setSueldoFictoPeriodo(ObjSueldoFictoPeriodo value) {
        this.sueldoFictoPeriodo = value;
    }

}
