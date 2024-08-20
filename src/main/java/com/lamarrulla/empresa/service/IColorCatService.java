package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.ColorCatDto;

import java.util.List;

public interface IColorCatService {
    ColorCatDto findById(Integer id);
    ColorCatDto save(ColorCatDto colorCatDto);
    List<ColorCatDto> findAll();
}
