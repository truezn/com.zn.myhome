package com.zn.myhome.srv.profile.controller;

import com.zn.myhome.srv.profile.db.User;
import com.zn.myhome.srv.profile.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUser(){

        return userRepository.findAll();
    }
    @PostMapping(path="/add")
    public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        return "New User Saved";
    }
    
}
