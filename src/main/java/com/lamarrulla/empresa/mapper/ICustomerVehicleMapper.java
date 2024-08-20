package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.CustomerVehicleDto;
import com.lamarrulla.empresa.entity.CustomerVehicle;

import java.util.List;

public interface ICustomerVehicleMapper {
    CustomerVehicle toEntity(CustomerVehicleDto customerVehicleDto);
    CustomerVehicleDto toDto(CustomerVehicle customerVehicle);
    List<CustomerVehicle> toEntityList(List<CustomerVehicleDto> customerVehicleDtoList);
    List<CustomerVehicleDto> toDtoList(List<CustomerVehicle> customerVehicleList);
}
