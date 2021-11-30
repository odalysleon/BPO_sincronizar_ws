
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration.t_TipoParticipacion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_TipoParticipacion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SujetoPasivo"/>
 *     &lt;enumeration value="Titular"/>
 *     &lt;enumeration value="Vendedor"/>
 *     &lt;enumeration value="Avalista"/>
 *     &lt;enumeration value="Otros"/>
 *     &lt;enumeration value="Demandante"/>
 *     &lt;enumeration value="Demandado"/>
 *     &lt;enumeration value="PersonaContacto"/>
 *     &lt;enumeration value="HipotecanteNoDeudor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_TipoParticipacion")
@XmlEnum
public enum ConfigurationTTipoParticipacion {

    @XmlEnumValue("SujetoPasivo")
    SUJETO_PASIVO("SujetoPasivo"),
    @XmlEnumValue("Titular")
    TITULAR("Titular"),
    @XmlEnumValue("Vendedor")
    VENDEDOR("Vendedor"),
    @XmlEnumValue("Avalista")
    AVALISTA("Avalista"),
    @XmlEnumValue("Otros")
    OTROS("Otros"),
    @XmlEnumValue("Demandante")
    DEMANDANTE("Demandante"),
    @XmlEnumValue("Demandado")
    DEMANDADO("Demandado"),
    @XmlEnumValue("PersonaContacto")
    PERSONA_CONTACTO("PersonaContacto"),
    @XmlEnumValue("HipotecanteNoDeudor")
    HIPOTECANTE_NO_DEUDOR("HipotecanteNoDeudor");
    private final String value;

    ConfigurationTTipoParticipacion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTTipoParticipacion fromValue(String v) {
        for (ConfigurationTTipoParticipacion c: ConfigurationTTipoParticipacion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
