package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.TitleCatDto;
import com.lamarrulla.empresa.entity.TitleCat;

import java.util.List;

public interface ITitleCatMapper {
    TitleCat toEntity(TitleCatDto titleCatDto);
    TitleCatDto toDto(TitleCat titleCat);
    List<TitleCat> toEntityList(List<TitleCatDto> titleCatDtoList);
    List<TitleCatDto> toDtoList(List<TitleCat> titleCatList);
}
