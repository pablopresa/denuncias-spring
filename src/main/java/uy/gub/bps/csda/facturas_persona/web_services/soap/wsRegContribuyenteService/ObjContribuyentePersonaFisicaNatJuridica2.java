
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ObjContribuyentePersonaFisicaNatJuridica complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ObjContribuyentePersonaFisicaNatJuridica"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contribuyente" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjContribuyente"/&gt;
 *         &lt;element name="naturalezasJuridicas" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ColNatJuridicaPeriodo"/&gt;
 *         &lt;element name="personaFisica" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ObjPersonaFisica"/&gt;
 *         &lt;element name="relacionesLaborales" type="{http://bps.gub.uy/atyr/registro/rce/v001/datatypes}ColRelacionLaboralPeriodo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjContribuyentePersonaFisicaNatJuridica", propOrder = {
    "contribuyente",
    "naturalezasJuridicas",
    "personaFisica",
    "relacionesLaborales"
})
public class ObjContribuyentePersonaFisicaNatJuridica2 {

    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjContribuyente3 contribuyente;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ColNatJuridicaPeriodo naturalezasJuridicas;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ObjPersonaFisica2 personaFisica;
    @XmlElement(namespace = "http://bps.gub.uy/atyr/registro/rce/v001/datatypes", required = true, nillable = true)
    protected ColRelacionLaboralPeriodo relacionesLaborales;

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
     * Obtiene el valor de la propiedad naturalezasJuridicas.
     * 
     * @return
     *     possible object is
     *     {@link ColNatJuridicaPeriodo }
     *     
     */
    public ColNatJuridicaPeriodo getNaturalezasJuridicas() {
        return naturalezasJuridicas;
    }

    /**
     * Define el valor de la propiedad naturalezasJuridicas.
     * 
     * @param value
     *     allowed object is
     *     {@link ColNatJuridicaPeriodo }
     *     
     */
    public void setNaturalezasJuridicas(ColNatJuridicaPeriodo value) {
        this.naturalezasJuridicas = value;
    }

    /**
     * Obtiene el valor de la propiedad personaFisica.
     * 
     * @return
     *     possible object is
     *     {@link ObjPersonaFisica2 }
     *     
     */
    public ObjPersonaFisica2 getPersonaFisica() {
        return personaFisica;
    }

    /**
     * Define el valor de la propiedad personaFisica.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjPersonaFisica2 }
     *     
     */
    public void setPersonaFisica(ObjPersonaFisica2 value) {
        this.personaFisica = value;
    }

    /**
     * Obtiene el valor de la propiedad relacionesLaborales.
     * 
     * @return
     *     possible object is
     *     {@link ColRelacionLaboralPeriodo }
     *     
     */
    public ColRelacionLaboralPeriodo getRelacionesLaborales() {
        return relacionesLaborales;
    }

    /**
     * Define el valor de la propiedad relacionesLaborales.
     * 
     * @param value
     *     allowed object is
     *     {@link ColRelacionLaboralPeriodo }
     *     
     */
    public void setRelacionesLaborales(ColRelacionLaboralPeriodo value) {
        this.relacionesLaborales = value;
    }

}
