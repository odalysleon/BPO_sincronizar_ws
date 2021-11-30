
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Advertencia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Advertencia">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}OCRBase">
 *       &lt;sequence>
 *         &lt;element name="IdAdvertencia" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_TipoAdvertencia" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Advertencia", propOrder = {
    "idAdvertencia"
})
public class Advertencia
    extends OCRBase
{

    @XmlElement(name = "IdAdvertencia")
    protected ConfigurationTTipoAdvertencia idAdvertencia;

    /**
     * Gets the value of the idAdvertencia property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTTipoAdvertencia }
     *     
     */
    public ConfigurationTTipoAdvertencia getIdAdvertencia() {
        return idAdvertencia;
    }

    /**
     * Sets the value of the idAdvertencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTTipoAdvertencia }
     *     
     */
    public void setIdAdvertencia(ConfigurationTTipoAdvertencia value) {
        this.idAdvertencia = value;
    }

}
