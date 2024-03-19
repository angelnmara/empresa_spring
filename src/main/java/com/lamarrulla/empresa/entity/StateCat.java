package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class StateCat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String stateName;
    private String stateCode;
    @ManyToOne
    @JoinColumn(name = "country_cat_id", nullable = false)
    private CountryCat countryCat;
}
