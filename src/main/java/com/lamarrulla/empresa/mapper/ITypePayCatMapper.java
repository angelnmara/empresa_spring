package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.dto.TypePayCatDto;
import com.lamarrulla.empresa.entity.TypePayCat;

import java.util.List;

public interface ITypePayCatMapper {
    TypePayCat toEntity(TypePayCatDto typePayCatDto);
    TypePayCatDto toDto(TypePayCat typePayCat);
    List<TypePayCat> toEntityList(List<TypePayCatDto> typePayCatDtoList);
    List<TypePayCatDto> toDtoList(List<TypePayCat> typePayCatList);
}
