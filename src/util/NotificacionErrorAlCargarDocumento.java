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
public class NotificacionErrorAlCargarDocumento {
    private Boolean resultadoSubida;
    private Boolean existeError;
    private String descripcionExcepcion;
    private Integer cantidadDocumentos;
    public String getDescripcionExcepcion() {
        return descripcionExcepcion;
    }
    public Boolean getResultadoSubida() {
        return resultadoSubida;
    }
    public void setResultadoSubida(Boolean resultadoSubida) {
        this.resultadoSubida = resultadoSubida;
    }
    public void setDescripcionExcepcion(String descripcionExcepcion) {
        this.descripcionExcepcion = descripcionExcepcion;
    }
    public Boolean getExisteError() {
        return existeError;
    }
    public void setExisteError(Boolean existeError) {
        this.existeError = existeError;
    }

    public Integer getCantidadDocumentos() {
        return cantidadDocumentos;
    }

    public void setCantidadDocumentos(Integer cantidadDocumentos) {
        this.cantidadDocumentos = cantidadDocumentos;
    }
    
}
