package uy.gub.bps.csda.facturas_persona.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static String formatearFecha(Date fecha){
        return formatearFecha(fecha, null);
    }

    public static String formatearFecha(Date fecha, String formato) {
        if (fecha == null) {
            throw new IllegalArgumentException("La fecha no puede ser nula");
        }
        if(formato == null){
            formato = "dd/MM/yyyy";
        }
        SimpleDateFormat formatter = new SimpleDateFormat(formato);
        return formatter.format(fecha);
    }
}