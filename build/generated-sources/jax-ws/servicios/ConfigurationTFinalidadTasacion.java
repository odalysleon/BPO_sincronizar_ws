
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration.t_FinalidadTasacion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_FinalidadTasacion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CompraPrimeraVivienda"/>
 *     &lt;enumeration value="CambiarlaHipotecaActual"/>
 *     &lt;enumeration value="CompraSegundaVivienda"/>
 *     &lt;enumeration value="OtraFinalidad"/>
 *     &lt;enumeration value="Reformas_Mejoras"/>
 *     &lt;enumeration value="FinanciacionNegocios"/>
 *     &lt;enumeration value="Refinanciacion_CancelacionDeudas"/>
 *     &lt;enumeration value="Resto"/>
 *     &lt;enumeration value="NoBuscoFinanciacionAdicional"/>
 *     &lt;enumeration value="EliminarInterviniente"/>
 *     &lt;enumeration value="CompraPrimeraViviendaConMudanza"/>
 *     &lt;enumeration value="CompraSegundaViviendaConMudanza"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_FinalidadTasacion")
@XmlEnum
public enum ConfigurationTFinalidadTasacion {

    @XmlEnumValue("CompraPrimeraVivienda")
    COMPRA_PRIMERA_VIVIENDA("CompraPrimeraVivienda"),
    @XmlEnumValue("CambiarlaHipotecaActual")
    CAMBIARLA_HIPOTECA_ACTUAL("CambiarlaHipotecaActual"),
    @XmlEnumValue("CompraSegundaVivienda")
    COMPRA_SEGUNDA_VIVIENDA("CompraSegundaVivienda"),
    @XmlEnumValue("OtraFinalidad")
    OTRA_FINALIDAD("OtraFinalidad"),
    @XmlEnumValue("Reformas_Mejoras")
    REFORMAS_MEJORAS("Reformas_Mejoras"),
    @XmlEnumValue("FinanciacionNegocios")
    FINANCIACION_NEGOCIOS("FinanciacionNegocios"),
    @XmlEnumValue("Refinanciacion_CancelacionDeudas")
    REFINANCIACION_CANCELACION_DEUDAS("Refinanciacion_CancelacionDeudas"),
    @XmlEnumValue("Resto")
    RESTO("Resto"),
    @XmlEnumValue("NoBuscoFinanciacionAdicional")
    NO_BUSCO_FINANCIACION_ADICIONAL("NoBuscoFinanciacionAdicional"),
    @XmlEnumValue("EliminarInterviniente")
    ELIMINAR_INTERVINIENTE("EliminarInterviniente"),
    @XmlEnumValue("CompraPrimeraViviendaConMudanza")
    COMPRA_PRIMERA_VIVIENDA_CON_MUDANZA("CompraPrimeraViviendaConMudanza"),
    @XmlEnumValue("CompraSegundaViviendaConMudanza")
    COMPRA_SEGUNDA_VIVIENDA_CON_MUDANZA("CompraSegundaViviendaConMudanza");
    private final String value;

    ConfigurationTFinalidadTasacion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTFinalidadTasacion fromValue(String v) {
        for (ConfigurationTFinalidadTasacion c: ConfigurationTFinalidadTasacion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
