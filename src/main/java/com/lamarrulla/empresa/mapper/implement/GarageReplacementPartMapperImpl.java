package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.GarageReplacementPartDto;
import com.lamarrulla.empresa.entity.GarageReplacementPart;
import com.lamarrulla.empresa.mapper.IGarageReplacementPartMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class GarageReplacementPartMapperImpl implements IGarageReplacementPartMapper {
    private final ReplacementPartCatMapperImpl replacementPartCatMapper;
    private final GarageCatMapperImpl garageCatMapper;

    public GarageReplacementPartMapperImpl(ReplacementPartCatMapperImpl replacementPartCatMapper, GarageCatMapperImpl garageCatMapper) {
        this.replacementPartCatMapper = replacementPartCatMapper;
        this.garageCatMapper = garageCatMapper;
    }

    @Override
    public GarageReplacementPart toEntity(GarageReplacementPartDto garageReplacementPartDto) {
        GarageReplacementPart garageReplacementPart = new GarageReplacementPart();
        garageReplacementPart.setReplacementPart(replacementPartCatMapper.toEntity(garageReplacementPartDto.getReplacementPartDto()));
        garageReplacementPart.setGarage(garageCatMapper.toEntity(garageReplacementPartDto.getGarageDto()));
        garageReplacementPart.setId(garageReplacementPartDto.getId());
        garageReplacementPart.setCost(garageReplacementPartDto.getCost());
        garageReplacementPart.setSalesCost(garageReplacementPartDto.getSalesCost());
        return garageReplacementPart;
    }

    @Override
    public GarageReplacementPartDto toDto(GarageReplacementPart garageReplacementPart) {
        GarageReplacementPartDto garageReplacementPartDto = new GarageReplacementPartDto();
        garageReplacementPartDto.setCost(garageReplacementPart.getCost());
        garageReplacementPartDto.setReplacementPartDto(replacementPartCatMapper.toDto(garageReplacementPart.getReplacementPart()));
        garageReplacementPartDto.setGarageDto(garageCatMapper.toDto(garageReplacementPart.getGarage()));
        garageReplacementPartDto.setId(garageReplacementPart.getId());
        garageReplacementPartDto.setSalesCost(garageReplacementPart.getSalesCost());
        return garageReplacementPartDto;
    }

    @Override
    public List<GarageReplacementPart> toEntityList(List<GarageReplacementPartDto> garageReplacementPartDtoList) {
        return garageReplacementPartDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<GarageReplacementPartDto> toDtoList(List<GarageReplacementPart> garageReplacementPartList) {
        return garageReplacementPartList.stream().map(this::toDto).collect(Collectors.toList());
    }
}