package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.GarageBudgetDto;
import com.lamarrulla.empresa.mapper.IGarageBudgetMapper;
import com.lamarrulla.empresa.repository.IGarageBudgetRepository;
import com.lamarrulla.empresa.service.IGarageBudgetService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GarageBudgetServiceImpl implements IGarageBudgetService {
    private final IGarageBudgetRepository iGarageBudgetRepository;
    private final IGarageBudgetMapper iGarageBudgetMapper;

    public GarageBudgetServiceImpl(IGarageBudgetRepository iGarageBudgetRepository, IGarageBudgetMapper iGarageBudgetMapper) {
        this.iGarageBudgetRepository = iGarageBudgetRepository;
        this.iGarageBudgetMapper = iGarageBudgetMapper;
    }

    @Override
    public GarageBudgetDto findById(Integer id) {
        return iGarageBudgetMapper.toDto(iGarageBudgetRepository.findById(id).get());
    }

    @Override
    public List<GarageBudgetDto> findAll() {
        return iGarageBudgetMapper.toDtoList(iGarageBudgetRepository.findAll());
    }

    @Override
    public GarageBudgetDto save(GarageBudgetDto garageBudgetDto) {
        return iGarageBudgetMapper.toDto(iGarageBudgetRepository.save(iGarageBudgetMapper.toEntity(garageBudgetDto)));
    }
}
