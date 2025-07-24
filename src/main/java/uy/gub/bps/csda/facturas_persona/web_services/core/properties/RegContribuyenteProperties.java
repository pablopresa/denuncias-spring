package uy.gub.bps.csda.facturas_persona.web_services.core.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "webservices.reg-contribuyente")
@Getter
@Setter
public class RegContribuyenteProperties {
    private String url;
    private String wsdl;
    private int timeout;
}