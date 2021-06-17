
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotaSimpleNodulos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotaSimpleNodulos">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}OCRBase">
 *       &lt;sequence>
 *         &lt;element name="AsientosPendientes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Cargas" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DatosRegistrales" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescripcionFinca" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Documento" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Documento" minOccurs="0"/>
 *         &lt;element name="IdSolicitudOCR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Titulares" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotaSimpleNodulos", propOrder = {
    "asientosPendientes",
    "cargas",
    "datosRegistrales",
    "descripcionFinca",
    "documento",
    "idSolicitudOCR",
    "titulares"
})
public class NotaSimpleNodulos
    extends OCRBase
{

    @XmlElement(name = "AsientosPendientes", required = true, nillable = true)
    protected String asientosPendientes;
    @XmlElement(name = "Cargas", required = true, nillable = true)
    protected String cargas;
    @XmlElement(name = "DatosRegistrales", required = true, nillable = true)
    protected String datosRegistrales;
    @XmlElement(name = "DescripcionFinca", required = true, nillable = true)
    protected String descripcionFinca;
    @XmlElementRef(name = "Documento", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<Documento> documento;
    @XmlElement(name = "IdSolicitudOCR", required = true, type = Integer.class, nillable = true)
    protected Integer idSolicitudOCR;
    @XmlElement(name = "Titulares", required = true, nillable = true)
    protected String titulares;

    /**
     * Gets the value of the asientosPendientes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsientosPendientes() {
        return asientosPendientes;
    }

    /**
     * Sets the value of the asientosPendientes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsientosPendientes(String value) {
        this.asientosPendientes = value;
    }

    /**
     * Gets the value of the cargas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargas() {
        return cargas;
    }

    /**
     * Sets the value of the cargas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargas(String value) {
        this.cargas = value;
    }

    /**
     * Gets the value of the datosRegistrales property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatosRegistrales() {
        return datosRegistrales;
    }

    /**
     * Sets the value of the datosRegistrales property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatosRegistrales(String value) {
        this.datosRegistrales = value;
    }

    /**
     * Gets the value of the descripcionFinca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionFinca() {
        return descripcionFinca;
    }

    /**
     * Sets the value of the descripcionFinca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionFinca(String value) {
        this.descripcionFinca = value;
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
     * Gets the value of the titulares property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitulares() {
        return titulares;
    }

    /**
     * Sets the value of the titulares property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitulares(String value) {
        this.titulares = value;
    }

}
