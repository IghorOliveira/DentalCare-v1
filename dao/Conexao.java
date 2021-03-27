/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ighor.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ighor Alves
 */
public class Conexao {
    
    private String dbUrl = "jdbc:mysql://localhost:3306/dentalcare?useSSL=false";
    private String dbUserName = "root";
    private String dbPassword = "/seedsmellharbor";
    private String dbDriver = "com.mysql.jdbc.Driver"; 
    
    public Connection getConnection(){
        Connection conn = null;
        
        try{
            Class.forName(dbDriver);
        } catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
        
        try{
            conn = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
        } catch(SQLException ex){
            ex.printStackTrace();
        }
        
        return conn;
    }
}
