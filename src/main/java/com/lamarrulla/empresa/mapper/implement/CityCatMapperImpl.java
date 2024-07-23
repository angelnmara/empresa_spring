package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.CityCatDto;
import com.lamarrulla.empresa.entity.City;
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
    public City toEntity(CityCatDto cityCatDto) {
        City city = new City();
        city.setState(iStateCatMapper.toEntity(cityCatDto.getStateCatDto()));
        city.setName(cityCatDto.getCityName());
        city.setId(cityCatDto.getId());
        return city;
    }

    @Override
    public CityCatDto toDto(City city) {
        CityCatDto cityCatDto = new CityCatDto();
        cityCatDto.setCityName(city.getName());
        cityCatDto.setStateCatDto(iStateCatMapper.toDto(city.getState()));
        cityCatDto.setId(city.getId());
        return cityCatDto;
    }

    @Override
    public List<CityCatDto> toDtoList(List<City> cityList) {
        return cityList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
