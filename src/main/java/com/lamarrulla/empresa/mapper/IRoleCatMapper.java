package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.RoleCatDto;
import com.lamarrulla.empresa.entity.RoleCat;

import java.util.List;

public interface IRoleCatMapper {
    RoleCatDto toDTO(RoleCat roleCat);
    RoleCat toEntity(RoleCatDto roleCatDto);
    List<RoleCatDto> toDTOList(List<RoleCat> roleCats);
}
