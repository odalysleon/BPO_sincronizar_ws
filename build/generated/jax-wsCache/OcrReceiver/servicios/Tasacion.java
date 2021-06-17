
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
 * <p>Java class for Tasacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Tasacion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}OCRBase">
 *       &lt;sequence>
 *         &lt;element name="Advertencias" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}ArrayOfAdvertencia" minOccurs="0"/>
 *         &lt;element name="CodigoSociedadTasacionEstadistica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoTasacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodigoTasacionSociedadTasacionEstadistica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Condicionantes" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}ArrayOfCondicionante" minOccurs="0"/>
 *         &lt;element name="Documento" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Documento" minOccurs="0"/>
 *         &lt;element name="EmpresaTasadora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FechaCaducidad" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaTasacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaValoracionEstadistica" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaVisita" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FinalidadTasacion" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_FinalidadTasacion" minOccurs="0"/>
 *         &lt;element name="Fincas" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}ArrayOfFincaTasacion" minOccurs="0"/>
 *         &lt;element name="FuenteDatos" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_FuenteDeDatos" minOccurs="0"/>
 *         &lt;element name="IdSolicitudOCR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LeyDeMercado" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_LeyDeMercado" minOccurs="0"/>
 *         &lt;element name="MetodoValoracion" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_MetodoValoracion" minOccurs="0"/>
 *         &lt;element name="MetodoValoracionEstadistico" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_MetodoValoracionEstadistico" minOccurs="0"/>
 *         &lt;element name="NombreTasador" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Solicitante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValorHipotecario" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ValorTasacion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ValorTasacionEstadistico" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="VisitaInmueble" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_VisitaInmueble" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Tasacion", propOrder = {
    "advertencias",
    "codigoSociedadTasacionEstadistica",
    "codigoTasacion",
    "codigoTasacionSociedadTasacionEstadistica",
    "condicionantes",
    "documento",
    "empresaTasadora",
    "fechaCaducidad",
    "fechaTasacion",
    "fechaValoracionEstadistica",
    "fechaVisita",
    "finalidadTasacion",
    "fincas",
    "fuenteDatos",
    "idSolicitudOCR",
    "leyDeMercado",
    "metodoValoracion",
    "metodoValoracionEstadistico",
    "nombreTasador",
    "observaciones",
    "solicitante",
    "valorHipotecario",
    "valorTasacion",
    "valorTasacionEstadistico",
    "visitaInmueble"
})
public class Tasacion
    extends OCRBase
{

    @XmlElementRef(name = "Advertencias", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAdvertencia> advertencias;
    @XmlElementRef(name = "CodigoSociedadTasacionEstadistica", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoSociedadTasacionEstadistica;
    @XmlElementRef(name = "CodigoTasacion", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTasacion;
    @XmlElementRef(name = "CodigoTasacionSociedadTasacionEstadistica", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoTasacionSociedadTasacionEstadistica;
    @XmlElementRef(name = "Condicionantes", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCondicionante> condicionantes;
    @XmlElementRef(name = "Documento", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<Documento> documento;
    @XmlElementRef(name = "EmpresaTasadora", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empresaTasadora;
    @XmlElement(name = "FechaCaducidad")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCaducidad;
    @XmlElement(name = "FechaTasacion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaTasacion;
    @XmlElementRef(name = "FechaValoracionEstadistica", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaValoracionEstadistica;
    @XmlElement(name = "FechaVisita")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaVisita;
    @XmlElement(name = "FinalidadTasacion")
    protected ConfigurationTFinalidadTasacion finalidadTasacion;
    @XmlElementRef(name = "Fincas", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFincaTasacion> fincas;
    @XmlElement(name = "FuenteDatos")
    protected ConfigurationTFuenteDeDatos fuenteDatos;
    @XmlElement(name = "IdSolicitudOCR")
    protected Integer idSolicitudOCR;
    @XmlElement(name = "LeyDeMercado")
    protected ConfigurationTLeyDeMercado leyDeMercado;
    @XmlElement(name = "MetodoValoracion")
    protected ConfigurationTMetodoValoracion metodoValoracion;
    @XmlElement(name = "MetodoValoracionEstadistico")
    protected ConfigurationTMetodoValoracionEstadistico metodoValoracionEstadistico;
    @XmlElementRef(name = "NombreTasador", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombreTasador;
    @XmlElementRef(name = "Observaciones", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observaciones;
    @XmlElementRef(name = "Solicitante", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> solicitante;
    @XmlElement(name = "ValorHipotecario")
    protected Double valorHipotecario;
    @XmlElement(name = "ValorTasacion")
    protected Double valorTasacion;
    @XmlElementRef(name = "ValorTasacionEstadistico", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valorTasacionEstadistico;
    @XmlElement(name = "VisitaInmueble")
    protected ConfigurationTVisitaInmueble visitaInmueble;

    /**
     * Gets the value of the advertencias property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAdvertencia }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAdvertencia> getAdvertencias() {
        return advertencias;
    }

    /**
     * Sets the value of the advertencias property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAdvertencia }{@code >}
     *     
     */
    public void setAdvertencias(JAXBElement<ArrayOfAdvertencia> value) {
        this.advertencias = value;
    }

    /**
     * Gets the value of the codigoSociedadTasacionEstadistica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoSociedadTasacionEstadistica() {
        return codigoSociedadTasacionEstadistica;
    }

    /**
     * Sets the value of the codigoSociedadTasacionEstadistica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoSociedadTasacionEstadistica(JAXBElement<String> value) {
        this.codigoSociedadTasacionEstadistica = value;
    }

    /**
     * Gets the value of the codigoTasacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoTasacion() {
        return codigoTasacion;
    }

    /**
     * Sets the value of the codigoTasacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoTasacion(JAXBElement<String> value) {
        this.codigoTasacion = value;
    }

    /**
     * Gets the value of the codigoTasacionSociedadTasacionEstadistica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoTasacionSociedadTasacionEstadistica() {
        return codigoTasacionSociedadTasacionEstadistica;
    }

    /**
     * Sets the value of the codigoTasacionSociedadTasacionEstadistica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoTasacionSociedadTasacionEstadistica(JAXBElement<String> value) {
        this.codigoTasacionSociedadTasacionEstadistica = value;
    }

    /**
     * Gets the value of the condicionantes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCondicionante }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCondicionante> getCondicionantes() {
        return condicionantes;
    }

    /**
     * Sets the value of the condicionantes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCondicionante }{@code >}
     *     
     */
    public void setCondicionantes(JAXBElement<ArrayOfCondicionante> value) {
        this.condicionantes = value;
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
     * Gets the value of the empresaTasadora property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpresaTasadora() {
        return empresaTasadora;
    }

    /**
     * Sets the value of the empresaTasadora property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpresaTasadora(JAXBElement<String> value) {
        this.empresaTasadora = value;
    }

    /**
     * Gets the value of the fechaCaducidad property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * Sets the value of the fechaCaducidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCaducidad(XMLGregorianCalendar value) {
        this.fechaCaducidad = value;
    }

    /**
     * Gets the value of the fechaTasacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaTasacion() {
        return fechaTasacion;
    }

    /**
     * Sets the value of the fechaTasacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaTasacion(XMLGregorianCalendar value) {
        this.fechaTasacion = value;
    }

    /**
     * Gets the value of the fechaValoracionEstadistica property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaValoracionEstadistica() {
        return fechaValoracionEstadistica;
    }

    /**
     * Sets the value of the fechaValoracionEstadistica property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaValoracionEstadistica(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaValoracionEstadistica = value;
    }

    /**
     * Gets the value of the fechaVisita property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaVisita() {
        return fechaVisita;
    }

    /**
     * Sets the value of the fechaVisita property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaVisita(XMLGregorianCalendar value) {
        this.fechaVisita = value;
    }

    /**
     * Gets the value of the finalidadTasacion property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTFinalidadTasacion }
     *     
     */
    public ConfigurationTFinalidadTasacion getFinalidadTasacion() {
        return finalidadTasacion;
    }

    /**
     * Sets the value of the finalidadTasacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTFinalidadTasacion }
     *     
     */
    public void setFinalidadTasacion(ConfigurationTFinalidadTasacion value) {
        this.finalidadTasacion = value;
    }

    /**
     * Gets the value of the fincas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFincaTasacion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFincaTasacion> getFincas() {
        return fincas;
    }

    /**
     * Sets the value of the fincas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFincaTasacion }{@code >}
     *     
     */
    public void setFincas(JAXBElement<ArrayOfFincaTasacion> value) {
        this.fincas = value;
    }

    /**
     * Gets the value of the fuenteDatos property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTFuenteDeDatos }
     *     
     */
    public ConfigurationTFuenteDeDatos getFuenteDatos() {
        return fuenteDatos;
    }

    /**
     * Sets the value of the fuenteDatos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTFuenteDeDatos }
     *     
     */
    public void setFuenteDatos(ConfigurationTFuenteDeDatos value) {
        this.fuenteDatos = value;
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
     * Gets the value of the leyDeMercado property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTLeyDeMercado }
     *     
     */
    public ConfigurationTLeyDeMercado getLeyDeMercado() {
        return leyDeMercado;
    }

    /**
     * Sets the value of the leyDeMercado property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTLeyDeMercado }
     *     
     */
    public void setLeyDeMercado(ConfigurationTLeyDeMercado value) {
        this.leyDeMercado = value;
    }

    /**
     * Gets the value of the metodoValoracion property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTMetodoValoracion }
     *     
     */
    public ConfigurationTMetodoValoracion getMetodoValoracion() {
        return metodoValoracion;
    }

    /**
     * Sets the value of the metodoValoracion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTMetodoValoracion }
     *     
     */
    public void setMetodoValoracion(ConfigurationTMetodoValoracion value) {
        this.metodoValoracion = value;
    }

    /**
     * Gets the value of the metodoValoracionEstadistico property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTMetodoValoracionEstadistico }
     *     
     */
    public ConfigurationTMetodoValoracionEstadistico getMetodoValoracionEstadistico() {
        return metodoValoracionEstadistico;
    }

    /**
     * Sets the value of the metodoValoracionEstadistico property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTMetodoValoracionEstadistico }
     *     
     */
    public void setMetodoValoracionEstadistico(ConfigurationTMetodoValoracionEstadistico value) {
        this.metodoValoracionEstadistico = value;
    }

    /**
     * Gets the value of the nombreTasador property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombreTasador() {
        return nombreTasador;
    }

    /**
     * Sets the value of the nombreTasador property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombreTasador(JAXBElement<String> value) {
        this.nombreTasador = value;
    }

    /**
     * Gets the value of the observaciones property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObservaciones() {
        return observaciones;
    }

    /**
     * Sets the value of the observaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObservaciones(JAXBElement<String> value) {
        this.observaciones = value;
    }

    /**
     * Gets the value of the solicitante property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSolicitante() {
        return solicitante;
    }

    /**
     * Sets the value of the solicitante property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSolicitante(JAXBElement<String> value) {
        this.solicitante = value;
    }

    /**
     * Gets the value of the valorHipotecario property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorHipotecario() {
        return valorHipotecario;
    }

    /**
     * Sets the value of the valorHipotecario property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorHipotecario(Double value) {
        this.valorHipotecario = value;
    }

    /**
     * Gets the value of the valorTasacion property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorTasacion() {
        return valorTasacion;
    }

    /**
     * Sets the value of the valorTasacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorTasacion(Double value) {
        this.valorTasacion = value;
    }

    /**
     * Gets the value of the valorTasacionEstadistico property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValorTasacionEstadistico() {
        return valorTasacionEstadistico;
    }

    /**
     * Sets the value of the valorTasacionEstadistico property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValorTasacionEstadistico(JAXBElement<Double> value) {
        this.valorTasacionEstadistico = value;
    }

    /**
     * Gets the value of the visitaInmueble property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTVisitaInmueble }
     *     
     */
    public ConfigurationTVisitaInmueble getVisitaInmueble() {
        return visitaInmueble;
    }

    /**
     * Sets the value of the visitaInmueble property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTVisitaInmueble }
     *     
     */
    public void setVisitaInmueble(ConfigurationTVisitaInmueble value) {
        this.visitaInmueble = value;
    }

}
