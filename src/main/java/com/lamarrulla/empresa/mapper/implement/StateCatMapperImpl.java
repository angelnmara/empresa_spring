package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.StateCatDto;
import com.lamarrulla.empresa.entity.StateCat;
import com.lamarrulla.empresa.mapper.IStateCatMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class StateCatMapperImpl implements IStateCatMapper {
    @Override
    public StateCat toEntity(StateCatDto stateCatDto) {
        StateCat stateCat = new StateCat();
        stateCat.setStateCode(stateCatDto.getStateCode());
        stateCat.setStateName(stateCatDto.getStateName());
        stateCat.setCountryCat(stateCatDto.getCountryCat());
        stateCat.setId(stateCatDto.getId());
        return stateCat;
    }

    @Override
    public StateCatDto toDto(StateCat stateCat) {
        StateCatDto stateCatDto = new StateCatDto();
        stateCatDto.setStateName(stateCat.getStateName());
        stateCatDto.setStateCode(stateCat.getStateCode());
        stateCatDto.setCountryCat(stateCat.getCountryCat());
        stateCatDto.setId(stateCat.getId());
        return stateCatDto;
    }

    @Override
    public List<StateCatDto> toDtoList(List<StateCat> states) {
        return states.stream().map(this::toDto).collect(Collectors.toList());
    }
}
