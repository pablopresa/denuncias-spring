package uy.gub.bps.csda.facturas_persona.dto;

import jakarta.activation.DataHandler;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uy.gub.bps.csda.facturas_persona.util.Utils;
import uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorConsulta.Documento;
import uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorConsulta.DocumentoDuplicado;
import java.math.BigDecimal;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Factura {
    private Long nroReferencia;
    private String tipoFactura;
    private String tipoDocumento;
    private String documento;
    private LocalDate fechaVencimiento;
    private Integer mesCargoDesde;
    private Integer mesCargoHasta;
    private BigDecimal importeTotal;

    public Factura(DocumentoDuplicado documentoDuplicado, Boolean devolverBase64) {
        Documento doc = documentoDuplicado.getDocumento();
        DataHandler archivo = documentoDuplicado.getArchivo();
        this.fechaVencimiento = Utils.toLocalDate(doc.getFechaVencimientoDoc());
        this.importeTotal = doc.getImporteTotal();
        this.mesCargoDesde = doc.getMesCargoDesde();
        this.mesCargoHasta = doc.getMesCargoHasta();
        this.nroReferencia = doc.getNroReferencia();
        this.tipoDocumento = doc.getTipoDocumento();
        this.tipoFactura = doc.getTipoFactura();
        this.documento = Boolean.TRUE.equals(devolverBase64)? Utils.convertToBase64(archivo) : "ARCHIVO EXISTENTE NO MOSTRADO";
    }
}