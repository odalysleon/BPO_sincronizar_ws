
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
 *         &lt;element name="VidasLaborales" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}ArrayOfVidaLaboral" minOccurs="0"/>
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
    "vidasLaborales"
})
@XmlRootElement(name = "ReceiveVidasLaborales", namespace = "http://tempuri.org/")
public class ReceiveVidasLaborales {

    @XmlElementRef(name = "VidasLaborales", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfVidaLaboral> vidasLaborales;

    /**
     * Gets the value of the vidasLaborales property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVidaLaboral }{@code >}
     *     
     */
    public JAXBElement<ArrayOfVidaLaboral> getVidasLaborales() {
        return vidasLaborales;
    }

    /**
     * Sets the value of the vidasLaborales property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfVidaLaboral }{@code >}
     *     
     */
    public void setVidasLaborales(JAXBElement<ArrayOfVidaLaboral> value) {
        this.vidasLaborales = value;
    }

}
