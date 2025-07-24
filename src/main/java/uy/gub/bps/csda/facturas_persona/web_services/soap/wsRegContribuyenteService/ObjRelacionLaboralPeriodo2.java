
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjRelacionLaboralPeriodo", namespace = "http://bps.gub.uy/atyr/registro/rce/v003/datatypes", propOrder = {
    "causalEgreso",
    "periodo",
    "relacionLaboral"
})
@Getter
@Setter
@ToString
public class ObjRelacionLaboralPeriodo2 {
    protected ObjCausal causalEgreso;
    protected ObjPeriodo2 periodo;
    protected ObjRelacionLaboral relacionLaboral;
}