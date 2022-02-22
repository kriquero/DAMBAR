
import clients.MesaClient;
import clients.ProductoClient;
import models.Mesa;
import models.Producto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class Pruebas {
    public static void main(String[] args) {
    ProductoClient pc = new ProductoClient();
    MesaClient mc = new MesaClient();
    Mesa m = new Mesa();
    m.setEstado("Ocupada");
    
    mc.modificaMesa(4, m);
    }
}
