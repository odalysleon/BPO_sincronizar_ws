
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad getPendingDocumentsResult.
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
     * Define el valor de la propiedad getPendingDocumentsResult.
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
