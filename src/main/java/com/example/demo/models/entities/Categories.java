package com.example.demo.models.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "categories")
@Entity
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean active;

}
