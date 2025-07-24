
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjRelacionEmpContr", namespace = "http://bps.gub.uy/atyr/registro/rce/v004/datatypes", propOrder = {
    "causalDesde",
    "causalHasta",
    "codEstadoAnulado",
    "periodo"
})
@Getter
@Setter
@ToString
public class ObjRelacionEmpContr {
    protected ObjGenericCodeInt causalDesde;
    protected ObjGenericCodeInt causalHasta;
    protected String codEstadoAnulado;
    protected ObjPeriodo periodo;
}