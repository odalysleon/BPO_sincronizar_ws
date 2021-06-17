
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
 * <p>Java class for VidaLaboral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VidaLaboral">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}OCRBase">
 *       &lt;sequence>
 *         &lt;element name="CodCEA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Documento" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Documento" minOccurs="0"/>
 *         &lt;element name="FechaAltaSS" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaAltaUltimaEmpresa" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaCEA" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaDocumento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IdCEA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdSolicitudOCR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NIF" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroAniosTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumeroSeguridadSocial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoContrato" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_TipoContratoLaboral" minOccurs="0"/>
 *         &lt;element name="TipoRegimen" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_TipoRegimenSS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VidaLaboral", propOrder = {
    "codCEA",
    "documento",
    "fechaAltaSS",
    "fechaAltaUltimaEmpresa",
    "fechaCEA",
    "fechaDocumento",
    "idCEA",
    "idSolicitudOCR",
    "nif",
    "nombre",
    "numeroAniosTotal",
    "numeroSeguridadSocial",
    "tipoContrato",
    "tipoRegimen"
})
public class VidaLaboral
    extends OCRBase
{

    @XmlElementRef(name = "CodCEA", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codCEA;
    @XmlElementRef(name = "Documento", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<Documento> documento;
    @XmlElement(name = "FechaAltaSS")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaAltaSS;
    @XmlElement(name = "FechaAltaUltimaEmpresa")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaAltaUltimaEmpresa;
    @XmlElement(name = "FechaCEA")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCEA;
    @XmlElement(name = "FechaDocumento")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDocumento;
    @XmlElementRef(name = "IdCEA", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idCEA;
    @XmlElement(name = "IdSolicitudOCR")
    protected Integer idSolicitudOCR;
    @XmlElementRef(name = "NIF", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nif;
    @XmlElement(name = "Nombre", required = true, nillable = true)
    protected String nombre;
    @XmlElement(name = "NumeroAniosTotal")
    protected Integer numeroAniosTotal;
    @XmlElementRef(name = "NumeroSeguridadSocial", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroSeguridadSocial;
    @XmlElement(name = "TipoContrato")
    protected String tipoContrato;
    @XmlElement(name = "TipoRegimen")
    protected ConfigurationTTipoRegimenSS tipoRegimen;

    /**
     * Gets the value of the codCEA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodCEA() {
        return codCEA;
    }

    /**
     * Sets the value of the codCEA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodCEA(JAXBElement<String> value) {
        this.codCEA = value;
    }

    /**
     * Gets the value of the documento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Documento }{@code >}
     *     
     */
    public JAXBElement<Documento> getDocumento() {
        return documento;
    }

    /**
     * Sets the value of the documento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Documento }{@code >}
     *     
     */
    public void setDocumento(JAXBElement<Documento> value) {
        this.documento = value;
    }

    /**
     * Gets the value of the fechaAltaSS property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAltaSS() {
        return fechaAltaSS;
    }

    /**
     * Sets the value of the fechaAltaSS property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAltaSS(XMLGregorianCalendar value) {
        this.fechaAltaSS = value;
    }

    /**
     * Gets the value of the fechaAltaUltimaEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAltaUltimaEmpresa() {
        return fechaAltaUltimaEmpresa;
    }

    /**
     * Sets the value of the fechaAltaUltimaEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAltaUltimaEmpresa(XMLGregorianCalendar value) {
        this.fechaAltaUltimaEmpresa = value;
    }

    /**
     * Gets the value of the fechaCEA property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCEA() {
        return fechaCEA;
    }

    /**
     * Sets the value of the fechaCEA property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCEA(XMLGregorianCalendar value) {
        this.fechaCEA = value;
    }

    /**
     * Gets the value of the fechaDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDocumento() {
        return fechaDocumento;
    }

    /**
     * Sets the value of the fechaDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDocumento(XMLGregorianCalendar value) {
        this.fechaDocumento = value;
    }

    /**
     * Gets the value of the idCEA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdCEA() {
        return idCEA;
    }

    /**
     * Sets the value of the idCEA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdCEA(JAXBElement<String> value) {
        this.idCEA = value;
    }

    /**
     * Gets the value of the idSolicitudOCR property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSolicitudOCR() {
        return idSolicitudOCR;
    }

    /**
     * Sets the value of the idSolicitudOCR property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSolicitudOCR(Integer value) {
        this.idSolicitudOCR = value;
    }

    /**
     * Gets the value of the nif property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNIF() {
        return nif;
    }

    /**
     * Sets the value of the nif property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNIF(JAXBElement<String> value) {
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
     * Gets the value of the numeroAniosTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroAniosTotal() {
        return numeroAniosTotal;
    }

    /**
     * Sets the value of the numeroAniosTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroAniosTotal(Integer value) {
        this.numeroAniosTotal = value;
    }

    /**
     * Gets the value of the numeroSeguridadSocial property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    /**
     * Sets the value of the numeroSeguridadSocial property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroSeguridadSocial(JAXBElement<String> value) {
        this.numeroSeguridadSocial = value;
    }

    /**
     * Gets the value of the tipoContrato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoContrato() {
        return tipoContrato;
    }

    /**
     * Sets the value of the tipoContrato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoContrato(String value) {
        this.tipoContrato = value;
    }

    /**
     * Gets the value of the tipoRegimen property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTTipoRegimenSS }
     *     
     */
    public ConfigurationTTipoRegimenSS getTipoRegimen() {
        return tipoRegimen;
    }

    /**
     * Sets the value of the tipoRegimen property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTTipoRegimenSS }
     *     
     */
    public void setTipoRegimen(ConfigurationTTipoRegimenSS value) {
        this.tipoRegimen = value;
    }

}
