package uy.gub.bps.csda.facturas_persona.web_services.core;

import jakarta.xml.ws.BindingProvider;
import java.net.MalformedURLException;
import java.net.URL;

public abstract class ClienteWebServiceBase<T, S> {
    protected T wsService;
    protected S wsClientPort;
    protected URL WSDL_LOCATION;
    protected String SERVICE_URL;
    protected int connectionTimeout;
    protected int receiveTimeout;

    public ClienteWebServiceBase(String serviceUrl, String wsdl, int timeout) {
        this.SERVICE_URL = serviceUrl;
        try {
            this.WSDL_LOCATION = new URL(wsdl);
        } catch (MalformedURLException e) {
            throw new RuntimeException("Error al crear la URL del WSDL", e);
        }
        this.connectionTimeout = timeout;
        this.receiveTimeout = timeout;
        crearService();
    }

    protected abstract T crearServicioEspecifico();

    protected void crearService() {
        try {
            wsService = crearServicioEspecifico();
        } catch (Exception e) {
            e.printStackTrace();
            wsService = null;
        }
    }

    protected S crearEndpoint() {
        BindingProvider bp = (BindingProvider) wsClientPort;
        bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, SERVICE_URL);
        bp.getRequestContext().put("javax.xml.ws.client.connectionTimeout", connectionTimeout);
        bp.getRequestContext().put("javax.xml.ws.client.receiveTimeout", receiveTimeout);
        bp.getRequestContext().put("set-jaxb-validation-event-handler", "false");

        configuracionExtra(bp);
        return wsClientPort;
    }

    protected abstract void configuracionExtra(BindingProvider bp);
}