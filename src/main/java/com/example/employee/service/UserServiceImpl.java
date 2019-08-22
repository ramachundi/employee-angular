package com.example.employee.service;

import java.util.List;

import com.example.employee.converter.*;
import com.example.employee.entity.User;
import com.example.employee.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//to implement the service
@Service
public class UserServiceImpl implements UserService {

    //used for singleton purpose -will return single object
    @Autowired
    private UserRepository userRepository;
    
    @Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
    }
    
    //we get user if from rest controller , user gives

    @Override
    public User getUserById(Integer userId){
        //return UserConverter.dtoToEntity(userRepository.getOne(userId));
     return userRepository.getOne(userId);
    }

}