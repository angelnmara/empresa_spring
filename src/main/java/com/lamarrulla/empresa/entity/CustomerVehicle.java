package com.lamarrulla.empresa.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

public class CustomerVehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private CustomerCat customer;
    private VehicleCat vehicle;
    private String plate;
    private ColorCat colorCat;
    private Integer kilometerAge;
    private Integer chassisNumber;
    private List<String> imageList;
}
