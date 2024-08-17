package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.PersonalDataDto;
import com.lamarrulla.empresa.entity.PersonalData;
import com.lamarrulla.empresa.mapper.IPersonalDataMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonalDataMapperImpl implements IPersonalDataMapper {
    @Override
    public PersonalDataDto toDTO(PersonalData personalData) {
        PersonalDataDto personalDataDto = new PersonalDataDto();
        personalDataDto.setId(personalData.getId());
        personalDataDto.setAge(personalData.getAge());
        personalDataDto.setLastName(personalData.getLastName());
        personalDataDto.setFirstName(personalData.getFirstName());
        return personalDataDto;
    }

    @Override
    public PersonalData toEntity(PersonalDataDto personalDataDto) {
        PersonalData personalData = new PersonalData();
        personalData.setId(personalDataDto.getId());
        personalData.setAge(personalDataDto.getAge());
        personalData.setFirstName(personalDataDto.getFirstName());
        personalData.setLastName(personalDataDto.getLastName());
        return personalData;
    }

    @Override
    public List<PersonalDataDto> toDTOList(List<PersonalData> personalDataList) {
        return personalDataList.stream().map(this::toDTO).collect(Collectors.toList());
    }
}
