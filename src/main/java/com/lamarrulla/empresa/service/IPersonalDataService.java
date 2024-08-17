package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.PersonalDataDto;

import java.util.List;

public interface IPersonalDataService {
    PersonalDataDto findById(Integer id);
    List<PersonalDataDto> findAll();
    PersonalDataDto save(PersonalDataDto personalDataDto);
}
