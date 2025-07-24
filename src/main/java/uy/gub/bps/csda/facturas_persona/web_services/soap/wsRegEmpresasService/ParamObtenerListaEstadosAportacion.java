
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParamObtenerListaEstadosAportacion", namespace = "http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes", propOrder = {
    "paramsObtenerEstadosAportacion"
})
@ToString
public class ParamObtenerListaEstadosAportacion {

    @XmlElement(nillable = true)
    protected List<ParamObtenerEstadosAportacion> paramsObtenerEstadosAportacion;

    public List<ParamObtenerEstadosAportacion> getParamsObtenerEstadosAportacion() {
        if (paramsObtenerEstadosAportacion == null) {
            paramsObtenerEstadosAportacion = new ArrayList<>();
        }
        return this.paramsObtenerEstadosAportacion;
    }
}
