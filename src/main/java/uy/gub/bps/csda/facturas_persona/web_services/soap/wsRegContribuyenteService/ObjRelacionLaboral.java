
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjRelacionLaboral", namespace = "http://bps.gub.uy/atyr/registro/rce/v002/datatypes", propOrder = {
    "codRelacionLaboral",
    "descRelacionLaboral",
    "vigente"
})
@Getter
@Setter
@ToString
public class ObjRelacionLaboral {
    protected Integer codRelacionLaboral;
    protected String descRelacionLaboral;
    protected String vigente;
}
