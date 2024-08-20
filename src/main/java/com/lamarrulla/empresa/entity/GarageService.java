package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class GarageService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "garage_cat_garage_service_id", nullable = false)
    private GarageCat garage;
    @OneToOne
    @JoinColumn(name = "service_cat_garage_service_id", nullable = false)
    private ServiceCat service;
    private Double labourCost;
    private Integer hourService;
    @OneToMany
    @JoinColumn(name = "garage_replacement_garage_service_id", nullable = false)
    private List<GarageReplacementPart> garageReplacementPartList;
    private Double costService;
}
