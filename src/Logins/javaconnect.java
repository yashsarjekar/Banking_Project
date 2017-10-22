/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logins;

/**
 *
 * @author yash
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect {
    Connection conn=null;

    /**
     *
     * @return
     * @throws java.lang.ClassNotFoundException
     */
    public static Connection ConnecrDb() throws ClassNotFoundException{
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\YASH\\Documents\\Bankingsystem\\bank.sqlite");
            return conn;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        return null;
    }
}
