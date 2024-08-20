package com.lamarrulla.empresa.dto;

import lombok.Data;

@Data
public class GarageBudgetDto {
    private Long id;
    private GarageCatDto garageDto;
    private BudgetCatDto budgetDto;
}
