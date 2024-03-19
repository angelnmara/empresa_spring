package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.CountryDto;
import com.lamarrulla.empresa.entity.Country;
import com.lamarrulla.empresa.mapper.ICountryMapper;

import java.util.List;
import java.util.stream.Collectors;

public class CountryMapperImpl implements ICountryMapper{
    @Override
    public Country toEntity(CountryDto countryDto) {
        Country country = new Country();
        country.setCountryCode(countryDto.getCountryCode());
        country.setCountryName(countryDto.getCountryName());
        country.setId(countryDto.getId());
        return country;
    }

    @Override
    public CountryDto toDto(Country country) {
        CountryDto countryDto = new CountryDto();
        countryDto.setCountryCode(country.getCountryCode());
        countryDto.setCountryName(country.getCountryName());
        countryDto.setId(country.getId());
        return countryDto;
    }

    @Override
    public List<CountryDto> toDtoList(List<Country> countries) {
        return countries.stream().map(this::toDto).collect(Collectors.toList());
    }
}
