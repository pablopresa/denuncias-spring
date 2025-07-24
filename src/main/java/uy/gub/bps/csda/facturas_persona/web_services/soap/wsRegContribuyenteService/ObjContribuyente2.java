
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
@XmlType(name = "ObjContribuyente", namespace = "http://bps.gub.uy/atyr/registro/rce/v003/datatypes", propOrder = {
    "claveContribuyente",
    "codEstadoAnulado",
    "denominacion",
    "fechaInicioActividad",
    "nroContribuyente",
    "nroIntContr"
})
@Getter
@Setter
@ToString
public class ObjContribuyente2 {
    protected String claveContribuyente;
    protected String codEstadoAnulado;
    protected ObjDenominacionPeriodo denominacion;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaInicioActividad;
    protected String nroContribuyente;
    protected Integer nroIntContr;
}
