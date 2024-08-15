package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.dto.MannagerDto;
import com.lamarrulla.empresa.entity.Mannager;

import java.util.List;

public interface IMannagerMapper {
    Mannager toEntity(MannagerDto mannagerDto);
    MannagerDto toDto(Mannager mannager);
    List<Mannager> toEntityList(List<MannagerDto> mannagerDtoList);
    List<MannagerDto> toDtoList(List<Mannager> mannagerList);
}
