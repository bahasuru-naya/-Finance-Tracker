/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author LENOVO
 */
public class DBconnection {
    private static final  String JDBC_URL = "jdbc:mysql://localhost:3306/finance_tracker?zeroDateTimeBehavior=convertToNull";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static Connection con;

    public DBconnection() {
    }
    
    

    public static Connection getCon() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            System.out.println("sucessful");               
        
        } catch (SQLException ex) {
            System.out.println(ex);
            
        } catch (ClassNotFoundException ex) {
             System.out.println(ex);
             
        }
        
        return con;
    }
    
    
    public static void closeCon(){
        if (con !=null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }

    
}
