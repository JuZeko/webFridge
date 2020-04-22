package org.acme.rest.json;

import java.util.Set;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.jboss.resteasy.annotations.jaxrs.PathParam;



@RegisterRestClient
public interface FruitService {

    @GET
    @Path("/fruits")
    @Produces("application/json")
    Set<Fruit> getByName(@PathParam String name);


}