package com.lamarrulla.empresa.dto.dto;

import lombok.Data;

import java.util.List;
@Data
public class BudgetCatDto {
    private Long id;
    private CustomerCatDto customerDto;
    private List<GarageServiceDto> garageServiceDtoList;
    private Double cost;
}
