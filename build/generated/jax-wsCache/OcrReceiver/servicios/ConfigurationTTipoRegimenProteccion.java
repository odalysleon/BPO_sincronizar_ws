
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration.t_TipoRegimenProteccion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_TipoRegimenProteccion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoInformado"/>
 *     &lt;enumeration value="VPO"/>
 *     &lt;enumeration value="VPOAnt78"/>
 *     &lt;enumeration value="VPOPrivada"/>
 *     &lt;enumeration value="VPOPublica"/>
 *     &lt;enumeration value="VentaLibre"/>
 *     &lt;enumeration value="VPT"/>
 *     &lt;enumeration value="Subvencionada"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_TipoRegimenProteccion")
@XmlEnum
public enum ConfigurationTTipoRegimenProteccion {

    @XmlEnumValue("NoInformado")
    NO_INFORMADO("NoInformado"),
    VPO("VPO"),
    @XmlEnumValue("VPOAnt78")
    VPO_ANT_78("VPOAnt78"),
    @XmlEnumValue("VPOPrivada")
    VPO_PRIVADA("VPOPrivada"),
    @XmlEnumValue("VPOPublica")
    VPO_PUBLICA("VPOPublica"),
    @XmlEnumValue("VentaLibre")
    VENTA_LIBRE("VentaLibre"),
    VPT("VPT"),
    @XmlEnumValue("Subvencionada")
    SUBVENCIONADA("Subvencionada");
    private final String value;

    ConfigurationTTipoRegimenProteccion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTTipoRegimenProteccion fromValue(String v) {
        for (ConfigurationTTipoRegimenProteccion c: ConfigurationTTipoRegimenProteccion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
