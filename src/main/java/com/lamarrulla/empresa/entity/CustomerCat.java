package com.lamarrulla.empresa.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

public class CustomerCat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private PersonalData personalData;
    private List<AddressCat> addressList;
    private TitleCat title;
    private Integer grade;
    private List<CustomerVehicle> customerVehicleList;
    // Cliente // Documentos //
    private List<DocumentsCat> documentsCatList;
}
