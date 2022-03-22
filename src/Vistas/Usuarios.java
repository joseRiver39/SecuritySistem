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
public class Usuarios extends javax.swing.JFrame {

    /**
     * Creates new form Loggin
     */
    public Usuarios() {
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
        lblPass = new javax.swing.JLabel();
        lblUsuario1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btnCrear = new javax.swing.JButton();
        lblUsuario2 = new javax.swing.JLabel();
        ComTipo = new javax.swing.JComboBox<>();
        lblUsuario3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabla = new javax.swing.JTable();
        txtusuario = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        btnEditar = new javax.swing.JButton();
        lblUsuario4 = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblUsuario5 = new javax.swing.JLabel();
        lblUsuario6 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblUsuario7 = new javax.swing.JLabel();

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
        jLabel1.setText("Usuarios ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 150, 30));

        panelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 50));

        lblPass.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblPass.setText("Contraseña");
        panelPrincipal.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 110, 20));

        lblUsuario1.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblUsuario1.setText("Editar");
        panelPrincipal.add(lblUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 40, 20));

        jSeparator1.setBackground(new java.awt.Color(250, 128, 114));
        panelPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 124, 160, 10));

        jSeparator2.setBackground(new java.awt.Color(250, 128, 114));
        panelPrincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 160, 10));

        btnCrear.setBackground(new java.awt.Color(250, 128, 114));
        btnCrear.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userMas01.png"))); // NOI18N
        btnCrear.setBorder(null);
        btnCrear.setContentAreaFilled(false);
        btnCrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCrear.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userMas.png"))); // NOI18N
        btnCrear.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/userMas01.png"))); // NOI18N
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 80, 60));

        lblUsuario2.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblUsuario2.setText("ID");
        panelPrincipal.add(lblUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 30, 20));

        ComTipo.setFont(new java.awt.Font("Arial", 3, 12)); // NOI18N
        ComTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador" }));
        ComTipo.setBorder(null);
        ComTipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelPrincipal.add(ComTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 120, -1));

        lblUsuario3.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblUsuario3.setText("Tipo");
        panelPrincipal.add(lblUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 40, 20));

        jTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Usuario", "Pass", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(jTabla);

        panelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 600, 150));

        txtusuario.setBorder(null);
        panelPrincipal.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 170, 30));

        txtpass.setBorder(null);
        panelPrincipal.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 160, 30));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        btnEditar.setBorder(null);
        btnEditar.setContentAreaFilled(false);
        panelPrincipal.add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 40, 50));

        lblUsuario4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblUsuario4.setText("Actualizar");
        panelPrincipal.add(lblUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 80, 20));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/update.png"))); // NOI18N
        btnActualizar.setBorder(null);
        btnActualizar.setContentAreaFilled(false);
        panelPrincipal.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, 40));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btnEliminar.setBorder(null);
        btnEliminar.setContentAreaFilled(false);
        panelPrincipal.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, -1, 50));

        lblUsuario5.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblUsuario5.setText("Eliminar");
        panelPrincipal.add(lblUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 70, 20));

        lblUsuario6.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblUsuario6.setText("Crear");
        panelPrincipal.add(lblUsuario6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, 40, 20));

        txtId.setEditable(false);
        txtId.setBackground(new java.awt.Color(255, 255, 255));
        txtId.setBorder(null);
        panelPrincipal.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 40, 20));

        lblUsuario7.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        lblUsuario7.setText("Usuario");
        panelPrincipal.add(lblUsuario7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 110, 20));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> ComTipo;
    public javax.swing.JButton btnActualizar;
    public javax.swing.JButton btnCrear;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JTable jTabla;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JLabel lblUsuario2;
    private javax.swing.JLabel lblUsuario3;
    private javax.swing.JLabel lblUsuario4;
    private javax.swing.JLabel lblUsuario5;
    private javax.swing.JLabel lblUsuario6;
    private javax.swing.JLabel lblUsuario7;
    private javax.swing.JPanel panelPrincipal;
    public javax.swing.JTextField txtId;
    public javax.swing.JPasswordField txtpass;
    public javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
