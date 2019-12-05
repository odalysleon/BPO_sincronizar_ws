
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Anejo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Anejo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}OCRBase">
 *       &lt;sequence>
 *         &lt;element name="SuperficieConstruida" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="SuperficieUtil" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TipoFinca" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_TipoFinca" minOccurs="0"/>
 *         &lt;element name="Valoracion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Anejo", propOrder = {
    "superficieConstruida",
    "superficieUtil",
    "tipoFinca",
    "valoracion"
})
public class Anejo
    extends OCRBase
{

    @XmlElement(name = "SuperficieConstruida")
    protected Double superficieConstruida;
    @XmlElement(name = "SuperficieUtil")
    protected Double superficieUtil;
    @XmlElement(name = "TipoFinca")
    protected ConfigurationTTipoFinca tipoFinca;
    @XmlElement(name = "Valoracion")
    protected Double valoracion;

    /**
     * Obtiene el valor de la propiedad superficieConstruida.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSuperficieConstruida() {
        return superficieConstruida;
    }

    /**
     * Define el valor de la propiedad superficieConstruida.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSuperficieConstruida(Double value) {
        this.superficieConstruida = value;
    }

    /**
     * Obtiene el valor de la propiedad superficieUtil.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSuperficieUtil() {
        return superficieUtil;
    }

    /**
     * Define el valor de la propiedad superficieUtil.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSuperficieUtil(Double value) {
        this.superficieUtil = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoFinca.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTTipoFinca }
     *     
     */
    public ConfigurationTTipoFinca getTipoFinca() {
        return tipoFinca;
    }

    /**
     * Define el valor de la propiedad tipoFinca.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTTipoFinca }
     *     
     */
    public void setTipoFinca(ConfigurationTTipoFinca value) {
        this.tipoFinca = value;
    }

    /**
     * Obtiene el valor de la propiedad valoracion.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getValoracion() {
        return valoracion;
    }

    /**
     * Define el valor de la propiedad valoracion.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setValoracion(Double value) {
        this.valoracion = value;
    }

}
