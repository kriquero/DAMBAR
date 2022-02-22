/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author admin
 */
public class Comanda {
    private long idComanda;
    private boolean pagado;
    private String fechaPedido;
    private List<LineaComanda> lineasComanda;

    public Comanda() {
    }

    public long getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(long idComanda) {
        this.idComanda = idComanda;
    }

   

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

   

    public List<LineaComanda> getLineasComanda() {
        return lineasComanda;
    }

    public void setLineasComanda(List<LineaComanda> lineasComanda) {
        this.lineasComanda = lineasComanda;
    }
    
    
    
    
    @Override
    public String toString() {
        if(lineasComanda == null){
        return "{" +
               "\"nombre\":\"" + pagado + "\"," +
               "\"descripcion\":\"" + fechaPedido + "\"" +
        "}"; 
        
        }else{
        return "{" +
               "\"nombre\":\"" + pagado + "\"," +
               "\"descripcion\":\"" + fechaPedido + "\"," +
               "\"precio\":\"" + lineasComanda.toString() + "\"," +

        "}"; //To change body of generated methods, choose Tools | Templates.
    }
    }
}
