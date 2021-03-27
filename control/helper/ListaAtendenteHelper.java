/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control.helper;

import com.ighor.model.Funcionario;
import com.ighor.view.ListaAtendenteView;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ighor Alves
 */
public class ListaAtendenteHelper {

    private final ListaAtendenteView view;

    public ListaAtendenteHelper(ListaAtendenteView view) {
        this.view=view;
    }

    public void preencherTabela(ArrayList<Funcionario> funcionarios) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTbl_ListarAtendentesDados().getModel();
        tableModel.setNumRows(0);
        
        for(Funcionario funcionario : funcionarios){
            tableModel.addRow(new Object[]{
                funcionario.getCodigo(),
                funcionario.getNome(),
                funcionario.getCargo(),
                funcionario.getSalario(),
                funcionario.getTelefone(),
                funcionario.getCelular(),
                funcionario.getDtNascimento(),
                funcionario.getDtContratacao()
            });
        }
    }
    
}
