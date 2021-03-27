/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.dao;

import com.ighor.model.Consulta;
import com.ighor.model.Funcionario;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

/**
 *
 * @author Ighor Alves
 */
public class FuncionarioDAO {

    private final Connection conexao;
    
    public FuncionarioDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public boolean existeNoBancoPorUsuarioESenha(Funcionario funcionario) throws SQLException {
        String SELECT_USER_SQL="SELECT * FROM Funcionario WHERE  fnc_nome_usuario = ? AND fnc_senha = ?";
        PreparedStatement ps = null;
        
        ps = conexao.prepareStatement(SELECT_USER_SQL);
        ps.setString(1, funcionario.getNomeUsuario());
        ps.setString(2, funcionario.getSenha());
        ps.execute();
            
        ResultSet rs = ps.getResultSet();

        return rs.next();
    }

//    public boolean possuiCrm(Funcionario funcionario) throws SQLException {
//        String codigo = pegarCodigoFuncionario(funcionario);
//        if(!codigo.equals("") ){
//            String SELECT_USER_SQL="SELECT * FROM funcionario WHERE fnc_codigo= ?";
//            PreparedStatement ps = null;
//        
//            ps = conexao.prepareStatement(SELECT_USER_SQL);
//            ps.setString(1, codigo);
//            ps.execute();
//            
//            ResultSet rs = ps.getResultSet();
//
//            return rs.next();
//        }
//        return false;
//    }

    private int pegarCodigoFuncionario(Funcionario funcionario) throws SQLException {
        String SELECT_USER_SQL="SELECT fnc_codigo FROM Funcionario WHERE fnc_nome_usuario = ? AND fnc_senha = ?";
        PreparedStatement ps = null;
        
        ps = conexao.prepareStatement(SELECT_USER_SQL);
        ps.setString(1, funcionario.getNomeUsuario());
        ps.setString(2, funcionario.getSenha());
        ps.execute();
            
        ResultSet rs = ps.getResultSet();
        int codigo;
        if(rs.next()){
            codigo = rs.getInt("fnc_codigo");
            System.out.println(codigo);
            return codigo;
        } else {
            codigo = 0;
            System.out.println(codigo);
            return codigo;
        }
        
        
    }

    public boolean cadastrarAtendente(Funcionario funcionario) {
        String INSERIR_FUNCIONARIO_SQL="INSERT INTO Funcionario (fnc_nome,fnc_nome_usuario,fnc_senha,fnc_cargo,fnc_salario,fnc_telefone,fnc_celular,fnc_data_nascimento,fnc_data_contratacao) VALUES (?,?,?,?,?,?,?,?,?);";
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean resultado=false;
        
        try{
            ps=conexao.prepareStatement(INSERIR_FUNCIONARIO_SQL);
            ps.setString(1,funcionario.getNome());
            ps.setString(2,funcionario.getNomeUsuario());
            ps.setString(3, funcionario.getSenha());
            ps.setString(4, "Atendente");
            ps.setDouble(5, funcionario.getSalario());
            ps.setString(6, funcionario.getTelefone());
            ps.setString(7, funcionario.getCelular());
            ps.setDate(8, new Date(funcionario.getDtNascimento().getTime()));
            ps.setDate(9, new Date(funcionario.getDtContratacao().getTime()));
            ps.execute();
            resultado = true;
        } catch(SQLException e){
            resultado = false;
            e.printStackTrace();
        }
        return resultado;
    }

        public boolean cadastrarDentista(Funcionario funcionario) {
        String INSERIR_FUNCIONARIO_SQL="INSERT INTO Funcionario (fnc_nome,fnc_nome_usuario,fnc_senha,fnc_cargo,fnc_crm,fnc_salario,fnc_telefone,fnc_celular,fnc_data_nascimento,fnc_data_contratacao) VALUES (?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean resultado=false;
        
        try{
            ps=conexao.prepareStatement(INSERIR_FUNCIONARIO_SQL);
            ps.setString(1,funcionario.getNome());
            ps.setString(2,funcionario.getNomeUsuario());
            ps.setString(3, funcionario.getSenha());
            ps.setString(4, funcionario.getCargo());
            ps.setString(5, funcionario.getCrm());
            ps.setDouble(6, funcionario.getSalario());
            ps.setString(7, funcionario.getTelefone());
            ps.setString(8, funcionario.getCelular());
            ps.setDate(9, new Date(funcionario.getDtNascimento().getTime()));
            ps.setDate(10, new Date(funcionario.getDtContratacao().getTime()));
            ps.execute();
            resultado = true;
        } catch(SQLException e){
            resultado = false;
            e.printStackTrace();
        }
        return resultado;
    }

    public ArrayList<Funcionario> selecionarTodosAtendentes() {
        String SELECIONAR_TODOS_ATENDENTES_SQL = "SELECT fnc_codigo,fnc_nome,fnc_cargo,fnc_salario,fnc_telefone,fnc_celular,fnc_data_nascimento,fnc_data_contratacao FROM funcionario WHERE fnc_cargo='Atendente'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Funcionario> funcionarios = new ArrayList();
    
        try{
            ps = conexao.prepareStatement(SELECIONAR_TODOS_ATENDENTES_SQL);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Funcionario funcionario = new Funcionario();
                
                funcionario.setCodigo(rs.getInt("fnc_codigo"));
                funcionario.setNome(rs.getString("fnc_nome"));
                funcionario.setCargo(rs.getString("fnc_cargo"));
                funcionario.setSalario(rs.getDouble("fnc_salario"));
                funcionario.setTelefone(rs.getString("fnc_telefone"));
                funcionario.setCelular(rs.getString("fnc_celular"));
                funcionario.setDtNascimento(rs.getDate("fnc_data_nascimento"));
                funcionario.setDtContratacao(rs.getDate("fnc_data_contratacao"));
                
                funcionarios.add(funcionario);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar atendentes");
            e.getStackTrace();
        }
        
        
        return funcionarios;
    }
    
    
    public ArrayList<Funcionario> selecionarTodosDentista() {
        String SELECIONAR_TODOS_DENTISTAS_SQL = "SELECT fnc_codigo,fnc_nome,fnc_cargo,fnc_crm,fnc_salario,fnc_telefone,fnc_celular,fnc_data_nascimento,fnc_data_contratacao FROM funcionario WHERE fnc_cargo='Dentista'";
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Funcionario> funcionarios = new ArrayList();
    
        try{
            ps = conexao.prepareStatement(SELECIONAR_TODOS_DENTISTAS_SQL);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Funcionario funcionario = new Funcionario();
                
                funcionario.setCodigo(rs.getInt("fnc_codigo"));
                funcionario.setNome(rs.getString("fnc_nome"));
                funcionario.setCargo(rs.getString("fnc_cargo"));
                funcionario.setCrm(rs.getString("fnc_crm"));
                funcionario.setSalario(rs.getDouble("fnc_salario"));
                funcionario.setTelefone(rs.getString("fnc_telefone"));
                funcionario.setCelular(rs.getString("fnc_celular"));
                funcionario.setDtNascimento(rs.getDate("fnc_data_nascimento"));
                funcionario.setDtContratacao(rs.getDate("fnc_data_contratacao"));
                
                funcionarios.add(funcionario);
            }
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar atendentes");
            e.getStackTrace();
        }
        
        
        return funcionarios;
    }

}
