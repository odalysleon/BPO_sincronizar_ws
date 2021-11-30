
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
 *         &lt;element name="NotasSimples" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}ArrayOfNotaSimple" minOccurs="0"/>
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
    "notasSimples"
})
@XmlRootElement(name = "ReceiveNotasSimples", namespace = "http://tempuri.org/")
public class ReceiveNotasSimples {

    @XmlElementRef(name = "NotasSimples", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNotaSimple> notasSimples;

    /**
     * Gets the value of the notasSimples property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotaSimple }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNotaSimple> getNotasSimples() {
        return notasSimples;
    }

    /**
     * Sets the value of the notasSimples property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotaSimple }{@code >}
     *     
     */
    public void setNotasSimples(JAXBElement<ArrayOfNotaSimple> value) {
        this.notasSimples = value;
    }

}
