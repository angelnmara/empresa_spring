package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.StateCatDto;
import com.lamarrulla.empresa.entity.StateCat;
import com.lamarrulla.empresa.mapper.ICountryCatMapper;
import com.lamarrulla.empresa.mapper.IStateCatMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class StateCatMapperImpl implements IStateCatMapper {
    private final ICountryCatMapper iCountryCatMapper;

    public StateCatMapperImpl(ICountryCatMapper iCountryCatMapper) {
        this.iCountryCatMapper = iCountryCatMapper;
    }

    @Override
    public StateCat toEntity(StateCatDto stateCatDto) {
        StateCat state = new StateCat();
        state.setCode(stateCatDto.getCode());
        state.setName(stateCatDto.getName());
        state.setCountry(iCountryCatMapper.toEntity(stateCatDto.getCountryDto()));
        state.setId(stateCatDto.getId());
        return state;
    }

    @Override
    public StateCatDto toDto(StateCat state) {
        StateCatDto stateCatDto = new StateCatDto();
        stateCatDto.setName(state.getName());
        stateCatDto.setCode(state.getCode());
        stateCatDto.setCountryDto(iCountryCatMapper.toDto(state.getCountry()));
        stateCatDto.setId(state.getId());
        return stateCatDto;
    }

    @Override
    public List<StateCatDto> toDtoList(List<StateCat> states) {
        return states.stream().map(this::toDto).collect(Collectors.toList());
    }
}