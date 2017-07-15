/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mariadb.jdbc.Driver;

/**
 *
 * @author TAJI
 */
public class conexion {
    
    
    public Connection getDBConnection(){
        Connection dbConnection = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            dbConnection = DriverManager.getConnection("jdbc:mariadb://127.0.0.1/proyecto", "root", "123");
            return dbConnection;
        } 
         catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
    }
        return dbConnection;
    }

    
    
    
}
