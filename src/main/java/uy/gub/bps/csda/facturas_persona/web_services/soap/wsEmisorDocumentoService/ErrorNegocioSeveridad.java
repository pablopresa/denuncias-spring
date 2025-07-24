
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorNegocioSeveridad", namespace = "http://bps.gub.uy/recaudacion/facturacion/v001/datatypes", propOrder = {
        "severidad"
})
@Getter
@Setter
public class ErrorNegocioSeveridad extends ErrorNegocio
{
    protected Integer severidad;

    @Override
    public String toString() {
        return "ErrorNegocioSeveridad{" +
                "severidad=" + severidad +
                ", codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}