/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.dao;

import com.ighor.model.Consulta;
import com.ighor.model.Funcionario;
import com.ighor.model.Paciente;
import com.ighor.model.Procedimento;
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
public class ProcedimentoDAO {

    private final Connection conexao;

    public ProcedimentoDAO(Connection conexao) {
        this.conexao = conexao;
    }


    public boolean cadastrarProcedimento(Procedimento procedimento) {
        String INSERIR_PROCEDIMENTO_SQL="INSERT INTO Procedimento (prc_nome,prc_descricao,prc_valor_sugerido) VALUES (?,?,?);";
        PreparedStatement ps = null;
        ResultSet rs = null;
        boolean resultado=false;
        
        try{
            ps=conexao.prepareStatement(INSERIR_PROCEDIMENTO_SQL);
            ps.setString(1,procedimento.getNome());
            ps.setString(2,procedimento.getDescricao());
            ps.setDouble(3, procedimento.getValor());
            ps.execute();
            resultado = true;
        } catch(SQLException e){
            resultado = false;
            e.printStackTrace();
        }
        return resultado;
    }

    public ArrayList<Procedimento> selecionarTodos() {
        String SELECIONAR_TODOS_SQL = "SELECT * FROM procedimento ORDER BY prc_codigo";
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Procedimento> procedimentos = new ArrayList();
        
        try{
            ps = conexao.prepareStatement(SELECIONAR_TODOS_SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                Procedimento procedimento = new Procedimento();
                procedimento.setCodigo(rs.getInt("prc_codigo"));
                procedimento.setNome(rs.getString("prc_nome"));
                procedimento.setDescricao(rs.getString("prc_descricao"));
                procedimento.setValor(rs.getDouble("prc_valor_sugerido"));
                
                procedimentos.add(procedimento);
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao listar Procedimentos");
            e.getStackTrace();
        }
        
        return procedimentos;
    }
    
}
