package com.example.Assigment2.response;

import com.example.Assigment2.model.ResponseModel;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class CustomResponses {

    public static Response read(Object object){
        return Response.ok(
                object,
                MediaType.APPLICATION_JSON
        ).build();
    }

    public static Response serverError(String message){
        return Response.status(500).entity(new ResponseModel(message)).type(MediaType.APPLICATION_JSON).build();
    }

}
