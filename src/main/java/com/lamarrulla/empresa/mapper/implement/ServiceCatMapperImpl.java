package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.ServiceCatDto;
import com.lamarrulla.empresa.entity.ServiceCat;
import com.lamarrulla.empresa.mapper.IServiceCatMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class ServiceCatMapperImpl implements IServiceCatMapper {
    @Override
    public ServiceCat toEntity(ServiceCatDto serviceCatDto) {
        ServiceCat serviceCat = new ServiceCat();
        serviceCat.setId(serviceCatDto.getId());
        serviceCat.setName(serviceCatDto.getName());
        serviceCat.setSpecialty(serviceCatDto.getSpecialty());
        return serviceCat;
    }

    @Override
    public ServiceCatDto toDto(ServiceCat serviceCat) {
        ServiceCatDto serviceCatDto = new ServiceCatDto();
        serviceCatDto.setId(serviceCat.getId());
        serviceCatDto.setName(serviceCat.getName());
        serviceCatDto.setSpecialty(serviceCat.getSpecialty());
        return serviceCatDto;
    }

    @Override
    public List<ServiceCat> toEntityList(List<ServiceCatDto> serviceCatDtoList) {
        return serviceCatDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<ServiceCatDto> toDtoList(List<ServiceCat> serviceCatList) {
        return serviceCatList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
