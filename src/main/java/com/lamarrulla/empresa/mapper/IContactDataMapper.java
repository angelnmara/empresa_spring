package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.ContactDataDto;
import com.lamarrulla.empresa.entity.ContactData;

import java.util.List;

public interface IContactDataMapper {
    ContactData toEntity(ContactDataDto contactDataDto);
    ContactDataDto toDto(ContactData contactData);
    List<ContactData> toEntityList(List<ContactDataDto> contactDataDtoList);
    List<ContactDataDto> toDtoList(List<ContactData> contactDataList);
}
