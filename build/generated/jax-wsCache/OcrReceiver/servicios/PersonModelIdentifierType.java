
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonModel.IdentifierType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PersonModel.IdentifierType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknwon"/>
 *     &lt;enumeration value="Nif"/>
 *     &lt;enumeration value="Cif"/>
 *     &lt;enumeration value="Passport"/>
 *     &lt;enumeration value="TarjetaResidente"/>
 *     &lt;enumeration value="IdentificacionFiscalMenor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonModel.IdentifierType", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Companies")
@XmlEnum
public enum PersonModelIdentifierType {

    @XmlEnumValue("Unknwon")
    UNKNWON("Unknwon"),
    @XmlEnumValue("Nif")
    NIF("Nif"),
    @XmlEnumValue("Cif")
    CIF("Cif"),
    @XmlEnumValue("Passport")
    PASSPORT("Passport"),
    @XmlEnumValue("TarjetaResidente")
    TARJETA_RESIDENTE("TarjetaResidente"),
    @XmlEnumValue("IdentificacionFiscalMenor")
    IDENTIFICACION_FISCAL_MENOR("IdentificacionFiscalMenor");
    private final String value;

    PersonModelIdentifierType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonModelIdentifierType fromValue(String v) {
        for (PersonModelIdentifierType c: PersonModelIdentifierType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
