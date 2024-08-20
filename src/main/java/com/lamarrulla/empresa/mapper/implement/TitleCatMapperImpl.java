package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.TitleCatDto;
import com.lamarrulla.empresa.entity.TitleCat;
import com.lamarrulla.empresa.mapper.ITitleCatMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class TitleCatMapperImpl implements ITitleCatMapper {
    @Override
    public TitleCat toEntity(TitleCatDto titleCatDto) {
        TitleCat titleCat = new TitleCat();
        titleCat.setId(titleCatDto.getId());
        titleCat.setName(titleCatDto.getName());
        return titleCat;
    }

    @Override
    public TitleCatDto toDto(TitleCat titleCat) {
        TitleCatDto titleCatDto = new TitleCatDto();
        titleCatDto.setId(titleCat.getId());
        titleCatDto.setName(titleCat.getName());
        return titleCatDto;
    }

    @Override
    public List<TitleCat> toEntityList(List<TitleCatDto> titleCatDtoList) {
        return titleCatDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<TitleCatDto> toDtoList(List<TitleCat> titleCatList) {
        return titleCatList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
