
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoEstablecimiento", namespace = "http://bps.gub.uy/atyr/registro/WsRegEmpresaV002/datatypes", propOrder = {
        "codigo",
        "descripcion"
})
@Getter
@Setter
@ToString
public class TipoEstablecimiento {
    protected Integer codigo;
    protected String descripcion;
}
