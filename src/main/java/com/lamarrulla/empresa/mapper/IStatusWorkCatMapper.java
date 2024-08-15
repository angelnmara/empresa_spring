package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.dto.StatusWorkCatDto;
import com.lamarrulla.empresa.entity.StatusWorkCat;

import java.util.List;

public interface IStatusWorkCatMapper {
    StatusWorkCat toEntity(StatusWorkCatDto statusWorkCatDto);
    StatusWorkCatDto toDto(StatusWorkCat statusWorkCat);
    List<StatusWorkCat> toEntityList(List<StatusWorkCatDto> statusWorkCatDtoList);
    List<StatusWorkCatDto> toDtoList(List<StatusWorkCat> statusWorkCatList);
}
