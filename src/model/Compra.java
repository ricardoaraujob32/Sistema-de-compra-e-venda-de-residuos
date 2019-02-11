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
public class Compra implements Serializable {
    private Empresa gerador;
    private Empresa comprador;    
    private LocalDate data;
    private double valor;
    private int formaPgto;
    private int status;
    private ArrayList<ItemCompra> listaItens;

    /**
     *
     */
    public Compra() {
        gerador = new Empresa();
        comprador = new Empresa();
        listaItens = new ArrayList<>();
    }
    
    /**
     * @return the gerador
     */
    public Empresa getGerador() {
        return gerador;
    }

    /**
     * @return the comprador
     */
    public Empresa getComprador() {
        return comprador;
    }

    /**
     * @return the data
     */
    public LocalDate getData() {
        return data;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @return the formaPgto
     */
    public int getFormaPgto() {
        return formaPgto;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }
    
    public List<ItemCompra> getListaItens(){
        return listaItens;
    }
    
    public void adicionarItem(ItemCompra i){
        listaItens.add(i);
    }
    
    public void removerItem(ItemCompra i){
        listaItens.remove(i);
    }

    /**
     * @param gerador the gerador to set
     */
    public void setGerador(Empresa gerador) {
        this.gerador = gerador;
    }

    /**
     * @param comprador the comprador to set
     */
    public void setComprador(Empresa comprador) {
        this.comprador = comprador;
    }

    /**
     * @param data the data to set
     */
    public void setData(LocalDate data) {
        this.data = data;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @param formaPgto the formaPgto to set
     */
    public void setFormaPgto(int formaPgto) {
        this.formaPgto = formaPgto;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }
}
