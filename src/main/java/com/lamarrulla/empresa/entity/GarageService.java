package com.lamarrulla.empresa.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

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
