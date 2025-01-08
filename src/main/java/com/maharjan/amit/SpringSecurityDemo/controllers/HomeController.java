package com.maharjan.amit.SpringSecurityDemo.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String getMessage(HttpServletRequest request) {
        String sessionId = request.getSession().getId();
        return "Hello World " + sessionId;
    }
}