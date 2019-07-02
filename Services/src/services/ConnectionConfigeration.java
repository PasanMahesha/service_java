/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Pasan Mahesha
 */
 //Connection conn = null;
public class ConnectionConfigeration {
    //Connection conn = null;
    public static Connection getConnection(){
       Connection conn ;
       
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/services","root","");
        return conn;
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        return null;
    }
    //return conn;
    }
}
