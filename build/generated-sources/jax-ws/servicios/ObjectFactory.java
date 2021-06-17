
package servicios;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servicios package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _KODocument_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes", "KODocument");
    private final static QName _ConfigurationTMetodoValoracionEstadistico_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_MetodoValoracionEstadistico");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _OCRBase_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "OCRBase");
    private final static QName _ConfigurationTTipoError_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_TipoError");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Carga_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Carga");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _ConfigurationTTipoCarga_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_TipoCarga");
    private final static QName _VidaLaboral_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "VidaLaboral");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Finca_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Finca");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _ConfigurationTTipoRegimenEconomica_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_TipoRegimenEconomica");
    private final static QName _ArrayOfIRPF_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ArrayOfIRPF");
    private final static QName _BaseModel_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Base", "BaseModel");
    private final static QName _ConfigurationTProvincia_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_Provincia");
    private final static QName _ConfigurationTTipoRegimenProteccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_TipoRegimenProteccion");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _IRPF_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "IRPF");
    private final static QName _ArrayOfFincaTasacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ArrayOfFincaTasacion");
    private final static QName _ConfigurationTTipoAdvertencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_TipoAdvertencia");
    private final static QName _ConfigurationTTipoTitulosPropiedad_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_tipoTitulosPropiedad");
    private final static QName _ConfigurationTVisitaInmueble_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_VisitaInmueble");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _ArrayOfAdvertencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ArrayOfAdvertencia");
    private final static QName _ConfigurationTTipoDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_TipoDocumento");
    private final static QName _ConfigurationTTipoParticipacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_TipoParticipacion");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _OCRWSResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "OCRWSResult");
    private final static QName _Nomina_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Nomina");
    private final static QName _ArrayOfTitulo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ArrayOfTitulo");
    private final static QName _ConfigurationTTipoRelacionViviendaHabitual_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_TipoRelacionViviendaHabitual");
    private final static QName _ConfigurationTTipoFinca_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_TipoFinca");
    private final static QName _ConfigurationTTipoVia_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_TipoVia");
    private final static QName _ArrayOfRecibo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ArrayOfRecibo");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _ConfigurationTFinalidadTasacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_FinalidadTasacion");
    private final static QName _FincaTitular_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "FincaTitular");
    private final static QName _ConfigurationTLeyDeMercado_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_LeyDeMercado");
    private final static QName _NotaSimple_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "NotaSimple");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _ArrayOfTasacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ArrayOfTasacion");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _ArrayOfCarga_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ArrayOfCarga");
    private final static QName _FincaTasacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "FincaTasacion");
    private final static QName _ConfigurationTTipoPropiedad_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_tipoPropiedad");
    private final static QName _ConfigurationTTipoEstadoConservacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_TipoEstadoConservacion");
    private final static QName _ArrayOfFincaTitular_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ArrayOfFincaTitular");
    private final static QName _ArrayOfOCRWSResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ArrayOfOCRWSResult");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _ConfigurationTMetodoValoracion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_MetodoValoracion");
    private final static QName _ArrayOfDocumento_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ArrayOfDocumento");
    private final static QName _ConfigurationTTipoOcupacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_TipoOcupacion");
    private final static QName _Anejo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Anejo");
    private final static QName _ArrayOfCondicionante_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ArrayOfCondicionante");
    private final static QName _Advertencia_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Advertencia");
    private final static QName _ConfigurationTFuenteDeDatos_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_FuenteDeDatos");
    private final static QName _Condicionante_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Condicionante");
    private final static QName _ArrayOfDatosEnvio_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes", "ArrayOfDatosEnvio");
    private final static QName _ArrayOfNotaSimple_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ArrayOfNotaSimple");
    private final static QName _ArrayOfVidaLaboral_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ArrayOfVidaLaboral");
    private final static QName _Identificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Identificacion");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _ArrayOfNomina_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ArrayOfNomina");
    private final static QName _ConfigurationTTipoEstadoCivil_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_TipoEstadoCivil");
    private final static QName _Recibo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Recibo");
    private final static QName _Documento_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Documento");
    private final static QName _Titulo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Titulo");
    private final static QName _ConfigurationTTipoContratoLaboral_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_TipoContratoLaboral");
    private final static QName _ConfigurationTTipoRegimenSS_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_TipoRegimenSS");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _Persona_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Persona");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _ArrayOfKODocument_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes", "ArrayOfKODocument");
    private final static QName _PersonModelIdentifierType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Companies", "PersonModel.IdentifierType");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _ConfigurationTOpcionTributacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_OpcionTributacion");
    private final static QName _ConfigurationTGrupoCotizacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_GrupoCotizacion");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _ConfigurationTTipoCondicionante_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_TipoCondicionante");
    private final static QName _ConfigurationTAnioConstruccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Configuration.t_AnioConstruccion");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _ArrayOfAnejo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ArrayOfAnejo");
    private final static QName _ArrayOfNotaSimpleNodulos_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ArrayOfNotaSimpleNodulos");
    private final static QName _DatosEnvio_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes", "DatosEnvio");
    private final static QName _NotaSimpleNodulos_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "NotaSimpleNodulos");
    private final static QName _Tasacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Tasacion");
    private final static QName _ReceiveIRPFsResponseReceiveIRPFsResult_QNAME = new QName("http://tempuri.org/", "ReceiveIRPFsResult");
    private final static QName _ReceiveNotasSimplesNodulosNotasSimples_QNAME = new QName("http://tempuri.org/", "NotasSimples");
    private final static QName _FincaTasacionIdTasacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "IdTasacion");
    private final static QName _FincaTasacionTitulares_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Titulares");
    private final static QName _FincaTasacionAnejos_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Anejos");
    private final static QName _FincaTasacionValorTasacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ValorTasacion");
    private final static QName _FincaTasacionValorHipotecario_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ValorHipotecario");
    private final static QName _ReciboFechaVencimiento_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "FechaVencimiento");
    private final static QName _ReceiveKODocumentsResponseReceiveKODocumentsResult_QNAME = new QName("http://tempuri.org/", "ReceiveKODocumentsResult");
    private final static QName _DatosEnvioIDSolicitud_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes", "IDSolicitud");
    private final static QName _DatosEnvioDocumentos_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes", "Documentos");
    private final static QName _ReceiveTasacionesResponseReceiveTasacionesResult_QNAME = new QName("http://tempuri.org/", "ReceiveTasacionesResult");
    private final static QName _FincaIdufir_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Idufir");
    private final static QName _FincaNumeroFinca_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "NumeroFinca");
    private final static QName _FincaEscalera_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Escalera");
    private final static QName _FincaFechaVerificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "FechaVerificacion");
    private final static QName _FincaRegistroPropiedad_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "RegistroPropiedad");
    private final static QName _FincaPuerta_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Puerta");
    private final static QName _FincaCodigoPostal_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "CodigoPostal");
    private final static QName _FincaPortal_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Portal");
    private final static QName _FincaReferenciaCatastral_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ReferenciaCatastral");
    private final static QName _FincaPlanta_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Planta");
    private final static QName _FincaCargas_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Cargas");
    private final static QName _FincaDireccion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Direccion");
    private final static QName _FincaFechaCalificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "FechaCalificacion");
    private final static QName _ReceiveNominasNominas_QNAME = new QName("http://tempuri.org/", "Nominas");
    private final static QName _VidaLaboralNumeroSeguridadSocial_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "NumeroSeguridadSocial");
    private final static QName _VidaLaboralCodCEA_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "CodCEA");
    private final static QName _VidaLaboralIdCEA_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "IdCEA");
    private final static QName _VidaLaboralNIF_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "NIF");
    private final static QName _IdentificacionNumeroIdentificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "NumeroIdentificacion");
    private final static QName _ReceiveRecibosRecibos_QNAME = new QName("http://tempuri.org/", "Recibos");
    private final static QName _TasacionCodigoTasacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "CodigoTasacion");
    private final static QName _TasacionAdvertencias_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Advertencias");
    private final static QName _TasacionCodigoTasacionSociedadTasacionEstadistica_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "CodigoTasacionSociedadTasacionEstadistica");
    private final static QName _TasacionFechaValoracionEstadistica_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "FechaValoracionEstadistica");
    private final static QName _TasacionCondicionantes_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Condicionantes");
    private final static QName _TasacionSolicitante_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Solicitante");
    private final static QName _TasacionEmpresaTasadora_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "EmpresaTasadora");
    private final static QName _TasacionCodigoSociedadTasacionEstadistica_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "CodigoSociedadTasacionEstadistica");
    private final static QName _TasacionValorTasacionEstadistico_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ValorTasacionEstadistico");
    private final static QName _TasacionNombreTasador_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "NombreTasador");
    private final static QName _TasacionObservaciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Observaciones");
    private final static QName _TasacionFincas_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Fincas");
    private final static QName _ReceiveTasacionesTasaciones_QNAME = new QName("http://tempuri.org/", "Tasaciones");
    private final static QName _NominaEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Empresa");
    private final static QName _ReceiveNotasSimplesNodulosResponseReceiveNotasSimplesNodulosResult_QNAME = new QName("http://tempuri.org/", "ReceiveNotasSimplesNodulosResult");
    private final static QName _GetPendingDocumentsResponseGetPendingDocumentsResult_QNAME = new QName("http://tempuri.org/", "GetPendingDocumentsResult");
    private final static QName _ReceiveNotasSimplesResponseReceiveNotasSimplesResult_QNAME = new QName("http://tempuri.org/", "ReceiveNotasSimplesResult");
    private final static QName _PersonaTitulos_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Titulos");
    private final static QName _PersonaNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Nombre");
    private final static QName _PersonaApellido1_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Apellido1");
    private final static QName _PersonaApellido2_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Apellido2");
    private final static QName _ReceiveNominasResponseReceiveNominasResult_QNAME = new QName("http://tempuri.org/", "ReceiveNominasResult");
    private final static QName _KODocumentObservaciones_QNAME = new QName("http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes", "Observaciones");
    private final static QName _OCRWSResultDescripcionResultado_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "DescripcionResultado");
    private final static QName _ReceiveIRPFsIRPFs_QNAME = new QName("http://tempuri.org/", "IRPFs");
    private final static QName _DocumentoMimeType_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "MimeType");
    private final static QName _DocumentoFileName_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "FileName");
    private final static QName _DocumentoContent_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Content");
    private final static QName _ReceiveVidasLaboralesResponseReceiveVidasLaboralesResult_QNAME = new QName("http://tempuri.org/", "ReceiveVidasLaboralesResult");
    private final static QName _FincaTitularTitular_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Titular");
    private final static QName _ReceiveKODocumentsKODocuemnts_QNAME = new QName("http://tempuri.org/", "KODocuemnts");
    private final static QName _ReceiveVidasLaboralesVidasLaborales_QNAME = new QName("http://tempuri.org/", "VidasLaborales");
    private final static QName _CargaNotarioCesion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "NotarioCesion");
    private final static QName _CargaProtocoloCesion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ProtocoloCesion");
    private final static QName _CargaFechaInscripcionCarga_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "FechaInscripcionCarga");
    private final static QName _CargaRelacionCarga_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "RelacionCarga");
    private final static QName _CargaFechaCertificacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "FechaCertificacion");
    private final static QName _CargaNotario_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Notario");
    private final static QName _CargaAuto_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Auto");
    private final static QName _CargaFechaAuto_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "FechaAuto");
    private final static QName _CargaFechaInscripcionCesion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "FechaInscripcionCesion");
    private final static QName _CargaJuzgado_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Juzgado");
    private final static QName _CargaBeneficiarioCesion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "BeneficiarioCesion");
    private final static QName _CargaFechaEscritura_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "FechaEscritura");
    private final static QName _CargaCertificacionDominio_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "CertificacionDominio");
    private final static QName _CargaBeneficiarioHipotecaBanco_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "BeneficiarioHipotecaBanco");
    private final static QName _CargaMoneda_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Moneda");
    private final static QName _CargaLetra_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Letra");
    private final static QName _CargaDescripcionNovacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "DescripcionNovacion");
    private final static QName _CargaBeneficiarioHipoteca_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "BeneficiarioHipoteca");
    private final static QName _CargaCesion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Cesion");
    private final static QName _CargaProtocolo_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Protocolo");
    private final static QName _CargaResponsabilidadHipoteca_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "ResponsabilidadHipoteca");
    private final static QName _CargaFechaCesion_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "FechaCesion");
    private final static QName _TituloNotaria_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "Notaria");
    private final static QName _TituloIdPersona_QNAME = new QName("http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", "IdPersona");
    private final static QName _ReceiveRecibosResponseReceiveRecibosResult_QNAME = new QName("http://tempuri.org/", "ReceiveRecibosResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReceiveNotasSimples }
     * 
     */
    public ReceiveNotasSimples createReceiveNotasSimples() {
        return new ReceiveNotasSimples();
    }

    /**
     * Create an instance of {@link ArrayOfNotaSimple }
     * 
     */
    public ArrayOfNotaSimple createArrayOfNotaSimple() {
        return new ArrayOfNotaSimple();
    }

    /**
     * Create an instance of {@link GetPendingDocumentsResponse }
     * 
     */
    public GetPendingDocumentsResponse createGetPendingDocumentsResponse() {
        return new GetPendingDocumentsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDatosEnvio }
     * 
     */
    public ArrayOfDatosEnvio createArrayOfDatosEnvio() {
        return new ArrayOfDatosEnvio();
    }

    /**
     * Create an instance of {@link ReceiveRecibosResponse }
     * 
     */
    public ReceiveRecibosResponse createReceiveRecibosResponse() {
        return new ReceiveRecibosResponse();
    }

    /**
     * Create an instance of {@link ArrayOfOCRWSResult }
     * 
     */
    public ArrayOfOCRWSResult createArrayOfOCRWSResult() {
        return new ArrayOfOCRWSResult();
    }

    /**
     * Create an instance of {@link ReceiveKODocuments }
     * 
     */
    public ReceiveKODocuments createReceiveKODocuments() {
        return new ReceiveKODocuments();
    }

    /**
     * Create an instance of {@link ArrayOfKODocument }
     * 
     */
    public ArrayOfKODocument createArrayOfKODocument() {
        return new ArrayOfKODocument();
    }

    /**
     * Create an instance of {@link ReceiveNominas }
     * 
     */
    public ReceiveNominas createReceiveNominas() {
        return new ReceiveNominas();
    }

    /**
     * Create an instance of {@link ArrayOfNomina }
     * 
     */
    public ArrayOfNomina createArrayOfNomina() {
        return new ArrayOfNomina();
    }

    /**
     * Create an instance of {@link ReceiveVidasLaboralesResponse }
     * 
     */
    public ReceiveVidasLaboralesResponse createReceiveVidasLaboralesResponse() {
        return new ReceiveVidasLaboralesResponse();
    }

    /**
     * Create an instance of {@link ReceiveTasaciones }
     * 
     */
    public ReceiveTasaciones createReceiveTasaciones() {
        return new ReceiveTasaciones();
    }

    /**
     * Create an instance of {@link ArrayOfTasacion }
     * 
     */
    public ArrayOfTasacion createArrayOfTasacion() {
        return new ArrayOfTasacion();
    }

    /**
     * Create an instance of {@link ReceiveNominasResponse }
     * 
     */
    public ReceiveNominasResponse createReceiveNominasResponse() {
        return new ReceiveNominasResponse();
    }

    /**
     * Create an instance of {@link ReceiveNotasSimplesNodulosResponse }
     * 
     */
    public ReceiveNotasSimplesNodulosResponse createReceiveNotasSimplesNodulosResponse() {
        return new ReceiveNotasSimplesNodulosResponse();
    }

    /**
     * Create an instance of {@link ReceiveRecibos }
     * 
     */
    public ReceiveRecibos createReceiveRecibos() {
        return new ReceiveRecibos();
    }

    /**
     * Create an instance of {@link ArrayOfRecibo }
     * 
     */
    public ArrayOfRecibo createArrayOfRecibo() {
        return new ArrayOfRecibo();
    }

    /**
     * Create an instance of {@link ReceiveKODocumentsResponse }
     * 
     */
    public ReceiveKODocumentsResponse createReceiveKODocumentsResponse() {
        return new ReceiveKODocumentsResponse();
    }

    /**
     * Create an instance of {@link ReceiveNotasSimplesNodulos }
     * 
     */
    public ReceiveNotasSimplesNodulos createReceiveNotasSimplesNodulos() {
        return new ReceiveNotasSimplesNodulos();
    }

    /**
     * Create an instance of {@link ArrayOfNotaSimpleNodulos }
     * 
     */
    public ArrayOfNotaSimpleNodulos createArrayOfNotaSimpleNodulos() {
        return new ArrayOfNotaSimpleNodulos();
    }

    /**
     * Create an instance of {@link GetPendingDocuments }
     * 
     */
    public GetPendingDocuments createGetPendingDocuments() {
        return new GetPendingDocuments();
    }

    /**
     * Create an instance of {@link ReceiveVidasLaborales }
     * 
     */
    public ReceiveVidasLaborales createReceiveVidasLaborales() {
        return new ReceiveVidasLaborales();
    }

    /**
     * Create an instance of {@link ArrayOfVidaLaboral }
     * 
     */
    public ArrayOfVidaLaboral createArrayOfVidaLaboral() {
        return new ArrayOfVidaLaboral();
    }

    /**
     * Create an instance of {@link ReceiveIRPFsResponse }
     * 
     */
    public ReceiveIRPFsResponse createReceiveIRPFsResponse() {
        return new ReceiveIRPFsResponse();
    }

    /**
     * Create an instance of {@link ReceiveIRPFs }
     * 
     */
    public ReceiveIRPFs createReceiveIRPFs() {
        return new ReceiveIRPFs();
    }

    /**
     * Create an instance of {@link ArrayOfIRPF }
     * 
     */
    public ArrayOfIRPF createArrayOfIRPF() {
        return new ArrayOfIRPF();
    }

    /**
     * Create an instance of {@link ReceiveNotasSimplesResponse }
     * 
     */
    public ReceiveNotasSimplesResponse createReceiveNotasSimplesResponse() {
        return new ReceiveNotasSimplesResponse();
    }

    /**
     * Create an instance of {@link ReceiveTasacionesResponse }
     * 
     */
    public ReceiveTasacionesResponse createReceiveTasacionesResponse() {
        return new ReceiveTasacionesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDocumento }
     * 
     */
    public ArrayOfDocumento createArrayOfDocumento() {
        return new ArrayOfDocumento();
    }

    /**
     * Create an instance of {@link ArrayOfCondicionante }
     * 
     */
    public ArrayOfCondicionante createArrayOfCondicionante() {
        return new ArrayOfCondicionante();
    }

    /**
     * Create an instance of {@link Anejo }
     * 
     */
    public Anejo createAnejo() {
        return new Anejo();
    }

    /**
     * Create an instance of {@link Condicionante }
     * 
     */
    public Condicionante createCondicionante() {
        return new Condicionante();
    }

    /**
     * Create an instance of {@link Advertencia }
     * 
     */
    public Advertencia createAdvertencia() {
        return new Advertencia();
    }

    /**
     * Create an instance of {@link NotaSimple }
     * 
     */
    public NotaSimple createNotaSimple() {
        return new NotaSimple();
    }

    /**
     * Create an instance of {@link FincaTitular }
     * 
     */
    public FincaTitular createFincaTitular() {
        return new FincaTitular();
    }

    /**
     * Create an instance of {@link FincaTasacion }
     * 
     */
    public FincaTasacion createFincaTasacion() {
        return new FincaTasacion();
    }

    /**
     * Create an instance of {@link ArrayOfCarga }
     * 
     */
    public ArrayOfCarga createArrayOfCarga() {
        return new ArrayOfCarga();
    }

    /**
     * Create an instance of {@link ArrayOfFincaTitular }
     * 
     */
    public ArrayOfFincaTitular createArrayOfFincaTitular() {
        return new ArrayOfFincaTitular();
    }

    /**
     * Create an instance of {@link ArrayOfAnejo }
     * 
     */
    public ArrayOfAnejo createArrayOfAnejo() {
        return new ArrayOfAnejo();
    }

    /**
     * Create an instance of {@link Tasacion }
     * 
     */
    public Tasacion createTasacion() {
        return new Tasacion();
    }

    /**
     * Create an instance of {@link NotaSimpleNodulos }
     * 
     */
    public NotaSimpleNodulos createNotaSimpleNodulos() {
        return new NotaSimpleNodulos();
    }

    /**
     * Create an instance of {@link Recibo }
     * 
     */
    public Recibo createRecibo() {
        return new Recibo();
    }

    /**
     * Create an instance of {@link Documento }
     * 
     */
    public Documento createDocumento() {
        return new Documento();
    }

    /**
     * Create an instance of {@link Titulo }
     * 
     */
    public Titulo createTitulo() {
        return new Titulo();
    }

    /**
     * Create an instance of {@link Identificacion }
     * 
     */
    public Identificacion createIdentificacion() {
        return new Identificacion();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link Finca }
     * 
     */
    public Finca createFinca() {
        return new Finca();
    }

    /**
     * Create an instance of {@link VidaLaboral }
     * 
     */
    public VidaLaboral createVidaLaboral() {
        return new VidaLaboral();
    }

    /**
     * Create an instance of {@link IRPF }
     * 
     */
    public IRPF createIRPF() {
        return new IRPF();
    }

    /**
     * Create an instance of {@link ArrayOfFincaTasacion }
     * 
     */
    public ArrayOfFincaTasacion createArrayOfFincaTasacion() {
        return new ArrayOfFincaTasacion();
    }

    /**
     * Create an instance of {@link OCRBase }
     * 
     */
    public OCRBase createOCRBase() {
        return new OCRBase();
    }

    /**
     * Create an instance of {@link Carga }
     * 
     */
    public Carga createCarga() {
        return new Carga();
    }

    /**
     * Create an instance of {@link ArrayOfTitulo }
     * 
     */
    public ArrayOfTitulo createArrayOfTitulo() {
        return new ArrayOfTitulo();
    }

    /**
     * Create an instance of {@link ArrayOfAdvertencia }
     * 
     */
    public ArrayOfAdvertencia createArrayOfAdvertencia() {
        return new ArrayOfAdvertencia();
    }

    /**
     * Create an instance of {@link OCRWSResult }
     * 
     */
    public OCRWSResult createOCRWSResult() {
        return new OCRWSResult();
    }

    /**
     * Create an instance of {@link Nomina }
     * 
     */
    public Nomina createNomina() {
        return new Nomina();
    }

    /**
     * Create an instance of {@link BaseModel }
     * 
     */
    public BaseModel createBaseModel() {
        return new BaseModel();
    }

    /**
     * Create an instance of {@link DatosEnvio }
     * 
     */
    public DatosEnvio createDatosEnvio() {
        return new DatosEnvio();
    }

    /**
     * Create an instance of {@link KODocument }
     * 
     */
    public KODocument createKODocument() {
        return new KODocument();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link KODocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes", name = "KODocument")
    public JAXBElement<KODocument> createKODocument(KODocument value) {
        return new JAXBElement<KODocument>(_KODocument_QNAME, KODocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTMetodoValoracionEstadistico }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_MetodoValoracionEstadistico")
    public JAXBElement<ConfigurationTMetodoValoracionEstadistico> createConfigurationTMetodoValoracionEstadistico(ConfigurationTMetodoValoracionEstadistico value) {
        return new JAXBElement<ConfigurationTMetodoValoracionEstadistico>(_ConfigurationTMetodoValoracionEstadistico_QNAME, ConfigurationTMetodoValoracionEstadistico.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OCRBase }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "OCRBase")
    public JAXBElement<OCRBase> createOCRBase(OCRBase value) {
        return new JAXBElement<OCRBase>(_OCRBase_QNAME, OCRBase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTTipoError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_TipoError")
    public JAXBElement<ConfigurationTTipoError> createConfigurationTTipoError(ConfigurationTTipoError value) {
        return new JAXBElement<ConfigurationTTipoError>(_ConfigurationTTipoError_QNAME, ConfigurationTTipoError.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Carga }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Carga")
    public JAXBElement<Carga> createCarga(Carga value) {
        return new JAXBElement<Carga>(_Carga_QNAME, Carga.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTTipoCarga }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_TipoCarga")
    public JAXBElement<ConfigurationTTipoCarga> createConfigurationTTipoCarga(ConfigurationTTipoCarga value) {
        return new JAXBElement<ConfigurationTTipoCarga>(_ConfigurationTTipoCarga_QNAME, ConfigurationTTipoCarga.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VidaLaboral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "VidaLaboral")
    public JAXBElement<VidaLaboral> createVidaLaboral(VidaLaboral value) {
        return new JAXBElement<VidaLaboral>(_VidaLaboral_QNAME, VidaLaboral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Finca }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Finca")
    public JAXBElement<Finca> createFinca(Finca value) {
        return new JAXBElement<Finca>(_Finca_QNAME, Finca.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTTipoRegimenEconomica }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_TipoRegimenEconomica")
    public JAXBElement<ConfigurationTTipoRegimenEconomica> createConfigurationTTipoRegimenEconomica(ConfigurationTTipoRegimenEconomica value) {
        return new JAXBElement<ConfigurationTTipoRegimenEconomica>(_ConfigurationTTipoRegimenEconomica_QNAME, ConfigurationTTipoRegimenEconomica.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIRPF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ArrayOfIRPF")
    public JAXBElement<ArrayOfIRPF> createArrayOfIRPF(ArrayOfIRPF value) {
        return new JAXBElement<ArrayOfIRPF>(_ArrayOfIRPF_QNAME, ArrayOfIRPF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Base", name = "BaseModel")
    public JAXBElement<BaseModel> createBaseModel(BaseModel value) {
        return new JAXBElement<BaseModel>(_BaseModel_QNAME, BaseModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTProvincia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_Provincia")
    public JAXBElement<ConfigurationTProvincia> createConfigurationTProvincia(ConfigurationTProvincia value) {
        return new JAXBElement<ConfigurationTProvincia>(_ConfigurationTProvincia_QNAME, ConfigurationTProvincia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTTipoRegimenProteccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_TipoRegimenProteccion")
    public JAXBElement<ConfigurationTTipoRegimenProteccion> createConfigurationTTipoRegimenProteccion(ConfigurationTTipoRegimenProteccion value) {
        return new JAXBElement<ConfigurationTTipoRegimenProteccion>(_ConfigurationTTipoRegimenProteccion_QNAME, ConfigurationTTipoRegimenProteccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IRPF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "IRPF")
    public JAXBElement<IRPF> createIRPF(IRPF value) {
        return new JAXBElement<IRPF>(_IRPF_QNAME, IRPF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFincaTasacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ArrayOfFincaTasacion")
    public JAXBElement<ArrayOfFincaTasacion> createArrayOfFincaTasacion(ArrayOfFincaTasacion value) {
        return new JAXBElement<ArrayOfFincaTasacion>(_ArrayOfFincaTasacion_QNAME, ArrayOfFincaTasacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTTipoAdvertencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_TipoAdvertencia")
    public JAXBElement<ConfigurationTTipoAdvertencia> createConfigurationTTipoAdvertencia(ConfigurationTTipoAdvertencia value) {
        return new JAXBElement<ConfigurationTTipoAdvertencia>(_ConfigurationTTipoAdvertencia_QNAME, ConfigurationTTipoAdvertencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTTipoTitulosPropiedad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_tipoTitulosPropiedad")
    public JAXBElement<ConfigurationTTipoTitulosPropiedad> createConfigurationTTipoTitulosPropiedad(ConfigurationTTipoTitulosPropiedad value) {
        return new JAXBElement<ConfigurationTTipoTitulosPropiedad>(_ConfigurationTTipoTitulosPropiedad_QNAME, ConfigurationTTipoTitulosPropiedad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTVisitaInmueble }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_VisitaInmueble")
    public JAXBElement<ConfigurationTVisitaInmueble> createConfigurationTVisitaInmueble(ConfigurationTVisitaInmueble value) {
        return new JAXBElement<ConfigurationTVisitaInmueble>(_ConfigurationTVisitaInmueble_QNAME, ConfigurationTVisitaInmueble.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdvertencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ArrayOfAdvertencia")
    public JAXBElement<ArrayOfAdvertencia> createArrayOfAdvertencia(ArrayOfAdvertencia value) {
        return new JAXBElement<ArrayOfAdvertencia>(_ArrayOfAdvertencia_QNAME, ArrayOfAdvertencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTTipoDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_TipoDocumento")
    public JAXBElement<ConfigurationTTipoDocumento> createConfigurationTTipoDocumento(ConfigurationTTipoDocumento value) {
        return new JAXBElement<ConfigurationTTipoDocumento>(_ConfigurationTTipoDocumento_QNAME, ConfigurationTTipoDocumento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTTipoParticipacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_TipoParticipacion")
    public JAXBElement<ConfigurationTTipoParticipacion> createConfigurationTTipoParticipacion(ConfigurationTTipoParticipacion value) {
        return new JAXBElement<ConfigurationTTipoParticipacion>(_ConfigurationTTipoParticipacion_QNAME, ConfigurationTTipoParticipacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OCRWSResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "OCRWSResult")
    public JAXBElement<OCRWSResult> createOCRWSResult(OCRWSResult value) {
        return new JAXBElement<OCRWSResult>(_OCRWSResult_QNAME, OCRWSResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Nomina }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Nomina")
    public JAXBElement<Nomina> createNomina(Nomina value) {
        return new JAXBElement<Nomina>(_Nomina_QNAME, Nomina.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTitulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ArrayOfTitulo")
    public JAXBElement<ArrayOfTitulo> createArrayOfTitulo(ArrayOfTitulo value) {
        return new JAXBElement<ArrayOfTitulo>(_ArrayOfTitulo_QNAME, ArrayOfTitulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTTipoRelacionViviendaHabitual }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_TipoRelacionViviendaHabitual")
    public JAXBElement<ConfigurationTTipoRelacionViviendaHabitual> createConfigurationTTipoRelacionViviendaHabitual(ConfigurationTTipoRelacionViviendaHabitual value) {
        return new JAXBElement<ConfigurationTTipoRelacionViviendaHabitual>(_ConfigurationTTipoRelacionViviendaHabitual_QNAME, ConfigurationTTipoRelacionViviendaHabitual.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTTipoFinca }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_TipoFinca")
    public JAXBElement<ConfigurationTTipoFinca> createConfigurationTTipoFinca(ConfigurationTTipoFinca value) {
        return new JAXBElement<ConfigurationTTipoFinca>(_ConfigurationTTipoFinca_QNAME, ConfigurationTTipoFinca.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTTipoVia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_TipoVia")
    public JAXBElement<ConfigurationTTipoVia> createConfigurationTTipoVia(ConfigurationTTipoVia value) {
        return new JAXBElement<ConfigurationTTipoVia>(_ConfigurationTTipoVia_QNAME, ConfigurationTTipoVia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRecibo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ArrayOfRecibo")
    public JAXBElement<ArrayOfRecibo> createArrayOfRecibo(ArrayOfRecibo value) {
        return new JAXBElement<ArrayOfRecibo>(_ArrayOfRecibo_QNAME, ArrayOfRecibo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTFinalidadTasacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_FinalidadTasacion")
    public JAXBElement<ConfigurationTFinalidadTasacion> createConfigurationTFinalidadTasacion(ConfigurationTFinalidadTasacion value) {
        return new JAXBElement<ConfigurationTFinalidadTasacion>(_ConfigurationTFinalidadTasacion_QNAME, ConfigurationTFinalidadTasacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FincaTitular }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "FincaTitular")
    public JAXBElement<FincaTitular> createFincaTitular(FincaTitular value) {
        return new JAXBElement<FincaTitular>(_FincaTitular_QNAME, FincaTitular.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTLeyDeMercado }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_LeyDeMercado")
    public JAXBElement<ConfigurationTLeyDeMercado> createConfigurationTLeyDeMercado(ConfigurationTLeyDeMercado value) {
        return new JAXBElement<ConfigurationTLeyDeMercado>(_ConfigurationTLeyDeMercado_QNAME, ConfigurationTLeyDeMercado.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotaSimple }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "NotaSimple")
    public JAXBElement<NotaSimple> createNotaSimple(NotaSimple value) {
        return new JAXBElement<NotaSimple>(_NotaSimple_QNAME, NotaSimple.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTasacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ArrayOfTasacion")
    public JAXBElement<ArrayOfTasacion> createArrayOfTasacion(ArrayOfTasacion value) {
        return new JAXBElement<ArrayOfTasacion>(_ArrayOfTasacion_QNAME, ArrayOfTasacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCarga }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ArrayOfCarga")
    public JAXBElement<ArrayOfCarga> createArrayOfCarga(ArrayOfCarga value) {
        return new JAXBElement<ArrayOfCarga>(_ArrayOfCarga_QNAME, ArrayOfCarga.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FincaTasacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "FincaTasacion")
    public JAXBElement<FincaTasacion> createFincaTasacion(FincaTasacion value) {
        return new JAXBElement<FincaTasacion>(_FincaTasacion_QNAME, FincaTasacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTTipoPropiedad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_tipoPropiedad")
    public JAXBElement<ConfigurationTTipoPropiedad> createConfigurationTTipoPropiedad(ConfigurationTTipoPropiedad value) {
        return new JAXBElement<ConfigurationTTipoPropiedad>(_ConfigurationTTipoPropiedad_QNAME, ConfigurationTTipoPropiedad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTTipoEstadoConservacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_TipoEstadoConservacion")
    public JAXBElement<ConfigurationTTipoEstadoConservacion> createConfigurationTTipoEstadoConservacion(ConfigurationTTipoEstadoConservacion value) {
        return new JAXBElement<ConfigurationTTipoEstadoConservacion>(_ConfigurationTTipoEstadoConservacion_QNAME, ConfigurationTTipoEstadoConservacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFincaTitular }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ArrayOfFincaTitular")
    public JAXBElement<ArrayOfFincaTitular> createArrayOfFincaTitular(ArrayOfFincaTitular value) {
        return new JAXBElement<ArrayOfFincaTitular>(_ArrayOfFincaTitular_QNAME, ArrayOfFincaTitular.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOCRWSResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ArrayOfOCRWSResult")
    public JAXBElement<ArrayOfOCRWSResult> createArrayOfOCRWSResult(ArrayOfOCRWSResult value) {
        return new JAXBElement<ArrayOfOCRWSResult>(_ArrayOfOCRWSResult_QNAME, ArrayOfOCRWSResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTMetodoValoracion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_MetodoValoracion")
    public JAXBElement<ConfigurationTMetodoValoracion> createConfigurationTMetodoValoracion(ConfigurationTMetodoValoracion value) {
        return new JAXBElement<ConfigurationTMetodoValoracion>(_ConfigurationTMetodoValoracion_QNAME, ConfigurationTMetodoValoracion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ArrayOfDocumento")
    public JAXBElement<ArrayOfDocumento> createArrayOfDocumento(ArrayOfDocumento value) {
        return new JAXBElement<ArrayOfDocumento>(_ArrayOfDocumento_QNAME, ArrayOfDocumento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTTipoOcupacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_TipoOcupacion")
    public JAXBElement<ConfigurationTTipoOcupacion> createConfigurationTTipoOcupacion(ConfigurationTTipoOcupacion value) {
        return new JAXBElement<ConfigurationTTipoOcupacion>(_ConfigurationTTipoOcupacion_QNAME, ConfigurationTTipoOcupacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Anejo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Anejo")
    public JAXBElement<Anejo> createAnejo(Anejo value) {
        return new JAXBElement<Anejo>(_Anejo_QNAME, Anejo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCondicionante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ArrayOfCondicionante")
    public JAXBElement<ArrayOfCondicionante> createArrayOfCondicionante(ArrayOfCondicionante value) {
        return new JAXBElement<ArrayOfCondicionante>(_ArrayOfCondicionante_QNAME, ArrayOfCondicionante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Advertencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Advertencia")
    public JAXBElement<Advertencia> createAdvertencia(Advertencia value) {
        return new JAXBElement<Advertencia>(_Advertencia_QNAME, Advertencia.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTFuenteDeDatos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_FuenteDeDatos")
    public JAXBElement<ConfigurationTFuenteDeDatos> createConfigurationTFuenteDeDatos(ConfigurationTFuenteDeDatos value) {
        return new JAXBElement<ConfigurationTFuenteDeDatos>(_ConfigurationTFuenteDeDatos_QNAME, ConfigurationTFuenteDeDatos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Condicionante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Condicionante")
    public JAXBElement<Condicionante> createCondicionante(Condicionante value) {
        return new JAXBElement<Condicionante>(_Condicionante_QNAME, Condicionante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosEnvio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes", name = "ArrayOfDatosEnvio")
    public JAXBElement<ArrayOfDatosEnvio> createArrayOfDatosEnvio(ArrayOfDatosEnvio value) {
        return new JAXBElement<ArrayOfDatosEnvio>(_ArrayOfDatosEnvio_QNAME, ArrayOfDatosEnvio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotaSimple }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ArrayOfNotaSimple")
    public JAXBElement<ArrayOfNotaSimple> createArrayOfNotaSimple(ArrayOfNotaSimple value) {
        return new JAXBElement<ArrayOfNotaSimple>(_ArrayOfNotaSimple_QNAME, ArrayOfNotaSimple.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVidaLaboral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ArrayOfVidaLaboral")
    public JAXBElement<ArrayOfVidaLaboral> createArrayOfVidaLaboral(ArrayOfVidaLaboral value) {
        return new JAXBElement<ArrayOfVidaLaboral>(_ArrayOfVidaLaboral_QNAME, ArrayOfVidaLaboral.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Identificacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Identificacion")
    public JAXBElement<Identificacion> createIdentificacion(Identificacion value) {
        return new JAXBElement<Identificacion>(_Identificacion_QNAME, Identificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNomina }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ArrayOfNomina")
    public JAXBElement<ArrayOfNomina> createArrayOfNomina(ArrayOfNomina value) {
        return new JAXBElement<ArrayOfNomina>(_ArrayOfNomina_QNAME, ArrayOfNomina.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTTipoEstadoCivil }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_TipoEstadoCivil")
    public JAXBElement<ConfigurationTTipoEstadoCivil> createConfigurationTTipoEstadoCivil(ConfigurationTTipoEstadoCivil value) {
        return new JAXBElement<ConfigurationTTipoEstadoCivil>(_ConfigurationTTipoEstadoCivil_QNAME, ConfigurationTTipoEstadoCivil.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Recibo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Recibo")
    public JAXBElement<Recibo> createRecibo(Recibo value) {
        return new JAXBElement<Recibo>(_Recibo_QNAME, Recibo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Documento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Documento")
    public JAXBElement<Documento> createDocumento(Documento value) {
        return new JAXBElement<Documento>(_Documento_QNAME, Documento.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Titulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Titulo")
    public JAXBElement<Titulo> createTitulo(Titulo value) {
        return new JAXBElement<Titulo>(_Titulo_QNAME, Titulo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_TipoContratoLaboral")
    public JAXBElement<String> createConfigurationTTipoContratoLaboral(String value) {
        return new JAXBElement<String>(_ConfigurationTTipoContratoLaboral_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTTipoRegimenSS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_TipoRegimenSS")
    public JAXBElement<ConfigurationTTipoRegimenSS> createConfigurationTTipoRegimenSS(ConfigurationTTipoRegimenSS value) {
        return new JAXBElement<ConfigurationTTipoRegimenSS>(_ConfigurationTTipoRegimenSS_QNAME, ConfigurationTTipoRegimenSS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Persona")
    public JAXBElement<Persona> createPersona(Persona value) {
        return new JAXBElement<Persona>(_Persona_QNAME, Persona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKODocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes", name = "ArrayOfKODocument")
    public JAXBElement<ArrayOfKODocument> createArrayOfKODocument(ArrayOfKODocument value) {
        return new JAXBElement<ArrayOfKODocument>(_ArrayOfKODocument_QNAME, ArrayOfKODocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonModelIdentifierType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Companies", name = "PersonModel.IdentifierType")
    public JAXBElement<PersonModelIdentifierType> createPersonModelIdentifierType(PersonModelIdentifierType value) {
        return new JAXBElement<PersonModelIdentifierType>(_PersonModelIdentifierType_QNAME, PersonModelIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTOpcionTributacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_OpcionTributacion")
    public JAXBElement<ConfigurationTOpcionTributacion> createConfigurationTOpcionTributacion(ConfigurationTOpcionTributacion value) {
        return new JAXBElement<ConfigurationTOpcionTributacion>(_ConfigurationTOpcionTributacion_QNAME, ConfigurationTOpcionTributacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTGrupoCotizacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_GrupoCotizacion")
    public JAXBElement<ConfigurationTGrupoCotizacion> createConfigurationTGrupoCotizacion(ConfigurationTGrupoCotizacion value) {
        return new JAXBElement<ConfigurationTGrupoCotizacion>(_ConfigurationTGrupoCotizacion_QNAME, ConfigurationTGrupoCotizacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTTipoCondicionante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_TipoCondicionante")
    public JAXBElement<ConfigurationTTipoCondicionante> createConfigurationTTipoCondicionante(ConfigurationTTipoCondicionante value) {
        return new JAXBElement<ConfigurationTTipoCondicionante>(_ConfigurationTTipoCondicionante_QNAME, ConfigurationTTipoCondicionante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationTAnioConstruccion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Configuration.t_AnioConstruccion")
    public JAXBElement<ConfigurationTAnioConstruccion> createConfigurationTAnioConstruccion(ConfigurationTAnioConstruccion value) {
        return new JAXBElement<ConfigurationTAnioConstruccion>(_ConfigurationTAnioConstruccion_QNAME, ConfigurationTAnioConstruccion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAnejo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ArrayOfAnejo")
    public JAXBElement<ArrayOfAnejo> createArrayOfAnejo(ArrayOfAnejo value) {
        return new JAXBElement<ArrayOfAnejo>(_ArrayOfAnejo_QNAME, ArrayOfAnejo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotaSimpleNodulos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ArrayOfNotaSimpleNodulos")
    public JAXBElement<ArrayOfNotaSimpleNodulos> createArrayOfNotaSimpleNodulos(ArrayOfNotaSimpleNodulos value) {
        return new JAXBElement<ArrayOfNotaSimpleNodulos>(_ArrayOfNotaSimpleNodulos_QNAME, ArrayOfNotaSimpleNodulos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosEnvio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes", name = "DatosEnvio")
    public JAXBElement<DatosEnvio> createDatosEnvio(DatosEnvio value) {
        return new JAXBElement<DatosEnvio>(_DatosEnvio_QNAME, DatosEnvio.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotaSimpleNodulos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "NotaSimpleNodulos")
    public JAXBElement<NotaSimpleNodulos> createNotaSimpleNodulos(NotaSimpleNodulos value) {
        return new JAXBElement<NotaSimpleNodulos>(_NotaSimpleNodulos_QNAME, NotaSimpleNodulos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Tasacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Tasacion")
    public JAXBElement<Tasacion> createTasacion(Tasacion value) {
        return new JAXBElement<Tasacion>(_Tasacion_QNAME, Tasacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOCRWSResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ReceiveIRPFsResult", scope = ReceiveIRPFsResponse.class)
    public JAXBElement<ArrayOfOCRWSResult> createReceiveIRPFsResponseReceiveIRPFsResult(ArrayOfOCRWSResult value) {
        return new JAXBElement<ArrayOfOCRWSResult>(_ReceiveIRPFsResponseReceiveIRPFsResult_QNAME, ArrayOfOCRWSResult.class, ReceiveIRPFsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotaSimpleNodulos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "NotasSimples", scope = ReceiveNotasSimplesNodulos.class)
    public JAXBElement<ArrayOfNotaSimpleNodulos> createReceiveNotasSimplesNodulosNotasSimples(ArrayOfNotaSimpleNodulos value) {
        return new JAXBElement<ArrayOfNotaSimpleNodulos>(_ReceiveNotasSimplesNodulosNotasSimples_QNAME, ArrayOfNotaSimpleNodulos.class, ReceiveNotasSimplesNodulos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "IdTasacion", scope = FincaTasacion.class)
    public JAXBElement<Integer> createFincaTasacionIdTasacion(Integer value) {
        return new JAXBElement<Integer>(_FincaTasacionIdTasacion_QNAME, Integer.class, FincaTasacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFincaTitular }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Titulares", scope = FincaTasacion.class)
    public JAXBElement<ArrayOfFincaTitular> createFincaTasacionTitulares(ArrayOfFincaTitular value) {
        return new JAXBElement<ArrayOfFincaTitular>(_FincaTasacionTitulares_QNAME, ArrayOfFincaTitular.class, FincaTasacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Finca }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Finca", scope = FincaTasacion.class)
    public JAXBElement<Finca> createFincaTasacionFinca(Finca value) {
        return new JAXBElement<Finca>(_Finca_QNAME, Finca.class, FincaTasacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAnejo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Anejos", scope = FincaTasacion.class)
    public JAXBElement<ArrayOfAnejo> createFincaTasacionAnejos(ArrayOfAnejo value) {
        return new JAXBElement<ArrayOfAnejo>(_FincaTasacionAnejos_QNAME, ArrayOfAnejo.class, FincaTasacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ValorTasacion", scope = FincaTasacion.class)
    public JAXBElement<Double> createFincaTasacionValorTasacion(Double value) {
        return new JAXBElement<Double>(_FincaTasacionValorTasacion_QNAME, Double.class, FincaTasacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ValorHipotecario", scope = FincaTasacion.class)
    public JAXBElement<Double> createFincaTasacionValorHipotecario(Double value) {
        return new JAXBElement<Double>(_FincaTasacionValorHipotecario_QNAME, Double.class, FincaTasacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "FechaVencimiento", scope = Recibo.class)
    public JAXBElement<XMLGregorianCalendar> createReciboFechaVencimiento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ReciboFechaVencimiento_QNAME, XMLGregorianCalendar.class, Recibo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOCRWSResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ReceiveKODocumentsResult", scope = ReceiveKODocumentsResponse.class)
    public JAXBElement<ArrayOfOCRWSResult> createReceiveKODocumentsResponseReceiveKODocumentsResult(ArrayOfOCRWSResult value) {
        return new JAXBElement<ArrayOfOCRWSResult>(_ReceiveKODocumentsResponseReceiveKODocumentsResult_QNAME, ArrayOfOCRWSResult.class, ReceiveKODocumentsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes", name = "IDSolicitud", scope = DatosEnvio.class)
    public JAXBElement<Integer> createDatosEnvioIDSolicitud(Integer value) {
        return new JAXBElement<Integer>(_DatosEnvioIDSolicitud_QNAME, Integer.class, DatosEnvio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDocumento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes", name = "Documentos", scope = DatosEnvio.class)
    public JAXBElement<ArrayOfDocumento> createDatosEnvioDocumentos(ArrayOfDocumento value) {
        return new JAXBElement<ArrayOfDocumento>(_DatosEnvioDocumentos_QNAME, ArrayOfDocumento.class, DatosEnvio.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOCRWSResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ReceiveTasacionesResult", scope = ReceiveTasacionesResponse.class)
    public JAXBElement<ArrayOfOCRWSResult> createReceiveTasacionesResponseReceiveTasacionesResult(ArrayOfOCRWSResult value) {
        return new JAXBElement<ArrayOfOCRWSResult>(_ReceiveTasacionesResponseReceiveTasacionesResult_QNAME, ArrayOfOCRWSResult.class, ReceiveTasacionesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Idufir", scope = Finca.class)
    public JAXBElement<String> createFincaIdufir(String value) {
        return new JAXBElement<String>(_FincaIdufir_QNAME, String.class, Finca.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "NumeroFinca", scope = Finca.class)
    public JAXBElement<String> createFincaNumeroFinca(String value) {
        return new JAXBElement<String>(_FincaNumeroFinca_QNAME, String.class, Finca.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Escalera", scope = Finca.class)
    public JAXBElement<String> createFincaEscalera(String value) {
        return new JAXBElement<String>(_FincaEscalera_QNAME, String.class, Finca.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "FechaVerificacion", scope = Finca.class)
    public JAXBElement<XMLGregorianCalendar> createFincaFechaVerificacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FincaFechaVerificacion_QNAME, XMLGregorianCalendar.class, Finca.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "RegistroPropiedad", scope = Finca.class)
    public JAXBElement<Integer> createFincaRegistroPropiedad(Integer value) {
        return new JAXBElement<Integer>(_FincaRegistroPropiedad_QNAME, Integer.class, Finca.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Puerta", scope = Finca.class)
    public JAXBElement<String> createFincaPuerta(String value) {
        return new JAXBElement<String>(_FincaPuerta_QNAME, String.class, Finca.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "CodigoPostal", scope = Finca.class)
    public JAXBElement<String> createFincaCodigoPostal(String value) {
        return new JAXBElement<String>(_FincaCodigoPostal_QNAME, String.class, Finca.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Portal", scope = Finca.class)
    public JAXBElement<String> createFincaPortal(String value) {
        return new JAXBElement<String>(_FincaPortal_QNAME, String.class, Finca.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ReferenciaCatastral", scope = Finca.class)
    public JAXBElement<String> createFincaReferenciaCatastral(String value) {
        return new JAXBElement<String>(_FincaReferenciaCatastral_QNAME, String.class, Finca.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Planta", scope = Finca.class)
    public JAXBElement<String> createFincaPlanta(String value) {
        return new JAXBElement<String>(_FincaPlanta_QNAME, String.class, Finca.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCarga }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Cargas", scope = Finca.class)
    public JAXBElement<ArrayOfCarga> createFincaCargas(ArrayOfCarga value) {
        return new JAXBElement<ArrayOfCarga>(_FincaCargas_QNAME, ArrayOfCarga.class, Finca.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Direccion", scope = Finca.class)
    public JAXBElement<String> createFincaDireccion(String value) {
        return new JAXBElement<String>(_FincaDireccion_QNAME, String.class, Finca.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "FechaCalificacion", scope = Finca.class)
    public JAXBElement<XMLGregorianCalendar> createFincaFechaCalificacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FincaFechaCalificacion_QNAME, XMLGregorianCalendar.class, Finca.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNomina }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Nominas", scope = ReceiveNominas.class)
    public JAXBElement<ArrayOfNomina> createReceiveNominasNominas(ArrayOfNomina value) {
        return new JAXBElement<ArrayOfNomina>(_ReceiveNominasNominas_QNAME, ArrayOfNomina.class, ReceiveNominas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "NumeroSeguridadSocial", scope = VidaLaboral.class)
    public JAXBElement<String> createVidaLaboralNumeroSeguridadSocial(String value) {
        return new JAXBElement<String>(_VidaLaboralNumeroSeguridadSocial_QNAME, String.class, VidaLaboral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Documento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Documento", scope = VidaLaboral.class)
    public JAXBElement<Documento> createVidaLaboralDocumento(Documento value) {
        return new JAXBElement<Documento>(_Documento_QNAME, Documento.class, VidaLaboral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "CodCEA", scope = VidaLaboral.class)
    public JAXBElement<String> createVidaLaboralCodCEA(String value) {
        return new JAXBElement<String>(_VidaLaboralCodCEA_QNAME, String.class, VidaLaboral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "IdCEA", scope = VidaLaboral.class)
    public JAXBElement<String> createVidaLaboralIdCEA(String value) {
        return new JAXBElement<String>(_VidaLaboralIdCEA_QNAME, String.class, VidaLaboral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "NIF", scope = VidaLaboral.class)
    public JAXBElement<String> createVidaLaboralNIF(String value) {
        return new JAXBElement<String>(_VidaLaboralNIF_QNAME, String.class, VidaLaboral.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "NumeroIdentificacion", scope = Identificacion.class)
    public JAXBElement<String> createIdentificacionNumeroIdentificacion(String value) {
        return new JAXBElement<String>(_IdentificacionNumeroIdentificacion_QNAME, String.class, Identificacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfRecibo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Recibos", scope = ReceiveRecibos.class)
    public JAXBElement<ArrayOfRecibo> createReceiveRecibosRecibos(ArrayOfRecibo value) {
        return new JAXBElement<ArrayOfRecibo>(_ReceiveRecibosRecibos_QNAME, ArrayOfRecibo.class, ReceiveRecibos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNotaSimple }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "NotasSimples", scope = ReceiveNotasSimples.class)
    public JAXBElement<ArrayOfNotaSimple> createReceiveNotasSimplesNotasSimples(ArrayOfNotaSimple value) {
        return new JAXBElement<ArrayOfNotaSimple>(_ReceiveNotasSimplesNodulosNotasSimples_QNAME, ArrayOfNotaSimple.class, ReceiveNotasSimples.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "IdTasacion", scope = Condicionante.class)
    public JAXBElement<Integer> createCondicionanteIdTasacion(Integer value) {
        return new JAXBElement<Integer>(_FincaTasacionIdTasacion_QNAME, Integer.class, Condicionante.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "CodigoTasacion", scope = Tasacion.class)
    public JAXBElement<String> createTasacionCodigoTasacion(String value) {
        return new JAXBElement<String>(_TasacionCodigoTasacion_QNAME, String.class, Tasacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAdvertencia }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Advertencias", scope = Tasacion.class)
    public JAXBElement<ArrayOfAdvertencia> createTasacionAdvertencias(ArrayOfAdvertencia value) {
        return new JAXBElement<ArrayOfAdvertencia>(_TasacionAdvertencias_QNAME, ArrayOfAdvertencia.class, Tasacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "CodigoTasacionSociedadTasacionEstadistica", scope = Tasacion.class)
    public JAXBElement<String> createTasacionCodigoTasacionSociedadTasacionEstadistica(String value) {
        return new JAXBElement<String>(_TasacionCodigoTasacionSociedadTasacionEstadistica_QNAME, String.class, Tasacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "FechaValoracionEstadistica", scope = Tasacion.class)
    public JAXBElement<XMLGregorianCalendar> createTasacionFechaValoracionEstadistica(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TasacionFechaValoracionEstadistica_QNAME, XMLGregorianCalendar.class, Tasacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCondicionante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Condicionantes", scope = Tasacion.class)
    public JAXBElement<ArrayOfCondicionante> createTasacionCondicionantes(ArrayOfCondicionante value) {
        return new JAXBElement<ArrayOfCondicionante>(_TasacionCondicionantes_QNAME, ArrayOfCondicionante.class, Tasacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Solicitante", scope = Tasacion.class)
    public JAXBElement<String> createTasacionSolicitante(String value) {
        return new JAXBElement<String>(_TasacionSolicitante_QNAME, String.class, Tasacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Documento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Documento", scope = Tasacion.class)
    public JAXBElement<Documento> createTasacionDocumento(Documento value) {
        return new JAXBElement<Documento>(_Documento_QNAME, Documento.class, Tasacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "EmpresaTasadora", scope = Tasacion.class)
    public JAXBElement<String> createTasacionEmpresaTasadora(String value) {
        return new JAXBElement<String>(_TasacionEmpresaTasadora_QNAME, String.class, Tasacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "CodigoSociedadTasacionEstadistica", scope = Tasacion.class)
    public JAXBElement<String> createTasacionCodigoSociedadTasacionEstadistica(String value) {
        return new JAXBElement<String>(_TasacionCodigoSociedadTasacionEstadistica_QNAME, String.class, Tasacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ValorTasacionEstadistico", scope = Tasacion.class)
    public JAXBElement<Double> createTasacionValorTasacionEstadistico(Double value) {
        return new JAXBElement<Double>(_TasacionValorTasacionEstadistico_QNAME, Double.class, Tasacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "NombreTasador", scope = Tasacion.class)
    public JAXBElement<String> createTasacionNombreTasador(String value) {
        return new JAXBElement<String>(_TasacionNombreTasador_QNAME, String.class, Tasacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Observaciones", scope = Tasacion.class)
    public JAXBElement<String> createTasacionObservaciones(String value) {
        return new JAXBElement<String>(_TasacionObservaciones_QNAME, String.class, Tasacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFincaTasacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Fincas", scope = Tasacion.class)
    public JAXBElement<ArrayOfFincaTasacion> createTasacionFincas(ArrayOfFincaTasacion value) {
        return new JAXBElement<ArrayOfFincaTasacion>(_TasacionFincas_QNAME, ArrayOfFincaTasacion.class, Tasacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTasacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Tasaciones", scope = ReceiveTasaciones.class)
    public JAXBElement<ArrayOfTasacion> createReceiveTasacionesTasaciones(ArrayOfTasacion value) {
        return new JAXBElement<ArrayOfTasacion>(_ReceiveTasacionesTasaciones_QNAME, ArrayOfTasacion.class, ReceiveTasaciones.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Empresa", scope = Nomina.class)
    public JAXBElement<String> createNominaEmpresa(String value) {
        return new JAXBElement<String>(_NominaEmpresa_QNAME, String.class, Nomina.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFincaTitular }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Titulares", scope = NotaSimple.class)
    public JAXBElement<ArrayOfFincaTitular> createNotaSimpleTitulares(ArrayOfFincaTitular value) {
        return new JAXBElement<ArrayOfFincaTitular>(_FincaTasacionTitulares_QNAME, ArrayOfFincaTitular.class, NotaSimple.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Finca }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Finca", scope = NotaSimple.class)
    public JAXBElement<Finca> createNotaSimpleFinca(Finca value) {
        return new JAXBElement<Finca>(_Finca_QNAME, Finca.class, NotaSimple.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAnejo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Anejos", scope = NotaSimple.class)
    public JAXBElement<ArrayOfAnejo> createNotaSimpleAnejos(ArrayOfAnejo value) {
        return new JAXBElement<ArrayOfAnejo>(_FincaTasacionAnejos_QNAME, ArrayOfAnejo.class, NotaSimple.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Documento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Documento", scope = NotaSimple.class)
    public JAXBElement<Documento> createNotaSimpleDocumento(Documento value) {
        return new JAXBElement<Documento>(_Documento_QNAME, Documento.class, NotaSimple.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOCRWSResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ReceiveNotasSimplesNodulosResult", scope = ReceiveNotasSimplesNodulosResponse.class)
    public JAXBElement<ArrayOfOCRWSResult> createReceiveNotasSimplesNodulosResponseReceiveNotasSimplesNodulosResult(ArrayOfOCRWSResult value) {
        return new JAXBElement<ArrayOfOCRWSResult>(_ReceiveNotasSimplesNodulosResponseReceiveNotasSimplesNodulosResult_QNAME, ArrayOfOCRWSResult.class, ReceiveNotasSimplesNodulosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDatosEnvio }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPendingDocumentsResult", scope = GetPendingDocumentsResponse.class)
    public JAXBElement<ArrayOfDatosEnvio> createGetPendingDocumentsResponseGetPendingDocumentsResult(ArrayOfDatosEnvio value) {
        return new JAXBElement<ArrayOfDatosEnvio>(_GetPendingDocumentsResponseGetPendingDocumentsResult_QNAME, ArrayOfDatosEnvio.class, GetPendingDocumentsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOCRWSResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ReceiveNotasSimplesResult", scope = ReceiveNotasSimplesResponse.class)
    public JAXBElement<ArrayOfOCRWSResult> createReceiveNotasSimplesResponseReceiveNotasSimplesResult(ArrayOfOCRWSResult value) {
        return new JAXBElement<ArrayOfOCRWSResult>(_ReceiveNotasSimplesResponseReceiveNotasSimplesResult_QNAME, ArrayOfOCRWSResult.class, ReceiveNotasSimplesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTitulo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Titulos", scope = Persona.class)
    public JAXBElement<ArrayOfTitulo> createPersonaTitulos(ArrayOfTitulo value) {
        return new JAXBElement<ArrayOfTitulo>(_PersonaTitulos_QNAME, ArrayOfTitulo.class, Persona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Identificacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Identificacion", scope = Persona.class)
    public JAXBElement<Identificacion> createPersonaIdentificacion(Identificacion value) {
        return new JAXBElement<Identificacion>(_Identificacion_QNAME, Identificacion.class, Persona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Nombre", scope = Persona.class)
    public JAXBElement<String> createPersonaNombre(String value) {
        return new JAXBElement<String>(_PersonaNombre_QNAME, String.class, Persona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Apellido1", scope = Persona.class)
    public JAXBElement<String> createPersonaApellido1(String value) {
        return new JAXBElement<String>(_PersonaApellido1_QNAME, String.class, Persona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Apellido2", scope = Persona.class)
    public JAXBElement<String> createPersonaApellido2(String value) {
        return new JAXBElement<String>(_PersonaApellido2_QNAME, String.class, Persona.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOCRWSResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ReceiveNominasResult", scope = ReceiveNominasResponse.class)
    public JAXBElement<ArrayOfOCRWSResult> createReceiveNominasResponseReceiveNominasResult(ArrayOfOCRWSResult value) {
        return new JAXBElement<ArrayOfOCRWSResult>(_ReceiveNominasResponseReceiveNominasResult_QNAME, ArrayOfOCRWSResult.class, ReceiveNominasResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes", name = "Observaciones", scope = KODocument.class)
    public JAXBElement<String> createKODocumentObservaciones(String value) {
        return new JAXBElement<String>(_KODocumentObservaciones_QNAME, String.class, KODocument.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "DescripcionResultado", scope = OCRWSResult.class)
    public JAXBElement<String> createOCRWSResultDescripcionResultado(String value) {
        return new JAXBElement<String>(_OCRWSResultDescripcionResultado_QNAME, String.class, OCRWSResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfIRPF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IRPFs", scope = ReceiveIRPFs.class)
    public JAXBElement<ArrayOfIRPF> createReceiveIRPFsIRPFs(ArrayOfIRPF value) {
        return new JAXBElement<ArrayOfIRPF>(_ReceiveIRPFsIRPFs_QNAME, ArrayOfIRPF.class, ReceiveIRPFs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "MimeType", scope = Documento.class)
    public JAXBElement<String> createDocumentoMimeType(String value) {
        return new JAXBElement<String>(_DocumentoMimeType_QNAME, String.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "FileName", scope = Documento.class)
    public JAXBElement<String> createDocumentoFileName(String value) {
        return new JAXBElement<String>(_DocumentoFileName_QNAME, String.class, Documento.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Content", scope = Documento.class)
    public JAXBElement<byte[]> createDocumentoContent(byte[] value) {
        return new JAXBElement<byte[]>(_DocumentoContent_QNAME, byte[].class, Documento.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOCRWSResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ReceiveVidasLaboralesResult", scope = ReceiveVidasLaboralesResponse.class)
    public JAXBElement<ArrayOfOCRWSResult> createReceiveVidasLaboralesResponseReceiveVidasLaboralesResult(ArrayOfOCRWSResult value) {
        return new JAXBElement<ArrayOfOCRWSResult>(_ReceiveVidasLaboralesResponseReceiveVidasLaboralesResult_QNAME, ArrayOfOCRWSResult.class, ReceiveVidasLaboralesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Titular", scope = FincaTitular.class)
    public JAXBElement<Persona> createFincaTitularTitular(Persona value) {
        return new JAXBElement<Persona>(_FincaTitularTitular_QNAME, Persona.class, FincaTitular.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfKODocument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "KODocuemnts", scope = ReceiveKODocuments.class)
    public JAXBElement<ArrayOfKODocument> createReceiveKODocumentsKODocuemnts(ArrayOfKODocument value) {
        return new JAXBElement<ArrayOfKODocument>(_ReceiveKODocumentsKODocuemnts_QNAME, ArrayOfKODocument.class, ReceiveKODocuments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Documento }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Documento", scope = NotaSimpleNodulos.class)
    public JAXBElement<Documento> createNotaSimpleNodulosDocumento(Documento value) {
        return new JAXBElement<Documento>(_Documento_QNAME, Documento.class, NotaSimpleNodulos.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfVidaLaboral }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "VidasLaborales", scope = ReceiveVidasLaborales.class)
    public JAXBElement<ArrayOfVidaLaboral> createReceiveVidasLaboralesVidasLaborales(ArrayOfVidaLaboral value) {
        return new JAXBElement<ArrayOfVidaLaboral>(_ReceiveVidasLaboralesVidasLaborales_QNAME, ArrayOfVidaLaboral.class, ReceiveVidasLaborales.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "NotarioCesion", scope = Carga.class)
    public JAXBElement<String> createCargaNotarioCesion(String value) {
        return new JAXBElement<String>(_CargaNotarioCesion_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ProtocoloCesion", scope = Carga.class)
    public JAXBElement<String> createCargaProtocoloCesion(String value) {
        return new JAXBElement<String>(_CargaProtocoloCesion_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "FechaInscripcionCarga", scope = Carga.class)
    public JAXBElement<XMLGregorianCalendar> createCargaFechaInscripcionCarga(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CargaFechaInscripcionCarga_QNAME, XMLGregorianCalendar.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "RelacionCarga", scope = Carga.class)
    public JAXBElement<String> createCargaRelacionCarga(String value) {
        return new JAXBElement<String>(_CargaRelacionCarga_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "FechaCertificacion", scope = Carga.class)
    public JAXBElement<XMLGregorianCalendar> createCargaFechaCertificacion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CargaFechaCertificacion_QNAME, XMLGregorianCalendar.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Notario", scope = Carga.class)
    public JAXBElement<String> createCargaNotario(String value) {
        return new JAXBElement<String>(_CargaNotario_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Auto", scope = Carga.class)
    public JAXBElement<String> createCargaAuto(String value) {
        return new JAXBElement<String>(_CargaAuto_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "FechaAuto", scope = Carga.class)
    public JAXBElement<XMLGregorianCalendar> createCargaFechaAuto(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CargaFechaAuto_QNAME, XMLGregorianCalendar.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "FechaInscripcionCesion", scope = Carga.class)
    public JAXBElement<XMLGregorianCalendar> createCargaFechaInscripcionCesion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CargaFechaInscripcionCesion_QNAME, XMLGregorianCalendar.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Juzgado", scope = Carga.class)
    public JAXBElement<String> createCargaJuzgado(String value) {
        return new JAXBElement<String>(_CargaJuzgado_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "BeneficiarioCesion", scope = Carga.class)
    public JAXBElement<String> createCargaBeneficiarioCesion(String value) {
        return new JAXBElement<String>(_CargaBeneficiarioCesion_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "FechaEscritura", scope = Carga.class)
    public JAXBElement<XMLGregorianCalendar> createCargaFechaEscritura(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CargaFechaEscritura_QNAME, XMLGregorianCalendar.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "FechaVencimiento", scope = Carga.class)
    public JAXBElement<XMLGregorianCalendar> createCargaFechaVencimiento(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ReciboFechaVencimiento_QNAME, XMLGregorianCalendar.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "CertificacionDominio", scope = Carga.class)
    public JAXBElement<String> createCargaCertificacionDominio(String value) {
        return new JAXBElement<String>(_CargaCertificacionDominio_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "BeneficiarioHipotecaBanco", scope = Carga.class)
    public JAXBElement<Integer> createCargaBeneficiarioHipotecaBanco(Integer value) {
        return new JAXBElement<Integer>(_CargaBeneficiarioHipotecaBanco_QNAME, Integer.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Moneda", scope = Carga.class)
    public JAXBElement<String> createCargaMoneda(String value) {
        return new JAXBElement<String>(_CargaMoneda_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Letra", scope = Carga.class)
    public JAXBElement<String> createCargaLetra(String value) {
        return new JAXBElement<String>(_CargaLetra_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "DescripcionNovacion", scope = Carga.class)
    public JAXBElement<String> createCargaDescripcionNovacion(String value) {
        return new JAXBElement<String>(_CargaDescripcionNovacion_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "BeneficiarioHipoteca", scope = Carga.class)
    public JAXBElement<String> createCargaBeneficiarioHipoteca(String value) {
        return new JAXBElement<String>(_CargaBeneficiarioHipoteca_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Cesion", scope = Carga.class)
    public JAXBElement<String> createCargaCesion(String value) {
        return new JAXBElement<String>(_CargaCesion_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Protocolo", scope = Carga.class)
    public JAXBElement<String> createCargaProtocolo(String value) {
        return new JAXBElement<String>(_CargaProtocolo_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "ResponsabilidadHipoteca", scope = Carga.class)
    public JAXBElement<String> createCargaResponsabilidadHipoteca(String value) {
        return new JAXBElement<String>(_CargaResponsabilidadHipoteca_QNAME, String.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "FechaCesion", scope = Carga.class)
    public JAXBElement<XMLGregorianCalendar> createCargaFechaCesion(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CargaFechaCesion_QNAME, XMLGregorianCalendar.class, Carga.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Notaria", scope = Titulo.class)
    public JAXBElement<String> createTituloNotaria(String value) {
        return new JAXBElement<String>(_TituloNotaria_QNAME, String.class, Titulo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "IdPersona", scope = Titulo.class)
    public JAXBElement<Integer> createTituloIdPersona(Integer value) {
        return new JAXBElement<Integer>(_TituloIdPersona_QNAME, Integer.class, Titulo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", name = "Protocolo", scope = Titulo.class)
    public JAXBElement<String> createTituloProtocolo(String value) {
        return new JAXBElement<String>(_CargaProtocolo_QNAME, String.class, Titulo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfOCRWSResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ReceiveRecibosResult", scope = ReceiveRecibosResponse.class)
    public JAXBElement<ArrayOfOCRWSResult> createReceiveRecibosResponseReceiveRecibosResult(ArrayOfOCRWSResult value) {
        return new JAXBElement<ArrayOfOCRWSResult>(_ReceiveRecibosResponseReceiveRecibosResult_QNAME, ArrayOfOCRWSResult.class, ReceiveRecibosResponse.class, value);
    }

}
