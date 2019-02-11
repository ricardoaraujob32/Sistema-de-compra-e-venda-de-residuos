/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author ricardobalduino
 */
public class ParticipanteLeilao implements Serializable {
    private int id;
    private Empresa empresa;
    private HashSet<ItemLeilao> conjuntoItens;
    private ArrayList<Lance> listaLances;

    public ParticipanteLeilao() {
        empresa = new Empresa();
        conjuntoItens = new HashSet<>();
        listaLances = new ArrayList<>();
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the empresa
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    public void arrematarItem(ItemLeilao i){
        conjuntoItens.add(i);
    }
    
    public Set<ItemLeilao> getItensLeilao(){
        return conjuntoItens;
    }
    
    public void darLance(Lance l){
        listaLances.add(l);
    }
    
    public List<Lance> getLances(){
        return listaLances;
    }    
    
}
