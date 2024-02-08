package com.rowley.PhysicsQuiz.Model;

public class RequestResponse {

    private Object object;
    private String status;


    public RequestResponse(Object obj, String status){
        this.object = obj;
        this.status = status;
    }

}
