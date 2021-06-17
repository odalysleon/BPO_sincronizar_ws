
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCRBase complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCRBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Base}BaseModel">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCRBase")
@XmlSeeAlso({
    Anejo.class,
    Condicionante.class,
    Advertencia.class,
    NotaSimple.class,
    FincaTitular.class,
    FincaTasacion.class,
    Tasacion.class,
    NotaSimpleNodulos.class,
    Recibo.class,
    Titulo.class,
    Identificacion.class,
    Persona.class,
    Finca.class,
    VidaLaboral.class,
    IRPF.class,
    Carga.class,
    Nomina.class
})
public class OCRBase
    extends BaseModel
{


}
