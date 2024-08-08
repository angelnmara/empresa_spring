package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.CountryCatDto;
import com.lamarrulla.empresa.entity.CountryCat;

import java.util.List;

public interface ICountryCatMapper {
    CountryCat toEntity(CountryCatDto countryCatDto);
    CountryCatDto toDto(CountryCat countryCat);
    List<CountryCatDto> toDtoList(List<CountryCat> countries);
}
