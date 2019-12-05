/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author TECH ID SOLUTIONS
 */
public class DocumentosDescargados {
    private Integer cantTotal;
    private Integer descargdaNotas;
    private Integer descargdaIRPF;
    private Integer descargdaNomina;
    private Integer descargdaRecibo;
    private Integer descargdaTasacion;
    private Integer descargdaVidaLaboral;
    private Integer descargdaNotasNodulos;

    public DocumentosDescargados(Integer cantTotal, Integer descargdaNotas, Integer descargdaIRPF, 
                                 Integer descargdaNomina, Integer descargdaRecibo, Integer descargdaTasacion, 
                                 Integer descargdaVidaLaboral, Integer descargdaNotasNodulos) {
        this.cantTotal = cantTotal;
        this.descargdaNotas = descargdaNotas;
        this.descargdaIRPF = descargdaIRPF;
        this.descargdaNomina = descargdaNomina;
        this.descargdaRecibo = descargdaRecibo;
        this.descargdaTasacion = descargdaTasacion;
        this.descargdaVidaLaboral = descargdaVidaLaboral;
        this.descargdaNotasNodulos = descargdaNotasNodulos;
    }

    public Integer getCantTotal() {
        return cantTotal;
    }

    public void setCantTotal(Integer cantTotal) {
        this.cantTotal = cantTotal;
    }

    public Integer getDescargdaNotas() {
        return descargdaNotas;
    }

    public void setDescargdaNotas(Integer descargdaNotas) {
        this.descargdaNotas = descargdaNotas;
    }

    public Integer getDescargdaIRPF() {
        return descargdaIRPF;
    }

    public void setDescargdaIRPF(Integer descargdaIRPF) {
        this.descargdaIRPF = descargdaIRPF;
    }

    public Integer getDescargdaNomina() {
        return descargdaNomina;
    }

    public void setDescargdaNomina(Integer descargdaNomina) {
        this.descargdaNomina = descargdaNomina;
    }

    public Integer getDescargdaRecibo() {
        return descargdaRecibo;
    }

    public void setDescargdaRecibo(Integer descargdaRecibo) {
        this.descargdaRecibo = descargdaRecibo;
    }

    public Integer getDescargdaTasacion() {
        return descargdaTasacion;
    }

    public void setDescargdaTasacion(Integer descargdaTasacion) {
        this.descargdaTasacion = descargdaTasacion;
    }

    public Integer getDescargdaVidaLaboral() {
        return descargdaVidaLaboral;
    }

    public void setDescargdaVidaLaboral(Integer descargdaVidaLaboral) {
        this.descargdaVidaLaboral = descargdaVidaLaboral;
    }

    public Integer getDescargdaNotasNodulos() {
        return descargdaNotasNodulos;
    }

    public void setDescargdaNotasNodulos(Integer descargdaNotasNodulos) {
        this.descargdaNotasNodulos = descargdaNotasNodulos;
    }
}
