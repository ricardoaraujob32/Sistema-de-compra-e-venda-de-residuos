/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author ricardobalduino
 */
public class ItemCompra {
    private Residuo residuo;
    private double quantidade;
    private double preco;
    private int unidMedida;

    /**
     * @return the residuo
     */
    public Residuo getResiduo() {
        return residuo;
    }

    /**
     * @return the quantidade
     */
    public double getQuantidade() {
        return quantidade;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @return the unidMedida
     */
    public int getUnidMedida() {
        return unidMedida;
    }

    /**
     * @param residuo the residuo to set
     */
    public void setResiduo(Residuo residuo) {
        this.residuo = residuo;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @param unidMedida the unidMedida to set
     */
    public void setUnidMedida(int unidMedida) {
        this.unidMedida = unidMedida;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
