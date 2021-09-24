package com.example.demo.models.dto;

import com.example.demo.models.entities.Products;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
public class PricesDto {
    private Long id;
    private Long price;
    private LocalDate startDate;
    private LocalDate endDate;
    private Products productsPrices;
}
