
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration.t_TipoEstadoConservacion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_TipoEstadoConservacion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NoInformado"/>
 *     &lt;enumeration value="Nuevo_1Anio"/>
 *     &lt;enumeration value="Seminuevo_5Anios"/>
 *     &lt;enumeration value="Usada_Mas5Anios"/>
 *     &lt;enumeration value="AReformar"/>
 *     &lt;enumeration value="Antigua"/>
 *     &lt;enumeration value="Usada_Mas55Anios"/>
 *     &lt;enumeration value="EnConstruccion"/>
 *     &lt;enumeration value="EnRuinas"/>
 *     &lt;enumeration value="EnProyecto"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_TipoEstadoConservacion")
@XmlEnum
public enum ConfigurationTTipoEstadoConservacion {

    @XmlEnumValue("NoInformado")
    NO_INFORMADO("NoInformado"),
    @XmlEnumValue("Nuevo_1Anio")
    NUEVO_1_ANIO("Nuevo_1Anio"),
    @XmlEnumValue("Seminuevo_5Anios")
    SEMINUEVO_5_ANIOS("Seminuevo_5Anios"),
    @XmlEnumValue("Usada_Mas5Anios")
    USADA_MAS_5_ANIOS("Usada_Mas5Anios"),
    @XmlEnumValue("AReformar")
    A_REFORMAR("AReformar"),
    @XmlEnumValue("Antigua")
    ANTIGUA("Antigua"),
    @XmlEnumValue("Usada_Mas55Anios")
    USADA_MAS_55_ANIOS("Usada_Mas55Anios"),
    @XmlEnumValue("EnConstruccion")
    EN_CONSTRUCCION("EnConstruccion"),
    @XmlEnumValue("EnRuinas")
    EN_RUINAS("EnRuinas"),
    @XmlEnumValue("EnProyecto")
    EN_PROYECTO("EnProyecto");
    private final String value;

    ConfigurationTTipoEstadoConservacion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTTipoEstadoConservacion fromValue(String v) {
        for (ConfigurationTTipoEstadoConservacion c: ConfigurationTTipoEstadoConservacion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
