
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration.t_OpcionTributacion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_OpcionTributacion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Individual"/>
 *     &lt;enumeration value="Conjunta"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_OpcionTributacion")
@XmlEnum
public enum ConfigurationTOpcionTributacion {

    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual"),
    @XmlEnumValue("Conjunta")
    CONJUNTA("Conjunta");
    private final String value;

    ConfigurationTOpcionTributacion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTOpcionTributacion fromValue(String v) {
        for (ConfigurationTOpcionTributacion c: ConfigurationTOpcionTributacion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
