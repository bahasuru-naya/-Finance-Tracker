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

     private static final  String JDBC_URL = "jdbc:mysql://localhost:3306/finance_tracker?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "bahasurubn0008";
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

    public static void closeCon() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    }

    // Method to insert income data into the incomes table
    public static void insertIncome(String userName, double amount, String category, java.util.Date date) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = getCon();
            String query = "INSERT INTO incomes (user_name, amount, category, date) VALUES (?, ?, ?, ?)";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, userName);
            pstmt.setDouble(2, amount);
            pstmt.setString(3, category);
            pstmt.setDate(4, new java.sql.Date(date.getTime()));
            pstmt.executeUpdate();
            System.out.println("Income added successfully");
        } catch (SQLException ex) {
            System.out.println("Error adding income: " + ex.getMessage());
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println("Error closing resources: " + ex.getMessage());
            }
        }
    }
}
