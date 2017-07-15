/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogo;

import iniciar_sesion.*;
import connection.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TAJI
 */
public class cuentas_clientes {
 
    
    String consulta = "";
    Connection dbc = null;
    PreparedStatement ps = null;
    
    
    

    public List<String> info_cuentas(int id_cliente) {
    
    List<String> resul = new ArrayList<String>();
    
        consulta = "select no_cuenta from cuenta where id_cliente='"+id_cliente+"' and estado='ACTIVO';";
        
        try{
            dbc = new conexion().getDBConnection();          
            ps = dbc.prepareStatement(consulta);
            
            ResultSet rs = ps.executeQuery();
           
                    while(rs.next()){
                    resul.add(rs.getString("no_cuenta"));
            } 
             rs.close();   
             
        } catch (SQLException se) {
        //Handle errors for JDBC
        se.printStackTrace();
        return null;
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
    return resul;
}   

    
    
    
}
