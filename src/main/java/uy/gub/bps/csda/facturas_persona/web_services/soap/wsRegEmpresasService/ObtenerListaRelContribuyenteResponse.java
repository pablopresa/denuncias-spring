
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerListaRelContribuyenteResponse", propOrder = {
    "resultObtenerListaRelContribuyente"
})
@Getter
@Setter
public class ObtenerListaRelContribuyenteResponse {

    protected ResultObtenerListaRelContribuyente resultObtenerListaRelContribuyente;
}
