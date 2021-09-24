package com.example.demo.models.entities;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@Table(name = "discounts")
@Entity
public class Discounts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double discount;
    @CreationTimestamp
    private Date startDate;
    private Date endDate;
    @ManyToOne
    @JoinColumn(name = "id_products")
    private Products products;
}
