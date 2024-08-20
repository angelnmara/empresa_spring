package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.GarageDocumentDto;
import com.lamarrulla.empresa.entity.GarageDocument;
import com.lamarrulla.empresa.mapper.IGarageDocumentMapper;

import java.util.List;
import java.util.stream.Collectors;

public class GarageDocumentMapperImpl implements IGarageDocumentMapper {
    private final DocumentCatMapperImpl documentCatMapper;
    private final GarageCatMapperImpl garageCatMapper;

    public GarageDocumentMapperImpl(DocumentCatMapperImpl documentCatMapper, GarageCatMapperImpl garageCatMapper) {
        this.documentCatMapper = documentCatMapper;
        this.garageCatMapper = garageCatMapper;
    }

    @Override
    public GarageDocument toEntity(GarageDocumentDto garageDocumentDto) {
        GarageDocument garageDocument = new GarageDocument();
        garageDocument.setDocument(documentCatMapper.toEntity(garageDocumentDto.getDocumentDto()));
        garageDocument.setGarage(garageCatMapper.toEntity(garageDocumentDto.getGarageDto()));
        garageDocument.setId(garageDocumentDto.getId());
        garageDocument.setMandatory(garageDocumentDto.getMandatory());
        return garageDocument;
    }

    @Override
    public GarageDocumentDto toDto(GarageDocument garageDocument) {
        GarageDocumentDto garageDocumentDto = new GarageDocumentDto();
        garageDocumentDto.setDocumentDto(documentCatMapper.toDto(garageDocument.getDocument()));
        garageDocumentDto.setMandatory(garageDocument.getMandatory());
        garageDocumentDto.setGarageDto(garageCatMapper.toDto(garageDocument.getGarage()));
        garageDocumentDto.setId(garageDocument.getId());
        return garageDocumentDto;
    }

    @Override
    public List<GarageDocument> toEntityList(List<GarageDocumentDto> garageDocumentDtoList) {
        return garageDocumentDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<GarageDocumentDto> toDtoList(List<GarageDocument> garageDocumentList) {
        return garageDocumentList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
