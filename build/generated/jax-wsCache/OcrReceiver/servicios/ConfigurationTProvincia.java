
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Configuration.t_Provincia.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_Provincia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SinAsignar"/>
 *     &lt;enumeration value="Alava"/>
 *     &lt;enumeration value="Albacete"/>
 *     &lt;enumeration value="Alicante"/>
 *     &lt;enumeration value="Almeria"/>
 *     &lt;enumeration value="Avila"/>
 *     &lt;enumeration value="Badajoz"/>
 *     &lt;enumeration value="Baleares"/>
 *     &lt;enumeration value="Barcelona"/>
 *     &lt;enumeration value="Burgos"/>
 *     &lt;enumeration value="Caceres"/>
 *     &lt;enumeration value="Cadiz"/>
 *     &lt;enumeration value="Castellon"/>
 *     &lt;enumeration value="CiudadReal"/>
 *     &lt;enumeration value="Cordoba"/>
 *     &lt;enumeration value="ACoruña"/>
 *     &lt;enumeration value="Cuenca"/>
 *     &lt;enumeration value="Girona"/>
 *     &lt;enumeration value="Granada"/>
 *     &lt;enumeration value="Guadalajara"/>
 *     &lt;enumeration value="Guipuzcoa"/>
 *     &lt;enumeration value="Huelva"/>
 *     &lt;enumeration value="Huesca"/>
 *     &lt;enumeration value="Jaen"/>
 *     &lt;enumeration value="Leon"/>
 *     &lt;enumeration value="Lleida"/>
 *     &lt;enumeration value="LaRioja"/>
 *     &lt;enumeration value="Lugo"/>
 *     &lt;enumeration value="Madrid"/>
 *     &lt;enumeration value="Malaga"/>
 *     &lt;enumeration value="Murcia"/>
 *     &lt;enumeration value="Navarra"/>
 *     &lt;enumeration value="Ourense"/>
 *     &lt;enumeration value="Asturias"/>
 *     &lt;enumeration value="Palencia"/>
 *     &lt;enumeration value="LasPalmas"/>
 *     &lt;enumeration value="Pontevedra"/>
 *     &lt;enumeration value="Salamanca"/>
 *     &lt;enumeration value="SCTenerife"/>
 *     &lt;enumeration value="Cantabria"/>
 *     &lt;enumeration value="Segovia"/>
 *     &lt;enumeration value="Sevilla"/>
 *     &lt;enumeration value="Soria"/>
 *     &lt;enumeration value="Tarragona"/>
 *     &lt;enumeration value="Teruel"/>
 *     &lt;enumeration value="Toledo"/>
 *     &lt;enumeration value="Valencia"/>
 *     &lt;enumeration value="Valladolid"/>
 *     &lt;enumeration value="Vizcaya"/>
 *     &lt;enumeration value="Zamora"/>
 *     &lt;enumeration value="Zaragoza"/>
 *     &lt;enumeration value="Ceuta"/>
 *     &lt;enumeration value="Melilla"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_Provincia")
@XmlEnum
public enum ConfigurationTProvincia {

    @XmlEnumValue("SinAsignar")
    SIN_ASIGNAR("SinAsignar"),
    @XmlEnumValue("Alava")
    ALAVA("Alava"),
    @XmlEnumValue("Albacete")
    ALBACETE("Albacete"),
    @XmlEnumValue("Alicante")
    ALICANTE("Alicante"),
    @XmlEnumValue("Almeria")
    ALMERIA("Almeria"),
    @XmlEnumValue("Avila")
    AVILA("Avila"),
    @XmlEnumValue("Badajoz")
    BADAJOZ("Badajoz"),
    @XmlEnumValue("Baleares")
    BALEARES("Baleares"),
    @XmlEnumValue("Barcelona")
    BARCELONA("Barcelona"),
    @XmlEnumValue("Burgos")
    BURGOS("Burgos"),
    @XmlEnumValue("Caceres")
    CACERES("Caceres"),
    @XmlEnumValue("Cadiz")
    CADIZ("Cadiz"),
    @XmlEnumValue("Castellon")
    CASTELLON("Castellon"),
    @XmlEnumValue("CiudadReal")
    CIUDAD_REAL("CiudadReal"),
    @XmlEnumValue("Cordoba")
    CORDOBA("Cordoba"),
    @XmlEnumValue("ACoru\u00f1a")
    A_CORUÑA("ACoru\u00f1a"),
    @XmlEnumValue("Cuenca")
    CUENCA("Cuenca"),
    @XmlEnumValue("Girona")
    GIRONA("Girona"),
    @XmlEnumValue("Granada")
    GRANADA("Granada"),
    @XmlEnumValue("Guadalajara")
    GUADALAJARA("Guadalajara"),
    @XmlEnumValue("Guipuzcoa")
    GUIPUZCOA("Guipuzcoa"),
    @XmlEnumValue("Huelva")
    HUELVA("Huelva"),
    @XmlEnumValue("Huesca")
    HUESCA("Huesca"),
    @XmlEnumValue("Jaen")
    JAEN("Jaen"),
    @XmlEnumValue("Leon")
    LEON("Leon"),
    @XmlEnumValue("Lleida")
    LLEIDA("Lleida"),
    @XmlEnumValue("LaRioja")
    LA_RIOJA("LaRioja"),
    @XmlEnumValue("Lugo")
    LUGO("Lugo"),
    @XmlEnumValue("Madrid")
    MADRID("Madrid"),
    @XmlEnumValue("Malaga")
    MALAGA("Malaga"),
    @XmlEnumValue("Murcia")
    MURCIA("Murcia"),
    @XmlEnumValue("Navarra")
    NAVARRA("Navarra"),
    @XmlEnumValue("Ourense")
    OURENSE("Ourense"),
    @XmlEnumValue("Asturias")
    ASTURIAS("Asturias"),
    @XmlEnumValue("Palencia")
    PALENCIA("Palencia"),
    @XmlEnumValue("LasPalmas")
    LAS_PALMAS("LasPalmas"),
    @XmlEnumValue("Pontevedra")
    PONTEVEDRA("Pontevedra"),
    @XmlEnumValue("Salamanca")
    SALAMANCA("Salamanca"),
    @XmlEnumValue("SCTenerife")
    SC_TENERIFE("SCTenerife"),
    @XmlEnumValue("Cantabria")
    CANTABRIA("Cantabria"),
    @XmlEnumValue("Segovia")
    SEGOVIA("Segovia"),
    @XmlEnumValue("Sevilla")
    SEVILLA("Sevilla"),
    @XmlEnumValue("Soria")
    SORIA("Soria"),
    @XmlEnumValue("Tarragona")
    TARRAGONA("Tarragona"),
    @XmlEnumValue("Teruel")
    TERUEL("Teruel"),
    @XmlEnumValue("Toledo")
    TOLEDO("Toledo"),
    @XmlEnumValue("Valencia")
    VALENCIA("Valencia"),
    @XmlEnumValue("Valladolid")
    VALLADOLID("Valladolid"),
    @XmlEnumValue("Vizcaya")
    VIZCAYA("Vizcaya"),
    @XmlEnumValue("Zamora")
    ZAMORA("Zamora"),
    @XmlEnumValue("Zaragoza")
    ZARAGOZA("Zaragoza"),
    @XmlEnumValue("Ceuta")
    CEUTA("Ceuta"),
    @XmlEnumValue("Melilla")
    MELILLA("Melilla");
    private final String value;

    ConfigurationTProvincia(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTProvincia fromValue(String v) {
        for (ConfigurationTProvincia c: ConfigurationTProvincia.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
