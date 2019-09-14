/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.api.controller;

import com.app.api.model.User;
import com.app.api.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jhon Baron
 */
@RestController
@CrossOrigin({"http://localhost:4200"})
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService service;

    @GetMapping("/user")
    public List<User> getUsers() {
        return service.getUsers();
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable String id) {
        return service.getUser(id);
    }
    
    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable String id){
        service.deleteUser(id);
    }
    
    @PostMapping("/user")
    public User addUser(@RequestBody User u){
        return service.addUser(u);
    }
    
    @PutMapping("/user")
    public User updateUser(@RequestBody User u){
        return service.addUser(u);
    }
    
    
    

}
