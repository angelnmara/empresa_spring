package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.BrandCatDto;
import com.lamarrulla.empresa.mapper.IBrandCatMapper;
import com.lamarrulla.empresa.repository.IBrandCatRepository;
import com.lamarrulla.empresa.service.IBrandCatService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BrandCatServiceImpl implements IBrandCatService {
    private final IBrandCatRepository iBrandCatRepository;
    private final IBrandCatMapper iBrandCatMapper;

    public BrandCatServiceImpl(IBrandCatRepository iBrandCatRepository, IBrandCatMapper iBrandCatMapper) {
        this.iBrandCatRepository = iBrandCatRepository;
        this.iBrandCatMapper = iBrandCatMapper;
    }

    @Override
    public BrandCatDto findById(Integer id) {
        return iBrandCatMapper.toDto(iBrandCatRepository.findById(id).get());
    }

    @Override
    public List<BrandCatDto> findAll() {
        return iBrandCatMapper.toDtoList(iBrandCatRepository.findAll());
    }

    @Override
    public BrandCatDto save(BrandCatDto brandCatDto) {
        return iBrandCatMapper.toDto(iBrandCatRepository.save(iBrandCatMapper.toEntity(brandCatDto)));
    }
}
