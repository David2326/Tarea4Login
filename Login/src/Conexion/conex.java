/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DAVID GUZMAN
 */
public class conex {
    Connection cn;
    
    public Connection ConectarBD(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/login","root","");
               System.out.println("Conexion Exitosa");
        } catch (Exception e) {
            
             System.out.println("Conexion Fallida"+e);
        }
        return cn;
    }
}
