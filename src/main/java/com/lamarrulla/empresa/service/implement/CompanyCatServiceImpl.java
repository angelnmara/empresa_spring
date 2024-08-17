package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.CompanyCatDto;
import com.lamarrulla.empresa.mapper.ICompanyCatMapper;
import com.lamarrulla.empresa.repository.ICompanyCatRepository;
import com.lamarrulla.empresa.service.ICompanyCatService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyCatServiceImpl implements ICompanyCatService {
    private final ICompanyCatRepository iCompanyCatRepository;
    private final ICompanyCatMapper iCompanyCatMapper;

    public CompanyCatServiceImpl(ICompanyCatRepository iCompanyCatRepository, ICompanyCatMapper iCompanyCatMapper) {
        this.iCompanyCatRepository = iCompanyCatRepository;
        this.iCompanyCatMapper = iCompanyCatMapper;
    }

    @Override
    public CompanyCatDto findById(Integer id) {
        return iCompanyCatMapper.toDto(iCompanyCatRepository.findById(id).get());
    }

    @Override
    public List<CompanyCatDto> findAll() {
        return iCompanyCatMapper.toDtoList(iCompanyCatRepository.findAll());
    }

    @Override
    public CompanyCatDto save(CompanyCatDto companyCatDto) {
        return iCompanyCatMapper.toDto(iCompanyCatRepository.save(iCompanyCatMapper.toEntity(companyCatDto)));
    }
}
