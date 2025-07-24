package uy.gub.bps.csda.facturas_persona.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ResultObtenerFacturasPersona {
    private List<Empresa> colEmpresas;
    private List<Error> colErrores;
}