
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration.t_GrupoCotizacion.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_GrupoCotizacion">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SinGrupo"/>
 *     &lt;enumeration value="Grupo1_Ingenieros_Licenciados"/>
 *     &lt;enumeration value="Grupo2_Ingenieros_Tecnicos_Peritos_AyudantesTitulados"/>
 *     &lt;enumeration value="Grupo3_Jefes_Administrativos_deTaller"/>
 *     &lt;enumeration value="Grupo4_AyudantesNoTitulados"/>
 *     &lt;enumeration value="Grupo5_Oficiales_Administrativos"/>
 *     &lt;enumeration value="Grupo6_Subalternos"/>
 *     &lt;enumeration value="Grupo7_AuxiliaresAdministrativos"/>
 *     &lt;enumeration value="Grupo8_OficialesPrimera_Segunda"/>
 *     &lt;enumeration value="Grupo9_OficialesTercera_Especialistas"/>
 *     &lt;enumeration value="Grupo10_Peones"/>
 *     &lt;enumeration value="Grupo11_Menores18"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_GrupoCotizacion")
@XmlEnum
public enum ConfigurationTGrupoCotizacion {

    @XmlEnumValue("SinGrupo")
    SIN_GRUPO("SinGrupo"),
    @XmlEnumValue("Grupo1_Ingenieros_Licenciados")
    GRUPO_1_INGENIEROS_LICENCIADOS("Grupo1_Ingenieros_Licenciados"),
    @XmlEnumValue("Grupo2_Ingenieros_Tecnicos_Peritos_AyudantesTitulados")
    GRUPO_2_INGENIEROS_TECNICOS_PERITOS_AYUDANTES_TITULADOS("Grupo2_Ingenieros_Tecnicos_Peritos_AyudantesTitulados"),
    @XmlEnumValue("Grupo3_Jefes_Administrativos_deTaller")
    GRUPO_3_JEFES_ADMINISTRATIVOS_DE_TALLER("Grupo3_Jefes_Administrativos_deTaller"),
    @XmlEnumValue("Grupo4_AyudantesNoTitulados")
    GRUPO_4_AYUDANTES_NO_TITULADOS("Grupo4_AyudantesNoTitulados"),
    @XmlEnumValue("Grupo5_Oficiales_Administrativos")
    GRUPO_5_OFICIALES_ADMINISTRATIVOS("Grupo5_Oficiales_Administrativos"),
    @XmlEnumValue("Grupo6_Subalternos")
    GRUPO_6_SUBALTERNOS("Grupo6_Subalternos"),
    @XmlEnumValue("Grupo7_AuxiliaresAdministrativos")
    GRUPO_7_AUXILIARES_ADMINISTRATIVOS("Grupo7_AuxiliaresAdministrativos"),
    @XmlEnumValue("Grupo8_OficialesPrimera_Segunda")
    GRUPO_8_OFICIALES_PRIMERA_SEGUNDA("Grupo8_OficialesPrimera_Segunda"),
    @XmlEnumValue("Grupo9_OficialesTercera_Especialistas")
    GRUPO_9_OFICIALES_TERCERA_ESPECIALISTAS("Grupo9_OficialesTercera_Especialistas"),
    @XmlEnumValue("Grupo10_Peones")
    GRUPO_10_PEONES("Grupo10_Peones"),
    @XmlEnumValue("Grupo11_Menores18")
    GRUPO_11_MENORES_18("Grupo11_Menores18");
    private final String value;

    ConfigurationTGrupoCotizacion(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTGrupoCotizacion fromValue(String v) {
        for (ConfigurationTGrupoCotizacion c: ConfigurationTGrupoCotizacion.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
