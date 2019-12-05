
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Configuration.t_TipoRelacionViviendaHabitual.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_TipoRelacionViviendaHabitual">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Propietario"/>
 *     &lt;enumeration value="Usufructuario"/>
 *     &lt;enumeration value="Arrendatario"/>
 *     &lt;enumeration value="OtraSituacion"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_TipoRelacionViviendaHabitual")
@XmlEnum
public enum ConfigurationTTipoRelacionViviendaHabitual {

    @XmlEnumValue("Propietario")
    PROPIETARIO("Propietario"),
    @XmlEnumValue("Usufructuario")
    USUFRUCTUARIO("Usufructuario"),
    @XmlEnumValue("Arrendatario")
    ARRENDATARIO("Arrendatario"),
    @XmlEnumValue("OtraSituacion")
    OTRA_SITUACION("OtraSituacion");
    private final String value;

    ConfigurationTTipoRelacionViviendaHabitual(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTTipoRelacionViviendaHabitual fromValue(String v) {
        for (ConfigurationTTipoRelacionViviendaHabitual c: ConfigurationTTipoRelacionViviendaHabitual.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
