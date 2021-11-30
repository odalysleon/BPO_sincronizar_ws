
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration.t_TipoVia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_TipoVia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Calle"/>
 *     &lt;enumeration value="Plaza"/>
 *     &lt;enumeration value="Paseo"/>
 *     &lt;enumeration value="Avenida"/>
 *     &lt;enumeration value="Ronda"/>
 *     &lt;enumeration value="Carretera"/>
 *     &lt;enumeration value="Camino"/>
 *     &lt;enumeration value="Cuesta"/>
 *     &lt;enumeration value="Edificio"/>
 *     &lt;enumeration value="Urbanizacion"/>
 *     &lt;enumeration value="Carrera"/>
 *     &lt;enumeration value="Callejon"/>
 *     &lt;enumeration value="Poligono"/>
 *     &lt;enumeration value="Travesia"/>
 *     &lt;enumeration value="Glorieta"/>
 *     &lt;enumeration value="Colonia"/>
 *     &lt;enumeration value="Chalet"/>
 *     &lt;enumeration value="Agrupacion"/>
 *     &lt;enumeration value="Alameda"/>
 *     &lt;enumeration value="Apartado"/>
 *     &lt;enumeration value="Bajada"/>
 *     &lt;enumeration value="Barranco"/>
 *     &lt;enumeration value="Barriada"/>
 *     &lt;enumeration value="Barrio"/>
 *     &lt;enumeration value="Bloque"/>
 *     &lt;enumeration value="Bulevar"/>
 *     &lt;enumeration value="Caserio"/>
 *     &lt;enumeration value="Diseminado"/>
 *     &lt;enumeration value="Grupo"/>
 *     &lt;enumeration value="Lugar"/>
 *     &lt;enumeration value="Mercado"/>
 *     &lt;enumeration value="Parque"/>
 *     &lt;enumeration value="Partida"/>
 *     &lt;enumeration value="Pasaje"/>
 *     &lt;enumeration value="Poblado"/>
 *     &lt;enumeration value="Rambla"/>
 *     &lt;enumeration value="Residencial"/>
 *     &lt;enumeration value="Rua"/>
 *     &lt;enumeration value="Sector"/>
 *     &lt;enumeration value="Senda"/>
 *     &lt;enumeration value="Subida"/>
 *     &lt;enumeration value="Torrente"/>
 *     &lt;enumeration value="Travesera"/>
 *     &lt;enumeration value="Via"/>
 *     &lt;enumeration value="Carrer"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_TipoVia")
@XmlEnum
public enum ConfigurationTTipoVia {

    @XmlEnumValue("Calle")
    CALLE("Calle"),
    @XmlEnumValue("Plaza")
    PLAZA("Plaza"),
    @XmlEnumValue("Paseo")
    PASEO("Paseo"),
    @XmlEnumValue("Avenida")
    AVENIDA("Avenida"),
    @XmlEnumValue("Ronda")
    RONDA("Ronda"),
    @XmlEnumValue("Carretera")
    CARRETERA("Carretera"),
    @XmlEnumValue("Camino")
    CAMINO("Camino"),
    @XmlEnumValue("Cuesta")
    CUESTA("Cuesta"),
    @XmlEnumValue("Edificio")
    EDIFICIO("Edificio"),
    @XmlEnumValue("Urbanizacion")
    URBANIZACION("Urbanizacion"),
    @XmlEnumValue("Carrera")
    CARRERA("Carrera"),
    @XmlEnumValue("Callejon")
    CALLEJON("Callejon"),
    @XmlEnumValue("Poligono")
    POLIGONO("Poligono"),
    @XmlEnumValue("Travesia")
    TRAVESIA("Travesia"),
    @XmlEnumValue("Glorieta")
    GLORIETA("Glorieta"),
    @XmlEnumValue("Colonia")
    COLONIA("Colonia"),
    @XmlEnumValue("Chalet")
    CHALET("Chalet"),
    @XmlEnumValue("Agrupacion")
    AGRUPACION("Agrupacion"),
    @XmlEnumValue("Alameda")
    ALAMEDA("Alameda"),
    @XmlEnumValue("Apartado")
    APARTADO("Apartado"),
    @XmlEnumValue("Bajada")
    BAJADA("Bajada"),
    @XmlEnumValue("Barranco")
    BARRANCO("Barranco"),
    @XmlEnumValue("Barriada")
    BARRIADA("Barriada"),
    @XmlEnumValue("Barrio")
    BARRIO("Barrio"),
    @XmlEnumValue("Bloque")
    BLOQUE("Bloque"),
    @XmlEnumValue("Bulevar")
    BULEVAR("Bulevar"),
    @XmlEnumValue("Caserio")
    CASERIO("Caserio"),
    @XmlEnumValue("Diseminado")
    DISEMINADO("Diseminado"),
    @XmlEnumValue("Grupo")
    GRUPO("Grupo"),
    @XmlEnumValue("Lugar")
    LUGAR("Lugar"),
    @XmlEnumValue("Mercado")
    MERCADO("Mercado"),
    @XmlEnumValue("Parque")
    PARQUE("Parque"),
    @XmlEnumValue("Partida")
    PARTIDA("Partida"),
    @XmlEnumValue("Pasaje")
    PASAJE("Pasaje"),
    @XmlEnumValue("Poblado")
    POBLADO("Poblado"),
    @XmlEnumValue("Rambla")
    RAMBLA("Rambla"),
    @XmlEnumValue("Residencial")
    RESIDENCIAL("Residencial"),
    @XmlEnumValue("Rua")
    RUA("Rua"),
    @XmlEnumValue("Sector")
    SECTOR("Sector"),
    @XmlEnumValue("Senda")
    SENDA("Senda"),
    @XmlEnumValue("Subida")
    SUBIDA("Subida"),
    @XmlEnumValue("Torrente")
    TORRENTE("Torrente"),
    @XmlEnumValue("Travesera")
    TRAVESERA("Travesera"),
    @XmlEnumValue("Via")
    VIA("Via"),
    @XmlEnumValue("Carrer")
    CARRER("Carrer");
    private final String value;

    ConfigurationTTipoVia(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTTipoVia fromValue(String v) {
        for (ConfigurationTTipoVia c: ConfigurationTTipoVia.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
