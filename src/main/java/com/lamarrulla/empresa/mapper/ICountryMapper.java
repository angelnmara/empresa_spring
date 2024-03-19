package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.CountryDto;
import com.lamarrulla.empresa.entity.Country;

import java.util.List;

public interface ICountryMapper {
    Country toEntity(CountryDto countryDto);
    CountryDto toDto(Country country);
    List<CountryDto> toDtoList(List<Country> countries);
}
