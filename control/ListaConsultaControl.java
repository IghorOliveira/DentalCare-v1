/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control;

import com.ighor.control.helper.ListaConsultaHelper;
import com.ighor.dao.Conexao;
import com.ighor.dao.ConsultaDAO;
import com.ighor.model.Consulta;
import com.ighor.view.ListaConsultaView;
import java.sql.Connection;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author Ighor Alves
 */
public class ListaConsultaControl {

    private final ListaConsultaView view;
    private final ListaConsultaHelper helper;

    public ListaConsultaControl(ListaConsultaView view) {
        this.view=view;
        this.helper= new ListaConsultaHelper(view);
    }

    public void iniciarTabela() {
        Connection conexao = new Conexao().getConnection();
        ConsultaDAO consultaDAO = new ConsultaDAO(conexao);
        
        ArrayList<Consulta> consultas = consultaDAO.selecionarTodos();
        
        helper.preencherTabela(consultas);
    }

    public void buscarConsulta() {
        
    }
    
}
