package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.GarageServiceDto;
import com.lamarrulla.empresa.entity.GarageService;
import com.lamarrulla.empresa.mapper.IGarageServiceMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GarageServiceMapperImpl implements IGarageServiceMapper {

    private final ServiceCatMapperImpl serviceCatMapper;
    private final GarageCatMapperImpl garageCatMapper;
    private final GarageReplacementPartMapperImpl garageReplacementPartMapper;

    public GarageServiceMapperImpl(ServiceCatMapperImpl serviceCatMapper, GarageCatMapperImpl garageCatMapper, GarageReplacementPartMapperImpl garageReplacementPartMapper) {
        this.serviceCatMapper = serviceCatMapper;
        this.garageCatMapper = garageCatMapper;
        this.garageReplacementPartMapper = garageReplacementPartMapper;
    }

    @Override
    public GarageService toEntity(GarageServiceDto garageServiceDto) {
        GarageService garageService = new GarageService();
        garageService.setCostService(garageServiceDto.getCostService());
        garageService.setService(serviceCatMapper.toEntity(garageServiceDto.getServiceDto()));
        garageService.setGarage(garageCatMapper.toEntity(garageServiceDto.getGarageDto()));
        garageService.setHourService(garageServiceDto.getHourService());
        garageService.setId(garageServiceDto.getId());
        garageService.setLabourCost(garageServiceDto.getLabourCost());
        garageService.setGarageReplacementPartList(garageReplacementPartMapper.toEntityList(garageServiceDto.getGarageReplacementPartDtoList()));
        return garageService;
    }

    @Override
    public GarageServiceDto toDto(GarageService garageService) {
        GarageServiceDto garageServiceDto = new GarageServiceDto();
        garageServiceDto.setCostService(garageService.getCostService());
        garageServiceDto.setHourService(garageService.getHourService());
        garageServiceDto.setServiceDto(serviceCatMapper.toDto(garageService.getService()));
        garageServiceDto.setGarageDto(garageCatMapper.toDto(garageService.getGarage()));
        garageServiceDto.setId(garageService.getId());
        garageServiceDto.setGarageReplacementPartDtoList(garageReplacementPartMapper.toDtoList(garageService.getGarageReplacementPartList()));
        garageServiceDto.setLabourCost(garageService.getLabourCost());
        return garageServiceDto;
    }

    @Override
    public List<GarageService> toEntityList(List<GarageServiceDto> garageServiceDtoList) {
        return garageServiceDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<GarageServiceDto> toDtoList(List<GarageService> garageServiceList) {
        return garageServiceList.stream().map(this::toDto).collect(Collectors.toList());
    }
}