
package servicios;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Configuration.t_TipoAdvertencia.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Configuration.t_TipoAdvertencia">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Inmueblesujetoaexpropiacionforzosaporloqueelvalordetasacioninformadopodriaversealterado"/>
 *     &lt;enumeration value="LaDenominacionDeCalleYoNumeroDePoliciaNoCoincideConLaQueFiguraEnLaDocumentacionRegistralNoExistiendoDudasDeLaIdentificacionDelElementoValorado"/>
 *     &lt;enumeration value="ExistenDiscrepanciasPocoSignificativasEntreLaDescripcionRegistralYLaRealidadFisicaActualSiendoElElementoValoradoAcordeConLaNormativaUrbanisticaVigente"/>
 *     &lt;enumeration value="NoSeHaDispuestoParaSuAnalisisPorElTasadorDeDocumentacionAcreditativaDeLaExpedicionDelSeguroDeDa�OsDecenal"/>
 *     &lt;enumeration value="NoSeHaDispuestoParaSuAnalisisPorElTasadorDelContratoDeEjecucionDeObraYDelPresupuestoDeContrata"/>
 *     &lt;enumeration value="NoSeHaDispuestoParaSuAnalisisPorElTasadorDeLaUltimaCertificacionDeObraDeLaDireccionFacultativa"/>
 *     &lt;enumeration value="DeNoCumplirseLasClausulasDeLaLicenciaDeObrasElValorDeTasacionInformadoPodriaVerseAlterado"/>
 *     &lt;enumeration value="NoSeHaDispuestoParaSuAnalisisPorElTasadorDeLaLicenciaDeAperturaYoActividad"/>
 *     &lt;enumeration value="DeNoCumplirseLasClausulasDeLaLicenciaDeObrasElValorDeTasacionInformadoPodriaVer"/>
 *     &lt;enumeration value="seAlterado"/>
 *     &lt;enumeration value="ElValorDeTasacionUnicamenteSeraValidadoSiElFuturoTitularRegistralEsElActualInquilinoDelElementoValoradoPorLoQueNoSeHaDeterminadoElValorDeMercadoPorCapitalizacionDeLasRentas"/>
 *     &lt;enumeration value="NoSeHaDispuestoParaSuAnalisisPorElTasadorLosEstatutosDeLaComunidadOCertificadoDelAdministradorParaComprobarLasLimitacionesDeUso"/>
 *     &lt;enumeration value="SeHanDeterminadoLosFlujosDeCajaAPartirDeRatiosMediasDelSectorAlNoHaberDispuestoElBalanceYCuentaDeResultadosDeLosTresUltimosA�Os"/>
 *     &lt;enumeration value="DocumentacionNecesariaParaCalcularFlujosDeCaja"/>
 *     &lt;enumeration value="AlTratarseDeUnDerechoDeUsufructoDeUnaConcesionAdministrativaODeUnDerechoDeSuperficieLaValoracionQuedaSujetaALasLimitacionesDelArt31DelRd6851982DelMercadoHipotecario"/>
 *     &lt;enumeration value="SeHaDeterminadoElValorMaximoLegalAPartirDeLaSuperficieUtilQueFiguraEnLaDocumentacionRegistralAlNoHaberDispuestoDeLaCedulaDeCalificacionDefinitiva"/>
 *     &lt;enumeration value="NoSeHaPodidoComprobarElRegimenDeProteccionDelPatrimonioArquitectonico"/>
 *     &lt;enumeration value="DocumentacionCatastralRelevanteRegimenDeExplotacionORendimientoEconomico"/>
 *     &lt;enumeration value="DocumentacionCatastralRelevante"/>
 *     &lt;enumeration value="RegimenDeExplotacionDerechoDeRiegoORendimientoEconomico"/>
 *     &lt;enumeration value="NoSeHaDispuestoParaSuAnalisisPorElTasadorDeLaReferenciaCatastralDeAlgunInmueble"/>
 *     &lt;enumeration value="SeAdvierteQueLaDocumentacionCatastralAportadaTieneUnaAntig�EdadSuperiorATresMeses"/>
 *     &lt;enumeration value="SeAdvierteQueSeHaIniciadoElProcedimientoDeExpropiacionDeLaTotalidadOParteDelInmuebleTasado"/>
 *     &lt;enumeration value="SeAdvierteQueSeHaAprobadoUnInstrumentoDeOrdenacionTerritorialOUrbanisticaPlanOProyectoQuePuedeProvocarLaExpropiacionDeLaTotalidadOParteDelInmuebleTasado"/>
 *     &lt;enumeration value="SeAdvierteQueSeHaDeclaradoPorLaAdministracionCompetenteUnaResolucionAdministrativaConAudienciaDeLosInteresadosQuePuedeProvocarLaExpropiacionDeLaTotalidadOParteDelInmuebleTasado"/>
 *     &lt;enumeration value="SeAdvierteQueSeHaIncoadoExpedienteDeIncumplimientoDeLosPlazosODemasDeberesInherentesAlProcesoDeUrbanizacionODeEdificacionQuePuedeProvocarLaExpropiacionDeLaTotalidadOParteDelInmuebleTasado"/>
 *     &lt;enumeration value="EnCasoDeDeclaracionAdministrativaDeIncumplimientoDePlazosDeLosDeberesDeUrbanizacionODeEdificacionDelSueloYPosteriorExpropiacionDeLosTerrenosEstosSeJustipreciaranDeConformidadConLosCriteriosEstablecidosEnLaLey82007"/>
 *     &lt;enumeration value="LaDocumentacionCatastralAportadaPerteneceALaFincaMatrizDeLaQueProcede"/>
 *     &lt;enumeration value="NoExistenAdvertenciasParaElCasoConcretoDeEsteInforme"/>
 *     &lt;enumeration value="OtrasAdvertencias"/>
 *     &lt;enumeration value="A11ExisteElementoOInmuebleConstruidoSobreLaFincaNoInscritoRegistralmenteQueSeHaConsideradoEnLaValoracionAlSerAcordeConLaNormativaUrbanisticaYLegalizableSiendoRecomendableSuInscripcionEnElRegistroDeLaPropiedadDe"/>
 *     &lt;enumeration value="A12LaDenominacionDelRegistroDeLaPropiedadYDePoliciaNoCoincidenNoExistiendoDudasDeSuCorrectaIdentificacionSeRecomiendaSuCorrectaInscripcion"/>
 *     &lt;enumeration value="A13AlEstarUbicadoElElementoValoradoEnUnEdificioDeRecienteConstruccionNoExisteTodaviaFichaCatastralDeLaMismaSeAportanLosDatosCatastralesDelTerrenoEnElQueSeHaConstruidoElEdificio"/>
 *     &lt;enumeration value="A14ElSolicitanteNoEsTitularDeLaPlenaPropiedadRegistralTasacionUnicamenteValidaSiEllosSolicitantesEssonTitularesDeLaPlenaTitularidadRegistral"/>
 *     &lt;enumeration value="A15ElSolicitanteNoEsTitularDeLaPlenaPropiedadRegistralTasacionUnicamenteValidaSiEllosSolicitantesEssonTitularesDeLaPlenaTitularidadRegistral"/>
 *     &lt;enumeration value="A16TasacionSolicitadaConjuntamentePorNudoPropietarioYUsufructuarioTasacionEnLaHipotesisDePlenaPropiedadAlSerLosSolicitantesConjuntamenteNudoPropietarioOUsufructuarioOPorExtincionDelUsufructo"/>
 *     &lt;enumeration value="A31NoSeHaDispuestoParaSuAnalisisPorElTasadorDeDocumentacionAcreditativaDeLaExpedicionDelSeguroDeDa�OsDecenal"/>
 *     &lt;enumeration value="A32NoSeHaDispuestoParaSuAnalisisPorElTasadorDelContratoDeEjecucionDeObraYDelPresupuestoDeContrata"/>
 *     &lt;enumeration value="A33NoSeHaDispuestoParaSuAnalisisPorElTasadorDeLaUltimaCertificacionDeObraDeLaDireccionFacultativa"/>
 *     &lt;enumeration value="A41NoSeAportaLaLicenciaDeAperturaYoActividadAlEstarElLocalDesocupado"/>
 *     &lt;enumeration value="A42NoSeHaDispuestoDeLaLicenciaDeAperturaYoActividadParaSuAnalisisPorElTasadorALosEfectosDeConfirmarQueElUsoAQueSeDestinaActualmenteEstaAutorizadoYQueElActualOcupanteEsTitularDeLaLicencia"/>
 *     &lt;enumeration value="A43ElValorDeTasacionInformadoUnicamenteSeraValidoSiElFuturoTitularRegistralEsElActualInquilinoDelElementoValoradoPorLoQueNoSeHaDeterminadoElValorDeMercadoPorCapitalizacionDeLasRentas"/>
 *     &lt;enumeration value="A44NoSeHaDispuestoParaSuAnalisisPorElTasadorDeLosEstatutosDeLaComunidadOCertificadoDelAdministradorParaConfirmarLasLimitacionesDeUso"/>
 *     &lt;enumeration value="A45SeHanDeterminadoLosFlujosDeCajaAPartirDeRatiosMediasDelSectorAlNoHaberDispuestoDelBalanceYCuentaDeResultadosDeLosTresUltimosA�Os"/>
 *     &lt;enumeration value="A46AlTratarseDeUnDerechoDeUsufructoDeUnaConcesionAdministrativaODeUnDerechoDeSuperficieLaValoracionQuedaSujetaALasLimitacionesDelArt31DelRd6851982DelMercadoHipotecario"/>
 *     &lt;enumeration value="A5NoSeHaDispuestoDeLaCedulaDeProteccionPorLoQueElValorMaximoLegalInformadoEsUnaEstimacionBasadaEnLaSuperficieUtilRegistralQueDeberaSerCorroboradaMedianteConsultaEnElDepartamentoDeLaAdministracionCompetente"/>
 *     &lt;enumeration value="A6NoSeHaDispuestoDeLaCedulaUrbanisticaDelTerrenoHabiendoseContrastadoLosParametrosUrbanisticosManejadosEnElInformeEnConsultaALosServiciosUrbanisticosMunicipales"/>
 *     &lt;enumeration value="A7Advertenciasotros"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Configuration.t_TipoAdvertencia")
@XmlEnum
public enum ConfigurationTTipoAdvertencia {

    @XmlEnumValue("Inmueblesujetoaexpropiacionforzosaporloqueelvalordetasacioninformadopodriaversealterado")
    INMUEBLESUJETOAEXPROPIACIONFORZOSAPORLOQUEELVALORDETASACIONINFORMADOPODRIAVERSEALTERADO("Inmueblesujetoaexpropiacionforzosaporloqueelvalordetasacioninformadopodriaversealterado"),
    @XmlEnumValue("LaDenominacionDeCalleYoNumeroDePoliciaNoCoincideConLaQueFiguraEnLaDocumentacionRegistralNoExistiendoDudasDeLaIdentificacionDelElementoValorado")
    LA_DENOMINACION_DE_CALLE_YO_NUMERO_DE_POLICIA_NO_COINCIDE_CON_LA_QUE_FIGURA_EN_LA_DOCUMENTACION_REGISTRAL_NO_EXISTIENDO_DUDAS_DE_LA_IDENTIFICACION_DEL_ELEMENTO_VALORADO("LaDenominacionDeCalleYoNumeroDePoliciaNoCoincideConLaQueFiguraEnLaDocumentacionRegistralNoExistiendoDudasDeLaIdentificacionDelElementoValorado"),
    @XmlEnumValue("ExistenDiscrepanciasPocoSignificativasEntreLaDescripcionRegistralYLaRealidadFisicaActualSiendoElElementoValoradoAcordeConLaNormativaUrbanisticaVigente")
    EXISTEN_DISCREPANCIAS_POCO_SIGNIFICATIVAS_ENTRE_LA_DESCRIPCION_REGISTRAL_Y_LA_REALIDAD_FISICA_ACTUAL_SIENDO_EL_ELEMENTO_VALORADO_ACORDE_CON_LA_NORMATIVA_URBANISTICA_VIGENTE("ExistenDiscrepanciasPocoSignificativasEntreLaDescripcionRegistralYLaRealidadFisicaActualSiendoElElementoValoradoAcordeConLaNormativaUrbanisticaVigente"),
    @XmlEnumValue("NoSeHaDispuestoParaSuAnalisisPorElTasadorDeDocumentacionAcreditativaDeLaExpedicionDelSeguroDeDa\u00f1OsDecenal")
    NO_SE_HA_DISPUESTO_PARA_SU_ANALISIS_POR_EL_TASADOR_DE_DOCUMENTACION_ACREDITATIVA_DE_LA_EXPEDICION_DEL_SEGURO_DE_DAÑ_OS_DECENAL("NoSeHaDispuestoParaSuAnalisisPorElTasadorDeDocumentacionAcreditativaDeLaExpedicionDelSeguroDeDa\u00f1OsDecenal"),
    @XmlEnumValue("NoSeHaDispuestoParaSuAnalisisPorElTasadorDelContratoDeEjecucionDeObraYDelPresupuestoDeContrata")
    NO_SE_HA_DISPUESTO_PARA_SU_ANALISIS_POR_EL_TASADOR_DEL_CONTRATO_DE_EJECUCION_DE_OBRA_Y_DEL_PRESUPUESTO_DE_CONTRATA("NoSeHaDispuestoParaSuAnalisisPorElTasadorDelContratoDeEjecucionDeObraYDelPresupuestoDeContrata"),
    @XmlEnumValue("NoSeHaDispuestoParaSuAnalisisPorElTasadorDeLaUltimaCertificacionDeObraDeLaDireccionFacultativa")
    NO_SE_HA_DISPUESTO_PARA_SU_ANALISIS_POR_EL_TASADOR_DE_LA_ULTIMA_CERTIFICACION_DE_OBRA_DE_LA_DIRECCION_FACULTATIVA("NoSeHaDispuestoParaSuAnalisisPorElTasadorDeLaUltimaCertificacionDeObraDeLaDireccionFacultativa"),
    @XmlEnumValue("DeNoCumplirseLasClausulasDeLaLicenciaDeObrasElValorDeTasacionInformadoPodriaVerseAlterado")
    DE_NO_CUMPLIRSE_LAS_CLAUSULAS_DE_LA_LICENCIA_DE_OBRAS_EL_VALOR_DE_TASACION_INFORMADO_PODRIA_VERSE_ALTERADO("DeNoCumplirseLasClausulasDeLaLicenciaDeObrasElValorDeTasacionInformadoPodriaVerseAlterado"),
    @XmlEnumValue("NoSeHaDispuestoParaSuAnalisisPorElTasadorDeLaLicenciaDeAperturaYoActividad")
    NO_SE_HA_DISPUESTO_PARA_SU_ANALISIS_POR_EL_TASADOR_DE_LA_LICENCIA_DE_APERTURA_YO_ACTIVIDAD("NoSeHaDispuestoParaSuAnalisisPorElTasadorDeLaLicenciaDeAperturaYoActividad"),
    @XmlEnumValue("DeNoCumplirseLasClausulasDeLaLicenciaDeObrasElValorDeTasacionInformadoPodriaVer")
    DE_NO_CUMPLIRSE_LAS_CLAUSULAS_DE_LA_LICENCIA_DE_OBRAS_EL_VALOR_DE_TASACION_INFORMADO_PODRIA_VER("DeNoCumplirseLasClausulasDeLaLicenciaDeObrasElValorDeTasacionInformadoPodriaVer"),
    @XmlEnumValue("seAlterado")
    SE_ALTERADO("seAlterado"),
    @XmlEnumValue("ElValorDeTasacionUnicamenteSeraValidadoSiElFuturoTitularRegistralEsElActualInquilinoDelElementoValoradoPorLoQueNoSeHaDeterminadoElValorDeMercadoPorCapitalizacionDeLasRentas")
    EL_VALOR_DE_TASACION_UNICAMENTE_SERA_VALIDADO_SI_EL_FUTURO_TITULAR_REGISTRAL_ES_EL_ACTUAL_INQUILINO_DEL_ELEMENTO_VALORADO_POR_LO_QUE_NO_SE_HA_DETERMINADO_EL_VALOR_DE_MERCADO_POR_CAPITALIZACION_DE_LAS_RENTAS("ElValorDeTasacionUnicamenteSeraValidadoSiElFuturoTitularRegistralEsElActualInquilinoDelElementoValoradoPorLoQueNoSeHaDeterminadoElValorDeMercadoPorCapitalizacionDeLasRentas"),
    @XmlEnumValue("NoSeHaDispuestoParaSuAnalisisPorElTasadorLosEstatutosDeLaComunidadOCertificadoDelAdministradorParaComprobarLasLimitacionesDeUso")
    NO_SE_HA_DISPUESTO_PARA_SU_ANALISIS_POR_EL_TASADOR_LOS_ESTATUTOS_DE_LA_COMUNIDAD_O_CERTIFICADO_DEL_ADMINISTRADOR_PARA_COMPROBAR_LAS_LIMITACIONES_DE_USO("NoSeHaDispuestoParaSuAnalisisPorElTasadorLosEstatutosDeLaComunidadOCertificadoDelAdministradorParaComprobarLasLimitacionesDeUso"),
    @XmlEnumValue("SeHanDeterminadoLosFlujosDeCajaAPartirDeRatiosMediasDelSectorAlNoHaberDispuestoElBalanceYCuentaDeResultadosDeLosTresUltimosA\u00f1Os")
    SE_HAN_DETERMINADO_LOS_FLUJOS_DE_CAJA_A_PARTIR_DE_RATIOS_MEDIAS_DEL_SECTOR_AL_NO_HABER_DISPUESTO_EL_BALANCE_Y_CUENTA_DE_RESULTADOS_DE_LOS_TRES_ULTIMOS_AÑ_OS("SeHanDeterminadoLosFlujosDeCajaAPartirDeRatiosMediasDelSectorAlNoHaberDispuestoElBalanceYCuentaDeResultadosDeLosTresUltimosA\u00f1Os"),
    @XmlEnumValue("DocumentacionNecesariaParaCalcularFlujosDeCaja")
    DOCUMENTACION_NECESARIA_PARA_CALCULAR_FLUJOS_DE_CAJA("DocumentacionNecesariaParaCalcularFlujosDeCaja"),
    @XmlEnumValue("AlTratarseDeUnDerechoDeUsufructoDeUnaConcesionAdministrativaODeUnDerechoDeSuperficieLaValoracionQuedaSujetaALasLimitacionesDelArt31DelRd6851982DelMercadoHipotecario")
    AL_TRATARSE_DE_UN_DERECHO_DE_USUFRUCTO_DE_UNA_CONCESION_ADMINISTRATIVA_O_DE_UN_DERECHO_DE_SUPERFICIE_LA_VALORACION_QUEDA_SUJETA_A_LAS_LIMITACIONES_DEL_ART_31_DEL_RD_6851982_DEL_MERCADO_HIPOTECARIO("AlTratarseDeUnDerechoDeUsufructoDeUnaConcesionAdministrativaODeUnDerechoDeSuperficieLaValoracionQuedaSujetaALasLimitacionesDelArt31DelRd6851982DelMercadoHipotecario"),
    @XmlEnumValue("SeHaDeterminadoElValorMaximoLegalAPartirDeLaSuperficieUtilQueFiguraEnLaDocumentacionRegistralAlNoHaberDispuestoDeLaCedulaDeCalificacionDefinitiva")
    SE_HA_DETERMINADO_EL_VALOR_MAXIMO_LEGAL_A_PARTIR_DE_LA_SUPERFICIE_UTIL_QUE_FIGURA_EN_LA_DOCUMENTACION_REGISTRAL_AL_NO_HABER_DISPUESTO_DE_LA_CEDULA_DE_CALIFICACION_DEFINITIVA("SeHaDeterminadoElValorMaximoLegalAPartirDeLaSuperficieUtilQueFiguraEnLaDocumentacionRegistralAlNoHaberDispuestoDeLaCedulaDeCalificacionDefinitiva"),
    @XmlEnumValue("NoSeHaPodidoComprobarElRegimenDeProteccionDelPatrimonioArquitectonico")
    NO_SE_HA_PODIDO_COMPROBAR_EL_REGIMEN_DE_PROTECCION_DEL_PATRIMONIO_ARQUITECTONICO("NoSeHaPodidoComprobarElRegimenDeProteccionDelPatrimonioArquitectonico"),
    @XmlEnumValue("DocumentacionCatastralRelevanteRegimenDeExplotacionORendimientoEconomico")
    DOCUMENTACION_CATASTRAL_RELEVANTE_REGIMEN_DE_EXPLOTACION_O_RENDIMIENTO_ECONOMICO("DocumentacionCatastralRelevanteRegimenDeExplotacionORendimientoEconomico"),
    @XmlEnumValue("DocumentacionCatastralRelevante")
    DOCUMENTACION_CATASTRAL_RELEVANTE("DocumentacionCatastralRelevante"),
    @XmlEnumValue("RegimenDeExplotacionDerechoDeRiegoORendimientoEconomico")
    REGIMEN_DE_EXPLOTACION_DERECHO_DE_RIEGO_O_RENDIMIENTO_ECONOMICO("RegimenDeExplotacionDerechoDeRiegoORendimientoEconomico"),
    @XmlEnumValue("NoSeHaDispuestoParaSuAnalisisPorElTasadorDeLaReferenciaCatastralDeAlgunInmueble")
    NO_SE_HA_DISPUESTO_PARA_SU_ANALISIS_POR_EL_TASADOR_DE_LA_REFERENCIA_CATASTRAL_DE_ALGUN_INMUEBLE("NoSeHaDispuestoParaSuAnalisisPorElTasadorDeLaReferenciaCatastralDeAlgunInmueble"),
    @XmlEnumValue("SeAdvierteQueLaDocumentacionCatastralAportadaTieneUnaAntig\u00fcEdadSuperiorATresMeses")
    SE_ADVIERTE_QUE_LA_DOCUMENTACION_CATASTRAL_APORTADA_TIENE_UNA_ANTIGÜ_EDAD_SUPERIOR_A_TRES_MESES("SeAdvierteQueLaDocumentacionCatastralAportadaTieneUnaAntig\u00fcEdadSuperiorATresMeses"),
    @XmlEnumValue("SeAdvierteQueSeHaIniciadoElProcedimientoDeExpropiacionDeLaTotalidadOParteDelInmuebleTasado")
    SE_ADVIERTE_QUE_SE_HA_INICIADO_EL_PROCEDIMIENTO_DE_EXPROPIACION_DE_LA_TOTALIDAD_O_PARTE_DEL_INMUEBLE_TASADO("SeAdvierteQueSeHaIniciadoElProcedimientoDeExpropiacionDeLaTotalidadOParteDelInmuebleTasado"),
    @XmlEnumValue("SeAdvierteQueSeHaAprobadoUnInstrumentoDeOrdenacionTerritorialOUrbanisticaPlanOProyectoQuePuedeProvocarLaExpropiacionDeLaTotalidadOParteDelInmuebleTasado")
    SE_ADVIERTE_QUE_SE_HA_APROBADO_UN_INSTRUMENTO_DE_ORDENACION_TERRITORIAL_O_URBANISTICA_PLAN_O_PROYECTO_QUE_PUEDE_PROVOCAR_LA_EXPROPIACION_DE_LA_TOTALIDAD_O_PARTE_DEL_INMUEBLE_TASADO("SeAdvierteQueSeHaAprobadoUnInstrumentoDeOrdenacionTerritorialOUrbanisticaPlanOProyectoQuePuedeProvocarLaExpropiacionDeLaTotalidadOParteDelInmuebleTasado"),
    @XmlEnumValue("SeAdvierteQueSeHaDeclaradoPorLaAdministracionCompetenteUnaResolucionAdministrativaConAudienciaDeLosInteresadosQuePuedeProvocarLaExpropiacionDeLaTotalidadOParteDelInmuebleTasado")
    SE_ADVIERTE_QUE_SE_HA_DECLARADO_POR_LA_ADMINISTRACION_COMPETENTE_UNA_RESOLUCION_ADMINISTRATIVA_CON_AUDIENCIA_DE_LOS_INTERESADOS_QUE_PUEDE_PROVOCAR_LA_EXPROPIACION_DE_LA_TOTALIDAD_O_PARTE_DEL_INMUEBLE_TASADO("SeAdvierteQueSeHaDeclaradoPorLaAdministracionCompetenteUnaResolucionAdministrativaConAudienciaDeLosInteresadosQuePuedeProvocarLaExpropiacionDeLaTotalidadOParteDelInmuebleTasado"),
    @XmlEnumValue("SeAdvierteQueSeHaIncoadoExpedienteDeIncumplimientoDeLosPlazosODemasDeberesInherentesAlProcesoDeUrbanizacionODeEdificacionQuePuedeProvocarLaExpropiacionDeLaTotalidadOParteDelInmuebleTasado")
    SE_ADVIERTE_QUE_SE_HA_INCOADO_EXPEDIENTE_DE_INCUMPLIMIENTO_DE_LOS_PLAZOS_O_DEMAS_DEBERES_INHERENTES_AL_PROCESO_DE_URBANIZACION_O_DE_EDIFICACION_QUE_PUEDE_PROVOCAR_LA_EXPROPIACION_DE_LA_TOTALIDAD_O_PARTE_DEL_INMUEBLE_TASADO("SeAdvierteQueSeHaIncoadoExpedienteDeIncumplimientoDeLosPlazosODemasDeberesInherentesAlProcesoDeUrbanizacionODeEdificacionQuePuedeProvocarLaExpropiacionDeLaTotalidadOParteDelInmuebleTasado"),
    @XmlEnumValue("EnCasoDeDeclaracionAdministrativaDeIncumplimientoDePlazosDeLosDeberesDeUrbanizacionODeEdificacionDelSueloYPosteriorExpropiacionDeLosTerrenosEstosSeJustipreciaranDeConformidadConLosCriteriosEstablecidosEnLaLey82007")
    EN_CASO_DE_DECLARACION_ADMINISTRATIVA_DE_INCUMPLIMIENTO_DE_PLAZOS_DE_LOS_DEBERES_DE_URBANIZACION_O_DE_EDIFICACION_DEL_SUELO_Y_POSTERIOR_EXPROPIACION_DE_LOS_TERRENOS_ESTOS_SE_JUSTIPRECIARAN_DE_CONFORMIDAD_CON_LOS_CRITERIOS_ESTABLECIDOS_EN_LA_LEY_82007("EnCasoDeDeclaracionAdministrativaDeIncumplimientoDePlazosDeLosDeberesDeUrbanizacionODeEdificacionDelSueloYPosteriorExpropiacionDeLosTerrenosEstosSeJustipreciaranDeConformidadConLosCriteriosEstablecidosEnLaLey82007"),
    @XmlEnumValue("LaDocumentacionCatastralAportadaPerteneceALaFincaMatrizDeLaQueProcede")
    LA_DOCUMENTACION_CATASTRAL_APORTADA_PERTENECE_A_LA_FINCA_MATRIZ_DE_LA_QUE_PROCEDE("LaDocumentacionCatastralAportadaPerteneceALaFincaMatrizDeLaQueProcede"),
    @XmlEnumValue("NoExistenAdvertenciasParaElCasoConcretoDeEsteInforme")
    NO_EXISTEN_ADVERTENCIAS_PARA_EL_CASO_CONCRETO_DE_ESTE_INFORME("NoExistenAdvertenciasParaElCasoConcretoDeEsteInforme"),
    @XmlEnumValue("OtrasAdvertencias")
    OTRAS_ADVERTENCIAS("OtrasAdvertencias"),
    @XmlEnumValue("A11ExisteElementoOInmuebleConstruidoSobreLaFincaNoInscritoRegistralmenteQueSeHaConsideradoEnLaValoracionAlSerAcordeConLaNormativaUrbanisticaYLegalizableSiendoRecomendableSuInscripcionEnElRegistroDeLaPropiedadDe")
    A_11_EXISTE_ELEMENTO_O_INMUEBLE_CONSTRUIDO_SOBRE_LA_FINCA_NO_INSCRITO_REGISTRALMENTE_QUE_SE_HA_CONSIDERADO_EN_LA_VALORACION_AL_SER_ACORDE_CON_LA_NORMATIVA_URBANISTICA_Y_LEGALIZABLE_SIENDO_RECOMENDABLE_SU_INSCRIPCION_EN_EL_REGISTRO_DE_LA_PROPIEDAD_DE("A11ExisteElementoOInmuebleConstruidoSobreLaFincaNoInscritoRegistralmenteQueSeHaConsideradoEnLaValoracionAlSerAcordeConLaNormativaUrbanisticaYLegalizableSiendoRecomendableSuInscripcionEnElRegistroDeLaPropiedadDe"),
    @XmlEnumValue("A12LaDenominacionDelRegistroDeLaPropiedadYDePoliciaNoCoincidenNoExistiendoDudasDeSuCorrectaIdentificacionSeRecomiendaSuCorrectaInscripcion")
    A_12_LA_DENOMINACION_DEL_REGISTRO_DE_LA_PROPIEDAD_Y_DE_POLICIA_NO_COINCIDEN_NO_EXISTIENDO_DUDAS_DE_SU_CORRECTA_IDENTIFICACION_SE_RECOMIENDA_SU_CORRECTA_INSCRIPCION("A12LaDenominacionDelRegistroDeLaPropiedadYDePoliciaNoCoincidenNoExistiendoDudasDeSuCorrectaIdentificacionSeRecomiendaSuCorrectaInscripcion"),
    @XmlEnumValue("A13AlEstarUbicadoElElementoValoradoEnUnEdificioDeRecienteConstruccionNoExisteTodaviaFichaCatastralDeLaMismaSeAportanLosDatosCatastralesDelTerrenoEnElQueSeHaConstruidoElEdificio")
    A_13_AL_ESTAR_UBICADO_EL_ELEMENTO_VALORADO_EN_UN_EDIFICIO_DE_RECIENTE_CONSTRUCCION_NO_EXISTE_TODAVIA_FICHA_CATASTRAL_DE_LA_MISMA_SE_APORTAN_LOS_DATOS_CATASTRALES_DEL_TERRENO_EN_EL_QUE_SE_HA_CONSTRUIDO_EL_EDIFICIO("A13AlEstarUbicadoElElementoValoradoEnUnEdificioDeRecienteConstruccionNoExisteTodaviaFichaCatastralDeLaMismaSeAportanLosDatosCatastralesDelTerrenoEnElQueSeHaConstruidoElEdificio"),
    @XmlEnumValue("A14ElSolicitanteNoEsTitularDeLaPlenaPropiedadRegistralTasacionUnicamenteValidaSiEllosSolicitantesEssonTitularesDeLaPlenaTitularidadRegistral")
    A_14_EL_SOLICITANTE_NO_ES_TITULAR_DE_LA_PLENA_PROPIEDAD_REGISTRAL_TASACION_UNICAMENTE_VALIDA_SI_ELLOS_SOLICITANTES_ESSON_TITULARES_DE_LA_PLENA_TITULARIDAD_REGISTRAL("A14ElSolicitanteNoEsTitularDeLaPlenaPropiedadRegistralTasacionUnicamenteValidaSiEllosSolicitantesEssonTitularesDeLaPlenaTitularidadRegistral"),
    @XmlEnumValue("A15ElSolicitanteNoEsTitularDeLaPlenaPropiedadRegistralTasacionUnicamenteValidaSiEllosSolicitantesEssonTitularesDeLaPlenaTitularidadRegistral")
    A_15_EL_SOLICITANTE_NO_ES_TITULAR_DE_LA_PLENA_PROPIEDAD_REGISTRAL_TASACION_UNICAMENTE_VALIDA_SI_ELLOS_SOLICITANTES_ESSON_TITULARES_DE_LA_PLENA_TITULARIDAD_REGISTRAL("A15ElSolicitanteNoEsTitularDeLaPlenaPropiedadRegistralTasacionUnicamenteValidaSiEllosSolicitantesEssonTitularesDeLaPlenaTitularidadRegistral"),
    @XmlEnumValue("A16TasacionSolicitadaConjuntamentePorNudoPropietarioYUsufructuarioTasacionEnLaHipotesisDePlenaPropiedadAlSerLosSolicitantesConjuntamenteNudoPropietarioOUsufructuarioOPorExtincionDelUsufructo")
    A_16_TASACION_SOLICITADA_CONJUNTAMENTE_POR_NUDO_PROPIETARIO_Y_USUFRUCTUARIO_TASACION_EN_LA_HIPOTESIS_DE_PLENA_PROPIEDAD_AL_SER_LOS_SOLICITANTES_CONJUNTAMENTE_NUDO_PROPIETARIO_O_USUFRUCTUARIO_O_POR_EXTINCION_DEL_USUFRUCTO("A16TasacionSolicitadaConjuntamentePorNudoPropietarioYUsufructuarioTasacionEnLaHipotesisDePlenaPropiedadAlSerLosSolicitantesConjuntamenteNudoPropietarioOUsufructuarioOPorExtincionDelUsufructo"),
    @XmlEnumValue("A31NoSeHaDispuestoParaSuAnalisisPorElTasadorDeDocumentacionAcreditativaDeLaExpedicionDelSeguroDeDa\u00f1OsDecenal")
    A_31_NO_SE_HA_DISPUESTO_PARA_SU_ANALISIS_POR_EL_TASADOR_DE_DOCUMENTACION_ACREDITATIVA_DE_LA_EXPEDICION_DEL_SEGURO_DE_DAÑ_OS_DECENAL("A31NoSeHaDispuestoParaSuAnalisisPorElTasadorDeDocumentacionAcreditativaDeLaExpedicionDelSeguroDeDa\u00f1OsDecenal"),
    @XmlEnumValue("A32NoSeHaDispuestoParaSuAnalisisPorElTasadorDelContratoDeEjecucionDeObraYDelPresupuestoDeContrata")
    A_32_NO_SE_HA_DISPUESTO_PARA_SU_ANALISIS_POR_EL_TASADOR_DEL_CONTRATO_DE_EJECUCION_DE_OBRA_Y_DEL_PRESUPUESTO_DE_CONTRATA("A32NoSeHaDispuestoParaSuAnalisisPorElTasadorDelContratoDeEjecucionDeObraYDelPresupuestoDeContrata"),
    @XmlEnumValue("A33NoSeHaDispuestoParaSuAnalisisPorElTasadorDeLaUltimaCertificacionDeObraDeLaDireccionFacultativa")
    A_33_NO_SE_HA_DISPUESTO_PARA_SU_ANALISIS_POR_EL_TASADOR_DE_LA_ULTIMA_CERTIFICACION_DE_OBRA_DE_LA_DIRECCION_FACULTATIVA("A33NoSeHaDispuestoParaSuAnalisisPorElTasadorDeLaUltimaCertificacionDeObraDeLaDireccionFacultativa"),
    @XmlEnumValue("A41NoSeAportaLaLicenciaDeAperturaYoActividadAlEstarElLocalDesocupado")
    A_41_NO_SE_APORTA_LA_LICENCIA_DE_APERTURA_YO_ACTIVIDAD_AL_ESTAR_EL_LOCAL_DESOCUPADO("A41NoSeAportaLaLicenciaDeAperturaYoActividadAlEstarElLocalDesocupado"),
    @XmlEnumValue("A42NoSeHaDispuestoDeLaLicenciaDeAperturaYoActividadParaSuAnalisisPorElTasadorALosEfectosDeConfirmarQueElUsoAQueSeDestinaActualmenteEstaAutorizadoYQueElActualOcupanteEsTitularDeLaLicencia")
    A_42_NO_SE_HA_DISPUESTO_DE_LA_LICENCIA_DE_APERTURA_YO_ACTIVIDAD_PARA_SU_ANALISIS_POR_EL_TASADOR_A_LOS_EFECTOS_DE_CONFIRMAR_QUE_EL_USO_A_QUE_SE_DESTINA_ACTUALMENTE_ESTA_AUTORIZADO_Y_QUE_EL_ACTUAL_OCUPANTE_ES_TITULAR_DE_LA_LICENCIA("A42NoSeHaDispuestoDeLaLicenciaDeAperturaYoActividadParaSuAnalisisPorElTasadorALosEfectosDeConfirmarQueElUsoAQueSeDestinaActualmenteEstaAutorizadoYQueElActualOcupanteEsTitularDeLaLicencia"),
    @XmlEnumValue("A43ElValorDeTasacionInformadoUnicamenteSeraValidoSiElFuturoTitularRegistralEsElActualInquilinoDelElementoValoradoPorLoQueNoSeHaDeterminadoElValorDeMercadoPorCapitalizacionDeLasRentas")
    A_43_EL_VALOR_DE_TASACION_INFORMADO_UNICAMENTE_SERA_VALIDO_SI_EL_FUTURO_TITULAR_REGISTRAL_ES_EL_ACTUAL_INQUILINO_DEL_ELEMENTO_VALORADO_POR_LO_QUE_NO_SE_HA_DETERMINADO_EL_VALOR_DE_MERCADO_POR_CAPITALIZACION_DE_LAS_RENTAS("A43ElValorDeTasacionInformadoUnicamenteSeraValidoSiElFuturoTitularRegistralEsElActualInquilinoDelElementoValoradoPorLoQueNoSeHaDeterminadoElValorDeMercadoPorCapitalizacionDeLasRentas"),
    @XmlEnumValue("A44NoSeHaDispuestoParaSuAnalisisPorElTasadorDeLosEstatutosDeLaComunidadOCertificadoDelAdministradorParaConfirmarLasLimitacionesDeUso")
    A_44_NO_SE_HA_DISPUESTO_PARA_SU_ANALISIS_POR_EL_TASADOR_DE_LOS_ESTATUTOS_DE_LA_COMUNIDAD_O_CERTIFICADO_DEL_ADMINISTRADOR_PARA_CONFIRMAR_LAS_LIMITACIONES_DE_USO("A44NoSeHaDispuestoParaSuAnalisisPorElTasadorDeLosEstatutosDeLaComunidadOCertificadoDelAdministradorParaConfirmarLasLimitacionesDeUso"),
    @XmlEnumValue("A45SeHanDeterminadoLosFlujosDeCajaAPartirDeRatiosMediasDelSectorAlNoHaberDispuestoDelBalanceYCuentaDeResultadosDeLosTresUltimosA\u00f1Os")
    A_45_SE_HAN_DETERMINADO_LOS_FLUJOS_DE_CAJA_A_PARTIR_DE_RATIOS_MEDIAS_DEL_SECTOR_AL_NO_HABER_DISPUESTO_DEL_BALANCE_Y_CUENTA_DE_RESULTADOS_DE_LOS_TRES_ULTIMOS_AÑ_OS("A45SeHanDeterminadoLosFlujosDeCajaAPartirDeRatiosMediasDelSectorAlNoHaberDispuestoDelBalanceYCuentaDeResultadosDeLosTresUltimosA\u00f1Os"),
    @XmlEnumValue("A46AlTratarseDeUnDerechoDeUsufructoDeUnaConcesionAdministrativaODeUnDerechoDeSuperficieLaValoracionQuedaSujetaALasLimitacionesDelArt31DelRd6851982DelMercadoHipotecario")
    A_46_AL_TRATARSE_DE_UN_DERECHO_DE_USUFRUCTO_DE_UNA_CONCESION_ADMINISTRATIVA_O_DE_UN_DERECHO_DE_SUPERFICIE_LA_VALORACION_QUEDA_SUJETA_A_LAS_LIMITACIONES_DEL_ART_31_DEL_RD_6851982_DEL_MERCADO_HIPOTECARIO("A46AlTratarseDeUnDerechoDeUsufructoDeUnaConcesionAdministrativaODeUnDerechoDeSuperficieLaValoracionQuedaSujetaALasLimitacionesDelArt31DelRd6851982DelMercadoHipotecario"),
    @XmlEnumValue("A5NoSeHaDispuestoDeLaCedulaDeProteccionPorLoQueElValorMaximoLegalInformadoEsUnaEstimacionBasadaEnLaSuperficieUtilRegistralQueDeberaSerCorroboradaMedianteConsultaEnElDepartamentoDeLaAdministracionCompetente")
    A_5_NO_SE_HA_DISPUESTO_DE_LA_CEDULA_DE_PROTECCION_POR_LO_QUE_EL_VALOR_MAXIMO_LEGAL_INFORMADO_ES_UNA_ESTIMACION_BASADA_EN_LA_SUPERFICIE_UTIL_REGISTRAL_QUE_DEBERA_SER_CORROBORADA_MEDIANTE_CONSULTA_EN_EL_DEPARTAMENTO_DE_LA_ADMINISTRACION_COMPETENTE("A5NoSeHaDispuestoDeLaCedulaDeProteccionPorLoQueElValorMaximoLegalInformadoEsUnaEstimacionBasadaEnLaSuperficieUtilRegistralQueDeberaSerCorroboradaMedianteConsultaEnElDepartamentoDeLaAdministracionCompetente"),
    @XmlEnumValue("A6NoSeHaDispuestoDeLaCedulaUrbanisticaDelTerrenoHabiendoseContrastadoLosParametrosUrbanisticosManejadosEnElInformeEnConsultaALosServiciosUrbanisticosMunicipales")
    A_6_NO_SE_HA_DISPUESTO_DE_LA_CEDULA_URBANISTICA_DEL_TERRENO_HABIENDOSE_CONTRASTADO_LOS_PARAMETROS_URBANISTICOS_MANEJADOS_EN_EL_INFORME_EN_CONSULTA_A_LOS_SERVICIOS_URBANISTICOS_MUNICIPALES("A6NoSeHaDispuestoDeLaCedulaUrbanisticaDelTerrenoHabiendoseContrastadoLosParametrosUrbanisticosManejadosEnElInformeEnConsultaALosServiciosUrbanisticosMunicipales"),
    @XmlEnumValue("A7Advertenciasotros")
    A_7_ADVERTENCIASOTROS("A7Advertenciasotros");
    private final String value;

    ConfigurationTTipoAdvertencia(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationTTipoAdvertencia fromValue(String v) {
        for (ConfigurationTTipoAdvertencia c: ConfigurationTTipoAdvertencia.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
