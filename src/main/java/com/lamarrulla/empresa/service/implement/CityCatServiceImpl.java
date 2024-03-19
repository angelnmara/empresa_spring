package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.CityCatDto;
import com.lamarrulla.empresa.mapper.ICityCatMapper;
import com.lamarrulla.empresa.repository.ICityCatRepository;
import com.lamarrulla.empresa.service.ICityCatService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityCatServiceImpl implements ICityCatService {
    private final ICityCatMapper iCityCatMapper;
    private final ICityCatRepository iCityCatRepository;

    public CityCatServiceImpl(ICityCatMapper iCityCatMapper, ICityCatRepository iCityCatRepository) {
        this.iCityCatMapper = iCityCatMapper;
        this.iCityCatRepository = iCityCatRepository;
    }

    @Override
    public CityCatDto findById(Integer Id) {
        return iCityCatMapper.toDto(iCityCatRepository.findById(Id).get());
    }

    @Override
    public List<CityCatDto> findAll() {
        return iCityCatMapper.toDtoList(iCityCatRepository.findAll());
    }

    @Override
    public CityCatDto save(CityCatDto cityCatDto) {
        return iCityCatMapper.toDto(iCityCatRepository.save(iCityCatMapper.toEntity(cityCatDto)));
    }
}
