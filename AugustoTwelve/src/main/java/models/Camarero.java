/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;
import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class Camarero {
    private long idCamarero;
    private String nombre;
    private String puesto;
    private String fechaInicio;
    private String telefono;
    private List<Comanda> comandas;

    public Camarero() {
    }

    public long getIdCamarero() {
        return idCamarero;
    }

    public void setIdCamarero(long idCamarero) {
        this.idCamarero = idCamarero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

   

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public List<Comanda> getComandas() {
        return comandas;
    }

    public void setComandas(List<Comanda> comandas) {
        this.comandas = comandas;
    }
    
    
    
        @Override
    public String toString() {
        return "{" +
                "\"idCamarero\":\"" + idCamarero + "\"," +
               "\"nombre\":\"" + nombre + "\"," +
               "\"puesto\":\"" + puesto + "\"," +
               "\"fechaInicio\":\"" + fechaInicio + "\"," +
               "\"telefono\":\"" + telefono + "\"," +
               "\"comanda\":" + comandas.toString() + "\"" +
        "}"; //To change body of generated methods, choose Tools | Templates.
    }
}
