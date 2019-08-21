package com.example.employee.service;

import java.util.List;

import com.example.employee.entity.User;

public interface UserService {

    //users take from entities and enties take from dto with the help of converters and send to the controllers
    List<User> getAllUsers();
}