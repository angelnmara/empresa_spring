package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.ExpenseCatDto;
import com.lamarrulla.empresa.entity.ExpenseCat;

import java.util.List;

public interface IExpenseCatMapper {
    ExpenseCat toEntity(ExpenseCatDto expenseCatDto);
    ExpenseCatDto toDto(ExpenseCat expenseCat);
    List<ExpenseCat> toEntityList(List<ExpenseCatDto> expenseCatDtoList);
    List<ExpenseCatDto> toDtoList(List<ExpenseCat> expenseCatList);
}
