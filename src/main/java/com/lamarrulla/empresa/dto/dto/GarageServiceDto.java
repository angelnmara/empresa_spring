package com.lamarrulla.empresa.dto.dto;

import com.lamarrulla.empresa.entity.GarageCat;
import com.lamarrulla.empresa.entity.ServiceCat;

import java.util.List;

public class GarageServiceDto {
    private Long id;
    private GarageCat garage;
    private ServiceCat service;
    private Double labourCost;
    private Integer hourService;
    private List<GarageReplacementPartDto> garageReplacementPartDtoList;
    private Double costService;
}
