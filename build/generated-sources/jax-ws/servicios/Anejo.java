
package servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Anejo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
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
     * Gets the value of the superficieConstruida property.
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
     * Sets the value of the superficieConstruida property.
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
     * Gets the value of the superficieUtil property.
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
     * Sets the value of the superficieUtil property.
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
     * Gets the value of the tipoFinca property.
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
     * Sets the value of the tipoFinca property.
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
     * Gets the value of the valoracion property.
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
     * Sets the value of the valoracion property.
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
