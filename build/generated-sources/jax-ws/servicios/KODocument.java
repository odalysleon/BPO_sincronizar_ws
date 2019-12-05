
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para KODocument complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="KODocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DescripcionError" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_TipoError" minOccurs="0"/>
 *         &lt;element name="IdSolicitudOcr" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KODocument", namespace = "http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes", propOrder = {
    "descripcionError",
    "idSolicitudOcr",
    "observaciones"
})
public class KODocument {

    @XmlElement(name = "DescripcionError")
    protected ConfigurationTTipoError descripcionError;
    @XmlElement(name = "IdSolicitudOcr")
    protected Integer idSolicitudOcr;
    @XmlElementRef(name = "Observaciones", namespace = "http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes", type = JAXBElement.class, required = false)
    protected JAXBElement<String> observaciones;

    /**
     * Obtiene el valor de la propiedad descripcionError.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTTipoError }
     *     
     */
    public ConfigurationTTipoError getDescripcionError() {
        return descripcionError;
    }

    /**
     * Define el valor de la propiedad descripcionError.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTTipoError }
     *     
     */
    public void setDescripcionError(ConfigurationTTipoError value) {
        this.descripcionError = value;
    }

    /**
     * Obtiene el valor de la propiedad idSolicitudOcr.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSolicitudOcr() {
        return idSolicitudOcr;
    }

    /**
     * Define el valor de la propiedad idSolicitudOcr.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSolicitudOcr(Integer value) {
        this.idSolicitudOcr = value;
    }

    /**
     * Obtiene el valor de la propiedad observaciones.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getObservaciones() {
        return observaciones;
    }

    /**
     * Define el valor de la propiedad observaciones.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setObservaciones(JAXBElement<String> value) {
        this.observaciones = value;
    }

}
