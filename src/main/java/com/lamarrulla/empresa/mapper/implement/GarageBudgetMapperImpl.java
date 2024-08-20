package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.GarageBudgetDto;
import com.lamarrulla.empresa.entity.GarageBudget;
import com.lamarrulla.empresa.mapper.IGarageBudgetMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GarageBudgetMapperImpl implements IGarageBudgetMapper {

    private final BudgetCatMapperImpl budgetCatMapper;
    private final GarageCatMapperImpl garageCatMapper;

    public GarageBudgetMapperImpl(BudgetCatMapperImpl budgetCatMapper, GarageCatMapperImpl garageCatMapper) {
        this.budgetCatMapper = budgetCatMapper;
        this.garageCatMapper = garageCatMapper;
    }

    @Override
    public GarageBudget toEntity(GarageBudgetDto garageBudgetDto) {
        GarageBudget garageBudget = new GarageBudget();
        garageBudget.setBudgetCat(budgetCatMapper.toEntity(garageBudgetDto.getBudgetDto()));
        garageBudget.setGarage(garageCatMapper.toEntity(garageBudgetDto.getGarageDto()));
        garageBudget.setId(garageBudgetDto.getId());
        return garageBudget;
    }

    @Override
    public GarageBudgetDto toDto(GarageBudget garageBudget) {
        GarageBudgetDto garageBudgetDto = new GarageBudgetDto();
        garageBudgetDto.setBudgetDto(budgetCatMapper.toDto(garageBudget.getBudgetCat()));
        garageBudgetDto.setGarageDto(garageCatMapper.toDto(garageBudget.getGarage()));
        garageBudgetDto.setId(garageBudget.getId());
        return garageBudgetDto;
    }

    @Override
    public List<GarageBudget> toEntityList(List<GarageBudgetDto> garageBudgetDtoList) {
        return garageBudgetDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<GarageBudgetDto> toDtoList(List<GarageBudget> garageBudgetList) {
        return garageBudgetList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
