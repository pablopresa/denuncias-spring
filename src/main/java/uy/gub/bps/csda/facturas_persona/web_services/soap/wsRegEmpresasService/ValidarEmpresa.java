
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "validarEmpresa", propOrder = {
        "paramValidarEmpresa"
})
@Getter
@Setter
@ToString
public class ValidarEmpresa {
    protected ParamValidarEmpresa paramValidarEmpresa;
}
