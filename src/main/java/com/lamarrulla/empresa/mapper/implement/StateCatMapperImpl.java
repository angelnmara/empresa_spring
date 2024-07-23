package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.StateCatDto;
import com.lamarrulla.empresa.entity.State;
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
    public State toEntity(StateCatDto stateCatDto) {
        State state = new State();
        state.setCode(stateCatDto.getStateCode());
        state.setName(stateCatDto.getStateName());
        state.setCountry(iCountryCatMapper.toEntity(stateCatDto.getCountryCatDto()));
        state.setId(stateCatDto.getId());
        return state;
    }

    @Override
    public StateCatDto toDto(State state) {
        StateCatDto stateCatDto = new StateCatDto();
        stateCatDto.setStateName(state.getName());
        stateCatDto.setStateCode(state.getCode());
        stateCatDto.setCountryCatDto(iCountryCatMapper.toDto(state.getCountry()));
        stateCatDto.setId(state.getId());
        return stateCatDto;
    }

    @Override
    public List<StateCatDto> toDtoList(List<State> states) {
        return states.stream().map(this::toDto).collect(Collectors.toList());
    }
}