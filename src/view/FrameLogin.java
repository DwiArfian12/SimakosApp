package view;

import javax.swing.JOptionPane;
import dao.dao_login;
import model.model_login;
import service.service_login;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author dwiar
 */
public class FrameLogin extends javax.swing.JFrame {

    private service_login servis = new dao_login();
    
    public static boolean tutup = false;
    /**
     * Creates new form FrameLogin
     */
    public FrameLogin() {
        initComponents();
        
        btn_login.requestFocus();
    }

    void bersih() {
        tf_username.setText("Masukkan username");
        tf_password.setText("Masukkan password");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tf_username = new javax.swing.JTextField();
        tf_password = new javax.swing.JTextField();
        btn_login = new javax.swing.JLabel();
        btn_exit = new javax.swing.JLabel();
        main_bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_username.setFont(new java.awt.Font("THICCCBOI Light", 0, 14)); // NOI18N
        tf_username.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_username.setText("Masukkan username");
        tf_username.setMinimumSize(new java.awt.Dimension(64, 26));
        tf_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_usernameFocusLost(evt);
            }
        });
        tf_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_usernameActionPerformed(evt);
            }
        });
        jPanel1.add(tf_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 240, 30));

        tf_password.setFont(new java.awt.Font("THICCCBOI Light", 0, 14)); // NOI18N
        tf_password.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_password.setText("Masukkan password");
        tf_password.setMinimumSize(new java.awt.Dimension(64, 26));
        tf_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tf_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_passwordFocusLost(evt);
            }
        });
        tf_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_passwordActionPerformed(evt);
            }
        });
        jPanel1.add(tf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 240, 30));

        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Group 1 (3).png"))); // NOI18N
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_loginMouseClicked(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, -1, -1));

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_multiply_35px_1.png"))); // NOI18N
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
        });
        jPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 40, -1));

        main_bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LoginLayout.png"))); // NOI18N
        main_bg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                main_bgMouseDragged(evt);
            }
        });
        main_bg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                main_bgMousePressed(evt);
            }
        });
        main_bg.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                main_bgComponentHidden(evt);
            }
        });
        jPanel1.add(main_bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void main_bgComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_main_bgComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_main_bgComponentHidden

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_exitMouseClicked
    int xx, xy;
    private void main_bgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_bgMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_main_bgMousePressed

    private void main_bgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_main_bgMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_main_bgMouseDragged

    private void tf_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_passwordActionPerformed

    private void tf_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_usernameActionPerformed

    private void btn_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseClicked
        // TODO add your handling code here:
        prosesLogin();
    }//GEN-LAST:event_btn_loginMouseClicked

    private void tf_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_usernameFocusGained
        // TODO add your handling code here:
        String user = tf_username.getText();
        if(user.equals("Masukkan username")) {
            tf_username.setText("");
        }
    }//GEN-LAST:event_tf_usernameFocusGained

    private void tf_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_passwordFocusGained
        // TODO add your handling code here:
        String pass = tf_password.getText();
        if(pass.equals("Masukkan password")) {
            tf_password.setText("");
        }
    }//GEN-LAST:event_tf_passwordFocusGained

    private void tf_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_usernameFocusLost
        // TODO add your handling code here:
        String pass = tf_username.getText();
        if(pass.equals("") || pass.equals("Masukkan username")) {
            tf_username.setText("Masukkan username");
        }
    }//GEN-LAST:event_tf_usernameFocusLost

    private void tf_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_passwordFocusLost
        // TODO add your handling code here:
        String pass = tf_password.getText();
        if(pass.equals("") || pass.equals("Masukkan password")) {
            tf_password.setText("Masukkan password");
        }
    }//GEN-LAST:event_tf_passwordFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogin().setVisible(true);
            }
        });
    }
    
    private void prosesLogin() {
        if (validasiInput() == true) {
            String username = tf_username.getText();
            String password = tf_password.getText();
            
            model.model_login modlog = new model_login();
            
            modlog.setUsername(username);
            modlog.setPassword(password);

            servis.prosesLogin(modlog);
            if (tutup) {
                dispose();
            }
        }
    }
    
    private boolean validasiInput() {
        boolean valid = false;
        if(tf_username.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Usernamae tidak boleh kosong");
        } else if(tf_password.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password tidak boleh kosong");
        } else {
            valid = true;
        }
        
        return valid;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_exit;
    private javax.swing.JLabel btn_login;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel main_bg;
    private javax.swing.JTextField tf_password;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}
