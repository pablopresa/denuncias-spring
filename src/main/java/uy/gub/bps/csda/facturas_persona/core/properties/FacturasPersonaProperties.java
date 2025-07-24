package uy.gub.bps.csda.facturas_persona.core.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@ConfigurationProperties(prefix = "facturas-persona.servicio")
public class FacturasPersonaProperties{
    private String nombre;
    private String version;
    private String fechaExpiracion;
    private String versionEstandar;
    private Integer codNatJuridicaUnipersonal;
    private Integer codRelLaboralPatronoUnipersonal;
    private String codAportacionesValidas;
    private Integer filtrarAnuladas;
    private String nivelDetalleDuplicadoDocumento;
    private Integer diaHabilCalchab;
    private Boolean devolverBase64;
}