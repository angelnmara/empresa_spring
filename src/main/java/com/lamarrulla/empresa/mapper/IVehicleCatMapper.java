package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.dto.VehicleCatDto;
import com.lamarrulla.empresa.entity.VehicleCat;

import java.util.List;

public interface IVehicleCatMapper {
    VehicleCat toEntity(VehicleCatDto vehicleCatDto);
    VehicleCatDto toDto(VehicleCat vehicleCat);
    List<VehicleCat> toEntityList(List<VehicleCatDto> vehicleCatDtoList);
    List<VehicleCatDto> toDtoList(List<VehicleCat> vehicleCatList);
}
