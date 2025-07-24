
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
@XmlType(name = "ObjEmpresa", namespace = "http://bps.gub.uy/atyr/registro/rce/v003/datatypes", propOrder = {
    "codEstadoAnulada",
    "denominacion",
    "digitoControl",
    "fechaInicioActividad",
    "nroEmpresa",
    "nroIntEmp"
})
@Getter
@Setter
@ToString
public class ObjEmpresa {
    protected String codEstadoAnulada;
    protected ObjDenominacionPeriodo denominacion;
    protected Integer digitoControl;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaInicioActividad;
    protected String nroEmpresa;
    protected Integer nroIntEmp;
}
