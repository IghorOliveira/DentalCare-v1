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
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Ighor Alves
 */
public class ConsultaDAO {

    private final Connection conexao;

    public ConsultaDAO(Connection conexao) {
        this.conexao = conexao;
    }

    public boolean inserir(Consulta consulta) {
        String INSERT_CONSULTA_SQL="INSERT INTO consulta (cns_data,cns_horario,cns_descricao,cns_valor,pac_codigo,fnc_codigo,prc_codigo) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = conexao.prepareStatement(INSERT_CONSULTA_SQL);
            ps.setDate(1, new Date(consulta.getDataFormatada().getTime()));
            ps.setString(2, consulta.getHoraFormatada());
            ps.setString(3, consulta.getDescricao());
            ps.setDouble(4, consulta.getValor());
            ps.setInt(5, consulta.getPaciente().getCodigo());
            ps.setInt(6, consulta.getFuncionario().getCodigo());
            ps.setInt(7, consulta.getProcedimento().getCodigo());
            ps.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ConsultaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
           
    }

    public ArrayList<Consulta> selecionarTodos() {
        String SELECIONAR_TODOS_SQL = "SELECT * FROM consulta ORDER BY cns_codigo";
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Consulta> consultas = new ArrayList();
        int codigoFuncionario, codigoPaciente, codigoProcedimento;   
        
        
        try{
            ps = conexao.prepareStatement(SELECIONAR_TODOS_SQL);
            rs = ps.executeQuery();
            while(rs.next()){
                Consulta consulta = new Consulta();
                consulta.setCodigo(rs.getInt("cns_codigo"));
                consulta.setAuxHorario(rs.getString("cns_horario"));
                consulta.setDtConsulta(rs.getDate("cns_data"));
                consulta.setDescricao(rs.getString("cns_descricao"));
                consulta.setValor(rs.getDouble("cns_valor"));
                
                codigoPaciente = rs.getInt("pac_codigo");
                Paciente paciente = new Paciente(codigoPaciente);
                consulta.setPaciente(paciente);
                
                codigoFuncionario = rs.getInt("fnc_codigo");
                Funcionario funcionario = new Funcionario(codigoFuncionario);
                consulta.setFuncionario(funcionario);
                
                codigoProcedimento = rs.getInt("prc_codigo");
                Procedimento procedimento = new Procedimento(codigoProcedimento);
                consulta.setProcedimento(procedimento);
                
                consultas.add(consulta);
            }
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao listar Consultas");
            e.getStackTrace();
        }
        
        return consultas;
    }
    
}
