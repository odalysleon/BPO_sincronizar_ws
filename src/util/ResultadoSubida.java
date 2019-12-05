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
public class ResultadoSubida {
    private DocumentosSubidos documentosSubidos;
    private Boolean resultado;

    public ResultadoSubida(DocumentosSubidos documentosSubidos, Boolean resultado) {
        this.documentosSubidos = documentosSubidos;
        this.resultado = resultado;
    }

    public DocumentosSubidos getDocumentosSubidos() {
        return documentosSubidos;
    }

    public void setDocumentosSubidos(DocumentosSubidos documentosSubidos) {
        this.documentosSubidos = documentosSubidos;
    }

    public Boolean getResultado() {
        return resultado;
    }

    public void setResultado(Boolean resultado) {
        this.resultado = resultado;
    }
    
}
