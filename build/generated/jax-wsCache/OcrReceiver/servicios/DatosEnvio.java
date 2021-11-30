
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DatosEnvio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatosEnvio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Documentos" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}ArrayOfDocumento" minOccurs="0"/>
 *         &lt;element name="IDSolicitud" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosEnvio", namespace = "http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes", propOrder = {
    "documentos",
    "idSolicitud"
})
public class DatosEnvio {

    @XmlElementRef(name = "Documentos", namespace = "http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDocumento> documentos;
    @XmlElementRef(name = "IDSolicitud", namespace = "http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idSolicitud;

    /**
     * Gets the value of the documentos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumento }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDocumento> getDocumentos() {
        return documentos;
    }

    /**
     * Sets the value of the documentos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDocumento }{@code >}
     *     
     */
    public void setDocumentos(JAXBElement<ArrayOfDocumento> value) {
        this.documentos = value;
    }

    /**
     * Gets the value of the idSolicitud property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIDSolicitud() {
        return idSolicitud;
    }

    /**
     * Sets the value of the idSolicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIDSolicitud(JAXBElement<Integer> value) {
        this.idSolicitud = value;
    }

}
