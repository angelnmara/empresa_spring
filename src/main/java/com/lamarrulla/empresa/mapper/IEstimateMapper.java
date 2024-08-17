package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.EstimateDto;
import com.lamarrulla.empresa.entity.Estimate;

import java.util.List;

public interface IEstimateMapper {
    Estimate toEntity(EstimateDto estimateDto);
    EstimateDto toDto(Estimate estimate);
    List<Estimate> toEntityList(List<EstimateDto> estimateDtoList);
    List<EstimateDto> toDtoList(List<Estimate> estimateList);
}
