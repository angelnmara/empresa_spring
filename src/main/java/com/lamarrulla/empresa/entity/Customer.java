package com.lamarrulla.empresa.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private PersonalData personalData;
    private List<Address> addressList;
    private Title title;
    private Integer grade;
    private List<Vehicle> vehicleList;
    // Cliente // Documentos //
    private List<DocumentsCat> documentsCatList;
}
