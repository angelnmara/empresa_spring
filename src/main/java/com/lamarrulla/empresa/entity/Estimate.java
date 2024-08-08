package com.lamarrulla.empresa.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

public class Estimate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Vehicle vehicle;
    private Services services;
    private Integer labourCost;
    /// revisar
    private List<ReplacementPart> replacementPartList;
    private Integer totalCost;
}
