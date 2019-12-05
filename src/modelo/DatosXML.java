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
public class DatosXML {
    private ArrayList<ComponenteFormulario> listaComponentes;
    private ArrayList<ArrayList<ComponenteFormulario>> listaTiturales;
    private ArrayList<ArrayList<ComponenteFormulario>> listaAnejos;
    private ArrayList<ArrayList<ComponenteFormulario>> listaCargas;
    private ArrayList<FincaTasacion> listaFincas;
    private Integer cantTitulares;
    private Integer cantAnejos;
    private Integer cantCargas;
    
    public DatosXML() {
        listaComponentes = new ArrayList<>();
        listaTiturales = new ArrayList<>();
        listaAnejos = new ArrayList<>();
        listaCargas = new ArrayList<>();
        listaFincas = new ArrayList<>();
    }
    public ArrayList<ComponenteFormulario> getListaComponentes() {
        return listaComponentes;
    }
    public Integer getCantTitulares() {
        return cantTitulares;
    }
    public void setCantTitulares(Integer cantTitulares) {
        this.cantTitulares = cantTitulares;
    }
    public void setListaComponentes(ArrayList<ComponenteFormulario> listaComponentes) {
        this.listaComponentes = listaComponentes;
    }

    public Integer getCantAnejos() {
        return cantAnejos;
    }

    public void setCantAnejos(Integer cantAnejos) {
        this.cantAnejos = cantAnejos;
    }

    public Integer getCantCargas() {
        return cantCargas;
    }

    public void setCantCargas(Integer cantCargas) {
        this.cantCargas = cantCargas;
    }

    public ArrayList<ArrayList<ComponenteFormulario>> getListaTiturales() {
        return listaTiturales;
    }

    public void setListaTiturales(ArrayList<ArrayList<ComponenteFormulario>> listaTiturales) {
        this.listaTiturales = listaTiturales;
    }

    public ArrayList<ArrayList<ComponenteFormulario>> getListaAnejos() {
        return listaAnejos;
    }

    public void setListaAnejos(ArrayList<ArrayList<ComponenteFormulario>> listaAnejos) {
        this.listaAnejos = listaAnejos;
    }

    public ArrayList<ArrayList<ComponenteFormulario>> getListaCargas() {
        return listaCargas;
    }

    public void setListaCargas(ArrayList<ArrayList<ComponenteFormulario>> listaCargas) {
        this.listaCargas = listaCargas;
    }

    public ArrayList<FincaTasacion> getListaFincas() {
        return listaFincas;
    }

    public void setListaFincas(ArrayList<FincaTasacion> listaFincas) {
        this.listaFincas = listaFincas;
    }
}
