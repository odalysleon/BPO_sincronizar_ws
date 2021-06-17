
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration.t_tipoPropiedad.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_tipoPropiedad">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Propietario"/>
 *     &lt;enumeration value="Nudo_propietario"/>
 *     &lt;enumeration value="Usufructuario"/>
 *     &lt;enumeration value="Arrendatario_Ocupante"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_tipoPropiedad")
@XmlEnum
public enum ConfigurationTTipoPropiedad {

    @XmlEnumValue("Propietario")
    PROPIETARIO("Propietario"),
    @XmlEnumValue("Nudo_propietario")
    NUDO_PROPIETARIO("Nudo_propietario"),
    @XmlEnumValue("Usufructuario")
    USUFRUCTUARIO("Usufructuario"),
    @XmlEnumValue("Arrendatario_Ocupante")
    ARRENDATARIO_OCUPANTE("Arrendatario_Ocupante");
    private final String value;

    ConfigurationTTipoPropiedad(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTTipoPropiedad fromValue(String v) {
        for (ConfigurationTTipoPropiedad c: ConfigurationTTipoPropiedad.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
