
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
@XmlType(name = "ResultObtenerListaRelContribuyenteEmpresas", namespace = "http://bps.gub.uy/atyr/registro/WsRegEmpresaV003/datatypes", propOrder = {
    "erroresNegocio",
    "resultObtenerListaRelContribuyente"
})
@Getter
@Setter
@ToString
public class ResultObtenerListaRelContribuyenteEmpresas {
    @XmlElement(nillable = true)
    protected List<ErrorNegocio> erroresNegocio;
    @XmlElement(nillable = true)
    protected List<ResultObtenerListaRelContribuyente> resultObtenerListaRelContribuyente;
}