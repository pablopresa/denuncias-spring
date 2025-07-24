package uy.gub.bps.csda.facturas_persona.util;

import jakarta.activation.DataHandler;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uy.gub.bps.csda.facturas_persona.dto.Error;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Stream;

public class Utils {

    private static final Logger logger = LogManager.getLogger(Utils.class);

    private Utils(){
    }

    public static LocalDate toLocalDate(XMLGregorianCalendar xmlGregorianCalendar) {
        if (xmlGregorianCalendar == null) {
            return null;
        }
        return xmlGregorianCalendar.toGregorianCalendar().toZonedDateTime().toLocalDate();
    }

    public static XMLGregorianCalendar toXMLGregorianCalendar(LocalDate localDate) throws DatatypeConfigurationException {
        if (localDate == null) {
            return null;
        }
        GregorianCalendar gregorianCalendar = GregorianCalendar.from(localDate.atStartOfDay(ZoneId.systemDefault()));
        return DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
    }

    public static Error mapearErrorNegocio(Object errorNegocio) {
        try {
            loguearInfo(errorNegocio.toString());

            Field campoCodigo = errorNegocio.getClass().getDeclaredField("codigo");
            Field campoDescripcion = errorNegocio.getClass().getDeclaredField("descripcion");

            // Hacer accesibles los campos privados
            campoCodigo.setAccessible(true);
            campoDescripcion.setAccessible(true);

            Integer codigo;
            try{
                codigo = (Integer) campoCodigo.get(errorNegocio);
            }
            catch (Exception e){
                String codigoStr = (String) campoCodigo.get(errorNegocio);
                codigo = parseInt(codigoStr);
            }

            String descripcion = (String) campoDescripcion.get(errorNegocio);

            return new Error(codigo, descripcion);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            logger.log(Level.ERROR, "El error que intenta mapear como error de negocio no tiene codigo o descripcion", e);
            return new Error();
        }
    }

    public static Integer parseInt(String num){
        try{
            return Integer.parseInt(num);
        }
        catch(Exception e){
            loguearInfo(String.format("El valor %s no es un número entero", num));
            return null;
        }
    }

    public static List<Integer> obtenerListaInteger(String listaString) {
        if (listaString == null || listaString.isEmpty()) {
            return new ArrayList<>();
        }
        return Stream.of(listaString.split(",")).map(Utils::parseInt).filter(Objects::nonNull).toList();
    }

    public static <T> void loguearErroresNegocio(Logger logger, List<T> erroresNegocio) {
        List<Error> errores = mapearErroresNegocio(erroresNegocio);
        loguearErrores(logger, errores);
    }

    public static <T> List<Error> mapearErroresNegocio(List<T> erroresNegocio) {
        loguearInfo(erroresNegocio.toString());
        return erroresNegocio.stream().map(Utils::mapearErrorNegocio).toList();
    }

    public static void loguearErrores(Logger logger, List<Error> errores){
        for(Error e : errores){
            if(e.getCodigo()!=null && e.getDescripcion()!=null){
                loguearInfo(logger, String.format("%s (Código %s)", e.getDescripcion(), e.getCodigo()));
            }
            else{
                loguearInfo("Error inválido: " + e.toString());
            }
        }
    }

    private static void loguearInfo(String mensaje){
        loguearInfo(logger, mensaje);
    }

    public static void loguearInfo(Logger logger, String mensaje){
        logger.log(Level.INFO, mensaje);
    }

    public static boolean isNullOrEmpty(Object objeto){
        return switch (objeto) {
            case null -> true;
            case Collection<?> collection -> collection.isEmpty();
            case String cadena -> cadena.isBlank();
            case Integer numero -> numero.equals(0);
            default -> false;
        };
    }

    public static String convertToBase64(DataHandler archivo) {
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            InputStream inputStream = archivo.getInputStream();

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            byte[] bytes = outputStream.toByteArray();

            return Base64.getEncoder().encodeToString(bytes);

        } catch (Exception e) {
            logger.log(Level.ERROR, e.getMessage());
            return null;
        }
    }
}
