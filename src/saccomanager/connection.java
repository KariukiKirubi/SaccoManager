package saccomanager;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author programmer
 */
public class connection {
    Connection conn = null;
    public  Connection Connectdb (){
     try{
                String dbnam = "kephis";
                String pass = "";
                String url = "jdbc:mysql://localhost:3306/";
                String driver = "com.mysql.jdbc.Driver";
                String usernam = "root";
               
                Class.forName(driver);
                conn = DriverManager.getConnection(url+dbnam,usernam,pass);
                //JOptionPane.showMessageDialog(null, conn);
                
                return conn;
                }
        catch(Exception e ){
        JOptionPane.showMessageDialog(null, e.getMessage());
        return null;
        }
    }



}


