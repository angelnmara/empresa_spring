package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.GarageBudgetDto;

import java.util.List;

public interface IGarageBudgetService {
    GarageBudgetDto findById(Integer id);
    List<GarageBudgetDto> findAll();
    GarageBudgetDto save(GarageBudgetDto garageBudgetDto);
}
