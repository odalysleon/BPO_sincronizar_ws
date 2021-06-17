
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration.t_tipoTitulosPropiedad.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_tipoTitulosPropiedad">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Adjudicacion"/>
 *     &lt;enumeration value="Aportacion"/>
 *     &lt;enumeration value="CompraVenta"/>
 *     &lt;enumeration value="DacionEnPago"/>
 *     &lt;enumeration value="Donacion"/>
 *     &lt;enumeration value="Herencia"/>
 *     &lt;enumeration value="LiquidacionSociedad"/>
 *     &lt;enumeration value="ObraNueva"/>
 *     &lt;enumeration value="Permuta"/>
 *     &lt;enumeration value="PropiedadDivisionHorizontal"/>
 *     &lt;enumeration value="TransmisionOnerosa"/>
 *     &lt;enumeration value="CompensacionUrbanistica"/>
 *     &lt;enumeration value="Otros"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_tipoTitulosPropiedad")
@XmlEnum
public enum ConfigurationTTipoTitulosPropiedad {

    @XmlEnumValue("Adjudicacion")
    ADJUDICACION("Adjudicacion"),
    @XmlEnumValue("Aportacion")
    APORTACION("Aportacion"),
    @XmlEnumValue("CompraVenta")
    COMPRA_VENTA("CompraVenta"),
    @XmlEnumValue("DacionEnPago")
    DACION_EN_PAGO("DacionEnPago"),
    @XmlEnumValue("Donacion")
    DONACION("Donacion"),
    @XmlEnumValue("Herencia")
    HERENCIA("Herencia"),
    @XmlEnumValue("LiquidacionSociedad")
    LIQUIDACION_SOCIEDAD("LiquidacionSociedad"),
    @XmlEnumValue("ObraNueva")
    OBRA_NUEVA("ObraNueva"),
    @XmlEnumValue("Permuta")
    PERMUTA("Permuta"),
    @XmlEnumValue("PropiedadDivisionHorizontal")
    PROPIEDAD_DIVISION_HORIZONTAL("PropiedadDivisionHorizontal"),
    @XmlEnumValue("TransmisionOnerosa")
    TRANSMISION_ONEROSA("TransmisionOnerosa"),
    @XmlEnumValue("CompensacionUrbanistica")
    COMPENSACION_URBANISTICA("CompensacionUrbanistica"),
    @XmlEnumValue("Otros")
    OTROS("Otros");
    private final String value;

    ConfigurationTTipoTitulosPropiedad(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTTipoTitulosPropiedad fromValue(String v) {
        for (ConfigurationTTipoTitulosPropiedad c: ConfigurationTTipoTitulosPropiedad.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
