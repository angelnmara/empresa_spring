package com.lamarrulla.empresa.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

public class Garage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private List<Address> address;
    private List<Brand.Mannager> mannager;
    private Integer grade;
    private ContactData contactData;
    /// idcatalogo // taller // documento
    private List<DocumentsCat> documentsCatList;
    /// idServico // taller // precio // material
    private List<Services> servicesList;
    private List<Budget> budgetList;
    private Integer totalCustomers;
    private Integer newCustomers;
    /// agregar lista de empleados y sueldos // para punto de equilibrio // fecha de pago
    /// pensar en inicio y fin de punto de equilibrio ///
}
