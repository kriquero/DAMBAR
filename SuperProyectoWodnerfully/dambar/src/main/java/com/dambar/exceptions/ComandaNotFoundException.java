package com.dambar.exceptions;

import javax.management.RuntimeErrorException;

public class ComandaNotFoundException extends RuntimeException {
    public ComandaNotFoundException(){
        super();
    }
    public ComandaNotFoundException(String message){super(message);}
    public ComandaNotFoundException(long id){super("Comanda not found");}

}
