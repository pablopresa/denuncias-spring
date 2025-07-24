package uy.gub.bps.csda.facturas_persona.dto;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Empresa {
    private Integer nroIntEmp;
    private String nroEmpresa;
    private Integer tipoAportacion;
    private String descAportacion;
    private List<Factura> colFacturas;
}