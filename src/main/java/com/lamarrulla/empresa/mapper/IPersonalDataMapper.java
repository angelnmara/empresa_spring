package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.PersonalDataDto;
import com.lamarrulla.empresa.entity.PersonalData;

import java.util.List;

public interface IPersonalDataMapper {
    PersonalDataDto toDTO(PersonalData personalData);
    PersonalData toEntity(PersonalDataDto personalDataDto);
    List<PersonalDataDto> toDTOList(List<PersonalData> personalDataList);
}
