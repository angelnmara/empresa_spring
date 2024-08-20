package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.BrandCatDto;
import com.lamarrulla.empresa.entity.BrandCat;
import com.lamarrulla.empresa.mapper.IBrandCatMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class BrandCatMapperImpl implements IBrandCatMapper {
    @Override
    public BrandCat toEntity(BrandCatDto brandCatDto) {
        BrandCat brandCat = new BrandCat();
        brandCat.setId(brandCatDto.getId());
        brandCat.setName(brandCatDto.getName());
        return brandCat;
    }

    @Override
    public BrandCatDto toDto(BrandCat brandCat) {
        BrandCatDto brandCatDto = new BrandCatDto();
        brandCatDto.setId(brandCat.getId());
        brandCatDto.setName(brandCatDto.getName());
        return brandCatDto;
    }

    @Override
    public List<BrandCat> toEntiyList(List<BrandCatDto> brandCatDtoList) {
        return brandCatDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<BrandCatDto> toDtoList(List<BrandCat> brandCatList) {
        return brandCatList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
