package com.example.demo.models.dto;

import lombok.Data;

import java.util.Date;

@Data

public class UserDto {
    private Long id;
    private String name;
    private Long login;
    private boolean active;
    private String email;
    private Date blockDate;
}
