package uy.gub.bps.csda.facturas_persona.web_services.core.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "webservices.factura-consulta")
@Getter
@Setter
public class EmisorConsultaProperties {
    private String url;
    private String wsdl;
    private int timeout;
}