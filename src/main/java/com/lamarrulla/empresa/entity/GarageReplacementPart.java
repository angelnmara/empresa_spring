package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class GarageReplacementPart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "garage_id", nullable = false)
    private GarageCat garage;
    @OneToOne
    @JoinColumn(name = "replacement_part_id", nullable = false)
    private ReplacementPartCat replacementPart;
    private Double cost;
    private Double salesCost;
}
