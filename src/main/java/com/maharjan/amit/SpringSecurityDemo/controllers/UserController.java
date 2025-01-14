package com.maharjan.amit.SpringSecurityDemo.controllers;

import com.maharjan.amit.SpringSecurityDemo.models.Users;
import com.maharjan.amit.SpringSecurityDemo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public Users createUser(@RequestBody Users user) {
        return userService.createUser(user);
    }
}
