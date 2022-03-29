package SecuritySystem;

import Vistas.Loggin;
import Vistas.Usuarios;
import controlador.ControllerUser;

public class SecuritySystem {

    public static void main(String[] args) {       
        Loggin l = new Loggin();
        ControllerUser Cuser = new ControllerUser(l);       
        l.setVisible(true);
    }

}
