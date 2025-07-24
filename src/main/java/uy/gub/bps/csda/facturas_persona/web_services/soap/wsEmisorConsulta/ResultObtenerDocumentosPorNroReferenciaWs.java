
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorConsulta;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultObtenerDocumentosPorNroReferenciaWs", propOrder = {
        "erroresNegocio",
        "listaResultadoDatosDocumento"
})
@Getter
@Setter
@ToString
public class ResultObtenerDocumentosPorNroReferenciaWs {
    @XmlElement(nillable = true)
    protected List<ErrorNegocio> erroresNegocio;
    @XmlElement(nillable = true)
    protected List<DatosDocumento> listaResultadoDatosDocumento;
}
