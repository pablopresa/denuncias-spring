
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultVersion", namespace = "http://bps.gub.uy/v002/datatypes", propOrder = {
    "fechaExpiracion",
    "nombreServicio",
    "versionEstandar",
    "versionServicio"
})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ResultVersion {
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaExpiracion;
    protected String nombreServicio;
    protected String versionEstandar;
    protected String versionServicio;
}