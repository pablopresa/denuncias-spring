package uy.gub.bps.csda.facturas_persona.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ParamObtenerFacturasPersona {

    private Integer persIdentificador;
    private Integer tipoAportacion;
    private String usuario;
}
