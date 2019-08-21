package com.example.employee.converter;

import com.example.employee.dto.UserDto;
import com.example.employee.entity.User;

public class UserConverter {

    public static UserDto entityToDto(User user) {
        UserDto u = new UserDto();
        u.setUserId(user.getId());
        u.setUserName(user.getName());

        return u;

    }

    public static User dtoToEntity(UserDto user) {
        User u = new User();
        u.setId(user.getUserId());
        u.setName(user.getUserName());

        return u;

    }
}