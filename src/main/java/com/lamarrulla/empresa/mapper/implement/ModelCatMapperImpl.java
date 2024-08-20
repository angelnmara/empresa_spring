package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.ModelCatDto;
import com.lamarrulla.empresa.entity.ModelCat;
import com.lamarrulla.empresa.mapper.IModelCatMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class ModelCatMapperImpl implements IModelCatMapper {
    @Override
    public ModelCat toEntity(ModelCatDto modelCatDto) {
        ModelCat modelCat = new ModelCat();
        modelCat.setId(modelCatDto.getId());
        modelCat.setModel(modelCatDto.getModel());
        return modelCat;
    }

    @Override
    public ModelCatDto toDto(ModelCat modelCat) {
        ModelCatDto modelCatDto = new ModelCatDto();
        modelCatDto.setId(modelCat.getId());
        modelCatDto.setModel(modelCat.getModel());
        return modelCatDto;
    }

    @Override
    public List<ModelCat> toEntityList(List<ModelCatDto> modelCatDtoList) {
        return modelCatDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<ModelCatDto> toDtoList(List<ModelCat> modelCatList) {
        return modelCatList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
