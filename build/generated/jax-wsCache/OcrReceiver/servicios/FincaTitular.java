
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FincaTitular complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad regimenEconomico.
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
     * Define el valor de la propiedad regimenEconomico.
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
     * Obtiene el valor de la propiedad titular.
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
     * Define el valor de la propiedad titular.
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
