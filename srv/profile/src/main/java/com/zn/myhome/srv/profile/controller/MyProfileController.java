package com.zn.myhome.srv.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyProfileController {
    @Autowired
    private Environment env;

    @GetMapping("/profile")
    public String getProfile(){
        String port = env.getProperty("server.port");
        return  port;
    }
    
}
