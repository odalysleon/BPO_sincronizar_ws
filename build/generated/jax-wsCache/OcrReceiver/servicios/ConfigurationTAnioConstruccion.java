
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration.t_AnioConstruccion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_AnioConstruccion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoInformado"/>
 *     &lt;enumeration value="Antes1981"/>
 *     &lt;enumeration value="De1981a1999"/>
 *     &lt;enumeration value="De1999a2003"/>
 *     &lt;enumeration value="De2003a2008"/>
 *     &lt;enumeration value="De2009a2013"/>
 *     &lt;enumeration value="Despues2013"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_AnioConstruccion")
@XmlEnum
public enum ConfigurationTAnioConstruccion {

    @XmlEnumValue("NoInformado")
    NO_INFORMADO("NoInformado"),
    @XmlEnumValue("Antes1981")
    ANTES_1981("Antes1981"),
    @XmlEnumValue("De1981a1999")
    DE_1981_A_1999("De1981a1999"),
    @XmlEnumValue("De1999a2003")
    DE_1999_A_2003("De1999a2003"),
    @XmlEnumValue("De2003a2008")
    DE_2003_A_2008("De2003a2008"),
    @XmlEnumValue("De2009a2013")
    DE_2009_A_2013("De2009a2013"),
    @XmlEnumValue("Despues2013")
    DESPUES_2013("Despues2013");
    private final String value;

    ConfigurationTAnioConstruccion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTAnioConstruccion fromValue(String v) {
        for (ConfigurationTAnioConstruccion c: ConfigurationTAnioConstruccion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
