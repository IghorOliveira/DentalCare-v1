/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.dao;

import com.ighor.model.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ighor Alves
 */
public class PacienteDAO {

    private final Connection conexao;

    public PacienteDAO(Connection conexao) {
        this.conexao=conexao;
    }

    public ArrayList<Paciente> selecionarTodos() {
        String SELECIONAR_TODOS_SQL="SELECT * FROM paciente ORDER BY pac_codigo";
        PreparedStatement ps= null;
        ResultSet rs = null;
        ArrayList<Paciente> pacientes = new ArrayList();
        
        try{
            ps = conexao.prepareStatement(SELECIONAR_TODOS_SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                Paciente paciente = new Paciente();
                paciente.setCodigo(rs.getInt("pac_codigo"));
                paciente.setNome(rs.getString("pac_nome"));
                paciente.setCpf(rs.getString("pac_cpf"));
                paciente.setTelefone(rs.getString("pac_telefone"));
                paciente.setCelular(rs.getString("pac_celular"));
                paciente.setDtNascimento(rs.getDate("pac_data_nascimento"));            
                pacientes.add(paciente);
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Erro ao listar todos");
            e.getStackTrace();
        }
        
        
        return pacientes;
    }

    public ArrayList<Paciente> selecionarOndeEsteCampoEhIgualAoTexto(String nomeCampo, String texto) {
        String SELECIONAR_ALGUNS_SQL="SELECT * FROM paciente WHERE pac_"+nomeCampo+"=?";
        System.out.println(SELECIONAR_ALGUNS_SQL);
        PreparedStatement ps= null;
        ResultSet rs = null;
        ArrayList<Paciente> pacientes = new ArrayList();
        
        try{
            ps = conexao.prepareStatement(SELECIONAR_ALGUNS_SQL);
            ps.setString(1,texto);
            rs = ps.executeQuery();
            while(rs.next()){
                Paciente paciente = new Paciente();
                paciente.setCodigo(rs.getInt("pac_codigo"));
                paciente.setNome(rs.getString("pac_nome"));
                paciente.setCpf(rs.getString("pac_cpf"));
                paciente.setTelefone(rs.getString("pac_telefone"));
                paciente.setCelular(rs.getString("pac_celular"));
                paciente.setDtNascimento(rs.getDate("pac_data_nascimento"));            
                pacientes.add(paciente);
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Erro ao listar todos");
            e.printStackTrace();
        }
        
        
        return pacientes;
    }
    
    public ArrayList<Paciente> selecionarPorCodigo(String texto) {
        String SELECIONAR_ALGUNS_SQL="SELECT * FROM paciente WHERE pac_codigo= ?";
        PreparedStatement ps= null;
        ResultSet rs = null;
        ArrayList<Paciente> pacientes = new ArrayList();
        
        try{
            ps = conexao.prepareStatement(SELECIONAR_ALGUNS_SQL);
            ps.setInt(1,Integer.parseInt(texto));
            rs = ps.executeQuery();
            while(rs.next()){
                Paciente paciente = new Paciente();
                paciente.setCodigo(rs.getInt("pac_codigo"));
                paciente.setNome(rs.getString("pac_nome"));
                paciente.setCpf(rs.getString("pac_cpf"));
                paciente.setTelefone(rs.getString("pac_telefone"));
                paciente.setCelular(rs.getString("pac_celular"));
                paciente.setDtNascimento(rs.getDate("pac_data_nascimento"));            
                pacientes.add(paciente);
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Erro ao listar todos");
            e.printStackTrace();
        }
        
        
        return pacientes;
    }

    public boolean cadastrarPaciente(Paciente paciente) {
        String INSERIR_PACIENTE_SQL="INSERT INTO Paciente (pac_nome,pac_cpf, pac_telefone, pac_celular, pac_data_nascimento) VALUES (?,?,?,?,?);";
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean resultado=false;
        
        try{
            ps=conexao.prepareStatement(INSERIR_PACIENTE_SQL);
            ps.setString(1,paciente.getNome());
            ps.setString(2,paciente.getCpf());
            ps.setString(3, paciente.getTelefone());
            ps.setString(4, paciente.getCelular());
            ps.setDate(5, new Date(paciente.getDtNascimento().getTime()));
            ps.execute();
            resultado = true;
        } catch(SQLException e){
            resultado = false;
            e.printStackTrace();
        }
        return resultado;
    }
    
}
