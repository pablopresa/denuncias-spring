package uy.gub.bps.csda.facturas_persona.service.impl;

import uy.gub.bps.csda.facturas_persona.service.*;
import uy.gub.bps.csda.facturas_persona.mapper.*;
import org.springframework.stereotype.Service;
import uy.gub.bps.csda.facturas_persona.dto.MonitorDTO;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MonitorServiceImpl implements MonitorService{

	private EntityMapper mapper;

	public MonitorDTO getMonitor() {
		return null;
	}
}