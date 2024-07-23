package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String code;
    @ManyToOne
    @JoinColumn(name = "country_cat_id", nullable = false)
    private Country country;
}
