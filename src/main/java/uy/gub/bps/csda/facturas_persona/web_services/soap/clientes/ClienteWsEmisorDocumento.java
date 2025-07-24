package uy.gub.bps.csda.facturas_persona.web_services.soap.clientes;

import jakarta.xml.ws.BindingProvider;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uy.gub.bps.csda.facturas_persona.web_services.core.ClienteWebServiceBase;
import uy.gub.bps.csda.facturas_persona.web_services.core.properties.EmisorDocumentoProperties;
import uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService.*;

@Component
public class ClienteWsEmisorDocumento
        extends ClienteWebServiceBase<WsEmisorDocumentoService_Service, WsEmisorDocumentoService>
{

    private static final Logger logger = LogManager.getLogger(ClienteWsEmisorDocumento.class);

    @Autowired
    public ClienteWsEmisorDocumento(EmisorDocumentoProperties properties) {
        super(properties.getUrl(), properties.getWsdl(), properties.getTimeout());
    }

    @Override
    protected WsEmisorDocumentoService_Service crearServicioEspecifico() {
        this.wsService = new WsEmisorDocumentoService_Service(WSDL_LOCATION, WsEmisorDocumentoService_Service.SERVICE);
        this.wsClientPort = this.wsService.getWsEmisorDocumento();
        return wsService;
    }

    @Override
    protected void configuracionExtra(BindingProvider bp) {
        // Configuración adicional específica para este cliente
    }

    public ResultObtenerDocumentosPorEmpresa obtenerDocumentosPorEmpresa(String nroEmpresa, String usuario) {
        final String nombreMetodo = "obtenerDocumentosPorEmpresa";
        logger.log(Level.INFO, "Llamando a metodo: {}", nombreMetodo);

        // Crear el objeto de parámetros
        ParamObtenerDocumentosPorEmpresa param = new ObjectFactory().createParamObtenerDocumentosPorEmpresa();
        param.setNumeroEmpresa(nroEmpresa);
        param.setUsuario(usuario);

        try {
            ResultObtenerDocumentosPorEmpresa response = wsClientPort.obtenerDocumentosPorEmpresa(param);
            logger.log(Level.INFO, "Respuesta recibida: {}", response);
            return response;
        } catch (Exception e) {
            logger.log(Level.ERROR, "Error llamando a obtenerDocumentosPorEmpresa", e);
            return new ObjectFactory().createResultObtenerDocumentosPorEmpresa();
        }
    }

    public boolean obtenerVersion(){
        ResultObtenerDocumentosPorEmpresa docsPorEmpresa = obtenerDocumentosPorEmpresa("-1", "FACTURASPERSONA_MONITOR");
        logger.log(Level.INFO, "Respuesta recibida: {}", docsPorEmpresa);
        return docsPorEmpresa != null
                && docsPorEmpresa.getErroresNegocio() != null
                && !docsPorEmpresa.getErroresNegocio().isEmpty();
    }
}
