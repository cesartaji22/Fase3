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
public class login {
 
    
    String consulta = "";
    Connection dbc = null;
    PreparedStatement ps = null;
    
    
    

    public String logearse(String user, String pass) {
    String identificador ="";    
        consulta = "select id_cliente from cliente where user='"+user+"' and password='"+pass+"'";
        
        try{
            dbc = new conexion().getDBConnection();          
            ps = dbc.prepareStatement(consulta);
            
            ResultSet rs = ps.executeQuery();
           
                    while(rs.next()){
                  identificador = rs.getInt("id_cliente") +"";    
                    //identificador = rs.getInt("id_cliente") +rs.getString("nombres")+"";   
            } 
             rs.close();   
            
            if(identificador.equals("")){
                identificador ="0";
            }
             
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
        System.out.println("identificador");
    return identificador;
}   

    
    
    
}
