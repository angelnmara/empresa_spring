package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.CompanyCatDto;
import com.lamarrulla.empresa.entity.CompanyCat;

import java.util.List;

public interface ICompanyCatMapper {
    CompanyCatDto toDto(CompanyCat companyCat);
    CompanyCat toEntity(CompanyCatDto companyCatDto);
    List<CompanyCatDto> toDtoList(List<CompanyCat> companies);
}
