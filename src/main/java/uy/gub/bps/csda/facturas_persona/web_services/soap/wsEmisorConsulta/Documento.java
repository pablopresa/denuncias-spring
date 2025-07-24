
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorConsulta;

import java.math.BigDecimal;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Documento", propOrder = {
        "codAportacionContratista",
        "codAportacionTitular",
        "fechaVencimientoDoc",
        "fechaVencimientoIrpf",
        "importeTotal",
        "mesCargoDesde",
        "mesCargoHasta",
        "nroIntContribuyenteContratista",
        "nroIntContribuyenteTitular",
        "nroIntEmpresaContratista",
        "nroIntEmpresaTitular",
        "nroObra",
        "nroReferencia",
        "tipoDocumento",
        "tipoFactura"
})
@Getter
@Setter
@ToString
public class Documento {
    protected Integer codAportacionContratista;
    protected Integer codAportacionTitular;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaVencimientoDoc;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fechaVencimientoIrpf;
    protected BigDecimal importeTotal;
    protected Integer mesCargoDesde;
    protected Integer mesCargoHasta;
    protected Integer nroIntContribuyenteContratista;
    protected Integer nroIntContribuyenteTitular;
    protected Integer nroIntEmpresaContratista;
    protected Integer nroIntEmpresaTitular;
    protected String nroObra;
    protected Long nroReferencia;
    protected String tipoDocumento;
    protected String tipoFactura;
}