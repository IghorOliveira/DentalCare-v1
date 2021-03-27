/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control.helper;

import com.ighor.model.Funcionario;
import com.ighor.view.CadastroDentistaView;
import javax.swing.JOptionPane;

/**
 *
 * @author Ighor Alves
 */
public class CadastroDentistaHelper {

    private final CadastroDentistaView view;

    public CadastroDentistaHelper(CadastroDentistaView view) {
        this.view=view;
    }



    public Funcionario obterModelo() {
        String nome = view.getTxt_CadastroDentistaNome().getText();
        String nomeUsuario = view.getTxt_CadastroDentistaNomeUsuario().getText();
        String senha = String.valueOf(view.getTxt_CadastroDentistaSenha().getPassword());
        String cargo = "Dentista"; 
        float salario = Float.parseFloat(view.getTxt_CadastroDentistaSalario().getText());
        String telefone = view.getTxt_CadastroDentistaTelefone().getText();
        String celular = view.getTxt_CadastroDentistaCelular().getText();
        String dataNascimento = view.getTxt_CadastroDentistaDataNascimento().getText();
        String dataContratacao = view.getTxt_CadastroDentistaDataContratacao().getText();
        String crm = view.getTxt_CadastroDentistaCrm().getText();
        return new Funcionario(nome, nomeUsuario, senha,cargo,crm, salario, telefone, celular, dataNascimento, dataContratacao);
    }


    public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }
    
   
}
