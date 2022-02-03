package com.dambar.exceptions;

public class ProductoNotFoundException extends RuntimeException{
    public ProductoNotFoundException(){super();}
    public ProductoNotFoundException(String mensaje){super(mensaje);}
    public ProductoNotFoundException(long id){super("Producto not found: " + id);}
}
