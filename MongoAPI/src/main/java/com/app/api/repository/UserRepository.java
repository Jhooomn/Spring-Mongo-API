/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.api.repository;

import com.app.api.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Jhon Baron
 */
public interface UserRepository extends MongoRepository<User, String>{
    
}
