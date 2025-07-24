package uy.gub.bps.csda.facturas_persona.core.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import uy.gub.bps.csda.facturas_persona.service.DiasHabilesService;

@Component
@Getter
@Setter
@ConfigurationProperties(prefix = "facturas-persona.mensajes")
public class MensajesProperties {

    @Autowired
    private DiasHabilesService diasHabilesService;

    private String mensajeErrorDocumentosPorEmpresa101;
    private String mensajeErrorDocumentosPorEmpresa1021;
    private String mensajeErrorDocumentosPorEmpresa1022;
    private String mensajeErrorDocumentosPorEmpresa106;
    private String mensajeErrorDocumentosPorEmpresa107;
    private String mensajeErrorDocumentosPorEmpresa999;
    private String mensajeErrorValidacion1;
    private String mensajeErrorValidacion2;
    private String mensajeErrorValidacion3;
    private String mensajeErrorValidacion4;
    private String mensajeErrorValidacion5;

    public String obtenerMensajeError(Integer codigo){

        if(codigo.equals(102)){
            if(diasHabilesService.duranteODespuesDelDiaHabil()){
                codigo = 1022;
            }
            else{
                codigo = 1021;
            }
        }

        return switch (codigo) {
            case 1 -> mensajeErrorValidacion1;
            case 2 -> mensajeErrorValidacion2;
            case 3 -> mensajeErrorValidacion3;
            case 4 -> mensajeErrorValidacion4;
            case 5 -> mensajeErrorValidacion5;
            case 101 -> mensajeErrorDocumentosPorEmpresa101;
            case 1021 -> mensajeErrorDocumentosPorEmpresa1021;
            case 1022 -> mensajeErrorDocumentosPorEmpresa1022;
            case 106 -> mensajeErrorDocumentosPorEmpresa106;
            case 107 -> mensajeErrorDocumentosPorEmpresa107;
            default -> mensajeErrorDocumentosPorEmpresa999;
        };
    }
}