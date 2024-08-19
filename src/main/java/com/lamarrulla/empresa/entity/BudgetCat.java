package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class BudgetCat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "personal_data_budget_cat_id", nullable = false)
    private PersonalData personalData;
    @OneToOne
    @JoinColumn(name = "customer_cat_budget_cat_id", nullable = false)
    private CustomerCat customer;
    @OneToMany
    @JoinColumn(name = "garage_service_budget_cat_id", nullable = false)
    private List<GarageService> garageServiceList;
    private Double cost;
}
