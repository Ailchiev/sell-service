package com.example.demo.models.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "products")
@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String barcode;
    @ManyToOne
    @JoinColumn(name = "id_categories")
    private Categories categories;
    private boolean active;
}
