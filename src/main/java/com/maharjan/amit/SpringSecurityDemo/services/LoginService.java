package com.maharjan.amit.SpringSecurityDemo.services;

import com.maharjan.amit.SpringSecurityDemo.models.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JWTService jwtService;

    public String verifyUser(Users user) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        if(authentication.isAuthenticated()) {
            return jwtService.generateToken(user.getUsername());
        } else {
            return "Invalid username or password";
        }
    }
}
