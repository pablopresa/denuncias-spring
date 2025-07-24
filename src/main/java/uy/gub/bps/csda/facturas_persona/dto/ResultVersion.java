package uy.gub.bps.csda.facturas_persona.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ResultVersion {
    private String versionServicio;
    private String nombreServicio;
    private String fechaExpiracion;
    private String versionEstandar;
}