package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.dto.ServiceCatDto;
import com.lamarrulla.empresa.entity.ServiceCat;

import java.util.List;

public interface IServiceCatMapper {
    ServiceCat toEntity(ServiceCatDto serviceCatDto);
    ServiceCatDto toDto(ServiceCat serviceCat);
    List<ServiceCat> toEntityList(List<ServiceCatDto> serviceCatDtoList);
    List<ServiceCatDto> toDtoList(List<ServiceCat> serviceCatList);
}
