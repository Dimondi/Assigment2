package com.example.Assigment2.rest;

import com.example.Assigment2.response.CustomResponses;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/message")
public class FileRecourse {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public void sendMessage(){

    }

    @Path("{message}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response read(@PathParam("message") String message){
        try {
            return null;
        } catch (Exception e) {
            return CustomResponses.serverError(e.getMessage());
        }
    }
}
