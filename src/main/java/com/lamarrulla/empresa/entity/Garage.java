package com.lamarrulla.empresa.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Garage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Address address;
    private PersonalData mannager;
    private Specialty specialty;
    private Integer grade;
}
