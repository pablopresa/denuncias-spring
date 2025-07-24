
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorConsulta;

import jakarta.activation.DataHandler;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlMimeType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentoDuplicado", propOrder = {
        "archivo",
        "documento"
})
@Getter
@Setter
public class DocumentoDuplicado {
    @XmlMimeType("application/pdf")
    protected DataHandler archivo;
    protected Documento documento;

    @Override
    public String toString() {
        return "DocumentoDuplicado{archivo=" + ((archivo == null)? "NULO" : "EXISTENTE") + ", documento=" + documento + '}';
    }
}