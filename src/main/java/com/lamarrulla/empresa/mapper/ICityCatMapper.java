package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.CityCatDto;
import com.lamarrulla.empresa.entity.CityCat;

import java.util.List;

public interface ICityCatMapper {
    CityCat toEntity(CityCatDto cityCatDto);
    CityCatDto toDto(CityCat cityCat);
    List<CityCatDto> toDtoList(List<CityCat> cityCatList);
}
