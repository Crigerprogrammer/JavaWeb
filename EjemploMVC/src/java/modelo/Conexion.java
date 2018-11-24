/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 *
 * @author Juan Carlos
 */
public class Conexion {
    Connection cnn;  // conexion a la bd
    Statement state; // para ejecutar un query
    ResultSet res;  // para guardar el resultado del query

    public Conexion () {
        
        try {
            Class.forName("com.mysql.jdbc.Driver"); //driver
            cnn = DriverManager.getConnection ("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root",""); //url
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 

    public int insertar (Cliente c) {
        int bandera = 0;
        try {
            String query = " insert into proyecto.cliente(nit, nombre, edad) "
                    + "values ('" + c.getNit() + "','" + c.getNombre() + "'," + c.getEdad() + ")" ;
            
            state= cnn.createStatement();
            bandera = state.executeUpdate(query);
           
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
         return bandera;
        }
    
    public ResultSet consultarTodo () {
        try {
            String query = "select * from proyecto.cliente";
            state = cnn.createStatement();
            res = state.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
    
}




    
    
    

