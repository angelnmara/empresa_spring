package com.lamarrulla.empresa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class Estimate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private GarageCat garage;
    private String name;
    private VehicleCat vehicle;
    private GarageService garageService;
    private Integer labourCost;
    private List<GarageReplacementPart> replacementPartList;
    private Integer totalCost;
}
