
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamObtenerEstadosAportacion", namespace = "http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes", propOrder = {
    "fechaDesde",
    "fechaHasta",
    "nroEmpresa",
    "nroIntEmp"
})
@Getter
@Setter
@ToString
public class ParamObtenerEstadosAportacion {
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaDesde;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaHasta;
    protected String nroEmpresa;
    protected Integer nroIntEmp;
}
