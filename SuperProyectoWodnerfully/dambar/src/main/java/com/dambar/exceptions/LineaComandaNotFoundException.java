package com.dambar.exceptions;

public class LineaComandaNotFoundException extends RuntimeException{
    public LineaComandaNotFoundException(){super();}
    public LineaComandaNotFoundException(String mensaje){super(mensaje);}
    public LineaComandaNotFoundException(long id){super("Linea de comanda not found: " + id);}
}
