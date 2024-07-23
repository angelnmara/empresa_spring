package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.RoleCatDto;
import com.lamarrulla.empresa.entity.Role;

import java.util.List;

public interface IRoleCatMapper {
    RoleCatDto toDTO(Role role);
    Role toEntity(RoleCatDto roleCatDto);
    List<RoleCatDto> toDTOList(List<Role> roles);
}
