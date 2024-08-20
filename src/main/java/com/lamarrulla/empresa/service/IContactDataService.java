package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.ContactDataDto;

import java.util.List;

public interface IContactDataService {
    ContactDataDto findById(Integer id);
    List<ContactDataDto> findAll();
    ContactDataDto save(ContactDataDto contactDataDto);
}
