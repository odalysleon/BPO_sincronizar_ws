
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration.t_TipoError.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_TipoError">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Ilegible"/>
 *     &lt;enumeration value="NoCoincideTipologiaDocumental"/>
 *     &lt;enumeration value="DocumentoIncorrecto"/>
 *     &lt;enumeration value="OtrosErrores"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_TipoError")
@XmlEnum
public enum ConfigurationTTipoError {

    @XmlEnumValue("Ilegible")
    ILEGIBLE("Ilegible"),
    @XmlEnumValue("NoCoincideTipologiaDocumental")
    NO_COINCIDE_TIPOLOGIA_DOCUMENTAL("NoCoincideTipologiaDocumental"),
    @XmlEnumValue("DocumentoIncorrecto")
    DOCUMENTO_INCORRECTO("DocumentoIncorrecto"),
    @XmlEnumValue("OtrosErrores")
    OTROS_ERRORES("OtrosErrores");
    private final String value;

    ConfigurationTTipoError(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTTipoError fromValue(String v) {
        for (ConfigurationTTipoError c: ConfigurationTTipoError.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
