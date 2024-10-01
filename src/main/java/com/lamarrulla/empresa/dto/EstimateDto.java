package com.lamarrulla.empresa.dto;

import lombok.Data;

import java.util.List;
@Data
public class EstimateDto {
    private Long id;
    private GarageCatDto garageDto;
    private String name;
    private VehicleCatDto vehicleDto;
    private GarageServiceDto garageServiceDto;
    private Integer labourCost;
    private List<GarageReplacementPartDto> garageReplacementPartDtoList;
    private Integer totalCost;
}
