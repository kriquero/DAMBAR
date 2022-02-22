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
public class Producto {
    private long id;
    private String nombre;
    private String descripcion;
    private float precio;
    private int stock;
    private String tipo;
    private String foto;

    public Producto() {
    }
    

    public Producto(String nombre, String descripcion, float precio, int stock, String tipo, String foto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.tipo = tipo;
        this.foto = foto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    

    @Override
    public String toString() {
        if(foto == null){
        return "{" +
               "\"nombre\":\"" + nombre + "\"," +
               "\"descripcion\":\"" + descripcion + "\"," +
               "\"precio\":\"" + precio + "\"," +
               "\"stock\":\"" + stock + "\"," +
               "\"tipo\":\"" + tipo + "\"" +
        "}"; //To change body
        }else{
        return "{" +
               "\"nombre\":\"" + nombre + "\"," +
               "\"descripcion\":\"" + descripcion + "\"," +
               "\"precio\":\"" + precio + "\"," +
               "\"stock\":\"" + stock + "\"," +
               "\"tipo\":\"" + tipo + "\"," +
               "\"foto\":\"" + foto + "\"" +
        "}"; //To change body of generated methods, choose Tools | Templates.
    }
    }
    
    
    
}
