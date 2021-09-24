package com.example.demo.service;

import com.example.demo.models.dto.UserDto;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<?> saveUser(UserDto userDto);
}
