
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para IRPF complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IRPF">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}OCRBase">
 *       &lt;sequence>
 *         &lt;element name="Aportaciones" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BaseImponibleAhorro" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="BaseImponibleGeneral" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Documento" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Documento"/>
 *         &lt;element name="EstadoCivil" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_TipoEstadoCivil" minOccurs="0"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="IdSolicitudOCR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NIF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OpcionTributacion" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_OpcionTributacion" minOccurs="0"/>
 *         &lt;element name="PersonasACargo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Provincia" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_Provincia" minOccurs="0"/>
 *         &lt;element name="RelacionViviendaHabitual" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_TipoRelacionViviendaHabitual" minOccurs="0"/>
 *         &lt;element name="RendimientoNetoInmuebleArrendado" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ResultadoDeclaracion" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="RetencionesPorRendimientoTrabajo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IRPF", propOrder = {
    "aportaciones",
    "baseImponibleAhorro",
    "baseImponibleGeneral",
    "codigoPostal",
    "documento",
    "estadoCivil",
    "fecha",
    "idSolicitudOCR",
    "nif",
    "nombre",
    "opcionTributacion",
    "personasACargo",
    "provincia",
    "relacionViviendaHabitual",
    "rendimientoNetoInmuebleArrendado",
    "resultadoDeclaracion",
    "retencionesPorRendimientoTrabajo"
})
public class IRPF
    extends OCRBase
{

    @XmlElement(name = "Aportaciones")
    protected double aportaciones;
    @XmlElement(name = "BaseImponibleAhorro")
    protected double baseImponibleAhorro;
    @XmlElement(name = "BaseImponibleGeneral")
    protected double baseImponibleGeneral;
    @XmlElement(name = "CodigoPostal", required = true, nillable = true)
    protected String codigoPostal;
    @XmlElement(name = "Documento", required = true, nillable = true)
    protected Documento documento;
    @XmlElement(name = "EstadoCivil")
    protected ConfigurationTTipoEstadoCivil estadoCivil;
    @XmlElement(name = "Fecha", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "IdSolicitudOCR")
    protected int idSolicitudOCR;
    @XmlElement(name = "NIF", required = true, nillable = true)
    protected String nif;
    @XmlElement(name = "Nombre", required = true, nillable = true)
    protected String nombre;
    @XmlElement(name = "OpcionTributacion")
    protected ConfigurationTOpcionTributacion opcionTributacion;
    @XmlElement(name = "PersonasACargo")
    protected int personasACargo;
    @XmlElement(name = "Provincia")
    protected ConfigurationTProvincia provincia;
    @XmlElement(name = "RelacionViviendaHabitual")
    protected ConfigurationTTipoRelacionViviendaHabitual relacionViviendaHabitual;
    @XmlElement(name = "RendimientoNetoInmuebleArrendado")
    protected double rendimientoNetoInmuebleArrendado;
    @XmlElement(name = "ResultadoDeclaracion")
    protected double resultadoDeclaracion;
    @XmlElement(name = "RetencionesPorRendimientoTrabajo")
    protected double retencionesPorRendimientoTrabajo;

    /**
     * Obtiene el valor de la propiedad aportaciones.
     * 
     */
    public double getAportaciones() {
        return aportaciones;
    }

    /**
     * Define el valor de la propiedad aportaciones.
     * 
     */
    public void setAportaciones(double value) {
        this.aportaciones = value;
    }

    /**
     * Obtiene el valor de la propiedad baseImponibleAhorro.
     * 
     */
    public double getBaseImponibleAhorro() {
        return baseImponibleAhorro;
    }

    /**
     * Define el valor de la propiedad baseImponibleAhorro.
     * 
     */
    public void setBaseImponibleAhorro(double value) {
        this.baseImponibleAhorro = value;
    }

    /**
     * Obtiene el valor de la propiedad baseImponibleGeneral.
     * 
     */
    public double getBaseImponibleGeneral() {
        return baseImponibleGeneral;
    }

    /**
     * Define el valor de la propiedad baseImponibleGeneral.
     * 
     */
    public void setBaseImponibleGeneral(double value) {
        this.baseImponibleGeneral = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoPostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Define el valor de la propiedad codigoPostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPostal(String value) {
        this.codigoPostal = value;
    }

    /**
     * Obtiene el valor de la propiedad documento.
     * 
     * @return
     *     possible object is
     *     {@link Documento }
     *     
     */
    public Documento getDocumento() {
        return documento;
    }

    /**
     * Define el valor de la propiedad documento.
     * 
     * @param value
     *     allowed object is
     *     {@link Documento }
     *     
     */
    public void setDocumento(Documento value) {
        this.documento = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoCivil.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTTipoEstadoCivil }
     *     
     */
    public ConfigurationTTipoEstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * Define el valor de la propiedad estadoCivil.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTTipoEstadoCivil }
     *     
     */
    public void setEstadoCivil(ConfigurationTTipoEstadoCivil value) {
        this.estadoCivil = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad idSolicitudOCR.
     * 
     */
    public int getIdSolicitudOCR() {
        return idSolicitudOCR;
    }

    /**
     * Define el valor de la propiedad idSolicitudOCR.
     * 
     */
    public void setIdSolicitudOCR(int value) {
        this.idSolicitudOCR = value;
    }

    /**
     * Obtiene el valor de la propiedad nif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIF() {
        return nif;
    }

    /**
     * Define el valor de la propiedad nif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIF(String value) {
        this.nif = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad opcionTributacion.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTOpcionTributacion }
     *     
     */
    public ConfigurationTOpcionTributacion getOpcionTributacion() {
        return opcionTributacion;
    }

    /**
     * Define el valor de la propiedad opcionTributacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTOpcionTributacion }
     *     
     */
    public void setOpcionTributacion(ConfigurationTOpcionTributacion value) {
        this.opcionTributacion = value;
    }

    /**
     * Obtiene el valor de la propiedad personasACargo.
     * 
     */
    public int getPersonasACargo() {
        return personasACargo;
    }

    /**
     * Define el valor de la propiedad personasACargo.
     * 
     */
    public void setPersonasACargo(int value) {
        this.personasACargo = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTProvincia }
     *     
     */
    public ConfigurationTProvincia getProvincia() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTProvincia }
     *     
     */
    public void setProvincia(ConfigurationTProvincia value) {
        this.provincia = value;
    }

    /**
     * Obtiene el valor de la propiedad relacionViviendaHabitual.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTTipoRelacionViviendaHabitual }
     *     
     */
    public ConfigurationTTipoRelacionViviendaHabitual getRelacionViviendaHabitual() {
        return relacionViviendaHabitual;
    }

    /**
     * Define el valor de la propiedad relacionViviendaHabitual.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTTipoRelacionViviendaHabitual }
     *     
     */
    public void setRelacionViviendaHabitual(ConfigurationTTipoRelacionViviendaHabitual value) {
        this.relacionViviendaHabitual = value;
    }

    /**
     * Obtiene el valor de la propiedad rendimientoNetoInmuebleArrendado.
     * 
     */
    public double getRendimientoNetoInmuebleArrendado() {
        return rendimientoNetoInmuebleArrendado;
    }

    /**
     * Define el valor de la propiedad rendimientoNetoInmuebleArrendado.
     * 
     */
    public void setRendimientoNetoInmuebleArrendado(double value) {
        this.rendimientoNetoInmuebleArrendado = value;
    }

    /**
     * Obtiene el valor de la propiedad resultadoDeclaracion.
     * 
     */
    public double getResultadoDeclaracion() {
        return resultadoDeclaracion;
    }

    /**
     * Define el valor de la propiedad resultadoDeclaracion.
     * 
     */
    public void setResultadoDeclaracion(double value) {
        this.resultadoDeclaracion = value;
    }

    /**
     * Obtiene el valor de la propiedad retencionesPorRendimientoTrabajo.
     * 
     */
    public double getRetencionesPorRendimientoTrabajo() {
        return retencionesPorRendimientoTrabajo;
    }

    /**
     * Define el valor de la propiedad retencionesPorRendimientoTrabajo.
     * 
     */
    public void setRetencionesPorRendimientoTrabajo(double value) {
        this.retencionesPorRendimientoTrabajo = value;
    }

}
