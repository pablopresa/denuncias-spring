package uy.gub.bps.csda.facturas_persona.web_services.soap.clientes;

import jakarta.xml.ws.BindingProvider;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uy.gub.bps.csda.facturas_persona.web_services.core.ClienteWebServiceBase;
import uy.gub.bps.csda.facturas_persona.web_services.core.properties.EmisorConsultaProperties;
import uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorConsulta.*;

import java.util.List;

@Component
public class ClienteWsEmisorConsulta
        extends ClienteWebServiceBase<WsEmisorConsulta_Service, WsEmisorConsulta>
{

    private static final Logger logger = LogManager.getLogger(ClienteWsEmisorConsulta.class);

    @Autowired
    public ClienteWsEmisorConsulta(EmisorConsultaProperties properties) {
        super(properties.getUrl(), properties.getWsdl(), properties.getTimeout());
    }

    @Override
    protected WsEmisorConsulta_Service crearServicioEspecifico() {
        this.wsService = new WsEmisorConsulta_Service(WSDL_LOCATION, WsEmisorConsulta_Service.SERVICE);
        this.wsClientPort = this.wsService.getWsEmisorConsulta();
        return wsService;
    }

    @Override
    protected void configuracionExtra(BindingProvider bp) {
        // Configuración adicional específica para este cliente
    }

    public ResultObtenerDuplicadoDocumentoWs obtenerDocumentoPorNroReferencia(Long nroReferencia, String nivelDetalle){
        ParamObtenerDuplicadoDocumento param = new ObjectFactory().createParamObtenerDuplicadoDocumento();
        param.setNroReferencia(nroReferencia);
        param.setNivelDetalle(NivelDetalle.fromValue(nivelDetalle));
        try {
            ResultObtenerDuplicadoDocumentoWs response = wsClientPort.obtenerDuplicadoDocumento(param);
            logger.log(Level.INFO, "Respuesta recibida: {}", response);
            return response;
        } catch (Exception e) {
            logger.log(Level.ERROR, "Error llamando a obtenerDocumentosPorNroReferencia", e);
            return new ObjectFactory().createResultObtenerDuplicadoDocumentoWs();
        }
    }

    public boolean obtenerVersion(){
        ResultVersion version = wsClientPort.version();
        logger.log(Level.INFO, "Respuesta recibida: {}", version);
        return version != null;
    }
}
