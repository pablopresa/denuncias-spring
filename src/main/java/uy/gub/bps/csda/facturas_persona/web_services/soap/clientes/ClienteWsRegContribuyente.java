package uy.gub.bps.csda.facturas_persona.web_services.soap.clientes;

import jakarta.xml.ws.BindingProvider;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uy.gub.bps.csda.facturas_persona.web_services.core.ClienteWebServiceBase;
import uy.gub.bps.csda.facturas_persona.web_services.core.properties.RegContribuyenteProperties;
import uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService.*;

@Component
public class ClienteWsRegContribuyente
        extends ClienteWebServiceBase<WsRegContribuyenteService, WsRegContribuyenteV003>
{

    private static final Logger logger = LogManager.getLogger(ClienteWsRegContribuyente.class);

    @Autowired
    public ClienteWsRegContribuyente(RegContribuyenteProperties properties) {
        super(properties.getUrl(), properties.getWsdl(), properties.getTimeout());
    }

    @Override
    protected WsRegContribuyenteService crearServicioEspecifico() {
        this.wsService = new WsRegContribuyenteService(WSDL_LOCATION, WsRegContribuyenteService.SERVICE);
        this.wsClientPort = this.wsService.getWsRegContribuyenteV003();
        return wsService;
    }

    @Override
    protected void configuracionExtra(BindingProvider bp) {
        // Configuración adicional específica para este cliente
    }

    public ResultObtenerListaRelEmpresa obtenerListaRelEmpresa(Integer nroIntContr, Integer filtroAnulada) {
        final String nombreMetodo = "obtenerListaRelEmpresa";
        logger.log(Level.INFO, "Llamando a metodo: {}", nombreMetodo);

        // Crear el objeto de parámetros
        ParamObtenerListaRelEmpresa param = new ObjectFactory().createParamObtenerListaRelEmpresa();
        param.setNroIntContr(nroIntContr);
        param.setFiltroAnulada(filtroAnulada);

        try {
            ResultObtenerListaRelEmpresa response = wsClientPort.obtenerListaRelEmpresa(param);
            logger.log(Level.INFO, "Respuesta recibida: {}", response);
            return response;
        } catch (Exception e) {
            logger.log(Level.ERROR, "Error llamando a obtenerListaRelEmpresa", e);
            return new ObjectFactory().createResultObtenerListaRelEmpresa();
        }
    }

    public ResultObtenerContribuyentesPorPersona obtenerContribuyentesPorPersona(Integer persIdentificador) {
        final String nombreMetodo = "obtenerContribuyentesPorPersona";
        logger.log(Level.INFO, "Llamando a metodo: {}", nombreMetodo);

        // Crear el objeto de parámetros
        ParamObtenerContribuyentesPorPersona param = new ObjectFactory().createParamObtenerContribuyentesPorPersona();
        param.setPersIdentificador(persIdentificador);

        try {
            ResultObtenerContribuyentesPorPersona response = wsClientPort.obtenerContribuyentesPorPersona(param);
            logger.log(Level.INFO, "Respuesta recibida: {}", response);
            return response;
        } catch (Exception e) {
            logger.log(Level.ERROR, "Error llamando a obtenerListaRelEmpresa", e);
            return new ObjectFactory().createResultObtenerContribuyentesPorPersona();
        }
    }

    public boolean obtenerVersion(){
        ResultVersion version = wsClientPort.version();
        logger.log(Level.INFO, "Respuesta recibida: {}", version);
        return version != null;
    }
}

