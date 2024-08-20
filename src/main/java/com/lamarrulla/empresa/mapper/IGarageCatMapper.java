package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.GarageCatDto;
import com.lamarrulla.empresa.entity.GarageCat;

import java.util.List;

public interface IGarageCatMapper {
    GarageCat toEntity(GarageCatDto garageCatDto);
    GarageCatDto toDto(GarageCat garageCat);
    List<GarageCat> toEntityList(List<GarageCatDto> garageCatDtoList);
    List<GarageCatDto> toDtoList(List<GarageCat> garageCatList);
}
