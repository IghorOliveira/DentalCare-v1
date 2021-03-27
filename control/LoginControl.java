/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.control;

import com.ighor.dao.FuncionarioDAO;
import com.ighor.dao.Conexao;
import com.ighor.model.Funcionario;
import com.ighor.view.LoginView;
import com.ighor.view.MenuAtendenteView;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Ighor Alves
 */
public class LoginControl {

    private final LoginView view;

    public LoginControl(LoginView view) {
        this.view = view;
    }

    public void autenticarLogin() throws SQLException{
        String nomeUsuario = view.getTxt_LoginNome().getText();
        String senha = String.valueOf(view.getTxt_LoginSenha().getPassword());
        
        Funcionario funcionario = new Funcionario(nomeUsuario, senha);
        
        Connection conexao = new Conexao().getConnection();
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO(conexao);
        boolean existe = funcionarioDAO.existeNoBancoPorUsuarioESenha(funcionario);
        //boolean ehDentista  = funcionarioDAO.possuiCrm(funcionario);
        //System.out.println("Eh dentista: "+ehDentista);
        
        
        if (existe){
            loginParaMenuAtendente();
//        } else if(existe && ehDentista){
//            loginParaMenuDentista();
//        }  
        } else {
            view.apresentarMensagem("Usuario ou Senha Invalidos");
        }
    }
 
    public void loginParaMenuAtendente(){
        MenuAtendenteView menuAtendenteView = new MenuAtendenteView();
        menuAtendenteView.setVisible(true);
        view.dispose();
    }
    
}
