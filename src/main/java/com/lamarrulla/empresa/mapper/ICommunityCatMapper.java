package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.CommunityCatDto;
import com.lamarrulla.empresa.entity.CommunityCat;

import java.util.List;

public interface ICommunityCatMapper {
    CommunityCat toEntity(CommunityCatDto communityCatDto);
    CommunityCatDto toDto(CommunityCat communityCat);
    List<CommunityCatDto> toDtoList(List<CommunityCat> communityCats);
}
