
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
 *         &lt;element name="ReceiveKODocumentsResult" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}ArrayOfOCRWSResult" minOccurs="0"/>
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
    "receiveKODocumentsResult"
})
@XmlRootElement(name = "ReceiveKODocumentsResponse", namespace = "http://tempuri.org/")
public class ReceiveKODocumentsResponse {

    @XmlElementRef(name = "ReceiveKODocumentsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOCRWSResult> receiveKODocumentsResult;

    /**
     * Obtiene el valor de la propiedad receiveKODocumentsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOCRWSResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOCRWSResult> getReceiveKODocumentsResult() {
        return receiveKODocumentsResult;
    }

    /**
     * Define el valor de la propiedad receiveKODocumentsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOCRWSResult }{@code >}
     *     
     */
    public void setReceiveKODocumentsResult(JAXBElement<ArrayOfOCRWSResult> value) {
        this.receiveKODocumentsResult = value;
    }

}
