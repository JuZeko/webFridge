package org.acme.rest.json;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

import java.util.Set;
import java.util.concurrent.CompletionStage;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/fridge")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class FridgeResource {

  
    


    private ArrayList<Fridge> str = new ArrayList<Fridge>();
   

    public FridgeResource() {
        str.add(new Fridge("Apple", "2020:05:15",10));
       
        str.add(new Fridge("Pineapple", "2020:05:15",10));

        str.add(new Fridge("Pizza", "2020:05:15",10));
    }

    @GET
    public ArrayList<Fridge> list() {
        
        System.out.println("GET");
        return str;
    }



    @POST
    public ArrayList<Fridge> add(Fridge fridge) {
        str.add(fridge);
        return str;
    }

    @Path("/fridgeAll")
    @DELETE
    public ArrayList<Fridge> delete() {
        System.out.println("DELETE");
        str.removeAll(str);

        return str;
    }

    @Path("/fridgeOne/{numeris}")
    @DELETE
    public ArrayList<Fridge> delete1(@PathParam Integer numeris) {
        
        int nr = Integer.parseInt(numeris.toString());
        
       str.remove(nr);
        
        return str;
    }



    @Path("/test")
    @GET
    public String Test() {
        
        return "Test";
    }




}
