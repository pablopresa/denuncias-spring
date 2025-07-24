package uy.gub.bps.csda.facturas_persona.web_services.soap.clientes;

import jakarta.xml.ws.BindingProvider;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import uy.gub.bps.csda.facturas_persona.dto.Empresa;
import uy.gub.bps.csda.facturas_persona.web_services.core.ClienteWebServiceBase;
import uy.gub.bps.csda.facturas_persona.web_services.core.properties.RegEmpresaProperties;
import uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegEmpresasService.*;

import java.util.List;

@Component
public class ClienteWsRegEmpresa
        extends ClienteWebServiceBase<WsRegEmpresasService, WsRegEmpresaV003>
{

    private static final Logger logger = LogManager.getLogger(ClienteWsRegEmpresa.class);

    public ClienteWsRegEmpresa(String serviceUrl, String wsdl, int timeout) {
        super(serviceUrl, wsdl, timeout);
    }

    @Autowired
    public ClienteWsRegEmpresa(RegEmpresaProperties properties) {
        super(properties.getUrl(), properties.getWsdl(), properties.getTimeout());
    }

    @Override
    protected WsRegEmpresasService crearServicioEspecifico() {
        this.wsService = new WsRegEmpresasService(WSDL_LOCATION, WsRegEmpresasService.SERVICE);
        this.wsClientPort = this.wsService.getWsRegEmpresasV003();
        return wsService;
    }

    @Override
    protected void configuracionExtra(BindingProvider bp) {

    }

    public ResultObtenerListaEstadosAportacion obtenerListaEstadosAportacion(List<Empresa> empresas) {
        final String nombreMetodo = "obtenerListaEstadosAportacion";
        logger.log(Level.INFO, "Llamando a metodo: {}", nombreMetodo);

        // Crear el objeto de parámetros
        ParamObtenerListaEstadosAportacion paramLista = new ObjectFactory().createParamObtenerListaEstadosAportacion();
        for(Empresa e : empresas){
            ParamObtenerEstadosAportacion param = new ObjectFactory().createParamObtenerEstadosAportacion();
            param.setNroEmpresa(e.getNroEmpresa());
            paramLista.getParamsObtenerEstadosAportacion().add(param);
        }
        try {
            logger.log(Level.INFO, "Param: {}", paramLista);
            ResultObtenerListaEstadosAportacion response = wsClientPort.obtenerListaEstadosAportacion(paramLista);
            logger.log(Level.INFO, "Respuesta recibida: {}", response);
            return response;
        } catch (Exception e) {
            logger.log(Level.ERROR, "Error llamando a obtenerListaRelEmpresa", e);
            return new ObjectFactory().createResultObtenerListaEstadosAportacion();
        }
    }

    public boolean obtenerVersion(){
        ResultVersion version = wsClientPort.version();
        logger.log(Level.INFO, "Respuesta recibida: {}", version);
        return version != null;
    }
}
