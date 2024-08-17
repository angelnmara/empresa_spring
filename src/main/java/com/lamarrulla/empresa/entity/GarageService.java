package com.lamarrulla.empresa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class GarageService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private GarageCat garage;
    private ServiceCat service;
    private Double labourCost;
    private Integer hourService;
    private List<GarageReplacementPart> replacementPartList;
    private Double costService;
}
