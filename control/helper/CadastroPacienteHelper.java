/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control.helper;

import com.ighor.model.Paciente;
import com.ighor.view.CadastroPacienteView;
import javax.swing.JOptionPane;

/**
 *
 * @author Ighor Alves
 */
public class CadastroPacienteHelper {

    private final CadastroPacienteView view;

    public CadastroPacienteHelper(CadastroPacienteView view) {
        this.view = view;
    }

    public Paciente obterModelo() {
        String nome = view.getTxt_CadastroPacienteNome().getText();
        String cpf = view.getTxt_CadastroPacienteCpf().getText();
        String telefone = view.getTxt_CadastroPacienteTelefone().getText();
        String celular = view.getTxt_CadastroPacienteCelular().getText();
        String dtNascimento = view.getTxt_CadastroPacienteDataNascimento().getText();
        

        return new Paciente(nome, cpf, telefone, celular, dtNascimento);
    }

    public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public void limparCampos() {
        view.getTxt_CadastroPacienteCelular().setText("");
        view.getTxt_CadastroPacienteCpf().setText("");
        view.getTxt_CadastroPacienteDataNascimento().setText("");
        view.getTxt_CadastroPacienteNome().setText("");
        view.getTxt_CadastroPacienteTelefone().setText("");
    }
    
}
