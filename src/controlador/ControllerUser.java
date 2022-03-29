package controlador;

import Model.hash;
import Vistas.Loggin;
import Vistas.Usuarios;
import Vistas.menu;
import Vistas.menuAdmin;
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
    Loggin log = new Loggin();
    DefaultTableModel model = new DefaultTableModel();
    
    public ControllerUser(Usuarios u) {
        
        this.uservist = u;        
        this.uservist.btnCrear.addActionListener(this);
        this.uservist.btnActualizar.addActionListener(this);
        this.uservist.btnEditar.addActionListener(this);
        this.uservist.btnEliminar.addActionListener(this);
        this.log.btnLoggin.addActionListener(this);
        
        listar(uservist.jTabla);
        
    }

    public ControllerUser(Loggin l) {
        
        this.log = l;        
        
        this.log.btnLoggin.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == uservist.btnCrear) {
            
            if (uservist.txtusuario.getText().isEmpty() || uservist.txtpass.getText().isEmpty()) {
                JOptionPane.showMessageDialog(uservist, "campos vacios");
            } else if (uservist.txtusuario.getText().length() < 5 || uservist.txtpass.getText().length() < 5) {
                JOptionPane.showMessageDialog(uservist, " usuario o contraseña cortos estos deben  contener mas de 5 caracteres");
            } else {
                if (usDao.validarUsuario(uservist.txtusuario.getText()) == 0) {
                    agregar();
                    limpiarFormulario();
                    limpiartablas();
                    listar(uservist.jTabla);
                } else {
                    JOptionPane.showMessageDialog(uservist, " el usuario ya esta en uso ");
                }                
            }
            
        }
        if (e.getSource() == uservist.btnEditar) {
            int fila = uservist.jTabla.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(uservist, "seleciona  una fila  de  tabla");
            } else {
                int id = Integer.parseInt((String) uservist.jTabla.getValueAt(fila, 0).toString());
                String user = (String) uservist.jTabla.getValueAt(fila, 1);
                String pass = (String) uservist.jTabla.getValueAt(fila, 2);
                Object tipo = uservist.jTabla.getValueAt(fila, 3);
                uservist.txtId.setText("" + id);
                uservist.txtusuario.setText(user);
                uservist.txtpass.setText(pass);
                uservist.ComTipo.setSelectedItem(tipo);
            }
        }
        if (e.getSource() == uservist.btnActualizar) {
            
            if (uservist.txtusuario.getText().equals(" ") || uservist.txtpass.getText().isEmpty()) {
                JOptionPane.showMessageDialog(uservist, "campos vacios");
            } else if (uservist.txtusuario.getText().length() < 5 || uservist.txtpass.getText().length() < 5) {
                JOptionPane.showMessageDialog(uservist, " usuario o contraseña cortos estos deben  contener mas de 5 caracteres");
            } else {                
                actualizar();
                limpiarFormulario();
                limpiartablas();
                listar(uservist.jTabla);
                
            }
            
        }
        if (e.getSource() == uservist.btnEliminar) {
            delete();
            limpiartablas();
            listar(uservist.jTabla);
            
        }
        if (e.getSource() == log.btnLoggin) {
            
            if (log.txtUserLog.getText().isEmpty() && log.txtpassLog.getText().isEmpty()) {
                JOptionPane.showMessageDialog(log, "campos vacios");
            } else {                
                loggin();
                
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
        uservist.txtId.setText("");
        uservist.txtusuario.setText(" ");
        uservist.txtpass.setText("");
        ;
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

    public void actualizar() {
        int id = Integer.parseInt(uservist.txtId.getText());
        String user = uservist.txtusuario.getText();
        String pass = String.valueOf(uservist.txtpass.getPassword());
        String tipo = (String) uservist.ComTipo.getSelectedItem();
        String passSifrado = hash.sha1(pass);
        this.user.setIdusuarios(id);
        this.user.setUser(user);
        this.user.setPass(passSifrado);
        this.user.setTipo(tipo);
        int r = usDao.Actualizar(this.user);
        if (r == 1) {
            JOptionPane.showMessageDialog(uservist, " error el usuario  no fue actualizado con exito");
        } else {
            
            JOptionPane.showMessageDialog(uservist, "usuario actualizado con exito");
        }
        
    }

    public void delete() {
        int fila = uservist.jTabla.getSelectedRow();
        
        if (fila == -1) {
            JOptionPane.showMessageDialog(uservist, "deve seleccionar una fila");
        } else {
            int id = Integer.parseInt((String) uservist.jTabla.getValueAt(fila, 0).toString());
            usDao.eliminar(id);
            
        }
        
    }

    public void loggin() {
        
        String user = log.txtUserLog.getText();
        String pass = String.valueOf(log.txtpassLog.getPassword());        
        String passSifrado = hash.sha1(pass);
        this.user.setUser(user);
        this.user.setPass(passSifrado);
        boolean r = usDao.loggin(this.user);
        if (r == true) {
            if (this.user.getTipo().equals("Administrador")) {
                menuAdmin menuAdm = new menuAdmin();
                menuAdm.setVisible(true);
                log.dispose();
                
            } else if (this.user.getTipo().equals("Usuario")) {
                
                menu menuUser = new menu();
                menuUser.setVisible(true);
                log.dispose();                
            }
            
        } else {            
            JOptionPane.showMessageDialog(null, " error  de autenticacion verifique usuario o password");
        }
        
    }
}
