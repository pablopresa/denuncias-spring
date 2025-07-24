
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjPersonaFisica", namespace = "http://bps.gub.uy/atyr/registro/rce/v003/datatypes", propOrder = {
    "causalEgreso",
    "fechaEgreso",
    "fechaIngreso",
    "persIdentificador"
})
@Getter
@Setter
@ToString
public class ObjPersonaFisica {
    protected ObjCausal causalEgreso;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaEgreso;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaIngreso;
    protected Integer persIdentificador;
}
