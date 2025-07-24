
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsRegContribuyenteService;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CriterioPeriodo.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="CriterioPeriodo"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Completitud"/&gt;
 *     &lt;enumeration value="Solapamiento"/&gt;
 *     &lt;enumeration value="CompletitudMesAnio"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CriterioPeriodo", namespace = "http://bps.gub.uy/registro/contribuyentes/v001/datatypes")
@XmlEnum
public enum CriterioPeriodo {

    @XmlEnumValue("Completitud")
    COMPLETITUD("Completitud"),
    @XmlEnumValue("Solapamiento")
    SOLAPAMIENTO("Solapamiento"),
    @XmlEnumValue("CompletitudMesAnio")
    COMPLETITUD_MES_ANIO("CompletitudMesAnio");
    private final String value;

    CriterioPeriodo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CriterioPeriodo fromValue(String v) {
        for (CriterioPeriodo c: CriterioPeriodo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
