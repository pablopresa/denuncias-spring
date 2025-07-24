
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorConsulta;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerDocumentosPorNroResumenResponse", namespace = "http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001", propOrder = {
        "resultObtenerDocumentosPorNroResumenWs"
})
@Getter
@Setter
@ToString
public class ObtenerDocumentosPorNroResumenResponse {
    @XmlElement(name = "ResultObtenerDocumentosPorNroResumenWs")
    protected ResultObtenerDocumentosPorNroResumen resultObtenerDocumentosPorNroResumenWs;
}
