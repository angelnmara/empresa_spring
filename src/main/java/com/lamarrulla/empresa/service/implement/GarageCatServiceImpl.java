package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.GarageBudgetDto;
import com.lamarrulla.empresa.dto.GarageCatDto;
import com.lamarrulla.empresa.mapper.IGarageCatMapper;
import com.lamarrulla.empresa.repository.IGarageCatRepository;
import com.lamarrulla.empresa.service.IGarageCatService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GarageCatServiceImpl implements IGarageCatService {
    private final IGarageCatRepository iGarageCatRepository;
    private final IGarageCatMapper iGarageCatMapper;

    public GarageCatServiceImpl(IGarageCatRepository iGarageCatRepository, IGarageCatMapper iGarageCatMapper) {
        this.iGarageCatRepository = iGarageCatRepository;
        this.iGarageCatMapper = iGarageCatMapper;
    }

    @Override
    public GarageCatDto findById(Integer id) {
        return iGarageCatMapper.toDto(iGarageCatRepository.findById(id).get());
    }

    @Override
    public List<GarageCatDto> findAll() {
        return iGarageCatMapper.toDtoList(iGarageCatRepository.findAll());
    }

    @Override
    public GarageCatDto save(GarageCatDto garageCatDto) {
        return iGarageCatMapper.toDto(iGarageCatRepository.save(iGarageCatMapper.toEntity(garageCatDto)));
    }
}
