/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control.helper;

import com.ighor.model.Consulta;
import com.ighor.view.ListaConsultaView;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ighor Alves
 */
public class ListaConsultaHelper {

    private final ListaConsultaView view;

    public ListaConsultaHelper(ListaConsultaView view) {
        this.view = view;
    }

    public void preencherTabela(ArrayList<Consulta> consultas)  {
        DefaultTableModel tableModel = (DefaultTableModel) view.getTbl_ListaConsultaDados().getModel();
        tableModel.setNumRows(0);
        
        for(Consulta consulta : consultas){
                tableModel.addRow(new Object[]{
                    consulta.getCodigo(),
                    consulta.getDtConsulta(),
                    consulta.getAuxHorario(),
                    consulta.getDescricao(),
                    consulta.getValor(),
                    consulta.getPaciente().getCodigo(),
                    consulta.getFuncionario().getCodigo(),
                    consulta.getProcedimento().getCodigo()
                });
        }
    }
    
}
