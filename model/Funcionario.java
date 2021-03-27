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
public class Funcionario {
    private int codigo;
    private String nome;
    private String nomeUsuario;
    private String senha;
    private String cargo;
    private String crm;
    private double salario;
    private String telefone;
    private String celular;
    private Date dtNascimento;
    private Date dtContratacao;
    private boolean estaAtivo;
    

    public Funcionario(String nome, String nomeUsuario, String senha,String cargo,String crm ,double salario, String telefone, String celular, String dtNascimento, String dtContratacao) {
        this.nome = nome;
        this.salario = salario;
        this.cargo=cargo;
        this.crm=crm;
        this.telefone = telefone;
        this.celular = celular;
        try {
            this.dtNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dtNascimento);
            this.dtContratacao = new SimpleDateFormat("dd/MM/yyyy").parse(dtContratacao);
        } catch (ParseException ex) {
            Logger.getLogger(Funcionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public Funcionario(String nomeUsuario, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.senha =senha;
    }

    public Funcionario(){
    }
    
    public Funcionario(Funcionario funcionario){
        this.nome = funcionario.getNome();
        this.salario = funcionario.getSalario();
        this.telefone = funcionario.getTelefone();
        this.celular = funcionario.getCelular();
        this.dtNascimento  = funcionario.getDtNascimento();
        this.dtContratacao = funcionario.getDtContratacao();
        this.nomeUsuario = funcionario.getNomeUsuario();
        this.senha = funcionario.getSenha();
    }

    public Funcionario(int dentistaCodigo) {
        this.codigo = dentistaCodigo;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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

    public Date getDtContratacao() {
        return dtContratacao;
    }

    public void setDtContratacao(Date dtContratacao) {
        this.dtContratacao = dtContratacao;
    }

    public boolean isEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    
    
    
    
    
}
