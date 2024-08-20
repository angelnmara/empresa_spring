package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.GarageReplacementPartDto;
import com.lamarrulla.empresa.entity.GarageReplacementPart;

import java.util.List;

public interface IGarageReplacementPartMapper {
    GarageReplacementPart toEntity(GarageReplacementPartDto garageReplacementPartDto);
    GarageReplacementPartDto toDto(GarageReplacementPart garageReplacementPart);
    List<GarageReplacementPart> toEntityList(List<GarageReplacementPartDto> garageReplacementPartDtoList);
    List<GarageReplacementPartDto> toDtoList(List<GarageReplacementPart> garageReplacementPartList);
}
