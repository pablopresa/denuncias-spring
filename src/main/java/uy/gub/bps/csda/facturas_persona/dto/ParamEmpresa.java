package uy.gub.bps.csda.facturas_persona.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ParamEmpresa implements Serializable {
    private static final long serialVersionUID = 111L;
    private String numero;
    private String denominacion;
    private Integer nroIntEmp;
//    private List<CodigueraEmpresaAportacion> aportaciones;
    private Integer codGiro;
    private String descGiro;

    @Override
    public String toString() {
        return "ParamEmpresa [numero=" + numero + ", denominacion=" + denominacion + ", nroIntEmp=" + nroIntEmp + "]";
    }
}

