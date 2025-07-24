
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import jakarta.xml.bind.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacturaPorEmpresa", namespace = "http://bps.gub.uy/recaudacion/facturacion/v003/datatypes/generaciondocumento", propOrder = {
    "codigoAportacion",
    "descripcionAportacion",
    "erroresNegocio",
    "fechaVencimientoPago",
    "importeTotal",
    "mesCargoDesde",
    "mesCargoHasta",
    "nroReferencia",
    "tipoFactura"
})
@Getter
@Setter
@ToString
public class FacturaPorEmpresa {
    protected int codigoAportacion;
    protected String descripcionAportacion;
    @XmlElement(nillable = true)
    protected List<ErrorNegocioSeveridad> erroresNegocio;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaVencimientoPago;
    protected Double importeTotal;
    protected Integer mesCargoDesde;
    protected Integer mesCargoHasta;
    protected Long nroReferencia;
    @XmlSchemaType(name = "string")
    protected TipoFact tipoFactura;
}
