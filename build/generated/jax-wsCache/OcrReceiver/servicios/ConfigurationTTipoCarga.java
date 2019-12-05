
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Configuration.t_TipoCarga.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_TipoCarga">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Hipoteca"/>
 *     &lt;enumeration value="Embargo"/>
 *     &lt;enumeration value="DerechoSuperficie"/>
 *     &lt;enumeration value="ConcesionAdva"/>
 *     &lt;enumeration value="Usufructo"/>
 *     &lt;enumeration value="DerechoUso"/>
 *     &lt;enumeration value="DerechoHabitacion"/>
 *     &lt;enumeration value="AptoTuristico"/>
 *     &lt;enumeration value="ConcursoAcreedores"/>
 *     &lt;enumeration value="Art207"/>
 *     &lt;enumeration value="Art28"/>
 *     &lt;enumeration value="CertificadoCargas"/>
 *     &lt;enumeration value="Otros"/>
 *     &lt;enumeration value="AsientoPendienteDespacho"/>
 *     &lt;enumeration value="OtrosPresupuesto"/>
 *     &lt;enumeration value="EmbargoOOPP"/>
 *     &lt;enumeration value="ArtIculo205"/>
 *     &lt;enumeration value="Censo"/>
 *     &lt;enumeration value="CondicionResolutoria"/>
 *     &lt;enumeration value="CertificadoCargasOOPP"/>
 *     &lt;enumeration value="SeguroDecenal"/>
 *     &lt;enumeration value="AsientoPendienteCambioTitularidad"/>
 *     &lt;enumeration value="AsientoPendienteHipoteca"/>
 *     &lt;enumeration value="AsientoPendienteAgrupación_segregacionFincas"/>
 *     &lt;enumeration value="AsientoPendienteEmbargoResto"/>
 *     &lt;enumeration value="AsientoPendienteDescalificacion"/>
 *     &lt;enumeration value="OpcionCompraFavorTerceros"/>
 *     &lt;enumeration value="DerechosSobreBienesDemaniales"/>
 *     &lt;enumeration value="FincasIndivisas"/>
 *     &lt;enumeration value="CargasUrbanisticasVigor"/>
 *     &lt;enumeration value="AsientoPendienteEmbargoOOPP"/>
 *     &lt;enumeration value="DerechoVuelo"/>
 *     &lt;enumeration value="FueraOrdenacion_CambioPGOU"/>
 *     &lt;enumeration value="TitularRegistralIncapacitado"/>
 *     &lt;enumeration value="TitularMenorEdad"/>
 *     &lt;enumeration value="Alodio_Laudemio"/>
 *     &lt;enumeration value="AfeccionFiscal"/>
 *     &lt;enumeration value="DerechoReserva"/>
 *     &lt;enumeration value="LimitacionDominio"/>
 *     &lt;enumeration value="Servidumbre"/>
 *     &lt;enumeration value="SustitucionFideicomisa"/>
 *     &lt;enumeration value="OtrosGRAVE"/>
 *     &lt;enumeration value="Novación"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_TipoCarga")
@XmlEnum
public enum ConfigurationTTipoCarga {

    @XmlEnumValue("Hipoteca")
    HIPOTECA("Hipoteca"),
    @XmlEnumValue("Embargo")
    EMBARGO("Embargo"),
    @XmlEnumValue("DerechoSuperficie")
    DERECHO_SUPERFICIE("DerechoSuperficie"),
    @XmlEnumValue("ConcesionAdva")
    CONCESION_ADVA("ConcesionAdva"),
    @XmlEnumValue("Usufructo")
    USUFRUCTO("Usufructo"),
    @XmlEnumValue("DerechoUso")
    DERECHO_USO("DerechoUso"),
    @XmlEnumValue("DerechoHabitacion")
    DERECHO_HABITACION("DerechoHabitacion"),
    @XmlEnumValue("AptoTuristico")
    APTO_TURISTICO("AptoTuristico"),
    @XmlEnumValue("ConcursoAcreedores")
    CONCURSO_ACREEDORES("ConcursoAcreedores"),
    @XmlEnumValue("Art207")
    ART_207("Art207"),
    @XmlEnumValue("Art28")
    ART_28("Art28"),
    @XmlEnumValue("CertificadoCargas")
    CERTIFICADO_CARGAS("CertificadoCargas"),
    @XmlEnumValue("Otros")
    OTROS("Otros"),
    @XmlEnumValue("AsientoPendienteDespacho")
    ASIENTO_PENDIENTE_DESPACHO("AsientoPendienteDespacho"),
    @XmlEnumValue("OtrosPresupuesto")
    OTROS_PRESUPUESTO("OtrosPresupuesto"),
    @XmlEnumValue("EmbargoOOPP")
    EMBARGO_OOPP("EmbargoOOPP"),
    @XmlEnumValue("ArtIculo205")
    ART_ICULO_205("ArtIculo205"),
    @XmlEnumValue("Censo")
    CENSO("Censo"),
    @XmlEnumValue("CondicionResolutoria")
    CONDICION_RESOLUTORIA("CondicionResolutoria"),
    @XmlEnumValue("CertificadoCargasOOPP")
    CERTIFICADO_CARGAS_OOPP("CertificadoCargasOOPP"),
    @XmlEnumValue("SeguroDecenal")
    SEGURO_DECENAL("SeguroDecenal"),
    @XmlEnumValue("AsientoPendienteCambioTitularidad")
    ASIENTO_PENDIENTE_CAMBIO_TITULARIDAD("AsientoPendienteCambioTitularidad"),
    @XmlEnumValue("AsientoPendienteHipoteca")
    ASIENTO_PENDIENTE_HIPOTECA("AsientoPendienteHipoteca"),
    @XmlEnumValue("AsientoPendienteAgrupaci\u00f3n_segregacionFincas")
    ASIENTO_PENDIENTE_AGRUPACIÓN_SEGREGACION_FINCAS("AsientoPendienteAgrupaci\u00f3n_segregacionFincas"),
    @XmlEnumValue("AsientoPendienteEmbargoResto")
    ASIENTO_PENDIENTE_EMBARGO_RESTO("AsientoPendienteEmbargoResto"),
    @XmlEnumValue("AsientoPendienteDescalificacion")
    ASIENTO_PENDIENTE_DESCALIFICACION("AsientoPendienteDescalificacion"),
    @XmlEnumValue("OpcionCompraFavorTerceros")
    OPCION_COMPRA_FAVOR_TERCEROS("OpcionCompraFavorTerceros"),
    @XmlEnumValue("DerechosSobreBienesDemaniales")
    DERECHOS_SOBRE_BIENES_DEMANIALES("DerechosSobreBienesDemaniales"),
    @XmlEnumValue("FincasIndivisas")
    FINCAS_INDIVISAS("FincasIndivisas"),
    @XmlEnumValue("CargasUrbanisticasVigor")
    CARGAS_URBANISTICAS_VIGOR("CargasUrbanisticasVigor"),
    @XmlEnumValue("AsientoPendienteEmbargoOOPP")
    ASIENTO_PENDIENTE_EMBARGO_OOPP("AsientoPendienteEmbargoOOPP"),
    @XmlEnumValue("DerechoVuelo")
    DERECHO_VUELO("DerechoVuelo"),
    @XmlEnumValue("FueraOrdenacion_CambioPGOU")
    FUERA_ORDENACION_CAMBIO_PGOU("FueraOrdenacion_CambioPGOU"),
    @XmlEnumValue("TitularRegistralIncapacitado")
    TITULAR_REGISTRAL_INCAPACITADO("TitularRegistralIncapacitado"),
    @XmlEnumValue("TitularMenorEdad")
    TITULAR_MENOR_EDAD("TitularMenorEdad"),
    @XmlEnumValue("Alodio_Laudemio")
    ALODIO_LAUDEMIO("Alodio_Laudemio"),
    @XmlEnumValue("AfeccionFiscal")
    AFECCION_FISCAL("AfeccionFiscal"),
    @XmlEnumValue("DerechoReserva")
    DERECHO_RESERVA("DerechoReserva"),
    @XmlEnumValue("LimitacionDominio")
    LIMITACION_DOMINIO("LimitacionDominio"),
    @XmlEnumValue("Servidumbre")
    SERVIDUMBRE("Servidumbre"),
    @XmlEnumValue("SustitucionFideicomisa")
    SUSTITUCION_FIDEICOMISA("SustitucionFideicomisa"),
    @XmlEnumValue("OtrosGRAVE")
    OTROS_GRAVE("OtrosGRAVE"),
    @XmlEnumValue("Novaci\u00f3n")
    NOVACIÓN("Novaci\u00f3n");
    private final String value;

    ConfigurationTTipoCarga(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTTipoCarga fromValue(String v) {
        for (ConfigurationTTipoCarga c: ConfigurationTTipoCarga.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
