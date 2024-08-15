package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.dto.BrandCatDto;
import com.lamarrulla.empresa.entity.BrandCat;

import java.util.List;

public interface IBrandCatMapper {
    BrandCat toEntity(BrandCatDto brandCatDto);
    BrandCatDto toDto(BrandCat brandCat);
    List<BrandCat> toEntiyList(List<BrandCatDto> brandCatDtoList);
    List<BrandCatDto> toDtoList(List<BrandCat> brandCatList);
}
