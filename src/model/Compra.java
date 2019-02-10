/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ricardobalduino
 */
public class Compra {
    private Empresa gerador;
    private Empresa comprador;    
    private LocalDate data;
    private double valor;
    private int formaPgto;
    private int status;
    private List<ItemCompra> listaItens;

    public Compra(Empresa gerador, Empresa comprador, LocalDate data, double valor, int formaPgto, int status) {
        this.gerador = gerador;
        this.comprador = comprador;
        this.data = data;
        this.valor = valor;
        this.formaPgto = formaPgto;
        this.status = status;
        this.listaItens = new ArrayList<>();
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
    
    public ItemCompra getItem(ItemCompra i){
        return listaItens.contains(i) ? i : null;
    }
    
    public boolean adicionarItem(ItemCompra i){
        return listaItens.add(i);
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
