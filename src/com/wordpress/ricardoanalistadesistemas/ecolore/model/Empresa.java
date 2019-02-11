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
public class Empresa implements Serializable {
    private String nome;
    private String cnpj;
    private String ramo;
    private String endereco;
    private String bairro;
    private String telefone;
    private String responsavel;
    private String rg;
    private String cargo;
    private String email;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @return the ramo
     */
    public String getRamo() {
        return ramo;
    }

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @return the responsavel
     */
    public String getResponsavel() {
        return responsavel;
    }

    /**
     * @return the rg
     */
    public String getRg() {
        return rg;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @param ramo the ramo to set
     */
    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @param responsavel the responsavel to set
     */
    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    /**
     * @param rg the rg to set
     */
    public void setRg(String rg) {
        this.rg = rg;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nCNPJ: " + cnpj + "\nRamo: " + ramo + "\nEndereço: " + endereco +
                "\nBairo: " + bairro + "\nTelefone: " + telefone + "\nResponsável: " + responsavel +
                "\nRG: " + rg + "\nCargo: " + cargo + "\nE-Mail: " + email;
    }
}
