
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorConsulta;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NivelDetalle.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="NivelDetalle"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NIVEL_1"/&gt;
 *     &lt;enumeration value="NIVEL_2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NivelDetalle", namespace = "http://bps.gub.uy/recaudacion/wsEmisorConsultas/v001")
@XmlEnum
public enum NivelDetalle {

    NIVEL_1,
    NIVEL_2;

    public String value() {
        return name();
    }

    public static NivelDetalle fromValue(String v) {
        return valueOf(v);
    }

}
