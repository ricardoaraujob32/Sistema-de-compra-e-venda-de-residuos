/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wordpress.ricardoanalistadesistemas.ecolore.model;

import java.io.Serializable;

/**
 *
 * @author ricardobalduino
 */
public class ItemDoacao implements Serializable {
    private double quantidade;
    private String descricao;
    private Residuo residuo;

    public ItemDoacao() {
        residuo = new Residuo();
    }
    
    /**
     * @return the quantidade
     */
    public double getQuantidade() {
        return quantidade;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @return the residuo
     */
    public Residuo getResiduo() {
        return residuo;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @param residuo the residuo to set
     */
    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }
}
