package controlador;

import Model.hash;
import Vistas.Usuarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;
import modelo.UsuarioDAO;

public class ControllerUser implements ActionListener {
    
    UsuarioDAO usDao = new UsuarioDAO();
    Usuario user = new Usuario();
    Usuarios uservist = new Usuarios();
    DefaultTableModel model = new DefaultTableModel();
    
    public ControllerUser(Usuarios u) {
        
        this.uservist = u;
        this.uservist.btnCrear.addActionListener(this);
        
        listar(uservist.jTabla);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == uservist.btnCrear) {
            
            if (uservist.txtusuario.getText().isEmpty() || uservist.txtpass.getText().isEmpty()) {
                JOptionPane.showMessageDialog(uservist, "campos vacios");
            } else if (uservist.txtusuario.getText().length() < 5 || uservist.txtpass.getText().length() < 5) {
                JOptionPane.showMessageDialog(uservist, " usuario o contraseña cortos estos deben  contener mas de 5 caracteres");
            } else{
           if(usDao.validarUsuario(uservist.txtusuario.getText()) == 0) {
                agregar();
                limpiarFormulario();
                limpiartablas();
                listar(uservist.jTabla);
           }else{
           JOptionPane.showMessageDialog(uservist, " el usuario ya esta en uso ");
           } 
            }
            
        }
        
    }
    
    public void limpiartablas() {
        for (int i = 0; i < uservist.jTabla.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }
    
    public void limpiarFormulario() {
        //uservist.xtId.setText("" );
        uservist.txtusuario.setText(" ");
        uservist.txtpass.setText(" ");
        uservist.ComTipo.setSelectedIndex(0);
        
    }
    
    public void listar(JTable tabla) {
        model = (DefaultTableModel) tabla.getModel();
        List<Usuario> lista = usDao.listar();
        Object[] object = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            object[0] = lista.get(i).getIdusuarios();
            object[1] = lista.get(i).getUser();
            object[2] = lista.get(i).getPass();
            object[3] = lista.get(i).getTipo();
            model.addRow(object);
            
        }
        uservist.jTabla.setModel(model);
        
    }
    
    public void agregar() {
        
        String user = uservist.txtusuario.getText();
        String pass = String.valueOf(uservist.txtpass.getPassword());
        String tipo = (String) uservist.ComTipo.getSelectedItem();
        String passSifrado = hash.sha1(pass);
        this.user.setUser(user);
        this.user.setPass(passSifrado);
        this.user.setTipo(tipo);
        int r = usDao.AgregarUsuario(this.user);
        if (r == 1) {
            JOptionPane.showMessageDialog(null, " Usuario agregado con exito");
        } else {
            
            JOptionPane.showMessageDialog(null, " error  al  agreagar ususrio");
        }
        
    }
}
