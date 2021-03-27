/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control.helper;

import com.ighor.model.Paciente;
import com.ighor.view.ListaPacienteView;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ighor Alves
 */
public class ListaPacienteHelper {

    private final ListaPacienteView view;

    public ListaPacienteHelper(ListaPacienteView view) {
        this.view=view;
    }

    public void preencherTabela(ArrayList<Paciente> pacientes) {
         //tendo acesso ao model da tabela
        DefaultTableModel tableModel = (DefaultTableModel) view.getTbl_ListarPacienteDados().getModel();
        tableModel.setNumRows(0);
        
        //percorrer a lista preenchendo o tableModel
        for (Paciente paciente : pacientes) {
            tableModel.addRow(new Object[]{
                paciente.getCodigo(),
                paciente.getNome(),
                paciente.getCpf(),
                paciente.getTelefone(),
                paciente.getCelular(),
                paciente.getDtNascimento()
            });
        }
    }

    public String obterTexto() {
        return view.getTxt_ListarPacienteTexto().getText();
    }
    
}
