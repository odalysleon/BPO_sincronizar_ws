
package servicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVidaLaboral complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVidaLaboral">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VidaLaboral" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}VidaLaboral" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVidaLaboral", propOrder = {
    "vidaLaboral"
})
public class ArrayOfVidaLaboral {

    @XmlElement(name = "VidaLaboral", nillable = true)
    protected List<VidaLaboral> vidaLaboral;

    /**
     * Gets the value of the vidaLaboral property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vidaLaboral property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVidaLaboral().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VidaLaboral }
     * 
     * 
     */
    public List<VidaLaboral> getVidaLaboral() {
        if (vidaLaboral == null) {
            vidaLaboral = new ArrayList<VidaLaboral>();
        }
        return this.vidaLaboral;
    }

}
