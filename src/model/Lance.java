/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.time.LocalTime;

/**
 *
 * @author ricardobalduino
 */
public class Lance {
    private double valor;
    private LocalTime hora;

    public Lance() {
        hora = LocalTime.now();
    }
    
    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @return the hora
     */
    public LocalTime getHora() {
        return hora;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
}
