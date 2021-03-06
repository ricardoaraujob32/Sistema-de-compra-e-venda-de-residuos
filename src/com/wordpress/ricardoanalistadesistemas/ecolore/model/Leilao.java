/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wordpress.ricardoanalistadesistemas.ecolore.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author ricardobalduino
 */
public class Leilao implements Serializable {
    private int idLeilao;
    private int numParticipantes;
    private int numItens;
    private String cnpjSolicitante;
    private LocalDate dataInicio;
    private LocalTime horaInicio;
    private LocalTime duracao;
    private int status;
    private Set<ParticipanteLeilao> listaEmpresa;
    private Set<ItemLeilao> listaResiduo;

    /**
     *
     */
    public Leilao() {
        dataInicio = LocalDate.now();
        horaInicio = LocalTime.now();
        listaEmpresa = new LinkedHashSet<>();
        listaResiduo = new LinkedHashSet<>();
    }
    
    /**
     * @return the idLeilao
     */
    public int getIdLeilao() {
        return idLeilao;
    }

    /**
     * @return the numParticipantes
     */
    public int getNumParticipantes() {
        return numParticipantes;
    }

    /**
     * @return the numItens
     */
    public int getNumItens() {
        return numItens;
    }

    /**
     * @return the cnpjSolicitante
     */
    public String getCnpjSolicitante() {
        return cnpjSolicitante;
    }

    /**
     * @return the dataInicio
     */
    public LocalDate getDataInicio() {
        return dataInicio;
    }

    /**
     * @return the horaInicio
     */
    public LocalTime getHoraInicio() {
        return horaInicio;
    }

    /**
     * @return the duracao
     */
    public LocalTime getDuracao() {
        return duracao;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }
    
    /**
     *
     * @param p
     * @return
     */
    public ParticipanteLeilao getParticipante(ParticipanteLeilao p){
        return listaEmpresa.contains(p) ? p : null;
    }
    
    /**
     *
     * @param i
     * @return
     */
    public ItemLeilao getItem(ItemLeilao i){
        return listaResiduo.contains(i) ? i : null;
    }
    
    /**
     *
     * @param p
     * @return
     */
    public boolean adicionarParticipante(ParticipanteLeilao p){
        return listaEmpresa.add(p);
    }
    
    /**
     *
     * @param p
     * @return
     */
    public boolean removerParticipante(ParticipanteLeilao p){
        return listaEmpresa.remove(p);
    }
    
    /**
     *
     * @param i
     * @return
     */
    public boolean adicionarItem(ItemLeilao i){
        return listaResiduo.add(i);
    }
    
    /**
     *
     * @param i
     * @return
     */
    public boolean removerItem(ItemLeilao i){
        return listaResiduo.remove(i);
    }

    /**
     * @param idLeilao the idLeilao to set
     */
    public void setIdLeilao(int idLeilao) {
        this.idLeilao = idLeilao;
    }

    /**
     * @param numParticipantes the numParticipantes to set
     */
    public void setNumParticipantes(int numParticipantes) {
        this.numParticipantes = numParticipantes;
    }

    /**
     * @param numItens the numItens to set
     */
    public void setNumItens(int numItens) {
        this.numItens = numItens;
    }

    /**
     * @param cnpjSolicitante the cnpjSolicitante to set
     */
    public void setCnpjSolicitante(String cnpjSolicitante) {
        this.cnpjSolicitante = cnpjSolicitante;
    }

    /**
     * @param dataInicio the dataInicio to set
     */
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * @param horaInicio the horaInicio to set
     */
    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(LocalTime duracao) {
        this.duracao = duracao;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "Código de identificação: " + idLeilao + "\nTotal de participantes: " + numParticipantes +
               "\nTotal de itens: " + numItens + "\nCNPJ do solicitante: " + cnpjSolicitante +
               "\nData de início: " + dataInicio + "\nHora de início: " + horaInicio + "\nDuração: " + duracao +
               "\nStatus: " + status;
    }
}
