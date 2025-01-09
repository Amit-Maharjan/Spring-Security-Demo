package com.maharjan.amit.SpringSecurityDemo.controllers;

import com.maharjan.amit.SpringSecurityDemo.models.Users;
import com.maharjan.amit.SpringSecurityDemo.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginService loginService;

    @PostMapping
    public String login(@RequestBody Users user) {
        System.out.println("user = " + user);
        return loginService.verifyUser(user);
    }
}
