
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
 * <p>Java class for Titulo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Titulo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}OCRBase">
 *       &lt;sequence>
 *         &lt;element name="FechaEscritura" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FechaInscripcion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IdPersona" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Notaria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumeroInscripcion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PorcentajeParticipacion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Protocolo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoParticipacion" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_TipoParticipacion" minOccurs="0"/>
 *         &lt;element name="TipoPropiedad" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_tipoPropiedad" minOccurs="0"/>
 *         &lt;element name="TipoTituloPropiedad" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_tipoTitulosPropiedad" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Titulo", propOrder = {
    "fechaEscritura",
    "fechaInscripcion",
    "idPersona",
    "notaria",
    "numeroInscripcion",
    "porcentajeParticipacion",
    "protocolo",
    "tipoParticipacion",
    "tipoPropiedad",
    "tipoTituloPropiedad"
})
public class Titulo
    extends OCRBase
{

    @XmlElement(name = "FechaEscritura")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEscritura;
    @XmlElement(name = "FechaInscripcion")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInscripcion;
    @XmlElementRef(name = "IdPersona", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idPersona;
    @XmlElementRef(name = "Notaria", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> notaria;
    @XmlElement(name = "NumeroInscripcion")
    protected Integer numeroInscripcion;
    @XmlElement(name = "PorcentajeParticipacion")
    protected Double porcentajeParticipacion;
    @XmlElementRef(name = "Protocolo", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> protocolo;
    @XmlElement(name = "TipoParticipacion")
    protected ConfigurationTTipoParticipacion tipoParticipacion;
    @XmlElement(name = "TipoPropiedad")
    protected ConfigurationTTipoPropiedad tipoPropiedad;
    @XmlElement(name = "TipoTituloPropiedad")
    protected ConfigurationTTipoTitulosPropiedad tipoTituloPropiedad;

    /**
     * Gets the value of the fechaEscritura property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEscritura() {
        return fechaEscritura;
    }

    /**
     * Sets the value of the fechaEscritura property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEscritura(XMLGregorianCalendar value) {
        this.fechaEscritura = value;
    }

    /**
     * Gets the value of the fechaInscripcion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInscripcion() {
        return fechaInscripcion;
    }

    /**
     * Sets the value of the fechaInscripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInscripcion(XMLGregorianCalendar value) {
        this.fechaInscripcion = value;
    }

    /**
     * Gets the value of the idPersona property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdPersona() {
        return idPersona;
    }

    /**
     * Sets the value of the idPersona property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdPersona(JAXBElement<Integer> value) {
        this.idPersona = value;
    }

    /**
     * Gets the value of the notaria property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotaria() {
        return notaria;
    }

    /**
     * Sets the value of the notaria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotaria(JAXBElement<String> value) {
        this.notaria = value;
    }

    /**
     * Gets the value of the numeroInscripcion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroInscripcion() {
        return numeroInscripcion;
    }

    /**
     * Sets the value of the numeroInscripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroInscripcion(Integer value) {
        this.numeroInscripcion = value;
    }

    /**
     * Gets the value of the porcentajeParticipacion property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPorcentajeParticipacion() {
        return porcentajeParticipacion;
    }

    /**
     * Sets the value of the porcentajeParticipacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPorcentajeParticipacion(Double value) {
        this.porcentajeParticipacion = value;
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
     * Gets the value of the tipoParticipacion property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTTipoParticipacion }
     *     
     */
    public ConfigurationTTipoParticipacion getTipoParticipacion() {
        return tipoParticipacion;
    }

    /**
     * Sets the value of the tipoParticipacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTTipoParticipacion }
     *     
     */
    public void setTipoParticipacion(ConfigurationTTipoParticipacion value) {
        this.tipoParticipacion = value;
    }

    /**
     * Gets the value of the tipoPropiedad property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTTipoPropiedad }
     *     
     */
    public ConfigurationTTipoPropiedad getTipoPropiedad() {
        return tipoPropiedad;
    }

    /**
     * Sets the value of the tipoPropiedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTTipoPropiedad }
     *     
     */
    public void setTipoPropiedad(ConfigurationTTipoPropiedad value) {
        this.tipoPropiedad = value;
    }

    /**
     * Gets the value of the tipoTituloPropiedad property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTTipoTitulosPropiedad }
     *     
     */
    public ConfigurationTTipoTitulosPropiedad getTipoTituloPropiedad() {
        return tipoTituloPropiedad;
    }

    /**
     * Sets the value of the tipoTituloPropiedad property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTTipoTitulosPropiedad }
     *     
     */
    public void setTipoTituloPropiedad(ConfigurationTTipoTitulosPropiedad value) {
        this.tipoTituloPropiedad = value;
    }

}
