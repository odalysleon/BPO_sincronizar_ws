
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
 *         &lt;element name="ReceiveVidasLaboralesResult" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}ArrayOfOCRWSResult" minOccurs="0"/>
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
    "receiveVidasLaboralesResult"
})
@XmlRootElement(name = "ReceiveVidasLaboralesResponse", namespace = "http://tempuri.org/")
public class ReceiveVidasLaboralesResponse {

    @XmlElementRef(name = "ReceiveVidasLaboralesResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfOCRWSResult> receiveVidasLaboralesResult;

    /**
     * Obtiene el valor de la propiedad receiveVidasLaboralesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOCRWSResult }{@code >}
     *     
     */
    public JAXBElement<ArrayOfOCRWSResult> getReceiveVidasLaboralesResult() {
        return receiveVidasLaboralesResult;
    }

    /**
     * Define el valor de la propiedad receiveVidasLaboralesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfOCRWSResult }{@code >}
     *     
     */
    public void setReceiveVidasLaboralesResult(JAXBElement<ArrayOfOCRWSResult> value) {
        this.receiveVidasLaboralesResult = value;
    }

}
