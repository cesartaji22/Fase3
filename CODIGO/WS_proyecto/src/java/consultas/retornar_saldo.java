/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas;

import iniciar_sesion.*;
import connection.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TAJI
 */
public class retornar_saldo {
 
    
    String consulta = "";
    Connection dbc = null;
    PreparedStatement ps = null;
    
    
    

    public double devolver_saldo(String no_cuenta) {
    double identificador =0;    
        consulta = "select saldo from cuenta where no_cuenta='"+no_cuenta+"';";
        
        try{
            dbc = new conexion().getDBConnection();          
            ps = dbc.prepareStatement(consulta);
            
            ResultSet rs = ps.executeQuery();
           
                    while(rs.next()){
                  identificador = rs.getDouble("saldo");    
                    
            } 
             rs.close();   
            
             
        } catch (SQLException se) {
        //Handle errors for JDBC
        se.printStackTrace();
        
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
        
    return identificador;
}   

    
    
    
}
