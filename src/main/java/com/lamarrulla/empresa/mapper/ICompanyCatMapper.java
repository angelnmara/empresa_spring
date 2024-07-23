package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.CompanyCatDto;
import com.lamarrulla.empresa.entity.Company;

import java.util.List;

public interface ICompanyCatMapper {
    CompanyCatDto toDto(Company company);
    Company toEntity(CompanyCatDto companyCatDto);
    List<CompanyCatDto> toDtoList(List<Company> companies);
}
