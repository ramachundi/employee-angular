//this is a place where crud operations are performed
//these are the rest API's
package com.example.employee.controller;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.employee.converter.UserConverter;
import com.example.employee.dto.UserDto;
import com.example.employee.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//it maps the url 
@RequestMapping("/user")
// anotation for saying that its a rest API
@RestController

public class UserController{

    @Autowired
    private UserService userService;

    //get all the users
    @RequestMapping("/getAllUsers")
    public List<UserDto> getAllUsers(){
        return userService.getAllUsers().stream().map(UserConverter::entityToDto).collect(Collectors.toList());
    }

}