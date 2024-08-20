package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.MannagerDto;
import com.lamarrulla.empresa.entity.Mannager;
import com.lamarrulla.empresa.mapper.IMannagerMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MannagerMapperImpl implements IMannagerMapper {
    private final PersonalDataMapperImpl personalDataMapper;
    private final ContactDataMapperImpl contactDataMapper;

    public MannagerMapperImpl(PersonalDataMapperImpl personalDataMapper, ContactDataMapperImpl contactDataMapper) {
        this.personalDataMapper = personalDataMapper;
        this.contactDataMapper = contactDataMapper;
    }

    @Override
    public Mannager toEntity(MannagerDto mannagerDto) {
        Mannager mannager = new Mannager();
        mannager.setPersonalData(personalDataMapper.toEntity(mannagerDto.getPersonalDataDto()));
        mannager.setId(mannagerDto.getId());
        mannager.setContactData(contactDataMapper.toEntity(mannagerDto.getContactDataDto()));
        return mannager;
    }

    @Override
    public MannagerDto toDto(Mannager mannager) {
        MannagerDto mannagerDto = new MannagerDto();
        mannagerDto.setId(mannager.getId());
        mannagerDto.setContactDataDto(contactDataMapper.toDto(mannager.getContactData()));
        mannagerDto.setPersonalDataDto(personalDataMapper.toDTO(mannager.getPersonalData()));
        return mannagerDto;
    }

    @Override
    public List<Mannager> toEntityList(List<MannagerDto> mannagerDtoList) {
        return mannagerDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<MannagerDto> toDtoList(List<Mannager> mannagerList) {
        return mannagerList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
