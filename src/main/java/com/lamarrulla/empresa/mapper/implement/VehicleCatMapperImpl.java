package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.VehicleCatDto;
import com.lamarrulla.empresa.entity.VehicleCat;
import com.lamarrulla.empresa.mapper.IVehicleCatMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class VehicleCatMapperImpl implements IVehicleCatMapper {
    private final BrandCatMapperImpl brandCatMapper;
    private final ModelCatMapperImpl modelCatMapper;

    public VehicleCatMapperImpl(BrandCatMapperImpl brandCatMapper, ModelCatMapperImpl modelCatMapper) {
        this.brandCatMapper = brandCatMapper;
        this.modelCatMapper = modelCatMapper;
    }

    @Override
    public VehicleCat toEntity(VehicleCatDto vehicleCatDto) {
        VehicleCat vehicleCat = new VehicleCat();
        vehicleCat.setBrandCat(brandCatMapper.toEntity(vehicleCatDto.getBrandDto()));
        vehicleCat.setModelCat(modelCatMapper.toEntity(vehicleCatDto.getModelCat()));
        vehicleCat.setId(vehicleCatDto.getId());
        vehicleCat.setYear(vehicleCatDto.getYear());
        return vehicleCat;
    }

    @Override
    public VehicleCatDto toDto(VehicleCat vehicleCat) {
        VehicleCatDto vehicleCatDto = new VehicleCatDto();
        vehicleCatDto.setBrandDto(brandCatMapper.toDto(vehicleCat.getBrandCat()));
        vehicleCatDto.setModelCat(modelCatMapper.toDto(vehicleCat.getModelCat()));
        vehicleCatDto.setYear(vehicleCat.getYear());
        vehicleCatDto.setId(vehicleCat.getId());
        return vehicleCatDto;
    }

    @Override
    public List<VehicleCat> toEntityList(List<VehicleCatDto> vehicleCatDtoList) {
        return vehicleCatDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<VehicleCatDto> toDtoList(List<VehicleCat> vehicleCatList) {
        return vehicleCatList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
