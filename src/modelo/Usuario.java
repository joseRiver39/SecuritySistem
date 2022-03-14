package modelo;

public class Usuario {

    int idusuarios;
    String user;
    String pass;
    String tipo;

    public Usuario() {
    }

    public Usuario(int idusuarios, String user, String pass, String tipo) {
        this.idusuarios = idusuarios;
        this.user = user;
        this.pass = pass;
        this.tipo = tipo;
    }

    public int getIdusuarios() {
        return idusuarios;
    }

    public void setIdusuarios(int idusuarios) {
        this.idusuarios = idusuarios;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
