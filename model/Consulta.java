/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ighor Alves
 */
public class Consulta {
    private int codigo;
    private Date dtConsulta;
    private String auxHorario;
    private String descricao;
    private boolean pacienteCompareceu;
    private Paciente paciente;
    private Funcionario funcionario;
    private Procedimento procedimento;
    private double valor;
    


    public Consulta(String dtConsulta, String descricao, float valor, Paciente paciente, Funcionario dentista, Procedimento procedimento) {
        try {
            this.dtConsulta = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(dtConsulta);
        } catch (ParseException ex) {
            Logger.getLogger(Consulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.descricao = descricao;
        this.paciente = paciente;
        this.funcionario = dentista;
        this.procedimento = procedimento;
        this.valor = valor;
    }

    public Consulta() {
        
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDtConsulta() {
        return dtConsulta;
    }

    public void setDtConsulta(Date dtConsulta) {
        this.dtConsulta = dtConsulta;
    }
    
    
    public Date getDataFormatada() throws ParseException{
        String data = new SimpleDateFormat("dd/MM/yyyy").format(dtConsulta);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formato.parse(data);
        return date;
    }

    public String getHoraFormatada(){
        return new SimpleDateFormat("HH:mm").format(dtConsulta);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isPacienteCompareceu() {
        return pacienteCompareceu;
    }

    public void setPacienteCompareceu(boolean pacienteCompareceu) {
        this.pacienteCompareceu = pacienteCompareceu;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Procedimento procedimento) {
        this.procedimento = procedimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getAuxHorario() {
        return auxHorario;
    }

    public void setAuxHorario(String auxHorario) {
        this.auxHorario = auxHorario;
    }
    
    
    
    
    
    
}
