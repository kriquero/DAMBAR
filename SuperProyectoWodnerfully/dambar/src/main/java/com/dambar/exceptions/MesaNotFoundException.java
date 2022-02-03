package com.dambar.exceptions;

public class MesaNotFoundException extends RuntimeException{

    public MesaNotFoundException(){super();}
    public MesaNotFoundException(String mensaje){super(mensaje);}
    public MesaNotFoundException(long id){super("Mesa not found");}
}
