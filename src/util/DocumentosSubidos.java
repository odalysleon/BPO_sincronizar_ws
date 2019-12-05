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
public class DocumentosSubidos {
    private Integer cantTotal;
    private Integer cantidadNotas;
    private Integer cantidadIRPF;
    private Integer cantidadNomina;
    private Integer cantidadRecibo;
    private Integer cantidadTasacion;
    private Integer cantidadVidaLaboral;
    private Integer cantidadKO;
    private Integer cantidadNotasOCR;
    

    public DocumentosSubidos(Integer cantidadNotas, Integer cantidadIRPF, Integer cantidadNomina, 
                             Integer cantidadRecibo, Integer cantidadTasacion, 
                             Integer cantidadVidaLaboral, Integer cantidadKO, Integer cantidadNotasOCR) {
        this.cantidadNotas = cantidadNotas==null?0:cantidadNotas;
        this.cantidadIRPF = cantidadIRPF==null?0:cantidadIRPF;
        this.cantidadNomina = cantidadNomina==null?0:cantidadNomina;
        this.cantidadRecibo = cantidadRecibo==null?0:cantidadRecibo;
        this.cantidadTasacion = cantidadTasacion==null?0:cantidadTasacion;
        this.cantidadVidaLaboral = cantidadVidaLaboral==null?0:cantidadVidaLaboral;
        this.cantidadKO = cantidadKO==null?0:cantidadKO;
        this.cantidadNotasOCR = cantidadNotasOCR==null?0:cantidadNotasOCR;
        this.cantTotal = (cantidadNotas==null?0:cantidadNotas) + 
                         (cantidadIRPF==null?0:cantidadIRPF) + 
                         (cantidadNomina==null?0:cantidadNomina) + 
                         (cantidadRecibo==null?0:cantidadRecibo) + 
                         (cantidadTasacion==null?0:cantidadTasacion) + 
                         (cantidadVidaLaboral==null?0:cantidadVidaLaboral) + 
                         (cantidadKO==null?0:cantidadKO) + 
                         (cantidadNotasOCR==null?0:cantidadNotasOCR);
    }

    public Integer getCantTotal() {
        return cantTotal;
    }

    public void setCantTotal(Integer cantTotal) {
        this.cantTotal = cantTotal;
    }

    public Integer getCantidadNotas() {
        return cantidadNotas;
    }

    public void setCantidadNotas(Integer cantidadNotas) {
        this.cantidadNotas = cantidadNotas;
    }

    public Integer getCantidadIRPF() {
        return cantidadIRPF;
    }

    public void setCantidadIRPF(Integer cantidadIRPF) {
        this.cantidadIRPF = cantidadIRPF;
    }

    public Integer getCantidadNomina() {
        return cantidadNomina;
    }

    public void setCantidadNomina(Integer cantidadNomina) {
        this.cantidadNomina = cantidadNomina;
    }

    public Integer getCantidadRecibo() {
        return cantidadRecibo;
    }

    public void setCantidadRecibo(Integer cantidadRecibo) {
        this.cantidadRecibo = cantidadRecibo;
    }

    public Integer getCantidadTasacion() {
        return cantidadTasacion;
    }

    public void setCantidadTasacion(Integer cantidadTasacion) {
        this.cantidadTasacion = cantidadTasacion;
    }

    public Integer getCantidadVidaLaboral() {
        return cantidadVidaLaboral;
    }

    public void setCantidadVidaLaboral(Integer cantidadVidaLaboral) {
        this.cantidadVidaLaboral = cantidadVidaLaboral;
    }

    public Integer getCantidadKO() {
        return cantidadKO;
    }

    public void setCantidadKO(Integer cantidadKO) {
        this.cantidadKO = cantidadKO;
    }

    public Integer getCantidadNotasOCR() {
        return cantidadNotasOCR;
    }

    public void setCantidadNotasOCR(Integer cantidadNotasOCR) {
        this.cantidadNotasOCR = cantidadNotasOCR;
    }
    
    
}
