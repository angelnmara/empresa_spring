package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.EstimateDto;

import java.util.List;

public interface IEstimateService {
    EstimateDto findById(Integer id);
    List<EstimateDto> findAll();
    EstimateDto save(EstimateDto estimateDto);
}
