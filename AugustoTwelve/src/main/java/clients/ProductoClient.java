/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import models.Producto;

/**
 *
 * @author admin
 */
public class ProductoClient {
    Client client;
    
    public ProductoClient(){
        this.client = ClientBuilder.newClient();
    }
    
    public void crearProducto(Producto p){
        try{

            WebTarget wt = this.client.target("http://localhost:8080/productos");
            Invocation.Builder invocationBuilder =
            wt.request(MediaType.APPLICATION_JSON);
            Response response =
            invocationBuilder.post(Entity.entity(p.toString(),MediaType.APPLICATION_JSON));
            System.out.println(response.getStatus());
            System.out.println(response.readEntity(String.class));
            System.out.println();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
     public void getProductos(){
         ObjectMapper mapper = new ObjectMapper();
        try{

           String resultado = this.client.target("http://localhost:8080/productos")
            .request(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON)
            .get(String.class);
           
            System.out.println("Resultado: " + resultado);
            
            List<Producto> participantJsonList = mapper.readValue(resultado, new TypeReference<List<Producto>>(){});
            
            System.out.println("Prueba: " + participantJsonList);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     
     public void modificaProducto(long id, Producto p){
        try{

            WebTarget wt = this.client.target("http://localhost:8080/productos/" + id);
            Invocation.Builder invocationBuilder =
            wt.request(MediaType.APPLICATION_JSON);
            Response response =
            invocationBuilder.put(Entity.entity(p.toString(),MediaType.APPLICATION_JSON));
            System.out.println(response.getStatus());
            System.out.println(response.readEntity(String.class));
            System.out.println();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
     
     
}
