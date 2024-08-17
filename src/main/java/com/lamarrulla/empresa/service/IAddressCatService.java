package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.AddressCatDto;

import java.util.List;

public interface IAddressCatService {
    AddressCatDto findById(Integer id);
    List<AddressCatDto> findAll();
    AddressCatDto save(AddressCatDto addressCatDto);
}
