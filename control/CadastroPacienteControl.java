/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control;

import com.ighor.control.helper.CadastroPacienteHelper;
import com.ighor.dao.Conexao;
import com.ighor.dao.PacienteDAO;
import com.ighor.model.Paciente;
import com.ighor.view.CadastroPacienteView;
import com.ighor.view.MenuAtendenteView;
import java.sql.Connection;

/**
 *
 * @author Ighor Alves
 */
public class CadastroPacienteControl {

    private final CadastroPacienteView view;
    private final CadastroPacienteHelper helper;

    public CadastroPacienteControl(CadastroPacienteView view) {
        this.view = view;
        this.helper = new CadastroPacienteHelper(view);
    }

    public void cadastrarCliente() {
        Paciente paciente = helper.obterModelo();
        Connection conexao = new Conexao().getConnection();
        PacienteDAO pacienteDAO = new PacienteDAO(conexao);
        boolean sucesso  = pacienteDAO.cadastrarPaciente(paciente);
        
        if(sucesso){
            helper.mostrarMensagem("Cadastro De Paciente Feito");
            limparTela();
        } else {
            helper.mostrarMensagem("Erro ao Fazer Cadastro de Paciente");
        }
        
    }

    public void limparTela() {
        helper.limparCampos();
    }
    
    
    public void voltarMenuPrincipal(){
        MenuAtendenteView mav = new MenuAtendenteView();
        mav.setVisible(true);
        view.dispose();
    }
    
}
