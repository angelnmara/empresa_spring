package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.CompanyCatDto;
import com.lamarrulla.empresa.entity.Company;
import com.lamarrulla.empresa.mapper.ICompanyCatMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class CompanyCatMapperImpl implements ICompanyCatMapper {
    @Override
    public CompanyCatDto toDto(Company company) {
        CompanyCatDto companyCatDto = new CompanyCatDto();
        companyCatDto.setCompanyName(company.getName());
        companyCatDto.setId(company.getId());
        return companyCatDto;
    }

    @Override
    public Company toEntity(CompanyCatDto companyCatDto) {
        Company company = new Company();
        company.setName(companyCatDto.getCompanyName());
        company.setId(companyCatDto.getId());
        return company;
    }

    @Override
    public List<CompanyCatDto> toDtoList(List<Company> companies) {
        return companies.stream().map(this::toDto).collect(Collectors.toList());
    }
}
