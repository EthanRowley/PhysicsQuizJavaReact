package com.rowley.PhysicsQuiz.Controllers;


import com.rowley.PhysicsQuiz.Model.RequestResponse;
import com.rowley.PhysicsQuiz.Model.User;
import com.rowley.PhysicsQuiz.Services.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService){
        this.authService = authService;
    }

    @GetMapping("api/test")
    public String test(){
        return this.authService.test();
    }

    public RequestResponse addUser(User u){
        return this.authService.addUser(u);
    }


}
