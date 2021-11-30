
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Carga complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Carga">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}OCRBase">
 *       &lt;sequence>
 *         &lt;element name="Auto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BeneficiarioCesion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BeneficiarioHipoteca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BeneficiarioHipotecaBanco" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="CertificacionDominio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cesion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescripcionNovacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaAuto" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaCertificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaCesion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaEscritura" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaInscripcionCarga" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaInscripcionCesion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Folio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="GastoCostas" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="GastosProcesales" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="IgualdadRango" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ImporteHipoteca" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Inscripcion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InteresesDemora" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="InteresesHipoteca" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Juzgado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Letra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Libro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotarioCesion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtrosGastos" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="PlazoMesesCarga" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Protocolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProtocoloCesion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RecargoApremio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RelacionCarga" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponsabilidadHipoteca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoCarga" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_TipoCarga" minOccurs="0"/>
 *         &lt;element name="Tomo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Carga", propOrder = {
    "auto",
    "beneficiarioCesion",
    "beneficiarioHipoteca",
    "beneficiarioHipotecaBanco",
    "certificacionDominio",
    "cesion",
    "descripcionNovacion",
    "fechaAuto",
    "fechaCertificacion",
    "fechaCesion",
    "fechaEscritura",
    "fechaInscripcionCarga",
    "fechaInscripcionCesion",
    "fechaVencimiento",
    "folio",
    "gastoCostas",
    "gastosProcesales",
    "igualdadRango",
    "importeHipoteca",
    "inscripcion",
    "interesesDemora",
    "interesesHipoteca",
    "juzgado",
    "letra",
    "libro",
    "moneda",
    "notario",
    "notarioCesion",
    "otrosGastos",
    "plazoMesesCarga",
    "protocolo",
    "protocoloCesion",
    "recargoApremio",
    "relacionCarga",
    "responsabilidadHipoteca",
    "tipoCarga",
    "tomo"
})
public class Carga
    extends OCRBase
{

    @XmlElementRef(name = "Auto", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> auto;
    @XmlElementRef(name = "BeneficiarioCesion", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> beneficiarioCesion;
    @XmlElementRef(name = "BeneficiarioHipoteca", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> beneficiarioHipoteca;
    @XmlElementRef(name = "BeneficiarioHipotecaBanco", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> beneficiarioHipotecaBanco;
    @XmlElementRef(name = "CertificacionDominio", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certificacionDominio;
    @XmlElementRef(name = "Cesion", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cesion;
    @XmlElementRef(name = "DescripcionNovacion", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descripcionNovacion;
    @XmlElementRef(name = "FechaAuto", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaAuto;
    @XmlElementRef(name = "FechaCertificacion", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaCertificacion;
    @XmlElementRef(name = "FechaCesion", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaCesion;
    @XmlElementRef(name = "FechaEscritura", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaEscritura;
    @XmlElementRef(name = "FechaInscripcionCarga", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaInscripcionCarga;
    @XmlElementRef(name = "FechaInscripcionCesion", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaInscripcionCesion;
    @XmlElementRef(name = "FechaVencimiento", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaVencimiento;
    @XmlElement(name = "Folio")
    protected Integer folio;
    @XmlElement(name = "GastoCostas")
    protected Double gastoCostas;
    @XmlElement(name = "GastosProcesales")
    protected Double gastosProcesales;
    @XmlElement(name = "IgualdadRango")
    protected Boolean igualdadRango;
    @XmlElement(name = "ImporteHipoteca")
    protected Double importeHipoteca;
    @XmlElement(name = "Inscripcion")
    protected Integer inscripcion;
    @XmlElement(name = "InteresesDemora")
    protected Double interesesDemora;
    @XmlElement(name = "InteresesHipoteca")
    protected Double interesesHipoteca;
    @XmlElementRef(name = "Juzgado", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> juzgado;
    @XmlElementRef(name = "Letra", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> letra;
    @XmlElement(name = "Libro")
    protected Integer libro;
    @XmlElementRef(name = "Moneda", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> moneda;
    @XmlElementRef(name = "Notario", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notario;
    @XmlElementRef(name = "NotarioCesion", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notarioCesion;
    @XmlElement(name = "OtrosGastos")
    protected Double otrosGastos;
    @XmlElement(name = "PlazoMesesCarga")
    protected Integer plazoMesesCarga;
    @XmlElementRef(name = "Protocolo", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> protocolo;
    @XmlElementRef(name = "ProtocoloCesion", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> protocoloCesion;
    @XmlElement(name = "RecargoApremio")
    protected Double recargoApremio;
    @XmlElementRef(name = "RelacionCarga", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relacionCarga;
    @XmlElementRef(name = "ResponsabilidadHipoteca", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responsabilidadHipoteca;
    @XmlElement(name = "TipoCarga")
    protected ConfigurationTTipoCarga tipoCarga;
    @XmlElement(name = "Tomo")
    protected Integer tomo;

    /**
     * Gets the value of the auto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuto() {
        return auto;
    }

    /**
     * Sets the value of the auto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuto(JAXBElement<String> value) {
        this.auto = value;
    }

    /**
     * Gets the value of the beneficiarioCesion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBeneficiarioCesion() {
        return beneficiarioCesion;
    }

    /**
     * Sets the value of the beneficiarioCesion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBeneficiarioCesion(JAXBElement<String> value) {
        this.beneficiarioCesion = value;
    }

    /**
     * Gets the value of the beneficiarioHipoteca property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBeneficiarioHipoteca() {
        return beneficiarioHipoteca;
    }

    /**
     * Sets the value of the beneficiarioHipoteca property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBeneficiarioHipoteca(JAXBElement<String> value) {
        this.beneficiarioHipoteca = value;
    }

    /**
     * Gets the value of the beneficiarioHipotecaBanco property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getBeneficiarioHipotecaBanco() {
        return beneficiarioHipotecaBanco;
    }

    /**
     * Sets the value of the beneficiarioHipotecaBanco property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setBeneficiarioHipotecaBanco(JAXBElement<Integer> value) {
        this.beneficiarioHipotecaBanco = value;
    }

    /**
     * Gets the value of the certificacionDominio property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCertificacionDominio() {
        return certificacionDominio;
    }

    /**
     * Sets the value of the certificacionDominio property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCertificacionDominio(JAXBElement<String> value) {
        this.certificacionDominio = value;
    }

    /**
     * Gets the value of the cesion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCesion() {
        return cesion;
    }

    /**
     * Sets the value of the cesion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCesion(JAXBElement<String> value) {
        this.cesion = value;
    }

    /**
     * Gets the value of the descripcionNovacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescripcionNovacion() {
        return descripcionNovacion;
    }

    /**
     * Sets the value of the descripcionNovacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescripcionNovacion(JAXBElement<String> value) {
        this.descripcionNovacion = value;
    }

    /**
     * Gets the value of the fechaAuto property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaAuto() {
        return fechaAuto;
    }

    /**
     * Sets the value of the fechaAuto property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaAuto(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaAuto = value;
    }

    /**
     * Gets the value of the fechaCertificacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaCertificacion() {
        return fechaCertificacion;
    }

    /**
     * Sets the value of the fechaCertificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaCertificacion(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaCertificacion = value;
    }

    /**
     * Gets the value of the fechaCesion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaCesion() {
        return fechaCesion;
    }

    /**
     * Sets the value of the fechaCesion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaCesion(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaCesion = value;
    }

    /**
     * Gets the value of the fechaEscritura property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaEscritura() {
        return fechaEscritura;
    }

    /**
     * Sets the value of the fechaEscritura property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaEscritura(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaEscritura = value;
    }

    /**
     * Gets the value of the fechaInscripcionCarga property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaInscripcionCarga() {
        return fechaInscripcionCarga;
    }

    /**
     * Sets the value of the fechaInscripcionCarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaInscripcionCarga(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaInscripcionCarga = value;
    }

    /**
     * Gets the value of the fechaInscripcionCesion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaInscripcionCesion() {
        return fechaInscripcionCesion;
    }

    /**
     * Sets the value of the fechaInscripcionCesion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaInscripcionCesion(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaInscripcionCesion = value;
    }

    /**
     * Gets the value of the fechaVencimiento property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * Sets the value of the fechaVencimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaVencimiento(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaVencimiento = value;
    }

    /**
     * Gets the value of the folio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFolio() {
        return folio;
    }

    /**
     * Sets the value of the folio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFolio(Integer value) {
        this.folio = value;
    }

    /**
     * Gets the value of the gastoCostas property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGastoCostas() {
        return gastoCostas;
    }

    /**
     * Sets the value of the gastoCostas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGastoCostas(Double value) {
        this.gastoCostas = value;
    }

    /**
     * Gets the value of the gastosProcesales property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGastosProcesales() {
        return gastosProcesales;
    }

    /**
     * Sets the value of the gastosProcesales property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGastosProcesales(Double value) {
        this.gastosProcesales = value;
    }

    /**
     * Gets the value of the igualdadRango property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgualdadRango() {
        return igualdadRango;
    }

    /**
     * Sets the value of the igualdadRango property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgualdadRango(Boolean value) {
        this.igualdadRango = value;
    }

    /**
     * Gets the value of the importeHipoteca property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImporteHipoteca() {
        return importeHipoteca;
    }

    /**
     * Sets the value of the importeHipoteca property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImporteHipoteca(Double value) {
        this.importeHipoteca = value;
    }

    /**
     * Gets the value of the inscripcion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInscripcion() {
        return inscripcion;
    }

    /**
     * Sets the value of the inscripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInscripcion(Integer value) {
        this.inscripcion = value;
    }

    /**
     * Gets the value of the interesesDemora property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInteresesDemora() {
        return interesesDemora;
    }

    /**
     * Sets the value of the interesesDemora property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInteresesDemora(Double value) {
        this.interesesDemora = value;
    }

    /**
     * Gets the value of the interesesHipoteca property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInteresesHipoteca() {
        return interesesHipoteca;
    }

    /**
     * Sets the value of the interesesHipoteca property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInteresesHipoteca(Double value) {
        this.interesesHipoteca = value;
    }

    /**
     * Gets the value of the juzgado property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJuzgado() {
        return juzgado;
    }

    /**
     * Sets the value of the juzgado property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJuzgado(JAXBElement<String> value) {
        this.juzgado = value;
    }

    /**
     * Gets the value of the letra property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLetra() {
        return letra;
    }

    /**
     * Sets the value of the letra property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLetra(JAXBElement<String> value) {
        this.letra = value;
    }

    /**
     * Gets the value of the libro property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLibro() {
        return libro;
    }

    /**
     * Sets the value of the libro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLibro(Integer value) {
        this.libro = value;
    }

    /**
     * Gets the value of the moneda property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMoneda() {
        return moneda;
    }

    /**
     * Sets the value of the moneda property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMoneda(JAXBElement<String> value) {
        this.moneda = value;
    }

    /**
     * Gets the value of the notario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotario() {
        return notario;
    }

    /**
     * Sets the value of the notario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotario(JAXBElement<String> value) {
        this.notario = value;
    }

    /**
     * Gets the value of the notarioCesion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotarioCesion() {
        return notarioCesion;
    }

    /**
     * Sets the value of the notarioCesion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotarioCesion(JAXBElement<String> value) {
        this.notarioCesion = value;
    }

    /**
     * Gets the value of the otrosGastos property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getOtrosGastos() {
        return otrosGastos;
    }

    /**
     * Sets the value of the otrosGastos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setOtrosGastos(Double value) {
        this.otrosGastos = value;
    }

    /**
     * Gets the value of the plazoMesesCarga property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPlazoMesesCarga() {
        return plazoMesesCarga;
    }

    /**
     * Sets the value of the plazoMesesCarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPlazoMesesCarga(Integer value) {
        this.plazoMesesCarga = value;
    }

    /**
     * Gets the value of the protocolo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProtocolo() {
        return protocolo;
    }

    /**
     * Sets the value of the protocolo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProtocolo(JAXBElement<String> value) {
        this.protocolo = value;
    }

    /**
     * Gets the value of the protocoloCesion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProtocoloCesion() {
        return protocoloCesion;
    }

    /**
     * Sets the value of the protocoloCesion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProtocoloCesion(JAXBElement<String> value) {
        this.protocoloCesion = value;
    }

    /**
     * Gets the value of the recargoApremio property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecargoApremio() {
        return recargoApremio;
    }

    /**
     * Sets the value of the recargoApremio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecargoApremio(Double value) {
        this.recargoApremio = value;
    }

    /**
     * Gets the value of the relacionCarga property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRelacionCarga() {
        return relacionCarga;
    }

    /**
     * Sets the value of the relacionCarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRelacionCarga(JAXBElement<String> value) {
        this.relacionCarga = value;
    }

    /**
     * Gets the value of the responsabilidadHipoteca property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponsabilidadHipoteca() {
        return responsabilidadHipoteca;
    }

    /**
     * Sets the value of the responsabilidadHipoteca property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponsabilidadHipoteca(JAXBElement<String> value) {
        this.responsabilidadHipoteca = value;
    }

    /**
     * Gets the value of the tipoCarga property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTTipoCarga }
     *     
     */
    public ConfigurationTTipoCarga getTipoCarga() {
        return tipoCarga;
    }

    /**
     * Sets the value of the tipoCarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTTipoCarga }
     *     
     */
    public void setTipoCarga(ConfigurationTTipoCarga value) {
        this.tipoCarga = value;
    }

    /**
     * Gets the value of the tomo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTomo() {
        return tomo;
    }

    /**
     * Sets the value of the tomo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTomo(Integer value) {
        this.tomo = value;
    }

}
