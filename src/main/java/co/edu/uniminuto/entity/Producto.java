/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entity;

/**
 *
 * @author laupr
 */
public class Producto {
    private int productoid;
    private String productoNombre;
    private String productoDescripcion;
    private int productoStatus;

    public Producto() {
    }

    public Producto(String productoNombre, String productoDescripcion, int productoStatus) {
        this.productoNombre = productoNombre;
        this.productoDescripcion = productoDescripcion;
        this.productoStatus = productoStatus;
    }

    public Producto(int productoid, String productoNombre, String productoDescripcion, int productoStatus) {
        this.productoid = productoid;
        this.productoNombre = productoNombre;
        this.productoDescripcion = productoDescripcion;
        this.productoStatus = productoStatus;
    }
//hasta aquí vamos bien
    public int getProductoid() {
        return productoid;
    }

    public void setProductoid(int productoid) {
        this.productoid = productoid;
    }

    public String getProductoNombre() {
        return productoNombre;
    }

    public void setProductoNombre(String productoNombre) {
        this.productoNombre = productoNombre;
    }

    public String getProductoDescripcion() {
        return productoDescripcion;
    }

    public void setProductoDescripcion(String productoDescripcion) {
        this.productoDescripcion = productoDescripcion;
    }

    public int getProductoStatus() {
        return productoStatus;
    }

    public void setProductoStatus(int productoStatus) {
        this.productoStatus = productoStatus;
    }
    
    
    
}
