package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.RoleCatDto;

import java.util.List;

public interface IRoleCatService {
    RoleCatDto findById(Integer Id);
    List<RoleCatDto> findAll();
    RoleCatDto save(RoleCatDto roleCatDto);
}
