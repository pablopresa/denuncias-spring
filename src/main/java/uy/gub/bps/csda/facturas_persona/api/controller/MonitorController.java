package uy.gub.bps.csda.facturas_persona.api.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.AllArgsConstructor;
import uy.gub.bps.csda.facturas_persona.api.response.*;
import uy.gub.bps.csda.facturas_persona.dto.*;
import uy.gub.bps.csda.facturas_persona.service.*;

@AllArgsConstructor
@RestController
@RequestMapping("/v1/monitor")
public class MonitorController {
	
    private final MonitorService service;

    @GetMapping("/health")
    public ApplicationResponse health() {
    	// Metodo de monitoreo
        MonitorDTO monitor = service.getMonitor();
	    return ApplicationResponseFactory.getInstance().buildSuccess(monitor);
        
    }
    
    
    
    
    
         
}