package com.lamarrulla.empresa.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class VehicleCat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BrandCat brandCat;
    private ModelCat modelCat;
    private Integer year;
    private String plate;
    private ColorCat colorCat;
    /// falta url de la imagen
    /// falta el kilometraje
    /// no chasis
}
