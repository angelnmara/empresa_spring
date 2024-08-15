package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.dto.ReplacementPartCatDto;
import com.lamarrulla.empresa.entity.ReplacementPartCat;

import java.util.List;

public interface IReplacementPartCatMapper {
    ReplacementPartCat toEntity(ReplacementPartCatDto replacementPartCatDto);
    ReplacementPartCatDto toDto(ReplacementPartCat replacementPartCat);
    List<ReplacementPartCat> toEntityList(List<ReplacementPartCatDto> replacementPartCatDtoList);
    List<ReplacementPartCatDto> toDtoList(List<ReplacementPartCat> replacementPartCatList);
}
