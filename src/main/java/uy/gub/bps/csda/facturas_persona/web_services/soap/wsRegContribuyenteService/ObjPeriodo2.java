
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjPeriodo", namespace = "http://bps.gub.uy/atyr/registro/rce/v002/datatypes", propOrder = {
    "fechaDesde",
    "fechaHasta"
})
@Getter
@Setter
@ToString
public class ObjPeriodo2 {
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaDesde;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaHasta;
}