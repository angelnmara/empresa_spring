package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.AddressCatDto;
import com.lamarrulla.empresa.entity.AddressCat;

import java.util.List;

public interface IAddressCatMapper {
    AddressCat toEntity(AddressCatDto addressCatDto);
    AddressCatDto toDto(AddressCat addressCat);
    List<AddressCat> toEntityList(List<AddressCatDto> addressCatDtoList);
    List<AddressCatDto> toDtoList(List<AddressCat> addressCatList);
}
