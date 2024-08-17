package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.CountryCatDto;
import com.lamarrulla.empresa.mapper.ICountryCatMapper;
import com.lamarrulla.empresa.repository.ICountryCatRepository;
import com.lamarrulla.empresa.service.ICountryCatService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CountryCatServiceImpl implements ICountryCatService {
    private final ICountryCatRepository iCountryCatRepository;
    private final ICountryCatMapper iCountryCatMapper;

    public CountryCatServiceImpl(ICountryCatRepository iCountryCatRepository, ICountryCatMapper iCountryCatMapper) {
        this.iCountryCatRepository = iCountryCatRepository;
        this.iCountryCatMapper = iCountryCatMapper;
    }

    @Override
    public CountryCatDto findById(Integer id) {
        return iCountryCatMapper.toDto(iCountryCatRepository.findById(id).get());
    }

    @Override
    public List<CountryCatDto> findAll() {
        return iCountryCatMapper.toDtoList(iCountryCatRepository.findAll());
    }

    @Override
    public CountryCatDto save(CountryCatDto countryCatDto) {
        return iCountryCatMapper.toDto(iCountryCatRepository.save(iCountryCatMapper.toEntity(countryCatDto)));
    }
}