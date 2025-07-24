package uy.gub.bps.csda.facturas_persona.service;

import uy.gub.bps.csda.facturas_persona.dto.Empresa;
import uy.gub.bps.csda.facturas_persona.dto.Error;
import uy.gub.bps.csda.facturas_persona.dto.ResultMonitor;
import uy.gub.bps.csda.facturas_persona.dto.ResultVersion;

import java.util.List;

public interface FacturasPersonaService {

	public ResultMonitor obtenerMonitor();
	public ResultVersion obtenerVersion();
	public List<Empresa> obtenerFacturasPersona(Integer persIdentificador, Integer tipoAportacion, String usuario, List<Error> errores);
}
