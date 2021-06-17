
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Persona complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Persona">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}OCRBase">
 *       &lt;sequence>
 *         &lt;element name="Apellido1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Apellido2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Identificacion" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Identificacion" minOccurs="0"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TipoRegimenEconomico" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_TipoRegimenEconomica" minOccurs="0"/>
 *         &lt;element name="Titulos" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}ArrayOfTitulo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Persona", propOrder = {
    "apellido1",
    "apellido2",
    "identificacion",
    "nombre",
    "tipoRegimenEconomico",
    "titulos"
})
public class Persona
    extends OCRBase
{

    @XmlElementRef(name = "Apellido1", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido1;
    @XmlElementRef(name = "Apellido2", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> apellido2;
    @XmlElementRef(name = "Identificacion", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<Identificacion> identificacion;
    @XmlElementRef(name = "Nombre", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nombre;
    @XmlElement(name = "TipoRegimenEconomico")
    protected ConfigurationTTipoRegimenEconomica tipoRegimenEconomico;
    @XmlElementRef(name = "Titulos", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTitulo> titulos;

    /**
     * Gets the value of the apellido1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellido1() {
        return apellido1;
    }

    /**
     * Sets the value of the apellido1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellido1(JAXBElement<String> value) {
        this.apellido1 = value;
    }

    /**
     * Gets the value of the apellido2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApellido2() {
        return apellido2;
    }

    /**
     * Sets the value of the apellido2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApellido2(JAXBElement<String> value) {
        this.apellido2 = value;
    }

    /**
     * Gets the value of the identificacion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Identificacion }{@code >}
     *     
     */
    public JAXBElement<Identificacion> getIdentificacion() {
        return identificacion;
    }

    /**
     * Sets the value of the identificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Identificacion }{@code >}
     *     
     */
    public void setIdentificacion(JAXBElement<Identificacion> value) {
        this.identificacion = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNombre(JAXBElement<String> value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the tipoRegimenEconomico property.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTTipoRegimenEconomica }
     *     
     */
    public ConfigurationTTipoRegimenEconomica getTipoRegimenEconomico() {
        return tipoRegimenEconomico;
    }

    /**
     * Sets the value of the tipoRegimenEconomico property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTTipoRegimenEconomica }
     *     
     */
    public void setTipoRegimenEconomico(ConfigurationTTipoRegimenEconomica value) {
        this.tipoRegimenEconomico = value;
    }

    /**
     * Gets the value of the titulos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTitulo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTitulo> getTitulos() {
        return titulos;
    }

    /**
     * Sets the value of the titulos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTitulo }{@code >}
     *     
     */
    public void setTitulos(JAXBElement<ArrayOfTitulo> value) {
        this.titulos = value;
    }

}
