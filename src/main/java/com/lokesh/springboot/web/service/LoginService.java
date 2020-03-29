package com.lokesh.springboot.web.service;

import org.springframework.stereotype.Component;

@Component
public class LoginService {
    public boolean validateUser(String userId, String password) {

        return userId.equalsIgnoreCase("lokesh") &&
                password.equalsIgnoreCase("dummy");

    }
}
