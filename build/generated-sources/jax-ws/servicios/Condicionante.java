
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Condicionante complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Condicionante">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}OCRBase">
 *       &lt;sequence>
 *         &lt;element name="IdCondicionante" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_TipoCondicionante" minOccurs="0"/>
 *         &lt;element name="IdTasacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Condicionante", propOrder = {
    "idCondicionante",
    "idTasacion"
})
public class Condicionante
    extends OCRBase
{

    @XmlElement(name = "IdCondicionante")
    protected ConfigurationTTipoCondicionante idCondicionante;
    @XmlElementRef(name = "IdTasacion", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idTasacion;

    /**
     * Obtiene el valor de la propiedad idCondicionante.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTTipoCondicionante }
     *     
     */
    public ConfigurationTTipoCondicionante getIdCondicionante() {
        return idCondicionante;
    }

    /**
     * Define el valor de la propiedad idCondicionante.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTTipoCondicionante }
     *     
     */
    public void setIdCondicionante(ConfigurationTTipoCondicionante value) {
        this.idCondicionante = value;
    }

    /**
     * Obtiene el valor de la propiedad idTasacion.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdTasacion() {
        return idTasacion;
    }

    /**
     * Define el valor de la propiedad idTasacion.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdTasacion(JAXBElement<Integer> value) {
        this.idTasacion = value;
    }

}
