
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Nomina complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Nomina">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}OCRBase">
 *       &lt;sequence>
 *         &lt;element name="BaseImponible" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CNAE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContigenciasComunes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Documento" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Documento"/>
 *         &lt;element name="Empresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaAntiguedad" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GrupoCotizacion" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_GrupoCotizacion" minOccurs="0"/>
 *         &lt;element name="IdSolicitudOCR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ImporteARecibir" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NIF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroSeguridadSocial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Retencion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RetencionSeguridadSocial" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TipoIRPF" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nomina", propOrder = {
    "baseImponible",
    "cnae",
    "contigenciasComunes",
    "documento",
    "empresa",
    "fecha",
    "fechaAntiguedad",
    "grupoCotizacion",
    "idSolicitudOCR",
    "importeARecibir",
    "nif",
    "nombre",
    "numeroSeguridadSocial",
    "retencion",
    "retencionSeguridadSocial",
    "tipoIRPF"
})
public class Nomina
    extends OCRBase
{

    @XmlElement(name = "BaseImponible")
    protected Double baseImponible;
    @XmlElement(name = "CNAE", required = true, nillable = true)
    protected String cnae;
    @XmlElement(name = "ContigenciasComunes")
    protected Double contigenciasComunes;
    @XmlElement(name = "Documento", required = true, nillable = true)
    protected Documento documento;
    @XmlElementRef(name = "Empresa", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empresa;
    @XmlElement(name = "Fecha", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "FechaAntiguedad", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaAntiguedad;
    @XmlElement(name = "GrupoCotizacion")
    protected ConfigurationTGrupoCotizacion grupoCotizacion;
    @XmlElement(name = "IdSolicitudOCR")
    protected int idSolicitudOCR;
    @XmlElement(name = "ImporteARecibir")
    protected Double importeARecibir;
    @XmlElement(name = "NIF", required = true, nillable = true)
    protected String nif;
    @XmlElement(name = "Nombre", required = true, nillable = true)
    protected String nombre;
    @XmlElement(name = "NumeroSeguridadSocial", required = true, nillable = true)
    protected String numeroSeguridadSocial;
    @XmlElement(name = "Retencion")
    protected Double retencion;
    @XmlElement(name = "RetencionSeguridadSocial")
    protected Double retencionSeguridadSocial;
    @XmlElement(name = "TipoIRPF")
    protected Double tipoIRPF;

    /**
     * Gets the value of the baseImponible property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseImponible() {
        return baseImponible;
    }

    /**
     * Sets the value of the baseImponible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseImponible(Double value) {
        this.baseImponible = value;
    }

    /**
     * Gets the value of the cnae property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNAE() {
        return cnae;
    }

    /**
     * Sets the value of the cnae property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNAE(String value) {
        this.cnae = value;
    }

    /**
     * Gets the value of the contigenciasComunes property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getContigenciasComunes() {
        return contigenciasComunes;
    }

    /**
     * Sets the value of the contigenciasComunes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setContigenciasComunes(Double value) {
        this.contigenciasComunes = value;
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
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpresa() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpresa(JAXBElement<String> value) {
        this.empresa = value;
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
     * Gets the value of the fechaAntiguedad property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAntiguedad() {
        return fechaAntiguedad;
    }

    /**
     * Sets the value of the fechaAntiguedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAntiguedad(XMLGregorianCalendar value) {
        this.fechaAntiguedad = value;
    }

    /**
     * Gets the value of the grupoCotizacion property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTGrupoCotizacion }
     *     
     */
    public ConfigurationTGrupoCotizacion getGrupoCotizacion() {
        return grupoCotizacion;
    }

    /**
     * Sets the value of the grupoCotizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTGrupoCotizacion }
     *     
     */
    public void setGrupoCotizacion(ConfigurationTGrupoCotizacion value) {
        this.grupoCotizacion = value;
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
     * Gets the value of the importeARecibir property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImporteARecibir() {
        return importeARecibir;
    }

    /**
     * Sets the value of the importeARecibir property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImporteARecibir(Double value) {
        this.importeARecibir = value;
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
     * Gets the value of the numeroSeguridadSocial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    /**
     * Sets the value of the numeroSeguridadSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroSeguridadSocial(String value) {
        this.numeroSeguridadSocial = value;
    }

    /**
     * Gets the value of the retencion property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRetencion() {
        return retencion;
    }

    /**
     * Sets the value of the retencion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRetencion(Double value) {
        this.retencion = value;
    }

    /**
     * Gets the value of the retencionSeguridadSocial property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRetencionSeguridadSocial() {
        return retencionSeguridadSocial;
    }

    /**
     * Sets the value of the retencionSeguridadSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRetencionSeguridadSocial(Double value) {
        this.retencionSeguridadSocial = value;
    }

    /**
     * Gets the value of the tipoIRPF property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTipoIRPF() {
        return tipoIRPF;
    }

    /**
     * Sets the value of the tipoIRPF property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTipoIRPF(Double value) {
        this.tipoIRPF = value;
    }

}
