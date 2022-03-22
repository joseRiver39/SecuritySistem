package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Conexion conectar = new Conexion();
    Connection cn;
    PreparedStatement pst;
    ResultSet rs;

    public int AgregarUsuario(Usuario u) {

        String sql = "insert into usuarios(user,pass,tipo) values(?,?,?)";
        try {
            cn = conectar.getConnection();
            pst = cn.prepareStatement(sql);
            pst.setString(1, u.getUser());
            pst.setString(2, u.getPass());
            pst.setString(3, u.getTipo());
            pst.executeUpdate();
        } catch (SQLException e) {
        }
        return 1;

    }

    public int validarUsuario(String usuario) {

        String sql = "select count(idusuarios)  from usuarios where user = ?";
        try {
            cn = conectar.getConnection();
            pst = cn.prepareStatement(sql);
            pst.setString(1, usuario);
            rs =pst.executeQuery();
            
            
            if(rs.next()){
            return rs.getInt(1);
            }
            
        } catch (SQLException e) {
        }
        return 1;

    }

    public List listar() {

        List<Usuario> datos = new ArrayList<>();
        String sql = "select * from usuarios";

        try {
            cn = conectar.getConnection();
            pst = cn.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                Usuario u = new Usuario();
                u.setIdusuarios(rs.getInt(1));
                u.setUser(rs.getString(2));
                u.setPass(rs.getString(3));
                u.setTipo(rs.getString(4));
                datos.add(u);
            }
        } catch (Exception e) {
        }
        return datos;

    }
    public int Actualizar(Usuario u){
    int r =0;
    String sql = "update usuarios set user=?, pass=?, tipo=? where idusuarios = ?";
    
     try {
            cn = conectar.getConnection();
            pst = cn.prepareStatement(sql);
            pst.setString(1,u.getUser());
            pst.setString(2,u.getPass());
            pst.setString(3,u.getTipo());
            pst.setInt(4,u.getIdusuarios());
            pst.executeUpdate();
            if(r==1){
            return 1;
            }else{
            return 0;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    return  r;
    
    
    }
    public void eliminar( int id){
     String sql = "delete from usuarios where idusuarios =" +id;
     
        try {
            cn=conectar.getConnection();
            pst = cn.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Usuario Eliminado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"lo sentimos su consulta no pudo ser resuelta");
            System.err.println(e);
        }
    
    }
    

}
