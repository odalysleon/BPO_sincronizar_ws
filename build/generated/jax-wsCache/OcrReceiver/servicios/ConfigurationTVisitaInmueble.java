
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Configuration.t_VisitaInmueble.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_VisitaInmueble">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Si"/>
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="DatoNoDisponible"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_VisitaInmueble")
@XmlEnum
public enum ConfigurationTVisitaInmueble {

    @XmlEnumValue("Si")
    SI("Si"),
    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("DatoNoDisponible")
    DATO_NO_DISPONIBLE("DatoNoDisponible");
    private final String value;

    ConfigurationTVisitaInmueble(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTVisitaInmueble fromValue(String v) {
        for (ConfigurationTVisitaInmueble c: ConfigurationTVisitaInmueble.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
