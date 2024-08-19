package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.CommunityCatDto;
import com.lamarrulla.empresa.entity.CommunityCat;
import com.lamarrulla.empresa.mapper.ICommunityCatMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CommunityCatMapperImpl implements ICommunityCatMapper {

    private final CityCatMapperImpl cityCatMapper;

    public CommunityCatMapperImpl(CityCatMapperImpl cityCatMapper) {
        this.cityCatMapper = cityCatMapper;
    }

    @Override
    public CommunityCat toEntity(CommunityCatDto communityCatDto) {
        CommunityCat communityCat = new CommunityCat();
        communityCat.setCommunityName(communityCatDto.getCommunityName());
        communityCat.setZipCode(communityCatDto.getZipCode());
        communityCat.setId(communityCatDto.getId());
        communityCat.setCity(cityCatMapper.toEntity(communityCatDto.getCityDto()));

        return communityCat;
    }

    @Override
    public CommunityCatDto toDto(CommunityCat communityCat) {
        CommunityCatDto communityCatDto = new CommunityCatDto();
        communityCatDto.setId(communityCat.getId());
        communityCatDto.setCityDto(cityCatMapper.toDto(communityCat.getCity()));
        communityCatDto.setCommunityName(communityCat.getCommunityName());
        communityCatDto.setZipCode(communityCat.getZipCode());
        return communityCatDto;
    }

    @Override
    public List<CommunityCat> toEntityList(List<CommunityCatDto> communityCatDtoList) {
        return communityCatDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<CommunityCatDto> toDtoList(List<CommunityCat> communityCatList) {
        return communityCatList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
