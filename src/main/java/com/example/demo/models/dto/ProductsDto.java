package com.example.demo.models.dto;

import com.example.demo.models.entities.Categories;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class ProductsDto {
    private Long id;
    private String name;
    private Long barcode;
    private Categories categories;
    private boolean active;
}
