
package servicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Nomina complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Nomina">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}OCRBase">
 *       &lt;sequence>
 *         &lt;element name="BaseImponible" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CNAE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ContigenciasComunes" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Documento" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Documento"/>
 *         &lt;element name="Empresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FechaAntiguedad" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="GrupoCotizacion" type="{http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs}Configuration.t_GrupoCotizacion" minOccurs="0"/>
 *         &lt;element name="IdSolicitudOCR" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ImporteARecibir" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="NIF" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NumeroSeguridadSocial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Retencion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="RetencionSeguridadSocial" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TipoIRPF" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nomina", propOrder = {
    "baseImponible",
    "cnae",
    "contigenciasComunes",
    "documento",
    "empresa",
    "fecha",
    "fechaAntiguedad",
    "grupoCotizacion",
    "idSolicitudOCR",
    "importeARecibir",
    "nif",
    "nombre",
    "numeroSeguridadSocial",
    "retencion",
    "retencionSeguridadSocial",
    "tipoIRPF"
})
public class Nomina
    extends OCRBase
{

    @XmlElement(name = "BaseImponible")
    protected Double baseImponible;
    @XmlElement(name = "CNAE", required = true, nillable = true)
    protected String cnae;
    @XmlElement(name = "ContigenciasComunes")
    protected Double contigenciasComunes;
    @XmlElement(name = "Documento", required = true, nillable = true)
    protected Documento documento;
    @XmlElementRef(name = "Empresa", namespace = "http://schemas.datacontract.org/2004/07/GrupoBC.Libraries.LibCosmosManager.Model.Solicitudes.Processes.OCRs", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empresa;
    @XmlElement(name = "Fecha", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fecha;
    @XmlElement(name = "FechaAntiguedad", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaAntiguedad;
    @XmlElement(name = "GrupoCotizacion")
    protected ConfigurationTGrupoCotizacion grupoCotizacion;
    @XmlElement(name = "IdSolicitudOCR")
    protected int idSolicitudOCR;
    @XmlElement(name = "ImporteARecibir")
    protected Double importeARecibir;
    @XmlElement(name = "NIF", required = true, nillable = true)
    protected String nif;
    @XmlElement(name = "Nombre", required = true, nillable = true)
    protected String nombre;
    @XmlElement(name = "NumeroSeguridadSocial", required = true, nillable = true)
    protected String numeroSeguridadSocial;
    @XmlElement(name = "Retencion")
    protected Double retencion;
    @XmlElement(name = "RetencionSeguridadSocial")
    protected Double retencionSeguridadSocial;
    @XmlElement(name = "TipoIRPF")
    protected Double tipoIRPF;

    /**
     * Obtiene el valor de la propiedad baseImponible.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBaseImponible() {
        return baseImponible;
    }

    /**
     * Define el valor de la propiedad baseImponible.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBaseImponible(Double value) {
        this.baseImponible = value;
    }

    /**
     * Obtiene el valor de la propiedad cnae.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNAE() {
        return cnae;
    }

    /**
     * Define el valor de la propiedad cnae.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNAE(String value) {
        this.cnae = value;
    }

    /**
     * Obtiene el valor de la propiedad contigenciasComunes.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getContigenciasComunes() {
        return contigenciasComunes;
    }

    /**
     * Define el valor de la propiedad contigenciasComunes.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setContigenciasComunes(Double value) {
        this.contigenciasComunes = value;
    }

    /**
     * Obtiene el valor de la propiedad documento.
     * 
     * @return
     *     possible object is
     *     {@link Documento }
     *     
     */
    public Documento getDocumento() {
        return documento;
    }

    /**
     * Define el valor de la propiedad documento.
     * 
     * @param value
     *     allowed object is
     *     {@link Documento }
     *     
     */
    public void setDocumento(Documento value) {
        this.documento = value;
    }

    /**
     * Obtiene el valor de la propiedad empresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpresa() {
        return empresa;
    }

    /**
     * Define el valor de la propiedad empresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpresa(JAXBElement<String> value) {
        this.empresa = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFecha(XMLGregorianCalendar value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaAntiguedad.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAntiguedad() {
        return fechaAntiguedad;
    }

    /**
     * Define el valor de la propiedad fechaAntiguedad.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAntiguedad(XMLGregorianCalendar value) {
        this.fechaAntiguedad = value;
    }

    /**
     * Obtiene el valor de la propiedad grupoCotizacion.
     * 
     * @return
     *     possible object is
     *     {@link ConfigurationTGrupoCotizacion }
     *     
     */
    public ConfigurationTGrupoCotizacion getGrupoCotizacion() {
        return grupoCotizacion;
    }

    /**
     * Define el valor de la propiedad grupoCotizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfigurationTGrupoCotizacion }
     *     
     */
    public void setGrupoCotizacion(ConfigurationTGrupoCotizacion value) {
        this.grupoCotizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad idSolicitudOCR.
     * 
     */
    public int getIdSolicitudOCR() {
        return idSolicitudOCR;
    }

    /**
     * Define el valor de la propiedad idSolicitudOCR.
     * 
     */
    public void setIdSolicitudOCR(int value) {
        this.idSolicitudOCR = value;
    }

    /**
     * Obtiene el valor de la propiedad importeARecibir.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getImporteARecibir() {
        return importeARecibir;
    }

    /**
     * Define el valor de la propiedad importeARecibir.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setImporteARecibir(Double value) {
        this.importeARecibir = value;
    }

    /**
     * Obtiene el valor de la propiedad nif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIF() {
        return nif;
    }

    /**
     * Define el valor de la propiedad nif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIF(String value) {
        this.nif = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroSeguridadSocial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    /**
     * Define el valor de la propiedad numeroSeguridadSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroSeguridadSocial(String value) {
        this.numeroSeguridadSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad retencion.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRetencion() {
        return retencion;
    }

    /**
     * Define el valor de la propiedad retencion.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRetencion(Double value) {
        this.retencion = value;
    }

    /**
     * Obtiene el valor de la propiedad retencionSeguridadSocial.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRetencionSeguridadSocial() {
        return retencionSeguridadSocial;
    }

    /**
     * Define el valor de la propiedad retencionSeguridadSocial.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRetencionSeguridadSocial(Double value) {
        this.retencionSeguridadSocial = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoIRPF.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTipoIRPF() {
        return tipoIRPF;
    }

    /**
     * Define el valor de la propiedad tipoIRPF.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTipoIRPF(Double value) {
        this.tipoIRPF = value;
    }

}
