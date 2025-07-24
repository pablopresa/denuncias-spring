package uy.gub.bps.csda.facturas_persona.biz.repository;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
@AllArgsConstructor
public class DiasHabilesRepository {

    private JdbcTemplate jdbcTemplate;

    public Date obtenerDiaHabilDelMes(Integer cantidad) {
        // SQL para invocar la función CALCHAB
        String sql = String.format("SELECT GRALOWN.CALCHAB(TRUNC(SYSDATE, 'MM') - 1, %s) FROM DUAL", cantidad);

        // Ejecutar la consulta y obtener la fecha
        return jdbcTemplate.queryForObject(sql, Date.class);
    }
}