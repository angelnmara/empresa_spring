package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.EstimateDto;
import com.lamarrulla.empresa.entity.Estimate;
import com.lamarrulla.empresa.mapper.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class EstimateMapperImpl implements IEstimateMapper {
    private final IGarageCatMapper iGarageCatMapper;
    private final IVehicleCatMapper iVehicleCatMapper;
    private final IGarageServiceMapper iGarageServiceMapper;
    private final IGarageReplacementPartMapper iGarageReplacementPartMapper;

    public EstimateMapperImpl(IGarageCatMapper iGarageCatMapper, IVehicleCatMapper iVehicleCatMapper, IGarageServiceMapper iGarageServiceMapper, IReplacementPartCatMapper iReplacementPartCatMapper, IGarageReplacementPartMapper iGarageReplacementPartMapper) {
        this.iGarageCatMapper = iGarageCatMapper;
        this.iVehicleCatMapper = iVehicleCatMapper;
        this.iGarageServiceMapper = iGarageServiceMapper;
        this.iGarageReplacementPartMapper = iGarageReplacementPartMapper;
    }

    @Override
    public Estimate toEntity(EstimateDto estimateDto) {
        Estimate estimate = new Estimate();
        estimate.setId(estimateDto.getId());
        estimate.setName(estimateDto.getName());
        estimate.setGarage(iGarageCatMapper.toEntity(estimateDto.getGarageDto()));
        estimate.setVehicle(iVehicleCatMapper.toEntity(estimateDto.getVehicleDto()));
        estimate.setLabourCost(estimateDto.getLabourCost());
        estimate.setGarageService(iGarageServiceMapper.toEntity(estimateDto.getGarageServiceDto()));
        estimate.setTotalCost(estimateDto.getTotalCost());
        estimate.setReplacementPartList(iGarageReplacementPartMapper.toEntityList(estimateDto.getGarageReplacementPartDtoList()));
        return estimate;
    }

    @Override
    public EstimateDto toDto(Estimate estimate) {
        EstimateDto estimateDto = new EstimateDto();
        estimateDto.setGarageDto(iGarageCatMapper.toDto(estimate.getGarage()));
        estimateDto.setName(estimate.getName());
        estimateDto.setVehicleDto(iVehicleCatMapper.toDto(estimate.getVehicle()));
        estimateDto.setGarageServiceDto(iGarageServiceMapper.toDto(estimate.getGarageService()));
        estimateDto.setLabourCost(estimate.getLabourCost());
        estimateDto.setTotalCost(estimate.getTotalCost());
        estimateDto.setId(estimate.getId());
        estimateDto.setVehicleDto(iVehicleCatMapper.toDto(estimate.getVehicle()));
        estimateDto.setGarageReplacementPartDtoList(iGarageReplacementPartMapper.toDtoList(estimate.getReplacementPartList()));
        return estimateDto;
    }

    @Override
    public List<Estimate> toEntityList(List<EstimateDto> estimateDtoList) {
        return estimateDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<EstimateDto> toDtoList(List<Estimate> estimateList) {
        return estimateList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
