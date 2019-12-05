
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Finca complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad anioConstruccion.
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
     * Define el valor de la propiedad anioConstruccion.
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
     * Obtiene el valor de la propiedad cargas.
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
     * Define el valor de la propiedad cargas.
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
     * Obtiene el valor de la propiedad codigoPostal.
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
     * Define el valor de la propiedad codigoPostal.
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
     * Obtiene el valor de la propiedad direccion.
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
     * Define el valor de la propiedad direccion.
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
     * Obtiene el valor de la propiedad escalera.
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
     * Define el valor de la propiedad escalera.
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
     * Obtiene el valor de la propiedad estadoConservacion.
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
     * Define el valor de la propiedad estadoConservacion.
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
     * Obtiene el valor de la propiedad fechaCalificacion.
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
     * Define el valor de la propiedad fechaCalificacion.
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
     * Obtiene el valor de la propiedad fechaVerificacion.
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
     * Define el valor de la propiedad fechaVerificacion.
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
     * Obtiene el valor de la propiedad idufir.
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
     * Define el valor de la propiedad idufir.
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
     * Obtiene el valor de la propiedad inscripcionFolio.
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
     * Define el valor de la propiedad inscripcionFolio.
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
     * Obtiene el valor de la propiedad inscripcionLibro.
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
     * Define el valor de la propiedad inscripcionLibro.
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
     * Obtiene el valor de la propiedad inscripcionTomo.
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
     * Define el valor de la propiedad inscripcionTomo.
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
     * Obtiene el valor de la propiedad numeroFinca.
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
     * Define el valor de la propiedad numeroFinca.
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
     * Obtiene el valor de la propiedad ocupacion.
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
     * Define el valor de la propiedad ocupacion.
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
     * Obtiene el valor de la propiedad planta.
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
     * Define el valor de la propiedad planta.
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
     * Obtiene el valor de la propiedad poblacion.
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
     * Define el valor de la propiedad poblacion.
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
     * Obtiene el valor de la propiedad portal.
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
     * Define el valor de la propiedad portal.
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
     * Obtiene el valor de la propiedad puerta.
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
     * Define el valor de la propiedad puerta.
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
     * Obtiene el valor de la propiedad referenciaCatastral.
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
     * Define el valor de la propiedad referenciaCatastral.
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
     * Obtiene el valor de la propiedad regimenProteccion.
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
     * Define el valor de la propiedad regimenProteccion.
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
     * Obtiene el valor de la propiedad registroPropiedad.
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
     * Define el valor de la propiedad registroPropiedad.
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
     * Obtiene el valor de la propiedad seccion.
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
     * Define el valor de la propiedad seccion.
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
     * Obtiene el valor de la propiedad superficieComprobada.
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
     * Define el valor de la propiedad superficieComprobada.
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
     * Obtiene el valor de la propiedad superficieConstruida.
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
     * Define el valor de la propiedad superficieConstruida.
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
     * Obtiene el valor de la propiedad superficieTerreno.
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
     * Define el valor de la propiedad superficieTerreno.
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
     * Obtiene el valor de la propiedad superficieUtil.
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
     * Define el valor de la propiedad superficieUtil.
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
     * Obtiene el valor de la propiedad tipoFinca.
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
     * Define el valor de la propiedad tipoFinca.
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
     * Obtiene el valor de la propiedad tipoVia.
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
     * Define el valor de la propiedad tipoVia.
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
     * Obtiene el valor de la propiedad valorSeguroRD716.
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
     * Define el valor de la propiedad valorSeguroRD716.
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
     * Obtiene el valor de la propiedad valorSuelo.
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
     * Define el valor de la propiedad valorSuelo.
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
     * Obtiene el valor de la propiedad valoracion.
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
     * Define el valor de la propiedad valoracion.
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
