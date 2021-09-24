package com.example.demo.models.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "operations_details")
@Entity

public class OperationDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "id_product")
    private Products products;
    @ManyToOne
    @JoinColumn(name = "id_operations")
    private Operation operation;
    private int amount;
    private double price;

}
