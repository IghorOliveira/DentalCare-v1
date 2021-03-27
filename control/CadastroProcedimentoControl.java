/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control;

import com.ighor.control.helper.CadastroProcedimentoHelper;
import com.ighor.dao.Conexao;
import com.ighor.dao.ProcedimentoDAO;
import com.ighor.model.Procedimento;
import com.ighor.view.CadastroProcedimentoView;
import com.ighor.view.MenuAtendenteView;
import java.sql.Connection;

/**
 *
 * @author Ighor Alves
 */
public class CadastroProcedimentoControl {

    private final CadastroProcedimentoView view;
    private final CadastroProcedimentoHelper helper;

    public CadastroProcedimentoControl(CadastroProcedimentoView view) {
        this.view=view;
        this.helper= new CadastroProcedimentoHelper(view);
    }

    public void cadastrarProcimento() {
        Procedimento procedimento = helper.obterModelo();
        Connection conexao = new Conexao().getConnection();
        ProcedimentoDAO procedimentoDao = new ProcedimentoDAO(conexao);
        boolean sucesso = procedimentoDao.cadastrarProcedimento(procedimento);
        
        if(sucesso){
            helper.mostrarMensagem("Cadastro De Procedimento Feito");
            limparTela();
        } else {
            helper.mostrarMensagem("Erro ao Fazer Procedimento de Atendente");
        }
    }

    public void limparTela() {
        helper.limparCampos();
    }

    public void voltarMenuPrincipal() {
        MenuAtendenteView mav = new MenuAtendenteView();
        mav.setVisible(true);
        view.dispose();
    }
    
}
