/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iniciar_sesion;

import connection.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author TAJI
 */
public class login_empresa {
 
    
    String consulta = "";
    Connection dbc = null;
    PreparedStatement ps = null;
    
    
    

    public int logeo_empresa(int id_cliente) {
    int identificador =0;    
        consulta = "select cliente_empresa.id_cliente_empresa from personal_empresa \n" +
        "INNER JOIN cliente on personal_empresa.id_persona=cliente.id_cliente\n" +
        "INNER JOIN cliente_empresa on personal_empresa.id_empresa=cliente_empresa.id_cliente_empresa \n" +
        "where cliente.id_cliente='"+id_cliente+"';";
        
        try{
            dbc = new conexion().getDBConnection();          
            ps = dbc.prepareStatement(consulta);
            
            ResultSet rs = ps.executeQuery();
           
                    while(rs.next()){
                  identificador = rs.getInt("id_cliente_empresa");    
                    //identificador = rs.getInt("id_cliente") +rs.getString("nombres")+"";   
            } 
             rs.close();   
                if(identificador==0){
                identificador =0;
            }

             
        } catch (SQLException se) {
        //Handle errors for JDBC
        se.printStackTrace();
        return identificador;
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
        System.out.println("identificador");
    return identificador;
}   

    
    
    
}
