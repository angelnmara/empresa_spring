package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.BrandCatDto;

import java.util.List;

public interface IBrandCatService {
    BrandCatDto findById(Integer id);
    List<BrandCatDto> findAll();
    BrandCatDto save(BrandCatDto brandCatDto);
}
