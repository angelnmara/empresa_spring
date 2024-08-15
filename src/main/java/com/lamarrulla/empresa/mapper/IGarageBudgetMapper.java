package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.dto.GarageBudgetDto;
import com.lamarrulla.empresa.entity.GarageBudget;

import java.util.List;

public interface IGarageBudgetMapper {
    GarageBudget toEntity(GarageBudgetDto garageBudgetDto);
    GarageBudgetDto toDto(GarageBudget garageBudget);
    List<GarageBudget> toEntityList(List<GarageBudgetDto> garageBudgetDtoList);
    List<GarageBudgetDto> toDtoList(List<GarageBudget> garageBudgetList);
}
