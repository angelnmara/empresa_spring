package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.dto.GenderCatDto;
import com.lamarrulla.empresa.entity.GenderCat;

import java.util.List;

public interface IGenderCatMapper {
    GenderCat toEntity(GenderCatDto genderCatDto);
    GenderCatDto toDto(GenderCat genderCat);
    List<GenderCat> toEntityList(List<GenderCatDto> genderCatDtoList);
    List<GenderCatDto> toDtoList(List<GenderCat> genderCatList);
}
