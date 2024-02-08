package com.rowley.PhysicsQuiz.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private String username;
    private String password;
    private long ID;

    public User(String username, String password){
        this.username = username;
        this.password = password;
        this.ID = System.currentTimeMillis();
    }

}
