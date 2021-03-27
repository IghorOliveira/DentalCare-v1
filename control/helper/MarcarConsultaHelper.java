/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control.helper;

import com.ighor.model.Consulta;
import com.ighor.model.Funcionario;
import com.ighor.model.Paciente;
import com.ighor.model.Procedimento;
import com.ighor.view.MarcarConsultaView;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Ighor Alves
 */
public class MarcarConsultaHelper {

    private final MarcarConsultaView view;

    public MarcarConsultaHelper(MarcarConsultaView view) {
        this.view = view;
    }
    
    public Consulta obterModelo(){
        String dtConsulta = view.getTxt_MarcarConsultaData().getText();
        String hora = view.getTxt_MarcarConsultaHorario().getText();
        String horario =  dtConsulta+" "+hora;
        
        String descricao = view.getTxt_MarcarConsultaDescricao().getText();
       
        int pacienteCodigo = Integer.parseInt(view.getTxt_MarcarConsultaCodPaciente().getText());
        Paciente paciente = new Paciente(pacienteCodigo);
        
        int dentistaCodigo = Integer.parseInt(view.getTxt_MarcarConsultaCodDentista().getText()); 
        Funcionario dentista = new Funcionario(dentistaCodigo);
        
        int procedimentoCodigo = Integer.parseInt(view.getTxt_MarcarConsultaCodProcedimento().getText());
        Procedimento procedimento = new Procedimento(procedimentoCodigo);
        
        float valor = Float.parseFloat(view.getTxt_MarcarConsultaValor().getText());
        
        return new Consulta(horario,descricao,valor,paciente,dentista,procedimento);
    }
    
    public void limparTela(){
        view.getTxt_MarcarConsultaCodDentista().setText("");
        view.getTxt_MarcarConsultaCodPaciente().setText("");
        view.getTxt_MarcarConsultaCodProcedimento().setText("");
        view.getTxt_MarcarConsultaData().setText("");
        view.getTxt_MarcarConsultaDescricao().setText("");
        view.getTxt_MarcarConsultaHorario().setText("");
        view.getTxt_MarcarConsultaValor().setText("");
    }
    
    public void mostrarMensagem(String mensagem){
        JOptionPane.showMessageDialog(null,mensagem);
    }
}
