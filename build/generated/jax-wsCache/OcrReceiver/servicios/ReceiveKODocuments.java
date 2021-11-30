
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
 *         &lt;element name="KODocuemnts" type="{http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes}ArrayOfKODocument" minOccurs="0"/>
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
    "koDocuemnts"
})
@XmlRootElement(name = "ReceiveKODocuments", namespace = "http://tempuri.org/")
public class ReceiveKODocuments {

    @XmlElementRef(name = "KODocuemnts", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKODocument> koDocuemnts;

    /**
     * Gets the value of the koDocuemnts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKODocument }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKODocument> getKODocuemnts() {
        return koDocuemnts;
    }

    /**
     * Sets the value of the koDocuemnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKODocument }{@code >}
     *     
     */
    public void setKODocuemnts(JAXBElement<ArrayOfKODocument> value) {
        this.koDocuemnts = value;
    }

}
