package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.ContactDataDto;
import com.lamarrulla.empresa.entity.ContactData;
import com.lamarrulla.empresa.mapper.IContactDataMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class ContactDataMapperImpl implements IContactDataMapper {
    @Override
    public ContactData toEntity(ContactDataDto contactDataDto) {
        ContactData contactData = new ContactData();
        contactData.setCellphone(contactDataDto.getCellphone());
        contactData.setId(contactDataDto.getId());
        contactData.setEmail(contactDataDto.getEmail());
        contactData.setPhone(contactDataDto.getPhone());
        return contactData;
    }

    @Override
    public ContactDataDto toDto(ContactData contactData) {
        ContactDataDto contactDataDto = new ContactDataDto();
        contactDataDto.setCellphone(contactData.getCellphone());
        contactDataDto.setEmail(contactData.getEmail());
        contactDataDto.setId(contactData.getId());
        contactDataDto.setPhone(contactData.getPhone());
        return contactDataDto;
    }

    @Override
    public List<ContactData> toEntityList(List<ContactDataDto> contactDataDtoList) {
        return contactDataDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<ContactDataDto> toDtoList(List<ContactData> contactDataList) {
        return contactDataList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
