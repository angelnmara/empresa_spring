package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.CityCatDto;
import com.lamarrulla.empresa.entity.City;

import java.util.List;

public interface ICityCatMapper {
    City toEntity(CityCatDto cityCatDto);
    CityCatDto toDto(City city);
    List<CityCatDto> toDtoList(List<City> cityList);
}
