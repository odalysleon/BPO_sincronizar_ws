
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration.t_MetodoValoracion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_MetodoValoracion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MetodoDelCoste"/>
 *     &lt;enumeration value="MetodoResidual"/>
 *     &lt;enumeration value="MetodoDeComparacion"/>
 *     &lt;enumeration value="ActualizacionDeInmueblesArrendados"/>
 *     &lt;enumeration value="OtrosMetodos"/>
 *     &lt;enumeration value="ValorMaximoLegal"/>
 *     &lt;enumeration value="ExplotacionEconomica"/>
 *     &lt;enumeration value="ActualizacionDeMercadoDeAlquileres"/>
 *     &lt;enumeration value="ResidualEstatico"/>
 *     &lt;enumeration value="ResidualDinamico"/>
 *     &lt;enumeration value="OtroMetodo"/>
 *     &lt;enumeration value="DerechoReal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_MetodoValoracion")
@XmlEnum
public enum ConfigurationTMetodoValoracion {

    @XmlEnumValue("MetodoDelCoste")
    METODO_DEL_COSTE("MetodoDelCoste"),
    @XmlEnumValue("MetodoResidual")
    METODO_RESIDUAL("MetodoResidual"),
    @XmlEnumValue("MetodoDeComparacion")
    METODO_DE_COMPARACION("MetodoDeComparacion"),
    @XmlEnumValue("ActualizacionDeInmueblesArrendados")
    ACTUALIZACION_DE_INMUEBLES_ARRENDADOS("ActualizacionDeInmueblesArrendados"),
    @XmlEnumValue("OtrosMetodos")
    OTROS_METODOS("OtrosMetodos"),
    @XmlEnumValue("ValorMaximoLegal")
    VALOR_MAXIMO_LEGAL("ValorMaximoLegal"),
    @XmlEnumValue("ExplotacionEconomica")
    EXPLOTACION_ECONOMICA("ExplotacionEconomica"),
    @XmlEnumValue("ActualizacionDeMercadoDeAlquileres")
    ACTUALIZACION_DE_MERCADO_DE_ALQUILERES("ActualizacionDeMercadoDeAlquileres"),
    @XmlEnumValue("ResidualEstatico")
    RESIDUAL_ESTATICO("ResidualEstatico"),
    @XmlEnumValue("ResidualDinamico")
    RESIDUAL_DINAMICO("ResidualDinamico"),
    @XmlEnumValue("OtroMetodo")
    OTRO_METODO("OtroMetodo"),
    @XmlEnumValue("DerechoReal")
    DERECHO_REAL("DerechoReal");
    private final String value;

    ConfigurationTMetodoValoracion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTMetodoValoracion fromValue(String v) {
        for (ConfigurationTMetodoValoracion c: ConfigurationTMetodoValoracion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
