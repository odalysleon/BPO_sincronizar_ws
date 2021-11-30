
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration.t_MetodoValoracionEstadistico.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_MetodoValoracionEstadistico">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ModelosAutomaticosDeValoracion"/>
 *     &lt;enumeration value="ProcedimientoMuestral"/>
 *     &lt;enumeration value="DatoNoDisponible"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_MetodoValoracionEstadistico")
@XmlEnum
public enum ConfigurationTMetodoValoracionEstadistico {

    @XmlEnumValue("ModelosAutomaticosDeValoracion")
    MODELOS_AUTOMATICOS_DE_VALORACION("ModelosAutomaticosDeValoracion"),
    @XmlEnumValue("ProcedimientoMuestral")
    PROCEDIMIENTO_MUESTRAL("ProcedimientoMuestral"),
    @XmlEnumValue("DatoNoDisponible")
    DATO_NO_DISPONIBLE("DatoNoDisponible");
    private final String value;

    ConfigurationTMetodoValoracionEstadistico(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTMetodoValoracionEstadistico fromValue(String v) {
        for (ConfigurationTMetodoValoracionEstadistico c: ConfigurationTMetodoValoracionEstadistico.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
