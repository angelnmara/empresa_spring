package com.lamarrulla.empresa.entity;

import com.lamarrulla.empresa.dto.BudgetCatDto;
import com.lamarrulla.empresa.dto.GarageCatDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class GarageBudget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private GarageCatDto garage;
    private BudgetCatDto budgetCat;
}
