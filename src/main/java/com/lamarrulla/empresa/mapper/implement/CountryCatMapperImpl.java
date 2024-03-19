package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.CountryCatDto;
import com.lamarrulla.empresa.entity.CountryCat;
import com.lamarrulla.empresa.mapper.ICountryCatMapper;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CountryCatMapperImpl implements ICountryCatMapper {
    @Override
    public CountryCat toEntity(CountryCatDto countryCatDto) {
        CountryCat countryCat = new CountryCat();
        countryCat.setCountryCode(countryCatDto.getCountryCode());
        countryCat.setCountryName(countryCatDto.getCountryName());
        countryCat.setId(countryCatDto.getId());
        return countryCat;
    }

    @Override
    public CountryCatDto toDto(CountryCat countryCat) {
        CountryCatDto countryCatDto = new CountryCatDto();
        countryCatDto.setCountryCode(countryCat.getCountryCode());
        countryCatDto.setCountryName(countryCat.getCountryName());
        countryCatDto.setId(countryCat.getId());
        return countryCatDto;
    }

    @Override
    public List<CountryCatDto> toDtoList(List<CountryCat> countries) {
        return countries.stream().map(this::toDto).collect(Collectors.toList());
    }
}
