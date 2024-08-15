package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.dto.CustomerCatDto;
import com.lamarrulla.empresa.entity.CustomerCat;

import java.util.List;

public interface ICustomerCatMapper {
    CustomerCat toEntity(CustomerCatDto customerCatDto);
    CustomerCatDto toDto(CustomerCat customerCat);
    List<CustomerCat> toEntityList(List<CustomerCatDto> customerCatDtoList);
    List<CustomerCatDto> toDtoList(List<CustomerCat> customerCatList);
}
