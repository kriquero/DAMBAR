/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;

/**
 *
 * @author admin
 */
public class Mesa {
    private long id;
    private String estado;
    private List<Comanda> comandas;

    public Mesa() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Comanda> getComandas() {
        return comandas;
    }

    public void setComandas(List<Comanda> comandas) {
        this.comandas = comandas;
    }
    

    @Override
    public String toString() {
        if(comandas == null){
        return "{" +
               "\"estado\":\"" + estado + "\"" +
               
        "}";
        }else{
        
        return "{" +
               "\"estado\":\"" + estado + "\"," +
               "\"comandas\":" + comandas.toString() + "\"" +
        "}"; //To change body of generated methods, choose To ols | Templates.
        }
        }
    
    
}
