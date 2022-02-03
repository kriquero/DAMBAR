package com.dambar.exceptions;

import javax.management.RuntimeErrorException;

public class CamareroNotFoundException extends RuntimeException {
  public CamareroNotFoundException(){
      super();
  }
  public CamareroNotFoundException(String message){super(message);}
    public CamareroNotFoundException(long id){super("Camarero not found");}

}
