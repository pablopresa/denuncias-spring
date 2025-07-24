
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultObtenerListaRelEmpresa", namespace = "http://bps.gub.uy/registro/contribuyentes/v003/datatypes", propOrder = {
    "contribuyente",
    "empresas",
    "erroresNegocio"
})
@Getter
@Setter
@ToString
public class ResultObtenerListaRelEmpresa {
    protected ObjContribuyente2 contribuyente;
    @XmlElement(nillable = true)
    protected List<ObjContribuyenteEmpresas> empresas;
    @XmlElement(nillable = true)
    protected List<ErrorNegocio> erroresNegocio;
}
