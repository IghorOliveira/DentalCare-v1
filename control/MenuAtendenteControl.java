/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control;

import com.ighor.view.CadastroAtendenteView;
import com.ighor.view.CadastroDentistaView;
import com.ighor.view.CadastroPacienteView;
import com.ighor.view.CadastroProcedimentoView;
import com.ighor.view.ListaAtendenteView;
import com.ighor.view.ListaConsultaView;
import com.ighor.view.ListaDentistaView;
import com.ighor.view.ListaPacienteView;
import com.ighor.view.ListaProcedimentoView;
import com.ighor.view.MarcarConsultaView;
import com.ighor.view.MenuAtendenteView;

/**
 *
 * @author Ighor Alves
 */
public class MenuAtendenteControl {

    private final MenuAtendenteView view;

    public MenuAtendenteControl(MenuAtendenteView view) {
        this.view=view;
    }
    
    
    public void abrirMarcarConsultaView(){
        MarcarConsultaView mcv = new MarcarConsultaView();
        mcv.setVisible(true);
        view.dispose();
    }
    
    public void abrirListaConsultaView(){
        ListaConsultaView lcv = new ListaConsultaView();
        lcv.setVisible(true);
        view.dispose();
    }
    
    public void abrirCadastroPacienteView(){
        CadastroPacienteView ccv = new  CadastroPacienteView();
        ccv.setVisible(true);
        view.dispose();
    }
    
    public void abrirCadastroAtendenteView(){
        CadastroAtendenteView cav = new  CadastroAtendenteView();
        cav.setVisible(true);
        view.dispose();
    }
    
    public void abrirCadastroDentistaView(){
        CadastroDentistaView cdv = new  CadastroDentistaView();
        cdv.setVisible(true);
        view.dispose();
    }
    
    public void abrirCadastroProcedimentoView(){
        CadastroProcedimentoView cpv = new  CadastroProcedimentoView();
        cpv.setVisible(true);
        view.dispose();
    }
    
    public void abrirListaPacienteView(){
        ListaPacienteView lpv = new  ListaPacienteView();
        lpv.setVisible(true);
        view.dispose();
        
    }
    
    public void abrirListaAtendenteView(){
        ListaAtendenteView lav = new  ListaAtendenteView();
        lav.setVisible(true);
        view.dispose();
    }
    
    public void abrirListaDentistaView(){
        ListaDentistaView ldv = new  ListaDentistaView();
        ldv.setVisible(true);
        view.dispose();
    }
    
    public void abrirListaProcedimentoView(){
        ListaProcedimentoView lpv = new  ListaProcedimentoView();
        lpv.setVisible(true);
        view.dispose();
    }
    
    
}
