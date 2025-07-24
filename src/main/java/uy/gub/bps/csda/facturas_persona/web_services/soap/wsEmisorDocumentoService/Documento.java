
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Documento", namespace = "http://bps.gub.uy/recaudacion/facturacion/v003/datatypes/generaciondocumento", propOrder = {
    "denominacionEmpresa",
    "facturaPorEmpresa",
    "numeroContribuyente",
    "numeroEmpresa"
})
@Getter
@Setter
@ToString
public class Documento {
    protected String denominacionEmpresa;
    @XmlElement(nillable = true)
    protected List<FacturaPorEmpresa> facturaPorEmpresa;
    protected String numeroContribuyente;
    protected String numeroEmpresa;
}