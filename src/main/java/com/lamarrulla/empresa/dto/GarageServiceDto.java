package com.lamarrulla.empresa.dto;

import lombok.Data;

import java.util.List;
@Data
public class GarageServiceDto {
    private Long id;
    private GarageCatDto garageDto;
    private ServiceCatDto serviceDto;
    private Double labourCost;
    private Integer hourService;
    private List<GarageReplacementPartDto> garageReplacementPartDtoList;
    private Double costService;
}
