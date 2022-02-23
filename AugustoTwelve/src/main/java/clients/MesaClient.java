/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clients;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import models.Mesa;

/**
 *
 * @author admin
 */
public class MesaClient {
    Client client;
    
    public MesaClient(){
        this.client = ClientBuilder.newClient();
    }
    
    public List<Mesa> getMesas(){
        ObjectMapper mapper = new ObjectMapper();
        try{

           String resultado = this.client.target("http://localhost:8080/mesas")
            .request(MediaType.APPLICATION_JSON)
            .accept(MediaType.APPLICATION_JSON)
            .get(String.class);
           
            List<Mesa> mesas = mapper.readValue(resultado, new TypeReference<List<Mesa>>(){});
            return mesas;

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
     public void crearMesa(){
        try{

            WebTarget wt = this.client.target("http://localhost:8080/mesas");
            Invocation.Builder invocationBuilder =
            wt.request(MediaType.APPLICATION_JSON);
            Response response =
            invocationBuilder.post(Entity.entity("{\"estado\":\"Libre\"}",MediaType.APPLICATION_JSON));
            System.out.println(response.getStatus());
            System.out.println(response.readEntity(String.class));
            System.out.println();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
         public void modificaMesa(long id, Mesa m){
             
        try{

            WebTarget wt = this.client.target("http://localhost:8080/mesas/" + id);
            Invocation.Builder invocationBuilder =
            wt.request(MediaType.APPLICATION_JSON);
            
            Response response =
            invocationBuilder.put(Entity.entity(m.toString(),MediaType.APPLICATION_JSON));
            System.out.println(response.getStatus());
            System.out.println(response.readEntity(String.class));
            System.out.println();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
         
         public void eliminarMesa(long id){
        try{

            WebTarget wt = this.client.target("http://localhost:8080/mesas/" + id);
            Invocation.Builder invocationBuilder =
            wt.request(MediaType.APPLICATION_JSON);
            Response response =
            invocationBuilder.delete();
            System.out.println(response.getStatus());
            System.out.println(response.readEntity(String.class));
            System.out.println();
        }catch(Exception e){
            e.printStackTrace();
        }
        }
}
