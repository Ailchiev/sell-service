package com.example.demo.models.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "operations")
@Entity
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date addDate;
    private double totalPrice;
    private double change;
    private double cash;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
