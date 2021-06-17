
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration.t_TipoDocumento.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_TipoDocumento">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotaSimple"/>
 *     &lt;enumeration value="IRPF"/>
 *     &lt;enumeration value="VidaLaboral"/>
 *     &lt;enumeration value="Nomina"/>
 *     &lt;enumeration value="Tasacion"/>
 *     &lt;enumeration value="Recibo"/>
 *     &lt;enumeration value="NotaSimpleNodulos"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_TipoDocumento")
@XmlEnum
public enum ConfigurationTTipoDocumento {

    @XmlEnumValue("NotaSimple")
    NOTA_SIMPLE("NotaSimple"),
    IRPF("IRPF"),
    @XmlEnumValue("VidaLaboral")
    VIDA_LABORAL("VidaLaboral"),
    @XmlEnumValue("Nomina")
    NOMINA("Nomina"),
    @XmlEnumValue("Tasacion")
    TASACION("Tasacion"),
    @XmlEnumValue("Recibo")
    RECIBO("Recibo"),
    @XmlEnumValue("NotaSimpleNodulos")
    NOTA_SIMPLE_NODULOS("NotaSimpleNodulos");
    private final String value;

    ConfigurationTTipoDocumento(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTTipoDocumento fromValue(String v) {
        for (ConfigurationTTipoDocumento c: ConfigurationTTipoDocumento.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
