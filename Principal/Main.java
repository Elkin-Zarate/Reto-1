
package Principal;
import Modelo.Conexion;
import Vistas.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos la instancia de la clase conexion 
        Conexion conexion = new Conexion(); 
       conexion.getConnection(); 
         
        // creamos una instancia de la vista login
        Login login = new Login();
        // mediante la instancia de la vista llamamos el método
        //que la hace visible
        login.setVisible(true);
    }
    
}
