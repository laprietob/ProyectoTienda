/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.dao;

import co.edu.uniminuto.conexion.ConexionDB;
import co.edu.uniminuto.entity.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author laupr
 */
public class ProductoDao {
    //atributos    

    private ConexionDB conexionDB;
    private PreparedStatement statement;

//constructor
    public ProductoDao() {
        this.conexionDB = new ConexionDB();
        this.statement = null;
    }

    public void registrarProducto(Producto producto) {
        Connection myCon = this.conexionDB.getConexionDB();
        String query = "INSERT INTO productos VALUES (NULL,?,?,?);";

        try {
            if (this.statement == null) {
                this.statement = myCon.prepareStatement(query);
                this.statement.setString(1, producto.getProductoNombre());
                this.statement.setString(2, producto.getProductoDescripcion());
                this.statement.setInt(3, 1);
                int response = statement.executeUpdate();
                if (response > 0) {
                    JOptionPane.showMessageDialog(null, "Se registró " + response);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no se pudo registrar");
            System.out.println("" + e.getMessage());
        } finally {
            if (myCon != null) {
                try {
                    this.statement.close();
                    myCon.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}