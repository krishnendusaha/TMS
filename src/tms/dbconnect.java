/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class dbconnect {
     Connection dbconn=null;

   public static Connection connecrdb() {
        try 
            {
                Class.forName("com.mysql.jdbc.Driver");
                String connpath = "jdbc:sqlite:C:\\Users\\user\\Desktop\\others\\TMS\\src\\tms.sqlite";
                Connection dbconn = DriverManager.getConnection(connpath);
               
               return dbconn;
            } 
            catch (ClassNotFoundException | SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, ex);
            } 
           
        return null;
       
    }
    
}
