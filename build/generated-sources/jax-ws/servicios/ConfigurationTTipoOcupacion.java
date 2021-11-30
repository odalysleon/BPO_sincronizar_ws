
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration.t_TipoOcupacion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_TipoOcupacion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SinDatos"/>
 *     &lt;enumeration value="Usufructuario"/>
 *     &lt;enumeration value="Precarista"/>
 *     &lt;enumeration value="Inquilino"/>
 *     &lt;enumeration value="Propietario_Usuario"/>
 *     &lt;enumeration value="Desocupada"/>
 *     &lt;enumeration value="Otros"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_TipoOcupacion")
@XmlEnum
public enum ConfigurationTTipoOcupacion {

    @XmlEnumValue("SinDatos")
    SIN_DATOS("SinDatos"),
    @XmlEnumValue("Usufructuario")
    USUFRUCTUARIO("Usufructuario"),
    @XmlEnumValue("Precarista")
    PRECARISTA("Precarista"),
    @XmlEnumValue("Inquilino")
    INQUILINO("Inquilino"),
    @XmlEnumValue("Propietario_Usuario")
    PROPIETARIO_USUARIO("Propietario_Usuario"),
    @XmlEnumValue("Desocupada")
    DESOCUPADA("Desocupada"),
    @XmlEnumValue("Otros")
    OTROS("Otros");
    private final String value;

    ConfigurationTTipoOcupacion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTTipoOcupacion fromValue(String v) {
        for (ConfigurationTTipoOcupacion c: ConfigurationTTipoOcupacion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
