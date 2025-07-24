package uy.gub.bps.csda.facturas_persona.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ParamContribuyente{

    private String numero;
    private String denominacion;
    private Integer numeroInterno;

    @Override
    public String toString() {
        return "ParamContribuyente [numero=" + numero + ", denominacion=" + denominacion + ", numeroInterno="
                + numeroInterno + "]";
    }
}
