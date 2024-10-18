/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author laupr
 */

public class ConexionDB {
//Declaración de los atributos
    private String user; //usuario de conexión a la BD
    private String password; //contraseña de la BD
    private String nameDataBase; // nombre de la BD
    private String portMotor; 
    private String servidor;
    private String cadUrl;
    private Connection con;
    
    public ConexionDB (){
        this.user="root";
        this.password="";
        this.nameDataBase="tienda";
        this.portMotor="3306";
        this.servidor="localhost";
        this.cadUrl="jdbc:mysql://"+this.servidor+":"+this.portMotor+"/"+this.nameDataBase;
        this.con=null;              
}
    private Connection conexionTienda (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.con =  DriverManager.getConnection (this.cadUrl, this.user, this.password);
            JOptionPane.showMessageDialog(null, "Me conecté a mi tienda");
        } catch (Exception e) {
            System.out.println("********Excepción********"+e.getMessage());
            this.con = null;
                               
        }
    return (Connection) this.con;          
        
    }    
    public Connection getConexionDB(){
        return this.conexionTienda();
               
    }
}