package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.GarageServiceDto;
import com.lamarrulla.empresa.entity.GarageService;

import java.util.List;

public interface IGarageServiceMapper {
    GarageService toEntity(GarageServiceDto garageServiceDto);
    GarageServiceDto toDto(GarageService garageService);
    List<GarageService> toEntityList(List<GarageServiceDto> garageServiceDtoList);
    List<GarageServiceDto> toDtoList(List<GarageService> garageServiceList);
}
