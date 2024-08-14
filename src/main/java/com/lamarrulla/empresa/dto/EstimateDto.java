package com.lamarrulla.empresa.dto;

import com.lamarrulla.empresa.entity.GarageCat;
import com.lamarrulla.empresa.entity.GarageReplacementPart;
import com.lamarrulla.empresa.entity.GarageService;
import com.lamarrulla.empresa.entity.VehicleCat;

import java.util.List;

public class EstimateDto {
    private Long id;
    private GarageCatDto garageDto;
    private String name;
    private VehicleCat vehicle;
    private GarageService garageService;
    private Integer labourCost;
    private List<GarageReplacementPartDto> garageReplacementPartDtoList;
    private Integer totalCost;
}
