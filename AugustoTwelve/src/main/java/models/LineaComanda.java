/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author admin
 */
public class LineaComanda {
    private long id;
    private int cantidad;
    private Producto producto;

    public LineaComanda() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
    
        @Override
    public String toString() {
        return "{" +
               "\"cantidad\":\"" + cantidad + "\"," +
               "\"producto\":\"" + producto.toString() + "\"," +
        "}"; //To change body of generated methods, choose Tools | Templates.
    }
}
