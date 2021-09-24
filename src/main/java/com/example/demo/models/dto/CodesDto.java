package com.example.demo.models.dto;

import com.example.demo.models.entities.User;
import com.example.demo.models.entities.enums.CodeStatus;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Data
public class CodesDto {
    private Long id;
    private Long code;
    private LocalDate start_date;
    private LocalDate end_date;
    private CodeStatus status;
    private User user;
}
