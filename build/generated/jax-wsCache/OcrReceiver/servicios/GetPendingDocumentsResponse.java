
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
 *         &lt;element name="GetPendingDocumentsResult" type="{http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes}ArrayOfDatosEnvio" minOccurs="0"/>
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
    "getPendingDocumentsResult"
})
@XmlRootElement(name = "GetPendingDocumentsResponse", namespace = "http://tempuri.org/")
public class GetPendingDocumentsResponse {

    @XmlElementRef(name = "GetPendingDocumentsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDatosEnvio> getPendingDocumentsResult;

    /**
     * Gets the value of the getPendingDocumentsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDatosEnvio }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDatosEnvio> getGetPendingDocumentsResult() {
        return getPendingDocumentsResult;
    }

    /**
     * Sets the value of the getPendingDocumentsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDatosEnvio }{@code >}
     *     
     */
    public void setGetPendingDocumentsResult(JAXBElement<ArrayOfDatosEnvio> value) {
        this.getPendingDocumentsResult = value;
    }

}
