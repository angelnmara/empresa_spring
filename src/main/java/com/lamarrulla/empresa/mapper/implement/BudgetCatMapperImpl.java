package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.BudgetCatDto;
import com.lamarrulla.empresa.entity.BudgetCat;
import com.lamarrulla.empresa.mapper.IBudgetCatMapper;
import com.lamarrulla.empresa.mapper.ICustomerCatMapper;
import com.lamarrulla.empresa.mapper.IGarageServiceMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class BudgetCatMapperImpl implements IBudgetCatMapper {

    private final ICustomerCatMapper iCustomerCatMapper;
    private final IGarageServiceMapper iGarageServiceMapper;

    public BudgetCatMapperImpl(ICustomerCatMapper iCustomerCatMapper, IGarageServiceMapper iGarageServiceMapper) {
        this.iCustomerCatMapper = iCustomerCatMapper;
        this.iGarageServiceMapper = iGarageServiceMapper;
    }

    @Override
    public BudgetCat toEntity(BudgetCatDto budgetCatDto) {
        BudgetCat budgetCat = new BudgetCat();
        budgetCat.setId(budgetCatDto.getId());
        budgetCat.setCost(budgetCatDto.getCost());
        budgetCat.setCustomer(iCustomerCatMapper.toEntity(budgetCatDto.getCustomerDto()));
        budgetCat.setGarageServiceList(iGarageServiceMapper.toEntityList(budgetCatDto.getGarageServiceDtoList()));
        return budgetCat;
    }

    @Override
    public BudgetCatDto toDto(BudgetCat budgetCat) {
        BudgetCatDto budgetCatDto = new BudgetCatDto();
        budgetCatDto.setCost(budgetCat.getCost());
        budgetCatDto.setCustomerDto(iCustomerCatMapper.toDto(budgetCat.getCustomer()));
        budgetCatDto.setId(budgetCat.getId());
        budgetCatDto.setGarageServiceDtoList(iGarageServiceMapper.toDtoList(budgetCat.getGarageServiceList()));
        return budgetCatDto;
    }

    @Override
    public List<BudgetCat> toEntityList(List<BudgetCatDto> budgetCatDtoList) {
        return budgetCatDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<BudgetCatDto> toDtoList(List<BudgetCat> budgetCatList) {
        return budgetCatList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
