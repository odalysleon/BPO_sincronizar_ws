
package servicios;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNotaSimpleNodulos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNotaSimpleNodulos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotaSimpleNodulos" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}NotaSimpleNodulos" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNotaSimpleNodulos", propOrder = {
    "notaSimpleNodulos"
})
public class ArrayOfNotaSimpleNodulos {

    @XmlElement(name = "NotaSimpleNodulos", nillable = true)
    protected List<NotaSimpleNodulos> notaSimpleNodulos;

    /**
     * Gets the value of the notaSimpleNodulos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notaSimpleNodulos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotaSimpleNodulos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotaSimpleNodulos }
     * 
     * 
     */
    public List<NotaSimpleNodulos> getNotaSimpleNodulos() {
        if (notaSimpleNodulos == null) {
            notaSimpleNodulos = new ArrayList<NotaSimpleNodulos>();
        }
        return this.notaSimpleNodulos;
    }

}
