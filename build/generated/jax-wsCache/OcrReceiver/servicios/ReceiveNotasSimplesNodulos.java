
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
 *         &lt;element name="NotasSimples" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}ArrayOfNotaSimpleNodulos" minOccurs="0"/>
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
    "notasSimples"
})
@XmlRootElement(name = "ReceiveNotasSimplesNodulos", namespace = "http://tempuri.org/")
public class ReceiveNotasSimplesNodulos {

    @XmlElementRef(name = "NotasSimples", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNotaSimpleNodulos> notasSimples;

    /**
     * Obtiene el valor de la propiedad notasSimples.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotaSimpleNodulos }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNotaSimpleNodulos> getNotasSimples() {
        return notasSimples;
    }

    /**
     * Define el valor de la propiedad notasSimples.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNotaSimpleNodulos }{@code >}
     *     
     */
    public void setNotasSimples(JAXBElement<ArrayOfNotaSimpleNodulos> value) {
        this.notasSimples = value;
    }

}
