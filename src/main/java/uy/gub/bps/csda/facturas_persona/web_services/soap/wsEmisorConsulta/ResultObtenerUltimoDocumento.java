
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorConsulta;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultObtenerUltimoDocumento", propOrder = {
        "documentoDuplicado",
        "erroresNegocio"
})
@Getter
@Setter
@ToString
public class ResultObtenerUltimoDocumento {

    @XmlElementRef(name = "documentoDuplicado", type = JAXBElement.class, required = false)
    protected JAXBElement<DocumentoDuplicado> documentoDuplicado;
    @XmlElement(nillable = true)
    protected List<ErrorNegocio> erroresNegocio;
}
