
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FincaTasacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FincaTasacion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}OCRBase">
 *       &lt;sequence>
 *         &lt;element name="Anejos" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}ArrayOfAnejo" minOccurs="0"/>
 *         &lt;element name="Finca" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Finca" minOccurs="0"/>
 *         &lt;element name="IdTasacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Titulares" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}ArrayOfFincaTitular" minOccurs="0"/>
 *         &lt;element name="ValorHipotecario" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ValorTasacion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FincaTasacion", propOrder = {
    "anejos",
    "finca",
    "idTasacion",
    "titulares",
    "valorHipotecario",
    "valorTasacion"
})
public class FincaTasacion
    extends OCRBase
{

    @XmlElementRef(name = "Anejos", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAnejo> anejos;
    @XmlElementRef(name = "Finca", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<Finca> finca;
    @XmlElementRef(name = "IdTasacion", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idTasacion;
    @XmlElementRef(name = "Titulares", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFincaTitular> titulares;
    @XmlElementRef(name = "ValorHipotecario", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valorHipotecario;
    @XmlElementRef(name = "ValorTasacion", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> valorTasacion;

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
     * Gets the value of the idTasacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdTasacion() {
        return idTasacion;
    }

    /**
     * Sets the value of the idTasacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdTasacion(JAXBElement<Integer> value) {
        this.idTasacion = value;
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

    /**
     * Gets the value of the valorHipotecario property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValorHipotecario() {
        return valorHipotecario;
    }

    /**
     * Sets the value of the valorHipotecario property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValorHipotecario(JAXBElement<Double> value) {
        this.valorHipotecario = value;
    }

    /**
     * Gets the value of the valorTasacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValorTasacion() {
        return valorTasacion;
    }

    /**
     * Sets the value of the valorTasacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValorTasacion(JAXBElement<Double> value) {
        this.valorTasacion = value;
    }

}
