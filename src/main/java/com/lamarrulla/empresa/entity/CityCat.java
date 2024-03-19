package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class CityCat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cityName;
    private Long postalCode;
    @ManyToOne
    @JoinColumn(name = "state_cat_id", nullable = false)
    private StateCat stateCat;
}
