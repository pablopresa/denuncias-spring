
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjEmpresaContribuyentes", namespace = "http://bps.gub.uy/atyr/registro/rce/v002/datatypes", propOrder = {
        "objContribuyente",
        "objRelacionEmpContr"
})
@Getter
@Setter
@ToString
public class ObjEmpresaContribuyentes {
    protected ObjContribuyente objContribuyente;
    protected ObjRelacionEmpContr objRelacionEmpContr;
}
