package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.CountryCatDto;
import com.lamarrulla.empresa.entity.Country;
import com.lamarrulla.empresa.mapper.ICountryCatMapper;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CountryCatMapperImpl implements ICountryCatMapper {
    @Override
    public Country toEntity(CountryCatDto countryCatDto) {
        Country country = new Country();
        country.setCode(countryCatDto.getCountryCode());
        country.setName(countryCatDto.getCountryName());
        country.setId(countryCatDto.getId());
        return country;
    }

    @Override
    public CountryCatDto toDto(Country country) {
        CountryCatDto countryCatDto = new CountryCatDto();
        countryCatDto.setCountryCode(country.getCode());
        countryCatDto.setCountryName(country.getName());
        countryCatDto.setId(country.getId());
        return countryCatDto;
    }

    @Override
    public List<CountryCatDto> toDtoList(List<Country> countries) {
        return countries.stream().map(this::toDto).collect(Collectors.toList());
    }
}
