package com.example.demo.models.entities;

import com.example.demo.models.entities.enums.CodeStatus;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@Table(name = "codes")
@Entity
public class Codes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long code;
    @CreationTimestamp
    private Date startВate;
    private Date endВate;
    @Enumerated(EnumType.STRING)
    private CodeStatus status;
    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;
}
