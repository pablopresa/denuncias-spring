
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorConsulta;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultObtenerDuplicadoDocumentoWs", propOrder = {
        "documentoDuplicado",
        "erroresNegocio"
})
@Getter
@Setter
public class ResultObtenerDuplicadoDocumentoWs {
    @XmlElementRef(name = "documentoDuplicado", type = JAXBElement.class, required = false)
    protected JAXBElement<DocumentoDuplicado> documentoDuplicado;
    @XmlElement(nillable = true)
    protected List<ErrorNegocio> erroresNegocio;

    @Override
    public String toString() {
        return "ResultObtenerDuplicadoDocumentoWs{" +
                "documentoDuplicado=" + ((documentoDuplicado==null)? null : documentoDuplicado.getValue()) +
                ", erroresNegocio=" + erroresNegocio +
                '}';
    }
}