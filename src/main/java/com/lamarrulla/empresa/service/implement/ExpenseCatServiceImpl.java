package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.ExpenseCatDto;
import com.lamarrulla.empresa.mapper.IExpenseCatMapper;
import com.lamarrulla.empresa.repository.IExpenseCatRepository;
import com.lamarrulla.empresa.service.IExpenseCatService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExpenseCatServiceImpl implements IExpenseCatService {
    private final IExpenseCatRepository iExpenseCatRepository;
    private final IExpenseCatMapper iExpenseCatMapper;

    public ExpenseCatServiceImpl(IExpenseCatRepository iExpenseCatRepository, IExpenseCatMapper iExpenseCatMapper) {
        this.iExpenseCatRepository = iExpenseCatRepository;
        this.iExpenseCatMapper = iExpenseCatMapper;
    }

    @Override
    public ExpenseCatDto findById(Integer id) {
        return iExpenseCatMapper.toDto(iExpenseCatRepository.findById(id).get());
    }

    @Override
    public List<ExpenseCatDto> findAll() {
        return iExpenseCatMapper.toDtoList(iExpenseCatRepository.findAll());
    }

    @Override
    public ExpenseCatDto save(ExpenseCatDto expenseCatDto) {
        return iExpenseCatMapper.toDto(iExpenseCatRepository.save(iExpenseCatMapper.toEntity(expenseCatDto)));
    }
}
