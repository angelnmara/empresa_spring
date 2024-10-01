package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.GarageCatDto;

import java.util.List;

public interface IGarageCatService {
    GarageCatDto findById(Integer id);
    List<GarageCatDto> findAll();
    GarageCatDto save(GarageCatDto garageCatDto);
}
