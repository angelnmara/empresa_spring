package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.CityCatDto;
import com.lamarrulla.empresa.entity.CityCat;
import com.lamarrulla.empresa.mapper.ICityCatMapper;
import com.lamarrulla.empresa.mapper.IStateCatMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class CityCatMapperImpl implements ICityCatMapper {
    private final IStateCatMapper iStateCatMapper;

    public CityCatMapperImpl(IStateCatMapper iStateCatMapper) {
        this.iStateCatMapper = iStateCatMapper;
    }

    @Override
    public CityCat toEntity(CityCatDto cityCatDto) {
        CityCat cityCat = new CityCat();
        cityCat.setStateCat(iStateCatMapper.toEntity(cityCatDto.getStateCatDto()));
        cityCat.setCityName(cityCatDto.getCityName());
        cityCat.setId(cityCatDto.getId());
        return cityCat;
    }

    @Override
    public CityCatDto toDto(CityCat cityCat) {
        CityCatDto cityCatDto = new CityCatDto();
        cityCatDto.setCityName(cityCat.getCityName());
        cityCatDto.setStateCatDto(iStateCatMapper.toDto(cityCat.getStateCat()));
        cityCatDto.setId(cityCat.getId());
        return cityCatDto;
    }

    @Override
    public List<CityCatDto> toDtoList(List<CityCat> cityCatList) {
        return cityCatList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
