package com.lamarrulla.empresa.dto;

import lombok.Data;

@Data
public class GarageReplacementPartDto {
    private Long id;
    private GarageCatDto garageDto;
    private ReplacementPartCatDto replacementPartDto;
    private Double cost;
    private Double salesCost;
}
