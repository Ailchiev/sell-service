package com.example.demo.service.impl;

import com.example.demo.dao.UserRepo;
import com.example.demo.mapper.UserMapper;
import com.example.demo.models.ErrorResponse;
import com.example.demo.models.dto.UserDto;
import com.example.demo.models.entities.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Objects;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    public ResponseEntity<?> saveUser(UserDto userDto) {

        User user = UserMapper.INSTANCE.mapToUser(userDto);

        if (Objects.isNull(userRepo.findByLogin(user.getLogin()))) {
            userRepo.save(user);
        } else {
            return new ResponseEntity<>(new ErrorResponse("Этот логин занят", null), HttpStatus.OK);
        }
        return ResponseEntity.ok(UserMapper.INSTANCE.mapToUserDto(user));

    }
}
