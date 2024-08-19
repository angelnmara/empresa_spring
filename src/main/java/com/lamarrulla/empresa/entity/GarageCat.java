package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class GarageCat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    @JoinColumn(name = "address_cat_garage_cat_id", nullable = false)
    private List<AddressCat> addressList;
    @OneToMany
    @JoinColumn(name = "mannager_garage_cat_id", nullable = false)
    private List<Mannager> mannager;
    private Integer grade;
    @OneToOne
    @JoinColumn(name = "contact_data_garage_cat_id", nullable = false)
    private ContactData contactData;
    @OneToMany
    @JoinColumn(name = "garage_document_garage_cat_id", nullable = false)
    private List<GarageDocument> garageDocumentList;
    @OneToMany
    @JoinColumn(name = "garage_service_garage_cat_id", nullable = false)
    private List<GarageService> garageServiceList;
    @OneToMany
    @JoinColumn(name = "garage_budget_garage_cat_id", nullable = false)
    private List<GarageBudget> garageBudgetList;
    private Integer totalCustomers;
    private Integer newCustomers;
    /// agregar lista de empleados y sueldos // para punto de equilibrio // fecha de pago
    /// pensar en inicio y fin de punto de equilibrio ///
}
