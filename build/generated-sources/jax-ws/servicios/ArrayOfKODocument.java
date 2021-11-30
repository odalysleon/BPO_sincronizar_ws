
package servicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKODocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKODocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KODocument" type="{http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes}KODocument" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKODocument", namespace = "http://schemas.datacontract.org/2004/07/WebServiceOcr.Classes", propOrder = {
    "koDocument"
})
public class ArrayOfKODocument {

    @XmlElement(name = "KODocument", nillable = true)
    protected List<KODocument> koDocument;

    /**
     * Gets the value of the koDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the koDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKODocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KODocument }
     * 
     * 
     */
    public List<KODocument> getKODocument() {
        if (koDocument == null) {
            koDocument = new ArrayList<KODocument>();
        }
        return this.koDocument;
    }

}
