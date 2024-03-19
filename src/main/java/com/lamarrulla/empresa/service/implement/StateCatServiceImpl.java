package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.StateCatDto;
import com.lamarrulla.empresa.mapper.IStateCatMapper;
import com.lamarrulla.empresa.repository.IStateCatRepository;
import com.lamarrulla.empresa.service.IStateCatService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StateCatServiceImpl implements IStateCatService {
    private final IStateCatMapper iStateCatMapper;
    private final IStateCatRepository iStateCatRepository;

    public StateCatServiceImpl(IStateCatMapper iStateCatMapper, IStateCatRepository iStateCatRepository) {
        this.iStateCatMapper = iStateCatMapper;
        this.iStateCatRepository = iStateCatRepository;
    }

    @Override
    public StateCatDto findById(Integer id) {
        return iStateCatMapper.toDto(iStateCatRepository.findById(id).get());
    }

    @Override
    public StateCatDto save(StateCatDto stateCatDto) {
        return iStateCatMapper.toDto(iStateCatRepository.save(iStateCatMapper.toEntity(stateCatDto)));
    }

    @Override
    public List<StateCatDto> findAll() {
        return iStateCatMapper.toDtoList(iStateCatRepository.findAll());
    }
}
