package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.CompanyCatDto;
import com.lamarrulla.empresa.entity.CompanyCat;
import com.lamarrulla.empresa.mapper.ICompanyCatMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class CompanyCatMapperImpl implements ICompanyCatMapper {
    @Override
    public CompanyCatDto toDto(CompanyCat companyCat) {
        CompanyCatDto companyCatDto = new CompanyCatDto();
        companyCatDto.setCompanyName(companyCat.getCompanyName());
        companyCatDto.setId(companyCat.getId());
        return companyCatDto;
    }

    @Override
    public CompanyCat toEntity(CompanyCatDto companyCatDto) {
        CompanyCat companyCat = new CompanyCat();
        companyCat.setCompanyName(companyCatDto.getCompanyName());
        companyCat.setId(companyCatDto.getId());
        return companyCat;
    }

    @Override
    public List<CompanyCatDto> toDtoList(List<CompanyCat> companies) {
        return companies.stream().map(this::toDto).collect(Collectors.toList());
    }
}
