
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tasaciones" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}ArrayOfTasacion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tasaciones"
})
@XmlRootElement(name = "ReceiveTasaciones", namespace = "http://tempuri.org/")
public class ReceiveTasaciones {

    @XmlElementRef(name = "Tasaciones", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTasacion> tasaciones;

    /**
     * Gets the value of the tasaciones property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTasacion }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTasacion> getTasaciones() {
        return tasaciones;
    }

    /**
     * Sets the value of the tasaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTasacion }{@code >}
     *     
     */
    public void setTasaciones(JAXBElement<ArrayOfTasacion> value) {
        this.tasaciones = value;
    }

}
