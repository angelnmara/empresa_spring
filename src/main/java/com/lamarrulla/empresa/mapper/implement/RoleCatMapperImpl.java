package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.RoleCatDto;
import com.lamarrulla.empresa.entity.RoleCat;
import com.lamarrulla.empresa.mapper.IRoleCatMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class RoleCatMapperImpl implements IRoleCatMapper {
    @Override
    public RoleCatDto toDTO(RoleCat roleCat) {
        RoleCatDto roleCatDto = new RoleCatDto();
        roleCatDto.setId(roleCat.getId());
        roleCatDto.setName(roleCat.getName());
        return roleCatDto;
    }

    @Override
    public RoleCat toEntity(RoleCatDto roleCatDto) {
        RoleCat roleCat = new RoleCat();
        roleCat.setId(roleCatDto.getId());
        roleCat.setName(roleCatDto.getName());
        return roleCat;
    }

    @Override
    public List<RoleCatDto> toDTOList(List<RoleCat> roleCats) {
        return roleCats.stream().map(this::toDTO).collect(Collectors.toList());
    }
}
