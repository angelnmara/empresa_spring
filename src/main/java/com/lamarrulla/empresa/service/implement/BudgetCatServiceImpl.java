package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.BudgetCatDto;
import com.lamarrulla.empresa.mapper.IBudgetCatMapper;
import com.lamarrulla.empresa.repository.IBudgetCatRepository;
import com.lamarrulla.empresa.service.IBudgetCatService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BudgetCatServiceImpl implements IBudgetCatService {
    private final IBudgetCatRepository iBudgetCatRepository;
    private final IBudgetCatMapper iBudgetCatMapper;

    public BudgetCatServiceImpl(IBudgetCatRepository iBudgetCatRepository, IBudgetCatMapper iBudgetCatMapper) {
        this.iBudgetCatRepository = iBudgetCatRepository;
        this.iBudgetCatMapper = iBudgetCatMapper;
    }

    @Override
    public BudgetCatDto findById(Integer id) {
        return iBudgetCatMapper.toDto(iBudgetCatRepository.findById(id).get());
    }

    @Override
    public List<BudgetCatDto> findAll() {
        return iBudgetCatMapper.toDtoList(iBudgetCatRepository.findAll());
    }

    @Override
    public BudgetCatDto save(BudgetCatDto budgetCatDto) {
        return iBudgetCatMapper.toDto(iBudgetCatRepository.save(iBudgetCatMapper.toEntity(budgetCatDto)));
    }
}