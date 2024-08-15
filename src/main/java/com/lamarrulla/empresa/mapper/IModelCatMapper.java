package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.dto.ModelCatDto;
import com.lamarrulla.empresa.entity.ModelCat;

import java.util.List;

public interface IModelCatMapper {
    ModelCat toEntity(ModelCatDto modelCatDto);
    ModelCatDto toDto(ModelCat modelCat);
    List<ModelCat> toEntityList(List<ModelCatDto> modelCatDtoList);
    List<ModelCatDto> toDtoList(List<ModelCat> modelCatList);
}
