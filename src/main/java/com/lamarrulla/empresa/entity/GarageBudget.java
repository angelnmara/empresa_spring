package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class GarageBudget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "garage_cat_id", nullable = false)
    private GarageCat garage;
    @OneToOne
    @JoinColumn(name = "budget_cat_id", nullable = false)
    private BudgetCat budgetCat;
}
