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
public class historial_cuenta_cliente {
 
    
    String consulta = "";
    Connection dbc = null;
    PreparedStatement ps = null;
    
    
    

    public List<String> logearse_empleado(int id_cuenta,String fecha_inicio,String fecha_fin) {
    List<String> ident = new ArrayList<String>();    
    String identificador="";
        consulta = "select fecha, concepto, entra, sale, saldo from historial_cliente where id_cuenta='"+id_cuenta+"'and fecha>'"+fecha_inicio+"' and fecha<'"+fecha_fin+"';";
        
        try{
            dbc = new conexion().getDBConnection();          
            ps = dbc.prepareStatement(consulta);
            
            ResultSet rs = ps.executeQuery();
           
                    while(rs.next()){
                  identificador = rs.getDate("fecha") +"$"+rs.getString("concepto")+"$"+rs.getDouble("entra")+"$"+rs.getDouble("sale")+"$"+rs.getDouble("saldo");    
                    ident.add(identificador);
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
    return ident;
}   

    
    
    
}
