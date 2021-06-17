
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Identificacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Identificacion">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}OCRBase">
 *       &lt;sequence>
 *         &lt;element name="NumeroIdentificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoIdentificacion" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Companies}PersonModel.IdentifierType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identificacion", propOrder = {
    "numeroIdentificacion",
    "tipoIdentificacion"
})
public class Identificacion
    extends OCRBase
{

    @XmlElementRef(name = "NumeroIdentificacion", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> numeroIdentificacion;
    @XmlElement(name = "TipoIdentificacion")
    protected PersonModelIdentifierType tipoIdentificacion;

    /**
     * Gets the value of the numeroIdentificacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    /**
     * Sets the value of the numeroIdentificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNumeroIdentificacion(JAXBElement<String> value) {
        this.numeroIdentificacion = value;
    }

    /**
     * Gets the value of the tipoIdentificacion property.
     * 
     * @return
     *     possible object is
     *     {@link PersonModelIdentifierType }
     *     
     */
    public PersonModelIdentifierType getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Sets the value of the tipoIdentificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonModelIdentifierType }
     *     
     */
    public void setTipoIdentificacion(PersonModelIdentifierType value) {
        this.tipoIdentificacion = value;
    }

}
