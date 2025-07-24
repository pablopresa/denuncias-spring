
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorNegocio", namespace = "http://bps.gub.uy/v001/datatypes", propOrder = {
    "codigo",
    "descripcion"
})
@XmlSeeAlso({
    ErrorNegocioSeveridad.class
})
@Getter
@Setter
@ToString
public class ErrorNegocio {
    protected String codigo;
    protected String descripcion;
}
