
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration.t_TipoRegimenSS.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_TipoRegimenSS">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="General"/>
 *     &lt;enumeration value="Autonomos"/>
 *     &lt;enumeration value="Mar"/>
 *     &lt;enumeration value="Carbon"/>
 *     &lt;enumeration value="Hogar"/>
 *     &lt;enumeration value="Gral_RepresentantesComercio"/>
 *     &lt;enumeration value="Gral_SistemasEspecialesFrutasHorrtalizasConservasVegetales"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_TipoRegimenSS")
@XmlEnum
public enum ConfigurationTTipoRegimenSS {

    @XmlEnumValue("General")
    GENERAL("General"),
    @XmlEnumValue("Autonomos")
    AUTONOMOS("Autonomos"),
    @XmlEnumValue("Mar")
    MAR("Mar"),
    @XmlEnumValue("Carbon")
    CARBON("Carbon"),
    @XmlEnumValue("Hogar")
    HOGAR("Hogar"),
    @XmlEnumValue("Gral_RepresentantesComercio")
    GRAL_REPRESENTANTES_COMERCIO("Gral_RepresentantesComercio"),
    @XmlEnumValue("Gral_SistemasEspecialesFrutasHorrtalizasConservasVegetales")
    GRAL_SISTEMAS_ESPECIALES_FRUTAS_HORRTALIZAS_CONSERVAS_VEGETALES("Gral_SistemasEspecialesFrutasHorrtalizasConservasVegetales");
    private final String value;

    ConfigurationTTipoRegimenSS(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTTipoRegimenSS fromValue(String v) {
        for (ConfigurationTTipoRegimenSS c: ConfigurationTTipoRegimenSS.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
