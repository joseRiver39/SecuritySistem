/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.plaf.basic.BasicBorders;

/**
 *
 * @author usuario
 */
public class Loggin extends javax.swing.JFrame {

    /**
     * Creates new form Loggin
     */
    public Loggin() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(getIconImage());
        
    }
     @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/iconEcudo.png"));

        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblUsuario1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtUser = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        btnEnter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Systema De Seguridad");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(250, 128, 114));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(43, 41, 41));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenido  a Security System  ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 360, 30));

        panelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 50));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login2.png"))); // NOI18N
        panelPrincipal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 230, 200));

        lblPass.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblPass.setText("Contraseña");
        panelPrincipal.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, 20));

        lblUsuario1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblUsuario1.setText("Usuario");
        panelPrincipal.add(lblUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, 20));

        jSeparator1.setBackground(new java.awt.Color(250, 128, 114));
        panelPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 124, 160, 10));

        txtUser.setBorder(null);
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        panelPrincipal.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 150, 20));

        jPasswordField1.setBorder(null);
        panelPrincipal.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 150, 20));

        jSeparator2.setBackground(new java.awt.Color(250, 128, 114));
        panelPrincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 160, 10));

        btnEnter.setBackground(new java.awt.Color(250, 128, 114));
        btnEnter.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnEnter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGIN001.png"))); // NOI18N
        btnEnter.setBorder(null);
        btnEnter.setContentAreaFilled(false);
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnEnter, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 150, 50));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEnterActionPerformed

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
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loggin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}