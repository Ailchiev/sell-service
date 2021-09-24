package com.example.demo.models.dto;

import com.example.demo.models.entities.User;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;

@Data
public class OperationDto {
    private Long id;
    private Date addDate;
    private double totalPrice;
    private double change;
    private User user;
}
