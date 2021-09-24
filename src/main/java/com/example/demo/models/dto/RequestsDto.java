package com.example.demo.models.dto;

import com.example.demo.models.entities.Codes;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
public class RequestsDto {
    private Long id;
    private boolean success;
    private LocalDate addDate;
    private Codes codes;
}
