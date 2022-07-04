
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Atributo tipo connection
public class Conexion {
    Connection connection;
    private String driver = "com.mysql.cj.jdbc.Driver"; 
    private String user = "root";
    private String password = "" ;
    private String urlConexion = "jdbc:mysql://localhost:3306/reto1_g54_db";
    //anadimos constructor sin argumentos

    public Conexion() {
            
                
                
        // Inicializamos la variable connection
        //intentamos hacer conexión mendiante el bloque try catch
        try{
           Class.forName(driver); 
           connection = (Connection)DriverManager.getConnection(urlConexion, user, password);
           if(connection != null){
               System.out.println("conexión éxitosa con la base de datos");
           }
        }catch (ClassNotFoundException | SQLException e){
            System.out.println("Error en la conexión" + e);
        }
        }
        // 4. crear funcion con nombre getConnection
    public Connection getConnection(){
        //puede retormar mensaje de que si se pudo conectar o que no se pudo conectar
        return connection;
         
        }
    }
    
    
}
