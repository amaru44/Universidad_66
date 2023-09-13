/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad_66.accesoADatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author PROFES
 */
public class Conexion {
    private static final String URL="jdbc:mariadb://2803:6602:1a38:c600:d794:e2e:a543:b1bd/";
    private static final String DB="universidad_66";
    private static final String USUARIO="root";
    private static final String PASSWORD=" ";
    private static Connection connection;
    
    private Conexion(){}
    
    public static Connection getConexion(){
    
        if(connection ==null){
            
            try {
                
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB, USUARIO, PASSWORD);
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers ");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la DB ");
            }
        }
        return connection;
    }
    
}
