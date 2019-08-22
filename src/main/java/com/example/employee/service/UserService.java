package com.example.employee.service;

import java.util.List;

import com.example.employee.entity.User;

public interface UserService {

    //users take from entities and entities take from dto with the help of converters and send to the controllers
    //list of users from entities 
    List<User> getAllUsers();

   //get user by id from entities
   User getUserById(Integer userId);
}