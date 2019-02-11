/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricardobalduino
 */
public class Doacao implements Serializable {
    private LocalDate data;
    private int status;
    private ArrayList<ItemDoacao> listaItens;
    private Empresa doador;
    private Empresa solicitante;

    public Doacao() {
        listaItens = new ArrayList<>();
        doador = new Empresa();
        solicitante = new Empresa();
    }

    /**
     * @return the data
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @return the listaItens
     */
    public List<ItemDoacao> getListaItens() {
        return listaItens;
    }

    /**
     * @param data the data to set
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @param listaItens the listaItens to set
     */
    public void adicionarItem(ItemDoacao i) {
        listaItens.add(i);
    }
    
    public void removerItem(ItemDoacao i){
        listaItens.remove(i);
    }

    /**
     * @return the doador
     */
    public Empresa getDoador() {
        return doador;
    }

    /**
     * @return the solicitante
     */
    public Empresa getSolicitante() {
        return solicitante;
    }

    /**
     * @param doador the doador to set
     */
    public void setDoador(Empresa doador) {
        this.doador = doador;
    }

    /**
     * @param solicitante the solicitante to set
     */
    public void setSolicitante(Empresa solicitante) {
        this.solicitante = solicitante;
    }
}
