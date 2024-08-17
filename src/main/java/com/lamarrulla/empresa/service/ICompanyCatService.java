package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.CompanyCatDto;

import java.util.List;

public interface ICompanyCatService {
    CompanyCatDto findById(Integer id);
    List<CompanyCatDto> findAll();
    CompanyCatDto save(CompanyCatDto companyCatDto);
}
