
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Configuration.t_FuenteDeDatos.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_FuenteDeDatos">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TransaccionesRecientes"/>
 *     &lt;enumeration value="DatosDeOferta"/>
 *     &lt;enumeration value="DatoNoDisponible"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_FuenteDeDatos")
@XmlEnum
public enum ConfigurationTFuenteDeDatos {

    @XmlEnumValue("TransaccionesRecientes")
    TRANSACCIONES_RECIENTES("TransaccionesRecientes"),
    @XmlEnumValue("DatosDeOferta")
    DATOS_DE_OFERTA("DatosDeOferta"),
    @XmlEnumValue("DatoNoDisponible")
    DATO_NO_DISPONIBLE("DatoNoDisponible");
    private final String value;

    ConfigurationTFuenteDeDatos(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTFuenteDeDatos fromValue(String v) {
        for (ConfigurationTFuenteDeDatos c: ConfigurationTFuenteDeDatos.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
