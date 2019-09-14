/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.api.service;

import com.app.api.model.User;
import com.app.api.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jhon Baron
 */
@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository repo;

    @Override
    public List<User> getUsers() {
        return repo.findAll();
    }

    @Override
    public User getUser(String id) {
        return repo.findById(id).get();
    }

    @Override
    public User addUser(User user) {
        return repo.save(user);
    }

    @Override
    public void deleteUser(String id) {
        repo.deleteById(id);
    }

}
