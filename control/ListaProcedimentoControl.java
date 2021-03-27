/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control;

import com.ighor.control.helper.ListaProcedimentoHelper;
import com.ighor.dao.Conexao;
import com.ighor.dao.ProcedimentoDAO;
import com.ighor.model.Procedimento;
import com.ighor.view.ListaProcedimentoView;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Ighor Alves
 */
public class ListaProcedimentoControl {

    private final ListaProcedimentoView view;
    private final ListaProcedimentoHelper helper;

    public ListaProcedimentoControl(ListaProcedimentoView view) {
        this.view=view;
        this.helper=new ListaProcedimentoHelper(view);
    }

    public void iniciarTabela() {
        Connection conexao =new Conexao().getConnection();
        ProcedimentoDAO procedimentoDAO = new ProcedimentoDAO(conexao);
        
        
        ArrayList<Procedimento> procedimentos =procedimentoDAO.selecionarTodos();
        
        helper.preencherTabela(procedimentos);
     }



    
}
