
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
 * <p>Java class for NotaSimple complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotaSimple">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}OCRBase">
 *       &lt;sequence>
 *         &lt;element name="Anejos" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}ArrayOfAnejo" minOccurs="0"/>
 *         &lt;element name="Documento" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Documento" minOccurs="0"/>
 *         &lt;element name="FechaNotaSimple" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Finca" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Finca" minOccurs="0"/>
 *         &lt;element name="IdSolicitudOCR" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Titulares" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}ArrayOfFincaTitular" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotaSimple", propOrder = {
    "anejos",
    "documento",
    "fechaNotaSimple",
    "finca",
    "idSolicitudOCR",
    "titulares"
})
public class NotaSimple
    extends OCRBase
{

    @XmlElementRef(name = "Anejos", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAnejo> anejos;
    @XmlElementRef(name = "Documento", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<Documento> documento;
    @XmlElement(name = "FechaNotaSimple")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaNotaSimple;
    @XmlElementRef(name = "Finca", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<Finca> finca;
    @XmlElement(name = "IdSolicitudOCR")
    protected Integer idSolicitudOCR;
    @XmlElementRef(name = "Titulares", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFincaTitular> titulares;

    /**
     * Gets the value of the anejos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAnejo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAnejo> getAnejos() {
        return anejos;
    }

    /**
     * Sets the value of the anejos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAnejo }{@code >}
     *     
     */
    public void setAnejos(JAXBElement<ArrayOfAnejo> value) {
        this.anejos = value;
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
     * Gets the value of the fechaNotaSimple property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaNotaSimple() {
        return fechaNotaSimple;
    }

    /**
     * Sets the value of the fechaNotaSimple property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNotaSimple(XMLGregorianCalendar value) {
        this.fechaNotaSimple = value;
    }

    /**
     * Gets the value of the finca property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Finca }{@code >}
     *     
     */
    public JAXBElement<Finca> getFinca() {
        return finca;
    }

    /**
     * Sets the value of the finca property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Finca }{@code >}
     *     
     */
    public void setFinca(JAXBElement<Finca> value) {
        this.finca = value;
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
     *     {@link JAXBElement }{@code <}{@link ArrayOfFincaTitular }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFincaTitular> getTitulares() {
        return titulares;
    }

    /**
     * Sets the value of the titulares property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFincaTitular }{@code >}
     *     
     */
    public void setTitulares(JAXBElement<ArrayOfFincaTitular> value) {
        this.titulares = value;
    }

}
