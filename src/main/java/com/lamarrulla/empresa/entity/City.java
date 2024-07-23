package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    @JoinColumn(name = "state_cat_id", nullable = false)
    private State state;
}
