/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;

/**
 *
 * @author ricardobalduino
 */
public class ItemLeilao implements Serializable {
    private int id;
    private String descricao;
    private double lanceMinimo;
    private double valorAtual;
    private Residuo residuo;

    /**
     *
     */
    public ItemLeilao() {
        residuo = new Residuo();
    }    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @return the lanceMinimo
     */
    public double getLanceMinimo() {
        return lanceMinimo;
    }

    /**
     * @return the valorAtual
     */
    public double getValorAtual() {
        return valorAtual;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @param lanceMinimo the lanceMinimo to set
     */
    public void setLanceMinimo(double lanceMinimo) {
        this.lanceMinimo = lanceMinimo;
    }

    /**
     * @param valorAtual the valorAtual to set
     */
    public void setValorAtual(double valorAtual) {
        this.valorAtual = valorAtual;
    }

    /**
     * @return the residuo
     */
    public Residuo getResiduo() {
        return residuo;
    }

    /**
     * @param residuo the residuo to set
     */
    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }
}
