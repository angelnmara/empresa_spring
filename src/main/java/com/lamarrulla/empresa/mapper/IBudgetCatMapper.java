package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.BudgetCatDto;
import com.lamarrulla.empresa.entity.BudgetCat;

import java.util.List;

public interface IBudgetCatMapper {
    BudgetCat toEntity(BudgetCatDto budgetCatDto);
    BudgetCatDto toDto(BudgetCat budgetCat);
    List<BudgetCat> toEntityList(List<BudgetCatDto> budgetCatDtoList);
    List<BudgetCatDto> toDtoList(List<BudgetCat> budgetCatList);
}
