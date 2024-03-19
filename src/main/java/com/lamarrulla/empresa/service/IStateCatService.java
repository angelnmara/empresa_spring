package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.StateCatDto;

import java.util.List;

public interface IStateCatService {
    StateCatDto findById(Integer id);
    StateCatDto save(StateCatDto stateCatDto);
    List<StateCatDto> findAll();
}
