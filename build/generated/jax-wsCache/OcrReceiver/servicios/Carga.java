
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Carga complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad auto.
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
     * Define el valor de la propiedad auto.
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
     * Obtiene el valor de la propiedad beneficiarioCesion.
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
     * Define el valor de la propiedad beneficiarioCesion.
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
     * Obtiene el valor de la propiedad beneficiarioHipoteca.
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
     * Define el valor de la propiedad beneficiarioHipoteca.
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
     * Obtiene el valor de la propiedad beneficiarioHipotecaBanco.
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
     * Define el valor de la propiedad beneficiarioHipotecaBanco.
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
     * Obtiene el valor de la propiedad certificacionDominio.
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
     * Define el valor de la propiedad certificacionDominio.
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
     * Obtiene el valor de la propiedad cesion.
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
     * Define el valor de la propiedad cesion.
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
     * Obtiene el valor de la propiedad descripcionNovacion.
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
     * Define el valor de la propiedad descripcionNovacion.
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
     * Obtiene el valor de la propiedad fechaAuto.
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
     * Define el valor de la propiedad fechaAuto.
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
     * Obtiene el valor de la propiedad fechaCertificacion.
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
     * Define el valor de la propiedad fechaCertificacion.
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
     * Obtiene el valor de la propiedad fechaCesion.
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
     * Define el valor de la propiedad fechaCesion.
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
     * Obtiene el valor de la propiedad fechaEscritura.
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
     * Define el valor de la propiedad fechaEscritura.
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
     * Obtiene el valor de la propiedad fechaInscripcionCarga.
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
     * Define el valor de la propiedad fechaInscripcionCarga.
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
     * Obtiene el valor de la propiedad fechaInscripcionCesion.
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
     * Define el valor de la propiedad fechaInscripcionCesion.
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
     * Obtiene el valor de la propiedad fechaVencimiento.
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
     * Define el valor de la propiedad fechaVencimiento.
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
     * Obtiene el valor de la propiedad folio.
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
     * Define el valor de la propiedad folio.
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
     * Obtiene el valor de la propiedad gastoCostas.
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
     * Define el valor de la propiedad gastoCostas.
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
     * Obtiene el valor de la propiedad gastosProcesales.
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
     * Define el valor de la propiedad gastosProcesales.
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
     * Obtiene el valor de la propiedad igualdadRango.
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
     * Define el valor de la propiedad igualdadRango.
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
     * Obtiene el valor de la propiedad importeHipoteca.
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
     * Define el valor de la propiedad importeHipoteca.
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
     * Obtiene el valor de la propiedad inscripcion.
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
     * Define el valor de la propiedad inscripcion.
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
     * Obtiene el valor de la propiedad interesesDemora.
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
     * Define el valor de la propiedad interesesDemora.
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
     * Obtiene el valor de la propiedad interesesHipoteca.
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
     * Define el valor de la propiedad interesesHipoteca.
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
     * Obtiene el valor de la propiedad juzgado.
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
     * Define el valor de la propiedad juzgado.
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
     * Obtiene el valor de la propiedad letra.
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
     * Define el valor de la propiedad letra.
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
     * Obtiene el valor de la propiedad libro.
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
     * Define el valor de la propiedad libro.
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
     * Obtiene el valor de la propiedad moneda.
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
     * Define el valor de la propiedad moneda.
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
     * Obtiene el valor de la propiedad notario.
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
     * Define el valor de la propiedad notario.
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
     * Obtiene el valor de la propiedad notarioCesion.
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
     * Define el valor de la propiedad notarioCesion.
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
     * Obtiene el valor de la propiedad otrosGastos.
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
     * Define el valor de la propiedad otrosGastos.
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
     * Obtiene el valor de la propiedad plazoMesesCarga.
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
     * Define el valor de la propiedad plazoMesesCarga.
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
     * Obtiene el valor de la propiedad protocolo.
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
     * Define el valor de la propiedad protocolo.
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
     * Obtiene el valor de la propiedad protocoloCesion.
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
     * Define el valor de la propiedad protocoloCesion.
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
     * Obtiene el valor de la propiedad recargoApremio.
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
     * Define el valor de la propiedad recargoApremio.
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
     * Obtiene el valor de la propiedad relacionCarga.
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
     * Define el valor de la propiedad relacionCarga.
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
     * Obtiene el valor de la propiedad responsabilidadHipoteca.
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
     * Define el valor de la propiedad responsabilidadHipoteca.
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
     * Obtiene el valor de la propiedad tipoCarga.
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
     * Define el valor de la propiedad tipoCarga.
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
     * Obtiene el valor de la propiedad tomo.
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
     * Define el valor de la propiedad tomo.
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
