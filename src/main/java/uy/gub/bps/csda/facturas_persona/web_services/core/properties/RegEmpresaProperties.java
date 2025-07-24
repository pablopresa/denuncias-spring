package uy.gub.bps.csda.facturas_persona.web_services.core.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "webservices.reg-empresa")
@Getter
@Setter
public class RegEmpresaProperties {
    private String url;
    private String wsdl;
    private int timeout;
}
