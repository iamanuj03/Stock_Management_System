/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastockmanagementapp;

/**
 *
 * @author Anuj
 */
import java.sql.Connection; 
import java.sql.DriverManager; 
public class dbConnect {
    private static String URL = "jdbc:mysql://localhost/stockmgtmentdb";
    private static Connection conn;
    
    public static Connection getConnection() throws Exception{
        if(conn==null)
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(URL,"root","");
        }
        return conn;
    }
}
