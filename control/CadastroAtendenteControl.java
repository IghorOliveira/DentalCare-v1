/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control;

import com.ighor.control.helper.CadastroAtendenteHelper;
import com.ighor.dao.Conexao;
import com.ighor.dao.FuncionarioDAO;
import com.ighor.model.Funcionario;
import com.ighor.view.CadastroAtendenteView;
import com.ighor.view.MenuAtendenteView;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Ighor Alves
 */
public class CadastroAtendenteControl {

    private final CadastroAtendenteView view;
    private final CadastroAtendenteHelper helper;

    public CadastroAtendenteControl(CadastroAtendenteView view) {
        this.view = view;
        this.helper = new CadastroAtendenteHelper(view);
    }
    
    
    public void cadastrarAtendente(){
        Funcionario funcionario = helper.obterModelo();
        Connection conexao = new Conexao().getConnection();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO(conexao);
        boolean sucesso = funcionarioDAO.cadastrarAtendente(funcionario);
        
        if(sucesso){
            helper.mostrarMensagem("Cadastro De Atendente Feito");
            limparTela();
        } else {
            helper.mostrarMensagem("Erro ao Fazer Cadastro de Atendente");
        }
    }

    public void limparTela() {
        helper.limparCampos();
    }
    
    public void voltarMenuPrincipal(){
        MenuAtendenteView mav = new MenuAtendenteView();
        mav.setVisible(true);
        view.dispose();
    }
    
}
