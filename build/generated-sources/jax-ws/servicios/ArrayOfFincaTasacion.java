
package servicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFincaTasacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFincaTasacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FincaTasacion" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}FincaTasacion" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFincaTasacion", propOrder = {
    "fincaTasacion"
})
public class ArrayOfFincaTasacion {

    @XmlElement(name = "FincaTasacion", nillable = true)
    protected List<FincaTasacion> fincaTasacion;

    /**
     * Gets the value of the fincaTasacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fincaTasacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFincaTasacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FincaTasacion }
     * 
     * 
     */
    public List<FincaTasacion> getFincaTasacion() {
        if (fincaTasacion == null) {
            fincaTasacion = new ArrayList<FincaTasacion>();
        }
        return this.fincaTasacion;
    }

}
