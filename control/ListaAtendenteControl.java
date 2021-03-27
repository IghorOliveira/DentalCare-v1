/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control;

import com.ighor.control.helper.ListaAtendenteHelper;
import com.ighor.dao.Conexao;
import com.ighor.dao.ConsultaDAO;
import com.ighor.dao.FuncionarioDAO;
import com.ighor.model.Consulta;
import com.ighor.model.Funcionario;
import com.ighor.view.ListaAtendenteView;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Ighor Alves
 */
public class ListaAtendenteControl {

    private final ListaAtendenteView view;
    private final ListaAtendenteHelper helper;

    public ListaAtendenteControl(ListaAtendenteView view) {
        this.view=view;
        this.helper = new ListaAtendenteHelper(view);
    }

    public void iniciarTabela() {
        Connection conexao = new Conexao().getConnection();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO(conexao);
        
        ArrayList<Funcionario> funcionarios = funcionarioDAO.selecionarTodosAtendentes();
        
        helper.preencherTabela(funcionarios);
    }
    
}
