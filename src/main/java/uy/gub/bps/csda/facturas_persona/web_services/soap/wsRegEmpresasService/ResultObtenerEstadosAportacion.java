
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultObtenerEstadosAportacion", namespace = "http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes", propOrder = {
    "clave",
    "datosAportacionEmpresa",
    "erroresNegocio"
})
@Getter
@Setter
@ToString
public class ResultObtenerEstadosAportacion {

    protected ParamObtenerEstadosAportacion clave;
    @XmlElement(nillable = true)
    protected List<ObjDatosAportacionEmpresa> datosAportacionEmpresa;
    @XmlElement(nillable = true)
    protected List<ErrorNegocio> erroresNegocio;


}
