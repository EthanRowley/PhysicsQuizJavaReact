package com.rowley.PhysicsQuiz.Services;

import com.rowley.PhysicsQuiz.Model.RequestResponse;
import com.rowley.PhysicsQuiz.Model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AuthService {

    private ArrayList<User> user_store = new ArrayList<>();

    public String test(){
        return "Hello World!";
    }

    public RequestResponse addUser(User u){
        this.user_store.add(u);
        return new RequestResponse(u, "200");
    }



}
