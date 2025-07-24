package uy.gub.bps.csda.facturas_persona.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ResultMonitor {
    private Boolean ok;
    private List<String> resultados;
}