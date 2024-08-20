package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.ReplacementPartCatDto;
import com.lamarrulla.empresa.entity.ReplacementPartCat;
import com.lamarrulla.empresa.mapper.IReplacementPartCatMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class ReplacementPartCatMapperImpl implements IReplacementPartCatMapper {
    @Override
    public ReplacementPartCat toEntity(ReplacementPartCatDto replacementPartCatDto) {
        ReplacementPartCat replacementPartCat = new ReplacementPartCat();
        replacementPartCat.setId(replacementPartCatDto.getId());
        replacementPartCat.setName(replacementPartCatDto.getName());
        return replacementPartCat;
    }

    @Override
    public ReplacementPartCatDto toDto(ReplacementPartCat replacementPartCat) {
        ReplacementPartCatDto replacementPartCatDto = new ReplacementPartCatDto();
        replacementPartCatDto.setId(replacementPartCat.getId());
        replacementPartCatDto.setName(replacementPartCat.getName());
        return replacementPartCatDto;
    }

    @Override
    public List<ReplacementPartCat> toEntityList(List<ReplacementPartCatDto> replacementPartCatDtoList) {
        return replacementPartCatDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<ReplacementPartCatDto> toDtoList(List<ReplacementPartCat> replacementPartCatList) {
        return replacementPartCatList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
