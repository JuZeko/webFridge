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

public class FruitResource {

  
    


    private ArrayList<Fruit> str = new ArrayList<Fruit>();
   

    public FruitResource() {
        str.add(new Fruit("Apple", "2020:05:15",10));
       
        str.add(new Fruit("Pineapple", "2020:05:15",10));

        str.add(new Fruit("Pizza", "2020:05:15",10));
    }

    @GET
    public ArrayList<Fruit> list() {
        
        System.out.println("GET");
        return str;
    }



    @POST
    public ArrayList<Fruit> add(Fruit fruit) {
        str.add(fruit);
        return str;
    }

    @Path("/fridgeAll")
    @DELETE
    public ArrayList<Fruit> delete() {
        System.out.println("DELETE");
        str.removeAll(str);

        return str;
    }

    @Path("/fridgeOne/{numeris}")
    @DELETE
    public ArrayList<Fruit> delete1(@PathParam Integer numeris) {
        
        int nr = Integer.parseInt(numeris.toString());

       str.remove(nr);
        
        return str;
    }



    @Path("/test")
    @POST
    public ArrayList<Fruit> Test(String word) {
        System.out.println(word);
        return str;
    }




}
