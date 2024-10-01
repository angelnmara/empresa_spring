package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.EstimateDto;
import com.lamarrulla.empresa.mapper.IEstimateMapper;
import com.lamarrulla.empresa.repository.IEstimateRepository;
import com.lamarrulla.empresa.service.IEstimateService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EstimateServiceImpl implements IEstimateService {
    private final IEstimateRepository iEstimateRepository;
    private final IEstimateMapper iEstimateMapper;

    public EstimateServiceImpl(IEstimateRepository iEstimateRepository, IEstimateMapper iEstimateMapper) {
        this.iEstimateRepository = iEstimateRepository;
        this.iEstimateMapper = iEstimateMapper;
    }

    @Override
    public EstimateDto findById(Integer id) {
        return iEstimateMapper.toDto(iEstimateRepository.findById(id).get());
    }

    @Override
    public List<EstimateDto> findAll() {
        return iEstimateMapper.toDtoList(iEstimateRepository.findAll());
    }

    @Override
    public EstimateDto save(EstimateDto estimateDto) {
        return iEstimateMapper.toDto(iEstimateRepository.save(iEstimateMapper.toEntity(estimateDto)));
    }
}
