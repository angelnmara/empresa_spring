package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.ColorCatDto;
import com.lamarrulla.empresa.entity.ColorCat;
import com.lamarrulla.empresa.mapper.IColorCatMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class ColorCatMapperImpl implements IColorCatMapper {
    @Override
    public ColorCat toEntity(ColorCatDto colorCatDto) {
        ColorCat colorCat = new ColorCat();
        colorCat.setCode(colorCatDto.getCode());
        colorCat.setId(colorCatDto.getId());
        colorCat.setName(colorCatDto.getName());
        return colorCat;
    }

    @Override
    public ColorCatDto toDto(ColorCat colorCat) {
        ColorCatDto colorCatDto = new ColorCatDto();
        colorCatDto.setCode(colorCat.getCode());
        colorCatDto.setId(colorCat.getId());
        colorCatDto.setName(colorCat.getName());
        return colorCatDto;
    }

    @Override
    public List<ColorCat> toEntityList(List<ColorCatDto> colorCatDtoList) {
        return colorCatDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<ColorCatDto> toDtoList(List<ColorCat> colorCatList) {
        return colorCatList.stream().map(this::toDto).collect(Collectors.toList());
    }
}