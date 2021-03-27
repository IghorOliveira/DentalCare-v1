/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control;

import com.ighor.control.helper.ListaDentistaHelper;
import com.ighor.dao.Conexao;
import com.ighor.dao.FuncionarioDAO;
import com.ighor.model.Funcionario;
import com.ighor.view.ListaDentistaView;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Ighor Alves
 */
public class ListaDentistaControl {

    private final ListaDentistaView view;
    private final ListaDentistaHelper helper;

    public ListaDentistaControl(ListaDentistaView view) {
        this.view=view;
        this.helper=new ListaDentistaHelper(view);
    }

    public void iniciarTabela() {
        Connection conexao = new Conexao().getConnection();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO(conexao);
        
        ArrayList<Funcionario> funcionarios = funcionarioDAO.selecionarTodosDentista();
        
        helper.preencherTabela(funcionarios);
    }
    
}
