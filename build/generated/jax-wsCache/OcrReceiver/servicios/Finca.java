
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Finca complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Finca">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}OCRBase">
 *       &lt;sequence>
 *         &lt;element name="AnioConstruccion" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_AnioConstruccion" minOccurs="0"/>
 *         &lt;element name="Cargas" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}ArrayOfCarga" minOccurs="0"/>
 *         &lt;element name="CodigoPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Escalera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstadoConservacion" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_TipoEstadoConservacion" minOccurs="0"/>
 *         &lt;element name="FechaCalificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaVerificacion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Idufir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InscripcionFolio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InscripcionLibro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InscripcionTomo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumeroFinca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ocupacion" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_TipoOcupacion" minOccurs="0"/>
 *         &lt;element name="Planta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Poblacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Portal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Provincia" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_Provincia" minOccurs="0"/>
 *         &lt;element name="Puerta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReferenciaCatastral" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegimenProteccion" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_TipoRegimenProteccion" minOccurs="0"/>
 *         &lt;element name="RegistroPropiedad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Seccion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SuperficieComprobada" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SuperficieConstruida" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SuperficieTerreno" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SuperficieUtil" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TipoFinca" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_TipoFinca" minOccurs="0"/>
 *         &lt;element name="TipoVia" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_TipoVia" minOccurs="0"/>
 *         &lt;element name="ValorSeguroRD_716" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ValorSuelo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ValorTasacion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Valoracion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Finca", propOrder = {
    "anioConstruccion",
    "cargas",
    "codigoPostal",
    "direccion",
    "escalera",
    "estadoConservacion",
    "fechaCalificacion",
    "fechaVerificacion",
    "idufir",
    "inscripcionFolio",
    "inscripcionLibro",
    "inscripcionTomo",
    "numeroFinca",
    "ocupacion",
    "planta",
    "poblacion",
    "portal",
    "provincia",
    "puerta",
    "referenciaCatastral",
    "regimenProteccion",
    "registroPropiedad",
    "seccion",
    "superficieComprobada",
    "superficieConstruida",
    "superficieTerreno",
    "superficieUtil",
    "tipoFinca",
    "tipoVia",
    "valorSeguroRD716",
    "valorSuelo",
    "valorTasacion",
    "valoracion"
})
public class Finca
    extends OCRBase
{

    @XmlElement(name = "AnioConstruccion")
    protected ConfigurationTAnioConstruccion anioConstruccion;
    @XmlElementRef(name = "Cargas", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCarga> cargas;
    @XmlElementRef(name = "CodigoPostal", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codigoPostal;
    @XmlElementRef(name = "Direccion", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> direccion;
    @XmlElementRef(name = "Escalera", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> escalera;
    @XmlElement(name = "EstadoConservacion")
    protected ConfigurationTTipoEstadoConservacion estadoConservacion;
    @XmlElementRef(name = "FechaCalificacion", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaCalificacion;
    @XmlElementRef(name = "FechaVerificacion", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaVerificacion;
    @XmlElementRef(name = "Idufir", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idufir;
    @XmlElement(name = "InscripcionFolio")
    protected Integer inscripcionFolio;
    @XmlElement(name = "InscripcionLibro")
    protected Integer inscripcionLibro;
    @XmlElement(name = "InscripcionTomo")
    protected Integer inscripcionTomo;
    @XmlElementRef(name = "NumeroFinca", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroFinca;
    @XmlElement(name = "Ocupacion")
    protected ConfigurationTTipoOcupacion ocupacion;
    @XmlElementRef(name = "Planta", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> planta;
    @XmlElement(name = "Poblacion")
    protected Integer poblacion;
    @XmlElementRef(name = "Portal", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> portal;
    @XmlElement(name = "Provincia")
    protected ConfigurationTProvincia provincia;
    @XmlElementRef(name = "Puerta", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> puerta;
    @XmlElementRef(name = "ReferenciaCatastral", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenciaCatastral;
    @XmlElement(name = "RegimenProteccion")
    protected ConfigurationTTipoRegimenProteccion regimenProteccion;
    @XmlElementRef(name = "RegistroPropiedad", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> registroPropiedad;
    @XmlElement(name = "Seccion")
    protected Integer seccion;
    @XmlElement(name = "SuperficieComprobada")
    protected Double superficieComprobada;
    @XmlElement(name = "SuperficieConstruida")
    protected Double superficieConstruida;
    @XmlElement(name = "SuperficieTerreno")
    protected Double superficieTerreno;
    @XmlElement(name = "SuperficieUtil")
    protected Double superficieUtil;
    @XmlElement(name = "TipoFinca")
    protected ConfigurationTTipoFinca tipoFinca;
    @XmlElement(name = "TipoVia")
    protected ConfigurationTTipoVia tipoVia;
    @XmlElement(name = "ValorSeguroRD_716")
    protected Double valorSeguroRD716;
    @XmlElement(name = "ValorSuelo")
    protected Double valorSuelo;
    @XmlElement(name = "ValorTasacion")
    protected Double valorTasacion;
    @XmlElement(name = "Valoracion")
    protected Double valoracion;

    /**
     * Gets the value of the anioConstruccion property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTAnioConstruccion }
     *     
     */
    public ConfigurationTAnioConstruccion getAnioConstruccion() {
        return anioConstruccion;
    }

    /**
     * Sets the value of the anioConstruccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTAnioConstruccion }
     *     
     */
    public void setAnioConstruccion(ConfigurationTAnioConstruccion value) {
        this.anioConstruccion = value;
    }

    /**
     * Gets the value of the cargas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCarga }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCarga> getCargas() {
        return cargas;
    }

    /**
     * Sets the value of the cargas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCarga }{@code >}
     *     
     */
    public void setCargas(JAXBElement<ArrayOfCarga> value) {
        this.cargas = value;
    }

    /**
     * Gets the value of the codigoPostal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodigoPostal() {
        return codigoPostal;
    }

    /**
     * Sets the value of the codigoPostal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodigoPostal(JAXBElement<String> value) {
        this.codigoPostal = value;
    }

    /**
     * Gets the value of the direccion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDireccion(JAXBElement<String> value) {
        this.direccion = value;
    }

    /**
     * Gets the value of the escalera property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEscalera() {
        return escalera;
    }

    /**
     * Sets the value of the escalera property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEscalera(JAXBElement<String> value) {
        this.escalera = value;
    }

    /**
     * Gets the value of the estadoConservacion property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTTipoEstadoConservacion }
     *     
     */
    public ConfigurationTTipoEstadoConservacion getEstadoConservacion() {
        return estadoConservacion;
    }

    /**
     * Sets the value of the estadoConservacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTTipoEstadoConservacion }
     *     
     */
    public void setEstadoConservacion(ConfigurationTTipoEstadoConservacion value) {
        this.estadoConservacion = value;
    }

    /**
     * Gets the value of the fechaCalificacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaCalificacion() {
        return fechaCalificacion;
    }

    /**
     * Sets the value of the fechaCalificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaCalificacion(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaCalificacion = value;
    }

    /**
     * Gets the value of the fechaVerificacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFechaVerificacion() {
        return fechaVerificacion;
    }

    /**
     * Sets the value of the fechaVerificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFechaVerificacion(JAXBElement<XMLGregorianCalendar> value) {
        this.fechaVerificacion = value;
    }

    /**
     * Gets the value of the idufir property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdufir() {
        return idufir;
    }

    /**
     * Sets the value of the idufir property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdufir(JAXBElement<String> value) {
        this.idufir = value;
    }

    /**
     * Gets the value of the inscripcionFolio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInscripcionFolio() {
        return inscripcionFolio;
    }

    /**
     * Sets the value of the inscripcionFolio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInscripcionFolio(Integer value) {
        this.inscripcionFolio = value;
    }

    /**
     * Gets the value of the inscripcionLibro property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInscripcionLibro() {
        return inscripcionLibro;
    }

    /**
     * Sets the value of the inscripcionLibro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInscripcionLibro(Integer value) {
        this.inscripcionLibro = value;
    }

    /**
     * Gets the value of the inscripcionTomo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInscripcionTomo() {
        return inscripcionTomo;
    }

    /**
     * Sets the value of the inscripcionTomo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInscripcionTomo(Integer value) {
        this.inscripcionTomo = value;
    }

    /**
     * Gets the value of the numeroFinca property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroFinca() {
        return numeroFinca;
    }

    /**
     * Sets the value of the numeroFinca property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroFinca(JAXBElement<String> value) {
        this.numeroFinca = value;
    }

    /**
     * Gets the value of the ocupacion property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTTipoOcupacion }
     *     
     */
    public ConfigurationTTipoOcupacion getOcupacion() {
        return ocupacion;
    }

    /**
     * Sets the value of the ocupacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTTipoOcupacion }
     *     
     */
    public void setOcupacion(ConfigurationTTipoOcupacion value) {
        this.ocupacion = value;
    }

    /**
     * Gets the value of the planta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlanta() {
        return planta;
    }

    /**
     * Sets the value of the planta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlanta(JAXBElement<String> value) {
        this.planta = value;
    }

    /**
     * Gets the value of the poblacion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPoblacion() {
        return poblacion;
    }

    /**
     * Sets the value of the poblacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPoblacion(Integer value) {
        this.poblacion = value;
    }

    /**
     * Gets the value of the portal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPortal() {
        return portal;
    }

    /**
     * Sets the value of the portal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPortal(JAXBElement<String> value) {
        this.portal = value;
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
     * Gets the value of the puerta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPuerta() {
        return puerta;
    }

    /**
     * Sets the value of the puerta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPuerta(JAXBElement<String> value) {
        this.puerta = value;
    }

    /**
     * Gets the value of the referenciaCatastral property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenciaCatastral() {
        return referenciaCatastral;
    }

    /**
     * Sets the value of the referenciaCatastral property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenciaCatastral(JAXBElement<String> value) {
        this.referenciaCatastral = value;
    }

    /**
     * Gets the value of the regimenProteccion property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTTipoRegimenProteccion }
     *     
     */
    public ConfigurationTTipoRegimenProteccion getRegimenProteccion() {
        return regimenProteccion;
    }

    /**
     * Sets the value of the regimenProteccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTTipoRegimenProteccion }
     *     
     */
    public void setRegimenProteccion(ConfigurationTTipoRegimenProteccion value) {
        this.regimenProteccion = value;
    }

    /**
     * Gets the value of the registroPropiedad property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRegistroPropiedad() {
        return registroPropiedad;
    }

    /**
     * Sets the value of the registroPropiedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRegistroPropiedad(JAXBElement<Integer> value) {
        this.registroPropiedad = value;
    }

    /**
     * Gets the value of the seccion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeccion() {
        return seccion;
    }

    /**
     * Sets the value of the seccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeccion(Integer value) {
        this.seccion = value;
    }

    /**
     * Gets the value of the superficieComprobada property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSuperficieComprobada() {
        return superficieComprobada;
    }

    /**
     * Sets the value of the superficieComprobada property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSuperficieComprobada(Double value) {
        this.superficieComprobada = value;
    }

    /**
     * Gets the value of the superficieConstruida property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSuperficieConstruida() {
        return superficieConstruida;
    }

    /**
     * Sets the value of the superficieConstruida property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSuperficieConstruida(Double value) {
        this.superficieConstruida = value;
    }

    /**
     * Gets the value of the superficieTerreno property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSuperficieTerreno() {
        return superficieTerreno;
    }

    /**
     * Sets the value of the superficieTerreno property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSuperficieTerreno(Double value) {
        this.superficieTerreno = value;
    }

    /**
     * Gets the value of the superficieUtil property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSuperficieUtil() {
        return superficieUtil;
    }

    /**
     * Sets the value of the superficieUtil property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSuperficieUtil(Double value) {
        this.superficieUtil = value;
    }

    /**
     * Gets the value of the tipoFinca property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTTipoFinca }
     *     
     */
    public ConfigurationTTipoFinca getTipoFinca() {
        return tipoFinca;
    }

    /**
     * Sets the value of the tipoFinca property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTTipoFinca }
     *     
     */
    public void setTipoFinca(ConfigurationTTipoFinca value) {
        this.tipoFinca = value;
    }

    /**
     * Gets the value of the tipoVia property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTTipoVia }
     *     
     */
    public ConfigurationTTipoVia getTipoVia() {
        return tipoVia;
    }

    /**
     * Sets the value of the tipoVia property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTTipoVia }
     *     
     */
    public void setTipoVia(ConfigurationTTipoVia value) {
        this.tipoVia = value;
    }

    /**
     * Gets the value of the valorSeguroRD716 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorSeguroRD716() {
        return valorSeguroRD716;
    }

    /**
     * Sets the value of the valorSeguroRD716 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorSeguroRD716(Double value) {
        this.valorSeguroRD716 = value;
    }

    /**
     * Gets the value of the valorSuelo property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValorSuelo() {
        return valorSuelo;
    }

    /**
     * Sets the value of the valorSuelo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValorSuelo(Double value) {
        this.valorSuelo = value;
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
     * Gets the value of the valoracion property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValoracion() {
        return valoracion;
    }

    /**
     * Sets the value of the valoracion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValoracion(Double value) {
        this.valoracion = value;
    }

}
