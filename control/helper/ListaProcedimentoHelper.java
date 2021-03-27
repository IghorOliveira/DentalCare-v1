/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control.helper;

import com.ighor.model.Procedimento;
import com.ighor.view.ListaProcedimentoView;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ighor Alves
 */
public class ListaProcedimentoHelper {

    private final ListaProcedimentoView view;

    public ListaProcedimentoHelper(ListaProcedimentoView view) {
        this.view=view;
    }

    public void preencherTabela(ArrayList<Procedimento> procedimentos) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTbl_ListarProcedimentoDados().getModel();
        tableModel.setNumRows(0);
        
        for(Procedimento procedimento : procedimentos){
            tableModel.addRow(new Object[]{
                procedimento.getCodigo(),
                procedimento.getNome(),
                procedimento.getDescricao(),
                procedimento.getValor()
            });
        }
    }
    
}
