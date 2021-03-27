/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control.helper;

import com.ighor.model.Funcionario;
import com.ighor.view.CadastroAtendenteView;
import javax.swing.JOptionPane;

/**
 *
 * @author Ighor Alves
 */
public class CadastroAtendenteHelper {

    private final CadastroAtendenteView view;

    public CadastroAtendenteHelper(CadastroAtendenteView view) {
        this.view=view;
    }
 
    
    public Funcionario obterModelo(){
        String nome = view.getTxt_CadastroAtendenteNome().getText();
        String nomeUsuario = view.getTxt_CadastroAtendenteNomeUsuario().getText();
        String senha = String.valueOf(view.getTxt_CadastroAtendenteSenha().getPassword());
        float salario = Float.parseFloat(view.getTxt_CadastroAtendenteSalario().getText());
        String telefone = view.getTxt_CadastroAtendenteTelefone().getText();
        String celular = view.getTxt_CadastroAtendenteCelular().getText();
        String dataNascimento = view.getTxt_CadastroAtendenteDataNascimento().getText();
        String dataContratacao = view.getTxt_CadastroAtendenteDataContratacao().getText();
      
    
        return new Funcionario(nome,nomeUsuario,senha,"Atendente","",salario,telefone,celular,dataNascimento,dataContratacao);
    }
    
    public void limparCampos(){
        view.getTxt_CadastroAtendenteCelular().setText("");
        view.getTxt_CadastroAtendenteDataContratacao().setText("");
        view.getTxt_CadastroAtendenteDataNascimento().setText("");
        view.getTxt_CadastroAtendenteNome().setText("");
        view.getTxt_CadastroAtendenteNomeUsuario().setText("");
        view.getTxt_CadastroAtendenteSalario().setText("");
        view.getTxt_CadastroAtendenteSenha().setText("");
        view.getTxt_CadastroAtendenteTelefone().setText("");
    }
    
    public void mostrarMensagem(String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
