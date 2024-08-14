package com.lamarrulla.empresa.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

public class GarageCat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private List<AddressCat> addressCats;
    private List<Mannager> mannager;
    private Integer grade;
    private ContactData contactData;
    private List<GarageDocument> garageDocumentList;
    private List<GarageService> garageServiceList;
    private List<GarageBudget> garageBudgetList;
    private Integer totalCustomers;
    private Integer newCustomers;
    /// agregar lista de empleados y sueldos // para punto de equilibrio // fecha de pago
    /// pensar en inicio y fin de punto de equilibrio ///
}
