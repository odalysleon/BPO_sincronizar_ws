
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para OCRBase complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
    Tasacion.class,
    Finca.class,
    Identificacion.class,
    Condicionante.class,
    Titulo.class,
    NotaSimple.class,
    Advertencia.class,
    Recibo.class,
    NotaSimpleNodulos.class,
    Anejo.class,
    Persona.class,
    FincaTasacion.class,
    VidaLaboral.class,
    Carga.class,
    FincaTitular.class,
    Nomina.class,
    IRPF.class
})
public class OCRBase
    extends BaseModel
{


}
