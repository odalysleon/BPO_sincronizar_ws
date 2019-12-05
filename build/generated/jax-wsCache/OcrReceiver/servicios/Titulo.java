
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
 * <p>Clase Java para Titulo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad fechaEscritura.
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
     * Define el valor de la propiedad fechaEscritura.
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
     * Obtiene el valor de la propiedad fechaInscripcion.
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
     * Define el valor de la propiedad fechaInscripcion.
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
     * Obtiene el valor de la propiedad idPersona.
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
     * Define el valor de la propiedad idPersona.
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
     * Obtiene el valor de la propiedad notaria.
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
     * Define el valor de la propiedad notaria.
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
     * Obtiene el valor de la propiedad numeroInscripcion.
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
     * Define el valor de la propiedad numeroInscripcion.
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
     * Obtiene el valor de la propiedad porcentajeParticipacion.
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
     * Define el valor de la propiedad porcentajeParticipacion.
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
     * Obtiene el valor de la propiedad tipoParticipacion.
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
     * Define el valor de la propiedad tipoParticipacion.
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
     * Obtiene el valor de la propiedad tipoPropiedad.
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
     * Define el valor de la propiedad tipoPropiedad.
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
     * Obtiene el valor de la propiedad tipoTituloPropiedad.
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
     * Define el valor de la propiedad tipoTituloPropiedad.
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
