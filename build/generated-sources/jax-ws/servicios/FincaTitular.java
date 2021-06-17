
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FincaTitular complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FincaTitular">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}OCRBase">
 *       &lt;sequence>
 *         &lt;element name="RegimenEconomico" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_TipoRegimenEconomica" minOccurs="0"/>
 *         &lt;element name="Titular" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Persona" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FincaTitular", propOrder = {
    "regimenEconomico",
    "titular"
})
public class FincaTitular
    extends OCRBase
{

    @XmlElement(name = "RegimenEconomico")
    protected ConfigurationTTipoRegimenEconomica regimenEconomico;
    @XmlElementRef(name = "Titular", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<Persona> titular;

    /**
     * Gets the value of the regimenEconomico property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTTipoRegimenEconomica }
     *     
     */
    public ConfigurationTTipoRegimenEconomica getRegimenEconomico() {
        return regimenEconomico;
    }

    /**
     * Sets the value of the regimenEconomico property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTTipoRegimenEconomica }
     *     
     */
    public void setRegimenEconomico(ConfigurationTTipoRegimenEconomica value) {
        this.regimenEconomico = value;
    }

    /**
     * Gets the value of the titular property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Persona }{@code >}
     *     
     */
    public JAXBElement<Persona> getTitular() {
        return titular;
    }

    /**
     * Sets the value of the titular property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Persona }{@code >}
     *     
     */
    public void setTitular(JAXBElement<Persona> value) {
        this.titular = value;
    }

}
