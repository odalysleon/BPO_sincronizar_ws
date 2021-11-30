
package servicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFincaTitular complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFincaTitular">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FincaTitular" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}FincaTitular" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFincaTitular", propOrder = {
    "fincaTitular"
})
public class ArrayOfFincaTitular {

    @XmlElement(name = "FincaTitular", nillable = true)
    protected List<FincaTitular> fincaTitular;

    /**
     * Gets the value of the fincaTitular property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fincaTitular property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFincaTitular().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FincaTitular }
     * 
     * 
     */
    public List<FincaTitular> getFincaTitular() {
        if (fincaTitular == null) {
            fincaTitular = new ArrayList<FincaTitular>();
        }
        return this.fincaTitular;
    }

}
