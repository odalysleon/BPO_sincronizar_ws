
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration.t_TipoRegimenEconomica.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_TipoRegimenEconomica">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Otros"/>
 *     &lt;enumeration value="Gananciales"/>
 *     &lt;enumeration value="SeparacionBienes"/>
 *     &lt;enumeration value="Participacion"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_TipoRegimenEconomica")
@XmlEnum
public enum ConfigurationTTipoRegimenEconomica {

    @XmlEnumValue("Otros")
    OTROS("Otros"),
    @XmlEnumValue("Gananciales")
    GANANCIALES("Gananciales"),
    @XmlEnumValue("SeparacionBienes")
    SEPARACION_BIENES("SeparacionBienes"),
    @XmlEnumValue("Participacion")
    PARTICIPACION("Participacion");
    private final String value;

    ConfigurationTTipoRegimenEconomica(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTTipoRegimenEconomica fromValue(String v) {
        for (ConfigurationTTipoRegimenEconomica c: ConfigurationTTipoRegimenEconomica.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
