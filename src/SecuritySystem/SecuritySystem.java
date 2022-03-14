
package SecuritySystem;

import Vistas.Loggin;
import Vistas.Usuarios;
import controlador.ControllerUser;

public class SecuritySystem {

  
    public static void main(String[] args) {
     Usuarios u = new Usuarios();
     ControllerUser  Cuser  = new ControllerUser(u);
     u.setVisible(true);
    }
    
}
