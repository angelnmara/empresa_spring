package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.BudgetCatDto;

import java.util.List;

public interface IBudgetCatService {
    BudgetCatDto findById(Integer id);
    List<BudgetCatDto> findAll();
    BudgetCatDto save(BudgetCatDto budgetCatDto);
}
