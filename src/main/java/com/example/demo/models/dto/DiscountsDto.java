package com.example.demo.models.dto;

import com.example.demo.models.entities.Products;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
public class DiscountsDto {
    private Long id;
    private double discount;
    private LocalDate startDate;
    private LocalDate endDate;
    private Products products;
}
