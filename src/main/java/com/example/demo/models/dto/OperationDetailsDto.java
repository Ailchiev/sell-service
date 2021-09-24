package com.example.demo.models.dto;

import com.example.demo.models.entities.Operation;
import com.example.demo.models.entities.Products;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class OperationDetailsDto {
    private Long id;
    private Products products;
    private Operation operation;
    private int amount;
    private double price;
}
