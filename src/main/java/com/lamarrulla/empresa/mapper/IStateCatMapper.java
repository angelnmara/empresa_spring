package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.dto.StateCatDto;
import com.lamarrulla.empresa.entity.StateCat;
import java.util.List;

public interface IStateCatMapper {
    StateCat toEntity(StateCatDto stateCatDto);
    StateCatDto toDto(StateCat state);
    List<StateCatDto> toDtoList(List<StateCat> states);
}
