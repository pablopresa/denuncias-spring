
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultObtenerContribuyentesPorPersona", namespace = "http://bps.gub.uy/registro/contribuyentes/v003/datatypes", propOrder = {
    "contribuyentesPorPersona",
    "erroresNegocio"
})
@Getter
@Setter
public class ResultObtenerContribuyentesPorPersona {
    @XmlElement(nillable = true)
    protected List<ObjContribuyentePersonaFisicaNatJuridica> contribuyentesPorPersona;
    @XmlElement(nillable = true)
    protected List<ErrorNegocio> erroresNegocio;

    @Override
    public String toString() {
        return "ResultObtenerContribuyentesPorPersona{" +
                "contribuyentesPorPersona=" + contribuyentesPorPersona +
                ", erroresNegocio=" + erroresNegocio +
                '}';
    }
}
