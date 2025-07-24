
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "objGenericCodeInt", propOrder = {
    "codigo",
    "descripcion",
    "vigente"
})
@Getter
@Setter
@ToString
public class ObjGenericCodeInt {
    protected Integer codigo;
    protected String descripcion;
    protected String vigente;
}
