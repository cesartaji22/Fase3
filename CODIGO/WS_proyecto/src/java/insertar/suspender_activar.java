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
public class suspender_activar {
 
    String consulta = "";
    Connection dbc = null;
    PreparedStatement ps = null;
    
    public boolean cambiar_estado(String no_cuenta, String estado) {
        
        consulta = "UPDATE cuenta SET estado='"+estado+"' WHERE no_cuenta='"+no_cuenta+"';";
        
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
