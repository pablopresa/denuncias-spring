
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjContribuyentePersonaFisicaNatJuridica", namespace = "http://bps.gub.uy/atyr/registro/rce/v003/datatypes", propOrder = {
    "contribuyente",
    "naturalezasJuridicas",
    "personaFisica",
    "relacionesLaborales"
})
@Getter
@Setter
@ToString
public class ObjContribuyentePersonaFisicaNatJuridica {
    protected ObjContribuyente2 contribuyente;
    @XmlElement(nillable = true)
    protected List<ObjNatJuridicaPeriodo> naturalezasJuridicas;
    protected ObjPersonaFisica personaFisica;
    @XmlElement(nillable = true)
    protected List<ObjRelacionLaboralPeriodo2> relacionesLaborales;
}