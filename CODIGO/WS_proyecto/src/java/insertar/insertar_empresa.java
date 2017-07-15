/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertar;

import java.sql.Connection;
import java.sql.SQLException;
import connection.conexion;
import java.sql.PreparedStatement;
/**
 *
 * @author TAJI
 */
public class insertar_empresa {
 
    String consulta = "";
    Connection dbc = null;
    PreparedStatement ps = null;
    
    public boolean agregar_empresa(String patente, String nombre, String direccion, String telefono) {
        
        consulta = "INSERT INTO `cliente_empresa` (`patente`, `nombre`, `direccion`, `telefono`)"
                + " VALUES ('"+patente+"', '"+nombre+"', '"+direccion+"', '"+telefono+"');";
        
        try{
            dbc = new conexion().getDBConnection();
            
            ps = dbc.prepareStatement(consulta);
            ps.executeUpdate();
            dbc.close();
            
            return true;
        } catch (SQLException se) {
        //Handle errors for JDBC
        se.printStackTrace();
        return false;
    } catch (Exception e) {
        //Handle errors for Class.forName
        e.printStackTrace();
    } finally {
        //finally block used to close resources
        try {
            if (ps != null) {
                dbc.close();
            }
        } catch (SQLException se) {
        }// do nothing
        try {
            if (dbc != null) {
                dbc.close();
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }//end finally try
    }
    return true;
}   
    
    
}
