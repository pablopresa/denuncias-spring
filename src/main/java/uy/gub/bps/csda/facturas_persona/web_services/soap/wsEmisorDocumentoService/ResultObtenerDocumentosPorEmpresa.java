
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultObtenerDocumentosPorEmpresa", namespace = "http://bps.gub.uy/recaudacion/facturacion/v003/datatypes/generaciondocumento", propOrder = {
        "documentosPorEmpresa",
        "erroresNegocio"
})
@ToString
@Getter
@Setter
public class ResultObtenerDocumentosPorEmpresa {

    protected Documento documentosPorEmpresa;
    @XmlElement(nillable = true)
    protected List<ErrorNegocioSeveridad> erroresNegocio;

    public List<ErrorNegocioSeveridad> getErroresNegocio() {
        if (erroresNegocio == null) {
            erroresNegocio = new ArrayList<>();
        }
        return this.erroresNegocio;
    }
}
