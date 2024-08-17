package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.HarmonyPointDto;
import com.lamarrulla.empresa.entity.HarmonyPoint;

import java.util.List;

public interface IHarmonyPointMapper {
    HarmonyPoint toEntity(HarmonyPointDto harmonyPointDto);
    HarmonyPointDto toDto(HarmonyPoint harmonyPoint);
    List<HarmonyPoint> toEntityList(List<HarmonyPointDto> harmonyPointDtoList);
    List<HarmonyPointDto> toDtoList(List<HarmonyPoint> harmonyPointList);
}
