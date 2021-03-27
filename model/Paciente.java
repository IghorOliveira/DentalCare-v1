/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ighor Alves
 */
public class Paciente {
    private int codigo;
    private String nome;
    private String cpf;
    private String telefone;
    private String celular;
    private Date dtNascimento;

    public Paciente(String nome, String cpf, String telefone,String celular, String dtNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        try {
            this.dtNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dtNascimento);
        } catch (ParseException ex) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.telefone = telefone;
    }

    public Paciente(int pacienteCodigo) {
        this.codigo = pacienteCodigo;
    }

    public Paciente() {
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    
    
    
    
    
}
