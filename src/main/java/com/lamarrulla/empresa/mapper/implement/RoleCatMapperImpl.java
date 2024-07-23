package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.RoleCatDto;
import com.lamarrulla.empresa.entity.Role;
import com.lamarrulla.empresa.mapper.IRoleCatMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RoleCatMapperImpl implements IRoleCatMapper {
    @Override
    public RoleCatDto toDTO(Role role) {
        RoleCatDto roleCatDto = new RoleCatDto();
        roleCatDto.setId(role.getId());
        roleCatDto.setName(role.getName());
        return roleCatDto;
    }

    @Override
    public Role toEntity(RoleCatDto roleCatDto) {
        Role role = new Role();
        role.setId(roleCatDto.getId());
        role.setName(roleCatDto.getName());
        return role;
    }

    @Override
    public List<RoleCatDto> toDTOList(List<Role> roles) {
        return roles.stream().map(this::toDTO).collect(Collectors.toList());
    }
}
