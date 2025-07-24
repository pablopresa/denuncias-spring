package uy.gub.bps.csda.facturas_persona.service.impl;

import lombok.AllArgsConstructor;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import uy.gub.bps.csda.facturas_persona.biz.repository.DiasHabilesRepository;
import uy.gub.bps.csda.facturas_persona.core.properties.FacturasPersonaProperties;
import uy.gub.bps.csda.facturas_persona.service.DiasHabilesService;
import uy.gub.bps.csda.facturas_persona.util.DateUtils;

import java.util.Date;

@Service
@AllArgsConstructor
public class DiasHabilesServiceImpl implements DiasHabilesService {

    private DiasHabilesRepository diaHabilRepository;
    private FacturasPersonaProperties properties;
    private static final Logger logger = LogManager.getLogger(DiasHabilesServiceImpl.class);

    @Override
    public boolean duranteODespuesDelDiaHabil() {
        Integer numeroDiaHabil = properties.getDiaHabilCalchab();
        return duranteODespuesDelDiaHabil(numeroDiaHabil);
    }

        @Override
    public boolean duranteODespuesDelDiaHabil(Integer dia) {
        // Obtener el día hábil
        Date tercerDiaHabil = diaHabilRepository.obtenerDiaHabilDelMes(dia);
        logger.log(Level.INFO, String.format("Día hábil número %s: %s", dia, DateUtils.formatearFecha(tercerDiaHabil)));
        // Fecha actual
        Date fechaActual = new Date();
        logger.log(Level.INFO, String.format("Fecha actual: %s",  DateUtils.formatearFecha(fechaActual)));
        // Comparar las fechas
        boolean mismoDiaODespues = fechaActual.equals(tercerDiaHabil) || fechaActual.after(tercerDiaHabil);

        logger.log(Level.INFO, (mismoDiaODespues)? "Durante o después del tercer día hábil del mes" : "Antes del tercer día hábil del mes");

        return mismoDiaODespues;
    }
}