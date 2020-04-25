package org.acme.rest.json;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.UUID;

import javax.ws.rs.core.MediaType;
import static org.hamcrest.core.IsEqual.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.wildfly.common.Assert;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;

@QuarkusTest
public class FridgeResourceTest {

        @Test
        public void testHelloEndpoint() {
            given()
              .when().get("/fridge/test")
              .then()
                 .statusCode(200)
                 .body(is("Test"));
        }
    

        @Test
        public void testEndpoint() {
            
               given()
                 .when().get("/fridge")
                .then().statusCode(200);

          }
        
       
         @Test
          public void testEndpointAll() {
             
                given().when().delete("/fridge/fridgeAll").then().statusCode(200);
 
           }


           @Test
           public void testEndpointIndex() {
                  given().when().get("/fridgeOne/99")
                          .then().statusCode(404);
           }

          

}
