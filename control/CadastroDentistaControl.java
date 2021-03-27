/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control;

import com.ighor.control.helper.CadastroDentistaHelper;
import com.ighor.dao.Conexao;
import com.ighor.dao.FuncionarioDAO;
import com.ighor.model.Funcionario;
import com.ighor.view.CadastroDentistaView;
import com.ighor.view.MenuAtendenteView;
import java.sql.Connection;

/**
 *
 * @author Ighor Alves
 */
public class CadastroDentistaControl {

    private final CadastroDentistaView view;
    private final CadastroDentistaHelper helper;

    public CadastroDentistaControl(CadastroDentistaView view) {
        this.view = view;
        this.helper = new CadastroDentistaHelper(view);
    }
    
    
    public void cadastrarDentista(){
        Funcionario funcionario = helper.obterModelo();
        Connection conexao = new Conexao().getConnection();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO(conexao);
        boolean sucessoParte1 = funcionarioDAO.cadastrarDentista(funcionario);
        if(sucessoParte1){
            helper.mostrarMensagem("Cadastro de Dentista Feito com Sucesso");
        } else {
            helper.mostrarMensagem("Erro ao Cadastrar Dentista");
        }
        
    }

    public void voltarMenuPrincipal() {
        MenuAtendenteView mav = new MenuAtendenteView();
        mav.setVisible(true);
        view.dispose();
    }
}
