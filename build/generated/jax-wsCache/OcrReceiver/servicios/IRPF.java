
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for IRPF complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the aportaciones property.
     * 
     */
    public double getAportaciones() {
        return aportaciones;
    }

    /**
     * Sets the value of the aportaciones property.
     * 
     */
    public void setAportaciones(double value) {
        this.aportaciones = value;
    }

    /**
     * Gets the value of the baseImponibleAhorro property.
     * 
     */
    public double getBaseImponibleAhorro() {
        return baseImponibleAhorro;
    }

    /**
     * Sets the value of the baseImponibleAhorro property.
     * 
     */
    public void setBaseImponibleAhorro(double value) {
        this.baseImponibleAhorro = value;
    }

    /**
     * Gets the value of the baseImponibleGeneral property.
     * 
     */
    public double getBaseImponibleGeneral() {
        return baseImponibleGeneral;
    }

    /**
     * Sets the value of the baseImponibleGeneral property.
     * 
     */
    public void setBaseImponibleGeneral(double value) {
        this.baseImponibleGeneral = value;
    }

    /**
     * Gets the value of the codigoPostal property.
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
     * Sets the value of the codigoPostal property.
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
     * Gets the value of the documento property.
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
     * Sets the value of the documento property.
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
     * Gets the value of the estadoCivil property.
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
     * Sets the value of the estadoCivil property.
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
     * Gets the value of the fecha property.
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
     * Sets the value of the fecha property.
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
     * Gets the value of the idSolicitudOCR property.
     * 
     */
    public int getIdSolicitudOCR() {
        return idSolicitudOCR;
    }

    /**
     * Sets the value of the idSolicitudOCR property.
     * 
     */
    public void setIdSolicitudOCR(int value) {
        this.idSolicitudOCR = value;
    }

    /**
     * Gets the value of the nif property.
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
     * Sets the value of the nif property.
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
     * Gets the value of the nombre property.
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
     * Sets the value of the nombre property.
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
     * Gets the value of the opcionTributacion property.
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
     * Sets the value of the opcionTributacion property.
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
     * Gets the value of the personasACargo property.
     * 
     */
    public int getPersonasACargo() {
        return personasACargo;
    }

    /**
     * Sets the value of the personasACargo property.
     * 
     */
    public void setPersonasACargo(int value) {
        this.personasACargo = value;
    }

    /**
     * Gets the value of the provincia property.
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
     * Sets the value of the provincia property.
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
     * Gets the value of the relacionViviendaHabitual property.
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
     * Sets the value of the relacionViviendaHabitual property.
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
     * Gets the value of the rendimientoNetoInmuebleArrendado property.
     * 
     */
    public double getRendimientoNetoInmuebleArrendado() {
        return rendimientoNetoInmuebleArrendado;
    }

    /**
     * Sets the value of the rendimientoNetoInmuebleArrendado property.
     * 
     */
    public void setRendimientoNetoInmuebleArrendado(double value) {
        this.rendimientoNetoInmuebleArrendado = value;
    }

    /**
     * Gets the value of the resultadoDeclaracion property.
     * 
     */
    public double getResultadoDeclaracion() {
        return resultadoDeclaracion;
    }

    /**
     * Sets the value of the resultadoDeclaracion property.
     * 
     */
    public void setResultadoDeclaracion(double value) {
        this.resultadoDeclaracion = value;
    }

    /**
     * Gets the value of the retencionesPorRendimientoTrabajo property.
     * 
     */
    public double getRetencionesPorRendimientoTrabajo() {
        return retencionesPorRendimientoTrabajo;
    }

    /**
     * Sets the value of the retencionesPorRendimientoTrabajo property.
     * 
     */
    public void setRetencionesPorRendimientoTrabajo(double value) {
        this.retencionesPorRendimientoTrabajo = value;
    }

}
