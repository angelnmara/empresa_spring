package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.dto.ColorCatDto;
import com.lamarrulla.empresa.entity.ColorCat;

import java.util.List;

public interface IColorCatMapper {
    ColorCat toEntity(ColorCatDto colorCatDto);
    ColorCatDto toDto(ColorCat colorCat);
    List<ColorCat> toEntityList(List<ColorCatDto> colorCatDtoList);
    List<ColorCatDto> toDtoList(List<ColorCat> colorCatList);
}
