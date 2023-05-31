/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import config.koneksi;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import model.model_login;
import service.service_login;
import view.FrameLogin;
import view.FrameBeranda;

/**
 *
 * @author dwiar
 */

public class dao_login implements service_login {
    
    private Connection conn;
    
    public dao_login() {
        conn = koneksi.getConnection();
    }
    
    @Override
    public void prosesLogin(model_login modlog) {
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM admin_tbl WHERE(username ='"+modlog.getUsername()+"')"+
                     "AND password='"+modlog.getPassword()+"'";
        
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if (rs.next()) {               
                JOptionPane.showMessageDialog(null, "Login berhasil", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                FrameBeranda beranda = new FrameBeranda();
                beranda.setVisible(true);
                beranda.revalidate();
                
                FrameLogin lg = new FrameLogin();
                lg.tutup = true;
            } else {
                JOptionPane.showMessageDialog(null, "Username dan Password salah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
                FrameLogin lg = new FrameLogin();
                lg.tutup = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(dao_login.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (st != null) {
                try {
                    st.close();
                } catch (SQLException ex) {
                    Logger.getLogger(dao_login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
}
