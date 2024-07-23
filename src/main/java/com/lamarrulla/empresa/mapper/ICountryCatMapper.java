package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.CountryCatDto;
import com.lamarrulla.empresa.entity.Country;

import java.util.List;

public interface ICountryCatMapper {
    Country toEntity(CountryCatDto countryCatDto);
    CountryCatDto toDto(Country country);
    List<CountryCatDto> toDtoList(List<Country> countries);
}
