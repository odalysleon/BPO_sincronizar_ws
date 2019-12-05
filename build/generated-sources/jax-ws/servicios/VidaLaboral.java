
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
 * <p>Clase Java para VidaLaboral complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad codCEA.
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
     * Define el valor de la propiedad codCEA.
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
     * Obtiene el valor de la propiedad documento.
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
     * Define el valor de la propiedad documento.
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
     * Obtiene el valor de la propiedad fechaAltaSS.
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
     * Define el valor de la propiedad fechaAltaSS.
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
     * Obtiene el valor de la propiedad fechaAltaUltimaEmpresa.
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
     * Define el valor de la propiedad fechaAltaUltimaEmpresa.
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
     * Obtiene el valor de la propiedad fechaCEA.
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
     * Define el valor de la propiedad fechaCEA.
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
     * Obtiene el valor de la propiedad fechaDocumento.
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
     * Define el valor de la propiedad fechaDocumento.
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
     * Obtiene el valor de la propiedad idCEA.
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
     * Define el valor de la propiedad idCEA.
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
     * Obtiene el valor de la propiedad idSolicitudOCR.
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
     * Define el valor de la propiedad idSolicitudOCR.
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
     * Obtiene el valor de la propiedad nif.
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
     * Define el valor de la propiedad nif.
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
     * Obtiene el valor de la propiedad numeroAniosTotal.
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
     * Define el valor de la propiedad numeroAniosTotal.
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
     * Obtiene el valor de la propiedad numeroSeguridadSocial.
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
     * Define el valor de la propiedad numeroSeguridadSocial.
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
     * Obtiene el valor de la propiedad tipoContrato.
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
     * Define el valor de la propiedad tipoContrato.
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
     * Obtiene el valor de la propiedad tipoRegimen.
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
     * Define el valor de la propiedad tipoRegimen.
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
