/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control.helper;

import com.ighor.model.Procedimento;
import com.ighor.view.CadastroProcedimentoView;
import javax.swing.JOptionPane;

/**
 *
 * @author Ighor Alves
 */
public class CadastroProcedimentoHelper {

    private final CadastroProcedimentoView view;

    public CadastroProcedimentoHelper(CadastroProcedimentoView view) {
        this.view = view;
    }

    public Procedimento obterModelo() {
        String nome = view.getTxt_CadastroProcedimentoNome().getText();
        String descricao = view.getTxt_CadastroProcedimentoDescricao().getText();
        double valorSugerido = Double.parseDouble(view.getTxt_CadastroProcedimentoValor().getText());
        
        return new Procedimento(nome, descricao, valorSugerido);
    }

    public void mostrarMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public void limparCampos() {
        view.getTxt_CadastroProcedimentoNome().setText("");
        view.getTxt_CadastroProcedimentoDescricao().setText("");
        view.getTxt_CadastroProcedimentoValor().setText("");
    }
    
}
