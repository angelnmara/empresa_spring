package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.StateCatDto;
import com.lamarrulla.empresa.entity.State;
import java.util.List;

public interface IStateCatMapper {
    State toEntity(StateCatDto stateCatDto);
    StateCatDto toDto(State state);
    List<StateCatDto> toDtoList(List<State> states);
}
