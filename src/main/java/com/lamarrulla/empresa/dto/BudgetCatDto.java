package com.lamarrulla.empresa.dto;

import com.lamarrulla.empresa.entity.CustomerCat;

import java.util.List;

public class BudgetCatDto {
    private Long id;
    private CustomerCatDto customerDto;
    private List<GarageServiceDto> garageServiceDtoList;
    private Double cost;
}
