package com.example.demo.models.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@Table(name = "request")
@Entity
public class Requests {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean success;
    private Date addDate;
    @ManyToOne
    @JoinColumn(name = "id_codes")
    private Codes codes;
}
