package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.CommunityCatDto;
import com.lamarrulla.empresa.entity.CommunityCat;
import com.lamarrulla.empresa.mapper.ICityCatMapper;
import com.lamarrulla.empresa.mapper.ICommunityCatMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class CommunityCatMapperImpl implements ICommunityCatMapper {
    private final ICityCatMapper iCityCatMapper;

    public CommunityCatMapperImpl(ICityCatMapper iCityCatMapper) {
        this.iCityCatMapper = iCityCatMapper;
    }

    @Override
    public CommunityCat toEntity(CommunityCatDto communityCatDto) {
        CommunityCat communityCat = new CommunityCat();
        communityCat.setCityCat(iCityCatMapper.toEntity(communityCatDto.getCityCatDto()));
        communityCat.setCommunityName(communityCatDto.getCommunityName());
        communityCat.setId(communityCatDto.getId());
        communityCat.setZipCode(communityCatDto.getZipCode());
        return communityCat;
    }

    @Override
    public CommunityCatDto toDto(CommunityCat communityCat) {
        CommunityCatDto communityCatDto = new CommunityCatDto();
        communityCatDto.setCityCatDto(iCityCatMapper.toDto(communityCat.getCityCat()));
        communityCatDto.setCommunityName(communityCat.getCommunityName());
        communityCatDto.setZipCode(communityCat.getZipCode());
        communityCatDto.setId(communityCat.getId());
        return communityCatDto;
    }

    @Override
    public List<CommunityCatDto> toDtoList(List<CommunityCat> communityCats) {
        return communityCats.stream().map(this::toDto).collect(Collectors.toList());
    }
}