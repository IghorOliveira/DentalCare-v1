/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control.helper;

import com.ighor.model.Funcionario;
import com.ighor.view.ListaDentistaView;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ighor Alves
 */
public class ListaDentistaHelper {

    private final ListaDentistaView view;

    public ListaDentistaHelper(ListaDentistaView view) {
        this.view=view;
    }

    public void preencherTabela(ArrayList<Funcionario> funcionarios) {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTbl_ListarDentistaDados().getModel();
        tableModel.setNumRows(0);
        
        
        for(Funcionario funcionario : funcionarios){
            tableModel.addRow(new Object[]{
                funcionario.getCodigo(),
                funcionario.getNome(),
                funcionario.getCargo(),
                funcionario.getCrm(),
                funcionario.getSalario(),
                funcionario.getTelefone(),
                funcionario.getSalario(),
                funcionario.getDtNascimento(),
                funcionario.getDtContratacao()
            });
        }
   }
    
}
