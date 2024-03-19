package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.CountryCatDto;

import java.util.List;

public interface ICountryCatService {
    CountryCatDto findById(Integer id);
    List<CountryCatDto> findAll();
    CountryCatDto save(CountryCatDto countryCatDto);
}
