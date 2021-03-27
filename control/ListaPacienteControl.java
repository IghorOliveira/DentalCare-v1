/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control;

import com.ighor.control.helper.ListaPacienteHelper;
import com.ighor.dao.PacienteDAO;
import com.ighor.dao.Conexao;
import com.ighor.model.Paciente;
import com.ighor.view.ListaPacienteView;
import com.ighor.view.MenuAtendenteView;
import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Ighor Alves
 */
public class ListaPacienteControl {

    private final ListaPacienteView view;
    private final ListaPacienteHelper helper;

    public ListaPacienteControl(ListaPacienteView view) {
        this.view=view;
        this.helper = new ListaPacienteHelper(view);
    }

    public void buscarPaciente() {
//        String nomeCampo = helper.obterCampo();
//        String texto = helper.obterTexto();
//        ArrayList<Paciente> paciente;
//        
//        
//        Connection conexao = new Conexao().getConnection();
//        PacienteDAO pacienteDAO = new PacienteDAO(conexao);
//        if(nomeCampo.equals("codigo")){
//            paciente = pacienteDAO.selecionarPorCodigo(texto); 
//        } else {
//            paciente = pacienteDAO.selecionarOndeEsteCampoEhIgualAoTexto(nomeCampo,texto); 
//        
//        }
//        helper.preencherTabela(paciente);
       
    }
    
    public void iniciarTabela(){
        Connection conexao = new Conexao().getConnection();
        PacienteDAO pacienteDAO = new PacienteDAO(conexao);
        
        ArrayList<Paciente> pacientes = pacienteDAO.selecionarTodos();
        
        helper.preencherTabela(pacientes);
    }

    public void voltarMenuPrincipal() {
        MenuAtendenteView mav = new MenuAtendenteView();
        mav.setVisible(true);
        view.dispose();
    }



}
