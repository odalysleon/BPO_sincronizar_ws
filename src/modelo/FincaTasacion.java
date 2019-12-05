/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author TECH ID SOLUTIONS
 */
public class FincaTasacion {
    
    private ArrayList<ComponenteFormulario> listaComponentesXML;
    private ArrayList<ArrayList<ComponenteFormulario>> listaTitulares; 
    private ArrayList<ArrayList<ComponenteFormulario>> listaAnejos;

    public FincaTasacion(ArrayList<ComponenteFormulario> listaComponentesXML, ArrayList<ArrayList<ComponenteFormulario>> listaTitulares, ArrayList<ArrayList<ComponenteFormulario>> listaAnejos) {
        this.listaComponentesXML = listaComponentesXML;
        this.listaTitulares = listaTitulares;
        this.listaAnejos = listaAnejos;
    }

    public FincaTasacion() {
        listaComponentesXML = new ArrayList<>();
        listaTitulares = new ArrayList<>();
        listaAnejos = new ArrayList<>();
    }
    
    public ArrayList<ArrayList<ComponenteFormulario>> getListaTitulares() {
        return listaTitulares;
    }

    public void setListaTitulares(ArrayList<ArrayList<ComponenteFormulario>> listaTitulares) {
        this.listaTitulares = listaTitulares;
    }

    public ArrayList<ArrayList<ComponenteFormulario>> getListaAnejos() {
        return listaAnejos;
    }

    public void setListaAnejos(ArrayList<ArrayList<ComponenteFormulario>> listaAnejos) {
        this.listaAnejos = listaAnejos;
    }

    public ArrayList<ComponenteFormulario> getListaComponentesXML() {
        return listaComponentesXML;
    }

    public void setListaComponentesXML(ArrayList<ComponenteFormulario> listaComponentesXML) {
        this.listaComponentesXML = listaComponentesXML;
    }
    
}
