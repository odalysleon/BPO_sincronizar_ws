
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
 *         &lt;element name="ReceiveNotasSimplesResult" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}ArrayOfOCRWSResult" minOccurs="0"/>
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
    "receiveNotasSimplesResult"
})
@XmlRootElement(name = "ReceiveNotasSimplesResponse", namespace = "http://tempuri.org/")
public class ReceiveNotasSimplesResponse {

    @XmlElementRef(name = "ReceiveNotasSimplesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOCRWSResult> receiveNotasSimplesResult;

    /**
     * Gets the value of the receiveNotasSimplesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOCRWSResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOCRWSResult> getReceiveNotasSimplesResult() {
        return receiveNotasSimplesResult;
    }

    /**
     * Sets the value of the receiveNotasSimplesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOCRWSResult }{@code >}
     *     
     */
    public void setReceiveNotasSimplesResult(JAXBElement<ArrayOfOCRWSResult> value) {
        this.receiveNotasSimplesResult = value;
    }

}
