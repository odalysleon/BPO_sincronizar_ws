
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration.t_TipoFinca.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_TipoFinca">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TerrenoSecano"/>
 *     &lt;enumeration value="ViviendaPiso"/>
 *     &lt;enumeration value="ViviendaUnifamiliar"/>
 *     &lt;enumeration value="PlazaGaraje"/>
 *     &lt;enumeration value="CuartoTrastero"/>
 *     &lt;enumeration value="ObraNueva"/>
 *     &lt;enumeration value="DivisionHorizontal"/>
 *     &lt;enumeration value="LocalComercial"/>
 *     &lt;enumeration value="EdificioIndustrial"/>
 *     &lt;enumeration value="LocalIndustrial"/>
 *     &lt;enumeration value="LocalOficinas"/>
 *     &lt;enumeration value="Suelo"/>
 *     &lt;enumeration value="OtrosInmuebles"/>
 *     &lt;enumeration value="BienesInmuebles"/>
 *     &lt;enumeration value="EdificioCompleto"/>
 *     &lt;enumeration value="Pareado"/>
 *     &lt;enumeration value="Adosado"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_TipoFinca")
@XmlEnum
public enum ConfigurationTTipoFinca {

    @XmlEnumValue("TerrenoSecano")
    TERRENO_SECANO("TerrenoSecano"),
    @XmlEnumValue("ViviendaPiso")
    VIVIENDA_PISO("ViviendaPiso"),
    @XmlEnumValue("ViviendaUnifamiliar")
    VIVIENDA_UNIFAMILIAR("ViviendaUnifamiliar"),
    @XmlEnumValue("PlazaGaraje")
    PLAZA_GARAJE("PlazaGaraje"),
    @XmlEnumValue("CuartoTrastero")
    CUARTO_TRASTERO("CuartoTrastero"),
    @XmlEnumValue("ObraNueva")
    OBRA_NUEVA("ObraNueva"),
    @XmlEnumValue("DivisionHorizontal")
    DIVISION_HORIZONTAL("DivisionHorizontal"),
    @XmlEnumValue("LocalComercial")
    LOCAL_COMERCIAL("LocalComercial"),
    @XmlEnumValue("EdificioIndustrial")
    EDIFICIO_INDUSTRIAL("EdificioIndustrial"),
    @XmlEnumValue("LocalIndustrial")
    LOCAL_INDUSTRIAL("LocalIndustrial"),
    @XmlEnumValue("LocalOficinas")
    LOCAL_OFICINAS("LocalOficinas"),
    @XmlEnumValue("Suelo")
    SUELO("Suelo"),
    @XmlEnumValue("OtrosInmuebles")
    OTROS_INMUEBLES("OtrosInmuebles"),
    @XmlEnumValue("BienesInmuebles")
    BIENES_INMUEBLES("BienesInmuebles"),
    @XmlEnumValue("EdificioCompleto")
    EDIFICIO_COMPLETO("EdificioCompleto"),
    @XmlEnumValue("Pareado")
    PAREADO("Pareado"),
    @XmlEnumValue("Adosado")
    ADOSADO("Adosado");
    private final String value;

    ConfigurationTTipoFinca(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTTipoFinca fromValue(String v) {
        for (ConfigurationTTipoFinca c: ConfigurationTTipoFinca.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
