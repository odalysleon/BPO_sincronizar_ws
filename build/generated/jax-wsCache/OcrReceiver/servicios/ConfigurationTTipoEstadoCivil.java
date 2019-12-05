
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Configuration.t_TipoEstadoCivil.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_TipoEstadoCivil">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Soltera"/>
 *     &lt;enumeration value="Casada"/>
 *     &lt;enumeration value="Viuda"/>
 *     &lt;enumeration value="Divorciada"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_TipoEstadoCivil")
@XmlEnum
public enum ConfigurationTTipoEstadoCivil {

    @XmlEnumValue("Soltera")
    SOLTERA("Soltera"),
    @XmlEnumValue("Casada")
    CASADA("Casada"),
    @XmlEnumValue("Viuda")
    VIUDA("Viuda"),
    @XmlEnumValue("Divorciada")
    DIVORCIADA("Divorciada");
    private final String value;

    ConfigurationTTipoEstadoCivil(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTTipoEstadoCivil fromValue(String v) {
        for (ConfigurationTTipoEstadoCivil c: ConfigurationTTipoEstadoCivil.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
