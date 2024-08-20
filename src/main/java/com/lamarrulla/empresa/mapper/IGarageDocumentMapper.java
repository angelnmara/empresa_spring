package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.GarageDocumentDto;
import com.lamarrulla.empresa.entity.GarageDocument;

import java.util.List;

public interface IGarageDocumentMapper {
    GarageDocument toEntity(GarageDocumentDto garageDocumentDto);
    GarageDocumentDto toDto(GarageDocument garageDocument);
    List<GarageDocument> toEntityList(List<GarageDocumentDto> garageDocumentDtoList);
    List<GarageDocumentDto> toDtoList(List<GarageDocument> garageDocumentList);
}
