package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.ExpenseCatDto;
import com.lamarrulla.empresa.entity.ExpenseCat;
import com.lamarrulla.empresa.mapper.IExpenseCatMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class ExpenseCatMapperImp implements IExpenseCatMapper {
    @Override
    public ExpenseCat toEntity(ExpenseCatDto expenseCatDto) {
        ExpenseCat expenseCat = new ExpenseCat();
        expenseCat.setId(expenseCatDto.getId());
        expenseCat.setName(expenseCatDto.getName());
        return expenseCat;
    }

    @Override
    public ExpenseCatDto toDto(ExpenseCat expenseCat) {
        ExpenseCatDto expenseCatDto = new ExpenseCatDto();
        expenseCatDto.setId(expenseCat.getId());
        expenseCatDto.setName(expenseCat.getName());
        return expenseCatDto;
    }

    @Override
    public List<ExpenseCat> toEntityList(List<ExpenseCatDto> expenseCatDtoList) {
        return expenseCatDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<ExpenseCatDto> toDtoList(List<ExpenseCat> expenseCatList) {
        return expenseCatList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
