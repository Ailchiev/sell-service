package com.example.demo.models.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String login;
    private boolean active;
    @Column(unique = true)
    private String email;
    private Date blockDate;
}
