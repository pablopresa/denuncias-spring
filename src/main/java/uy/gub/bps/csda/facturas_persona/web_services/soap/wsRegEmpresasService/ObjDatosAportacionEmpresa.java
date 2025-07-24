
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjDatosAportacionEmpresa", namespace = "http://bps.gub.uy/atyr/registro/rce/v002/datatypes", propOrder = {
    "aportacion",
    "estadosAportacion"
})
@Getter
@Setter
@ToString
public class ObjDatosAportacionEmpresa {
    protected ObjAportacion aportacion;
    @XmlElement(nillable = true)
    protected List<ObjEstadoAportacion> estadosAportacion;
}
