
package uy.gub.bps.csda.facturas_persona.web_services.soap.wsEmisorDocumentoService;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para MetodoDePago.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <pre>
 * &lt;simpleType name="MetodoDePago"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="RC"/&gt;
 *     &lt;enumeration value="RP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MetodoDePago", namespace = "http://bps.gub.uy/recaudacion/facturacion/v001/datatypes")
@XmlEnum
public enum MetodoDePago {

    RC,
    RP;

    public String value() {
        return name();
    }

    public static MetodoDePago fromValue(String v) {
        return valueOf(v);
    }

}
