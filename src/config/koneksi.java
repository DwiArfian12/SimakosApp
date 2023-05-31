/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package config;

import java.sql.*;
import java.util.logging.*;

/**
 *
 * @author dwiar
 */
public class koneksi {
    private static Connection connection;
    
    public static Connection getConnection() {
        if (connection == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/simakos_db";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                connection = (Connection) DriverManager.getConnection(url, "root", "");
            } catch (SQLException ex) {
                Logger.getLogger(koneksi.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return connection;
    }
}
