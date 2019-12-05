
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
 * <p>Clase Java para Tasacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad advertencias.
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
     * Define el valor de la propiedad advertencias.
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
     * Obtiene el valor de la propiedad codigoSociedadTasacionEstadistica.
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
     * Define el valor de la propiedad codigoSociedadTasacionEstadistica.
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
     * Obtiene el valor de la propiedad codigoTasacion.
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
     * Define el valor de la propiedad codigoTasacion.
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
     * Obtiene el valor de la propiedad codigoTasacionSociedadTasacionEstadistica.
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
     * Define el valor de la propiedad codigoTasacionSociedadTasacionEstadistica.
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
     * Obtiene el valor de la propiedad condicionantes.
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
     * Define el valor de la propiedad condicionantes.
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
     * Obtiene el valor de la propiedad empresaTasadora.
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
     * Define el valor de la propiedad empresaTasadora.
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
     * Obtiene el valor de la propiedad fechaCaducidad.
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
     * Define el valor de la propiedad fechaCaducidad.
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
     * Obtiene el valor de la propiedad fechaTasacion.
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
     * Define el valor de la propiedad fechaTasacion.
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
     * Obtiene el valor de la propiedad fechaValoracionEstadistica.
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
     * Define el valor de la propiedad fechaValoracionEstadistica.
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
     * Obtiene el valor de la propiedad fechaVisita.
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
     * Define el valor de la propiedad fechaVisita.
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
     * Obtiene el valor de la propiedad finalidadTasacion.
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
     * Define el valor de la propiedad finalidadTasacion.
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
     * Obtiene el valor de la propiedad fincas.
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
     * Define el valor de la propiedad fincas.
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
     * Obtiene el valor de la propiedad fuenteDatos.
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
     * Define el valor de la propiedad fuenteDatos.
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
     * Obtiene el valor de la propiedad leyDeMercado.
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
     * Define el valor de la propiedad leyDeMercado.
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
     * Obtiene el valor de la propiedad metodoValoracion.
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
     * Define el valor de la propiedad metodoValoracion.
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
     * Obtiene el valor de la propiedad metodoValoracionEstadistico.
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
     * Define el valor de la propiedad metodoValoracionEstadistico.
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
     * Obtiene el valor de la propiedad nombreTasador.
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
     * Define el valor de la propiedad nombreTasador.
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
     * Obtiene el valor de la propiedad observaciones.
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
     * Define el valor de la propiedad observaciones.
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
     * Obtiene el valor de la propiedad solicitante.
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
     * Define el valor de la propiedad solicitante.
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
     * Obtiene el valor de la propiedad valorHipotecario.
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
     * Define el valor de la propiedad valorHipotecario.
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
     * Obtiene el valor de la propiedad valorTasacion.
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
     * Define el valor de la propiedad valorTasacion.
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
     * Obtiene el valor de la propiedad valorTasacionEstadistico.
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
     * Define el valor de la propiedad valorTasacionEstadistico.
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
     * Obtiene el valor de la propiedad visitaInmueble.
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
     * Define el valor de la propiedad visitaInmueble.
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
