package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class Estimate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "garage_cat_estimate_id", nullable = false)
    private GarageCat garage;
    private String name;
    @OneToOne
    @JoinColumn(name = "vehicle_cat_estimate_id", nullable = false)
    private VehicleCat vehicle;
    @OneToOne
    @JoinColumn(name = "garage_service_estimate_id", nullable = false)
    private GarageService garageService;
    private Integer labourCost;
    @OneToMany
    @JoinColumn(name = "garage_replacement_part_estimate_id", nullable = false)
    private List<GarageReplacementPart> replacementPartList;
    private Integer totalCost;
}
