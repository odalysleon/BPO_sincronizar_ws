
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
 * <p>Java class for Recibo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Recibo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}OCRBase">
 *       &lt;sequence>
 *         &lt;element name="CapitalPendiente" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Cuota" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Documento" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Documento"/>
 *         &lt;element name="EntidadEmisora" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FechaRecibo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaVencimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="IdSolicitudOCR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ImportePrestamo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroPrestamo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Recibo", propOrder = {
    "capitalPendiente",
    "cuota",
    "documento",
    "entidadEmisora",
    "fechaRecibo",
    "fechaVencimiento",
    "idSolicitudOCR",
    "importePrestamo",
    "nombre",
    "numeroPrestamo"
})
public class Recibo
    extends OCRBase
{

    @XmlElement(name = "CapitalPendiente", required = true, type = Double.class, nillable = true)
    protected Double capitalPendiente;
    @XmlElement(name = "Cuota")
    protected double cuota;
    @XmlElement(name = "Documento", required = true, nillable = true)
    protected Documento documento;
    @XmlElement(name = "EntidadEmisora", required = true, nillable = true)
    protected String entidadEmisora;
    @XmlElement(name = "FechaRecibo", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaRecibo;
    @XmlElementRef(name = "FechaVencimiento", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> fechaVencimiento;
    @XmlElement(name = "IdSolicitudOCR")
    protected int idSolicitudOCR;
    @XmlElement(name = "ImportePrestamo", required = true, type = Double.class, nillable = true)
    protected Double importePrestamo;
    @XmlElement(name = "Nombre", required = true, nillable = true)
    protected String nombre;
    @XmlElement(name = "NumeroPrestamo", required = true, nillable = true)
    protected String numeroPrestamo;

    /**
     * Gets the value of the capitalPendiente property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCapitalPendiente() {
        return capitalPendiente;
    }

    /**
     * Sets the value of the capitalPendiente property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCapitalPendiente(Double value) {
        this.capitalPendiente = value;
    }

    /**
     * Gets the value of the cuota property.
     * 
     */
    public double getCuota() {
        return cuota;
    }

    /**
     * Sets the value of the cuota property.
     * 
     */
    public void setCuota(double value) {
        this.cuota = value;
    }

    /**
     * Gets the value of the documento property.
     * 
     * @return
     *     possible object is
     *     {@link Documento }
     *     
     */
    public Documento getDocumento() {
        return documento;
    }

    /**
     * Sets the value of the documento property.
     * 
     * @param value
     *     allowed object is
     *     {@link Documento }
     *     
     */
    public void setDocumento(Documento value) {
        this.documento = value;
    }

    /**
     * Gets the value of the entidadEmisora property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntidadEmisora() {
        return entidadEmisora;
    }

    /**
     * Sets the value of the entidadEmisora property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntidadEmisora(String value) {
        this.entidadEmisora = value;
    }

    /**
     * Gets the value of the fechaRecibo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaRecibo() {
        return fechaRecibo;
    }

    /**
     * Sets the value of the fechaRecibo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaRecibo(XMLGregorianCalendar value) {
        this.fechaRecibo = value;
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
     * Gets the value of the idSolicitudOCR property.
     * 
     */
    public int getIdSolicitudOCR() {
        return idSolicitudOCR;
    }

    /**
     * Sets the value of the idSolicitudOCR property.
     * 
     */
    public void setIdSolicitudOCR(int value) {
        this.idSolicitudOCR = value;
    }

    /**
     * Gets the value of the importePrestamo property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImportePrestamo() {
        return importePrestamo;
    }

    /**
     * Sets the value of the importePrestamo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImportePrestamo(Double value) {
        this.importePrestamo = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the numeroPrestamo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    /**
     * Sets the value of the numeroPrestamo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroPrestamo(String value) {
        this.numeroPrestamo = value;
    }

}
