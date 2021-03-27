/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control;

import com.ighor.control.helper.MarcarConsultaHelper;
import com.ighor.dao.Conexao;
import com.ighor.dao.ConsultaDAO;
import com.ighor.model.Consulta;
import com.ighor.view.ListaPacienteView;
import com.ighor.view.MarcarConsultaView;
import java.sql.Connection;

/**
 *
 * @author Ighor Alves
 */
public class MarcarConsultaControl {

    private final MarcarConsultaView view;
    private final MarcarConsultaHelper helper;

    public MarcarConsultaControl(MarcarConsultaView view) {
        this.view = view;
        this.helper = new MarcarConsultaHelper(view);
    }
 
    
    public void marcarConsulta(){
        Consulta consulta = helper.obterModelo();
        Connection conexao = new Conexao().getConnection();
        ConsultaDAO consultaDAO = new ConsultaDAO(conexao);
        boolean sucesso = consultaDAO.inserir(consulta);
        if(sucesso){
            helper.mostrarMensagem("Consulta Marcada");
            limpar();
        } else {
            helper.mostrarMensagem("Erro ao marcar consulta");
        }
    }

    public void limpar() {
        helper.limparTela();
    }

    public void abrirListaPacientes() {
        ListaPacienteView lpv = new ListaPacienteView();
        lpv.setVisible(true);
    }
    
}
