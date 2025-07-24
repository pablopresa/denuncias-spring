package uy.gub.bps.csda.facturas_persona.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Error {
    private Integer codigo;
    private String descripcion;
}